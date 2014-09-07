package com.arctouch.toolkit;

import android.view.Gravity;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by felipehomma on 8/19/14.
 */
public class ATKLabel extends TextView implements ATKView {
    private final ATKRectangle requestedFrame = new ATKRectangle(0,0,0,0);
    private final RelativeLayout.LayoutParams layoutParams;

    public ATKLabel() {
        super(ATKApplication.instance());

        this.setTextAlignment(TEXT_ALIGNMENT_GRAVITY);
        this.setBackgroundColor(0xff0000);
        this.setGravity(Gravity.RIGHT);
        layoutParams = new RelativeLayout.LayoutParams(0,0);
        setLayoutParams(layoutParams);
    }

    public void setFrame(ATKRectangle rect) {
        requestedFrame.assignFrom(rect);
        layoutParams.leftMargin = (int)(requestedFrame.x * ATKApplication.screenScale);
        layoutParams.topMargin = (int)(requestedFrame.y * ATKApplication.screenScale);
        layoutParams.width = (int)(requestedFrame.width * ATKApplication.screenScale);
        layoutParams.height = (int)(requestedFrame.height * ATKApplication.screenScale);
        if (this.getParent() != null) {
            this.getParent().requestLayout();
        }

    }

    public ATKRectangle getFrame() {
        return requestedFrame;
    }
}
