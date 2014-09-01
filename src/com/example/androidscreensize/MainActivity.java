package com.example.androidscreensize;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
       Button button = (Button)findViewById(R.id.id);
       button.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
	        DisplayMetrics displayMetrics = new DisplayMetrics();
	        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
	       int displayWidth = displayMetrics.widthPixels;
	       int displayHeight = displayMetrics.heightPixels;
	       String text = "width = " + String.valueOf(displayWidth);
	       text = text + " Height = " + String.valueOf(displayHeight);
	       text = text + " densith = " + String.valueOf(displayMetrics.density);
	       text = text + " densithDpi = " + String.valueOf(displayMetrics.densityDpi);
	       float widthDPi = displayWidth * 160 /displayMetrics.densityDpi;
	       float heightDPi = displayHeight * 160 /displayMetrics.densityDpi;
	       text = text + " totalDpWith = " + String.valueOf(widthDPi);
	       text = text + " totalDpHeight = " + String.valueOf(heightDPi);
	       text = text + " values  = " + getResources().getString(R.string.values_res);
	       
	       Toast.makeText(MainActivity.this, text,Toast.LENGTH_LONG).show();
		}
	});
    }
    
    
    
}
