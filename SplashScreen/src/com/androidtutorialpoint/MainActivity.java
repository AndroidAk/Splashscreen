package com.androidtutorialpoint;



import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;

import android.content.Intent;



public class MainActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		 int secondsDelayed = 1;
	        new Handler().postDelayed(new Runnable() {
	                public void run() {
	                        startActivity(new Intent(MainActivity.this, HomePage.class));
	                       
	                       
	                        finish();
	                       
	                }
	        }, secondsDelayed * 3000);
	    }
	}