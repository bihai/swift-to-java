//
//  HatTrickViewController.swift
//  ArctouchTK
//
//  Created by Felipe Homma on 8/12/14.
//  Copyright (c) 2014 Arctouch. All rights reserved.
//


// change compiler to accept this //> thing
//>@package("com.arctouch.test")



class CalculatorState {
    let None:Int = 0
    let Sum:Int = 1
    let Sub:Int = 2
    
    var acc : Int = 0
    var newValue : Int = 0
    var op: Int = 0
    
    func addDigit(digit: Int) {
        newValue = newValue * 10 + digit
    }
    
    func doOperation() {
        if op == Sum {
            acc += newValue
        } else if op == Sub {
            acc -= newValue
        } else {
            acc = newValue
        }
        newValue = 0;
    }
}

class DigitListener: ATKClickListener {
    var calculator: CalculatorState?
    var output: ATKLabel?

    override func onClick(view: ATKView) {
        var button : ATKButton = view as ATKButton
        
        var text : String = button.getText()
        var digit : Int = StringToInt(text)
        calculator!.addDigit(digit)
        output!.setText(String(calculator!.newValue))
    }
}


class SumListener : ATKClickListener {
    var calculator: CalculatorState?
    var output: ATKLabel?
    override func onClick(view: ATKView) {
        calculator!.doOperation()
        calculator!.op = calculator!.Sum
        output!.setText(String(calculator!.acc))
    }
}

class SubListener : ATKClickListener {
    var calculator: CalculatorState?
    var output: ATKLabel?
    override func onClick(view: ATKView) {
        calculator!.doOperation()
        calculator!.op = calculator!.Sub
        output!.setText(String(calculator!.acc))
    }
}

class ResultListener : ATKClickListener {
    var calculator: CalculatorState?
    var output: ATKLabel?
    override func onClick(view: ATKView) {
        calculator!.doOperation()
        output!.setText(String(calculator!.acc))
        calculator!.acc = 0
    }
}

class HatTrick: ATKApplication {
    let calculator : CalculatorState = CalculatorState()
    var digitListener : DigitListener = DigitListener()
    var sumListener : SumListener = SumListener()
    var subListener : SubListener = SubListener()
    var resultListener : ResultListener = ResultListener()
    
    override func main(rootView: ATKViewContainer) {
        
        
        let frame:ATKRectangle = rootView.getFrame()
        var label : ATKLabel = self.createDisplay(20, height:60, canvasRect:frame)
        self.createDigits(20, buttonSize: 60, canvasRect:frame)
        self.createOperations(20, buttonSize: 60, canvasRect:frame)
        
        digitListener.calculator = calculator
        digitListener.output = label

        sumListener.calculator = calculator
        sumListener.output = label

        subListener.calculator = calculator
        subListener.output = label

        resultListener.calculator = calculator
        resultListener.output = label
    }
    
    func createDisplay(marginOffset: Int, height: Int, canvasRect:ATKRectangle) -> ATKLabel {
        var label : ATKLabel = ATKLabel()
        label.setText("0")
        label.setFrame(ATKRectangle(x:marginOffset, y: marginOffset, width:canvasRect.width - 2 * marginOffset, height:height))
        
        
        rootView.addChildView(label)
        return label
    }
    
    func createOperations(marginOffset: Int, buttonSize: Int, canvasRect:ATKRectangle) {
        let gap : Int = 1
        let buttonGap : Int = buttonSize + gap

        var topOffset: Int = canvasRect.height - marginOffset - 3 * buttonGap - buttonSize
        let rightOffset: Int = canvasRect.width - marginOffset - buttonSize
        var rect :ATKRectangle = ATKRectangle(x:rightOffset, y: 0, width:buttonSize, height:buttonSize)

        var sum : ATKButton = ATKButton()
        rect.y = topOffset
        sum.setFrame(rect)
        sum.onClickListener = sumListener
        sum.setText("+");
        rootView.addChildView(sum)

        topOffset += buttonGap
        var sub : ATKButton = ATKButton()
        rect.y = topOffset
        sub.setFrame(rect)
        sub.onClickListener = subListener
        sub.setText("-");
        rootView.addChildView(sub)

        topOffset += 2*buttonGap
        var enter : ATKButton = ATKButton()
        rect.y = topOffset
        enter.setFrame(rect)
        enter.onClickListener = resultListener
        enter.setText("=");
        rootView.addChildView(enter)
    }
    
    func createDigits(marginOffset: Int, buttonSize: Int, canvasRect:ATKRectangle) {
        let gap : Int = 1
        let buttonGap : Int = buttonSize + gap
        
        let topOffset: Int = canvasRect.height - marginOffset - 3 * buttonGap - buttonSize
        var rect :ATKRectangle = ATKRectangle(x:0, y: 0, width:buttonSize, height:buttonSize)
        var btn : ATKButton
        
        for var i:Int=1;i < 10; ++i {
            btn = ATKButton()
            btn.setText(String(i))
            let pos:Int = 9 - i;
            let col: Int = pos % 3;
            let row: Int = pos / 3;
            
            rect.x = marginOffset + 2 * buttonGap - col * buttonGap
            rect.y = topOffset + row * buttonGap
            btn.setFrame(rect)
            btn.onClickListener = digitListener
            
            rootView.addChildView(btn)
        }
        
        btn = ATKButton()
        btn.setText("0")
        rect.x = marginOffset
        rect.y = topOffset + 3 * buttonGap
        rect.width = 2 * buttonGap + buttonSize
        btn.setFrame(rect)
        btn.onClickListener = digitListener
        
        rootView.addChildView(btn)
    }
}
