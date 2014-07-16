class HatTrick : Activity, OnClickListener {
    var acc : Int
    var clear : Bool
    var label : EditText
 
    override func onCreate(savedState: Bundle) {
        super.onCreate(savedState)
        
        var uberroot: LinearLayout
        uberroot = LinearLayout(context: self)
        uberroot.setOrientation(VERTICAL)
        label = EditText(context: self)
        
        uberroot.addView(label)
        
        var root:LinearLayout
        root = LinearLayout(context: self)

        var button:Button

        var left: LinearLayout
        left = LinearLayout(context: self)
        left.setOrientation(VERTICAL)

        button = Button(context: self)
        button.setText("7")
        button.setOnClickListener(self)
        left.addView(button);
        button = Button(context: self)
        button.setText("4")
        button.setOnClickListener(self)
        left.addView(button);
        button = Button(context: self)
        button.setText("1")
        button.setOnClickListener(self)
        left.addView(button)
        button = Button(context: self)
        button.setText("0")
        button.setOnClickListener(self)
        left.addView(button)

        var center: LinearLayout
        center = LinearLayout(context: self)
        center.setOrientation(VERTICAL)
        
        button = Button(context: self)
        button.setText("8")
        button.setOnClickListener(self)
        center.addView(button);
        button = Button(context: self)
        button.setText("5")
        button.setOnClickListener(self)
        center.addView(button);
        button = Button(context: self)
        button.setText("2")
        button.setOnClickListener(self)
        center.addView(button);
        button = Button(context: self)
        button.setText("+")
        button.setOnClickListener(self)
        center.addView(button)
        
        var right: LinearLayout
        right = LinearLayout(context: self)
        right.setOrientation(VERTICAL)
        
        button = Button(context: self)
        button.setText("9")
        button.setOnClickListener(self)
        right.addView(button)
        button = Button(context: self)
        button.setText("6")
        button.setOnClickListener(self)
        right.addView(button);
        button = Button(context: self)
        button.setText("3")
        button.setOnClickListener(self)
        right.addView(button);
        button = Button(context: self)
        button.setText("=")
        button.setOnClickListener(self)
        right.addView(button)
        
        
        root.addView(left)
        root.addView(center)
        root.addView(right)
        uberroot.addView(root)

        self.setContentView(uberroot)
    }
    
    func onClick(view: View) {
        var button : Button
        button = view as Button

        var text : String
        text = button.getText().toString();
        
        var isEquals : Bool
        isEquals = text.equals("=")
        var isPlus : Bool
        isPlus = text.equals("+")
        var label: EditText
        label = self.label
        
        if isEquals || isPlus {
            var editable : Editable
            editable = label.getText()
            
            var ltext: String
            ltext = editable.toString()
            var rvalue : Int
            rvalue = ltext as Int
            
            
            acc = acc + rvalue
            ltext = acc as String
            
            label.setText(ltext)
            clear = true;
            if isEquals {
                acc = 0
            }
        } else {
            if clear {
                label.setText(text)
                clear = false;
            } else {
                label.append(text)
            }
            
        }
    }
}
