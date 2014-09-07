package com.arctouch.toolkit;

/**
 * Created by felipehomma on 8/23/14.
 */
public class ATKRectangle {
    public int x;
    public int y;
    public int width;
    public int height;

    public ATKRectangle(int x, int y, int width, int height) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public ATKRectangle assignFrom(ATKRectangle other) {
        this.x = other.x;
        this.y = other.y;
        this.width = other.width;
        this.height = other.height;
        return this;
    }

}
