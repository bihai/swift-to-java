package com.arctouch.generated;
import java.util.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.arctouch.toolkit.*;


public class HatTrick extends ATKApplication {
	public final CalculatorState calculator=new CalculatorState ();
	public DigitListener digitListener=new DigitListener ();
	public SumListener sumListener=new SumListener ();
	public SubListener subListener=new SubListener ();
	public ResultListener resultListener=new ResultListener ();

	public void main (final ATKViewContainer rootView) {
		final com.arctouch.toolkit.ATKRectangle frame=rootView . getFrame ();
		com.arctouch.toolkit.ATKLabel label=this . createDisplay (20,60,frame);
		this . createDigits (20,60,frame);
		this . createOperations (20,60,frame);
		digitListener . calculator=calculator;
		digitListener . output=label;
		sumListener . calculator=calculator;
		sumListener . output=label;
		subListener . calculator=calculator;
		subListener . output=label;
		resultListener . calculator=calculator;
		resultListener . output=label;

	}
	public ATKLabel createDisplay (final int marginOffset, final int height, final ATKRectangle canvasRect) {
		com.arctouch.toolkit.ATKLabel label=new ATKLabel ();
		label . setText ("0");
		label . setFrame (new ATKRectangle (marginOffset, marginOffset, canvasRect . width - 2 * marginOffset, height));
		rootView . addChildView (label);
		return label;

	}
	public void createOperations (final int marginOffset, final int buttonSize, final ATKRectangle canvasRect) {
		final int gap=1;
		final int buttonGap=buttonSize + gap;
		int topOffset=canvasRect . height - marginOffset - 3 * buttonGap - buttonSize;
		final int rightOffset=canvasRect . width - marginOffset - buttonSize;
		com.arctouch.toolkit.ATKRectangle rect=new ATKRectangle (rightOffset, 0, buttonSize, buttonSize);
		com.arctouch.toolkit.ATKButton sum=new ATKButton ();
		rect . y=topOffset;
		sum . setFrame (rect);
		sum . onClickListener=sumListener;
		sum . setText ("+");
		rootView . addChildView (sum);
		topOffset+=buttonGap;
		com.arctouch.toolkit.ATKButton sub=new ATKButton ();
		rect . y=topOffset;
		sub . setFrame (rect);
		sub . onClickListener=subListener;
		sub . setText ("-");
		rootView . addChildView (sub);
		topOffset+=2 * buttonGap;
		com.arctouch.toolkit.ATKButton enter=new ATKButton ();
		rect . y=topOffset;
		enter . setFrame (rect);
		enter . onClickListener=resultListener;
		enter . setText ("=");
		rootView . addChildView (enter);

	}
	public void createDigits (final int marginOffset, final int buttonSize, final ATKRectangle canvasRect) {
		final int gap=1;
		final int buttonGap=buttonSize + gap;
		final int topOffset=canvasRect . height - marginOffset - 3 * buttonGap - buttonSize;
		com.arctouch.toolkit.ATKRectangle rect=new ATKRectangle (0, 0, buttonSize, buttonSize);
		com.arctouch.toolkit.ATKButton btn;
		for (int i=1;i < 10;i+=1) {
				 btn=new ATKButton ();
				 btn . setText (String.valueOf (i));
				 final int pos=9 - i;
				 final int col=pos % 3;
				 final int row=pos / 3;
				 rect . x=marginOffset + 2 * buttonGap - col * buttonGap;
				 rect . y=topOffset + row * buttonGap;
				 btn . setFrame (rect);
				 btn . onClickListener=digitListener;
				 rootView . addChildView (btn);

		};
		btn=new ATKButton ();
		btn . setText ("0");
		rect . x=marginOffset;
		rect . y=topOffset + 3 * buttonGap;
		rect . width=2 * buttonGap + buttonSize;
		btn . setFrame (rect);
		btn . onClickListener=digitListener;
		rootView . addChildView (btn);

	}
	
}