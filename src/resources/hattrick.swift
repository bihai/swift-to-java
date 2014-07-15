class HatTrick : Activity {
    override func onCreate(savedState: Bundle) {
        super.onCreate(savedState)
        
        var root:LinearLayout
        var button:Button
        
        button = Button(context: self)
        button.setText("alo")

        root = LinearLayout(context: self)
        root.addView(button)
        
        self.setContentView(root)
    }
}