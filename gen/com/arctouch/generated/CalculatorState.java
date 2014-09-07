package com.arctouch.generated;
import java.util.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.arctouch.toolkit.*;


public class CalculatorState {
	public final int None=0;
	public final int Sum=1;
	public final int Sub=2;
	public int acc=0;
	public int newValue=0;
	public int op=0;

	public void addDigit (final int digit) {
		newValue=newValue * 10 + digit;

	}
	public void doOperation () {
		if (op == Sum) {
				 acc+=newValue;

		} else {
				 if (op == Sub) {
						 acc-=newValue;

				} else {
						 acc=newValue;

				};

		};
		newValue=0;

	}
	
}