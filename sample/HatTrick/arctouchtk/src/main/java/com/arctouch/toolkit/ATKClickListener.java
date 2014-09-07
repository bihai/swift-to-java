package com.arctouch.toolkit;

import android.view.View;

/**
 * Created by felipehomma on 8/19/14.
 */
public abstract class ATKClickListener implements View.OnClickListener {
    public abstract void onClick(ATKView view);

    @Override
    public final void onClick(View view) {
        onClick((ATKView) view);
    }
}
