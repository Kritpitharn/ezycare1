package com.example.easycare1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Conditionbloodpressure extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	Button nexttosignofheartfailure = (Button)findViewById(R.id.nextconclusion);
	nexttosignofheartfailure.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(getApplicationContext(), ConditionSignofheartfailure.class);
			startActivity(i);
		}
	});

	Button backtosignofheartfailure = (Button)findViewById(R.id.backbloodpressure);
	backtosignofheartfailure.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(getApplicationContext(), Conditiondoseoflasix.class);
			startActivity(i);
		}
	});
}
}
