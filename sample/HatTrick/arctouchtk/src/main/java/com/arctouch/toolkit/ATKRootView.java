package com.arctouch.toolkit;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ATKRootView extends RelativeLayout implements ATKViewContainer {
    private final ATKRectangle requestedFrame = new ATKRectangle(0,0,0,0);

    public ATKRootView(Context context) {
        super(context);
    }

    public void setFrame(ATKRectangle rect) {
        requestedFrame.assignFrom(rect);
    }

    public ATKRectangle getFrame() {
//        requestedFrame.x = (int)this.getX();
//        requestedFrame.y = (int)this.getY();
//        requestedFrame.width = this.getWidth();
//        requestedFrame.height = this.getHeight();
        return requestedFrame;
    }


    @Override
    public void addChildView(ATKView view) {
        this.addView((View)view);
    }
}
