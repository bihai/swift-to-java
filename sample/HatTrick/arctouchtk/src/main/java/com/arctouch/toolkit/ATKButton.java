package com.arctouch.toolkit;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by felipehomma on 8/19/14.
 */
public class ATKButton extends Button implements ATKView, View.OnClickListener {
    public ATKClickListener onClickListener;

    private final ATKRectangle requestedFrame = new ATKRectangle(0,0,0,0);
    private final RelativeLayout.LayoutParams layoutParams;

    public ATKButton() {
        super(ATKApplication.instance());
        layoutParams = new RelativeLayout.LayoutParams(0,0);
        setLayoutParams(layoutParams);
        setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
