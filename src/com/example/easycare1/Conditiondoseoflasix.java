package com.example.easycare1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Conditiondoseoflasix extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	

		Button nextbloodpressure = (Button)findViewById(R.id.nexttobloodpressure);
		nextbloodpressure.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditionperiodoftime.class);
				startActivity(i);
			}
	});
		
		Button backperiodoftime = (Button)findViewById(R.id.backbloodpressure);
		backperiodoftime.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditionperiodoftime.class);
				startActivity(i);
			}
	});
	
	}
}
