package com.example.androidscreensize;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
       Button button = (Button)findViewById(R.id.id);
       mTextView = (TextView)findViewById(R.id.textview);
       button.setOnClickListener(new View.OnClickListener() {
	
    	  
		@Override
		public void onClick(View v) {
	        DisplayMetrics displayMetrics = new DisplayMetrics();
	        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
	       int displayWidth = displayMetrics.widthPixels;
	       int displayHeight = displayMetrics.heightPixels;
	       String text = " width px = " + String.valueOf(displayWidth);
	       text = text + "\n Height px = " + String.valueOf(displayHeight);
	       text = text + "\n densith(px/dp) = " + String.valueOf(displayMetrics.density);
	       text = text + "\n densithDpi = " + String.valueOf(displayMetrics.densityDpi);
	       float widthDPi = displayWidth * 160 /displayMetrics.densityDpi;
	       float heightDPi = displayHeight * 160 /displayMetrics.densityDpi;
	       text = text + "\n totalDpWith = " + String.valueOf(widthDPi);
	       text = text + "\n totalDpHeight = " + String.valueOf(heightDPi);
	       text = text + "\n values  = " + getResources().getString(R.string.values_res);
	       
	       
	       
	      mTextView.setText(text); 
		}
	});
    }
    
    
    
}
