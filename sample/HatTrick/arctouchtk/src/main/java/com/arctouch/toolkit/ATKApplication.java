package com.arctouch.toolkit;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

/**
 * Created by felipehomma on 8/19/14.
 */
public abstract class ATKApplication extends Activity {
    public static final float screenScale  = 2;
    private static ATKApplication _instance;
    static ATKApplication instance(){
        return _instance;
    }



    public ATKRootView rootView;
    @Override
    public void onCreate (final android.os.Bundle savedState){
        if (_instance != null){
            throw new RuntimeException("Ups");
        }
        super.onCreate(savedState);
        _instance = this;
        rootView = new ATKRootView(this);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        int titleHeight = getStatusBarHeight();
        rootView.setFrame(new ATKRectangle(0,0,(int)(width / screenScale), (int)(height/screenScale) - titleHeight));

        setContentView(rootView);
        main(rootView);
    }


    @Override
    public void onDestroy(){
        super.onDestroy();
        _instance = null;
    }

    public int getStatusBarHeight() {
        int result = 80;
        int resourceId = getResources().getIdentifier("window_title_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public void main(ATKViewContainer rootView) {

    }
}
