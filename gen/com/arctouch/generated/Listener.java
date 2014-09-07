package com.arctouch.generated;
import java.util.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.arctouch.toolkit.*;


public class Listener extends ATKClickListener {
	public void onClick (final ATKView view) {
		final com.arctouch.toolkit.ATKButton button=((com.arctouch.toolkit.ATKButton) view);
		final String s=button . getText ();
		System.out.println (s);

	}
	
}