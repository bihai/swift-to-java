package com.arctouch.generated;
import java.util.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.arctouch.toolkit.*;


public class DigitListener extends ATKClickListener {
	public CalculatorState calculator;
	public com.arctouch.toolkit.ATKLabel output;

	public void onClick (final ATKView view) {
		com.arctouch.toolkit.ATKButton button=((com.arctouch.toolkit.ATKButton) view);
		String text=button . getText().toString ();
		int digit=Integer.valueOf (text);
		calculator . addDigit (digit);
		output . setText (String.valueOf (calculator . newValue));

	}
	
}