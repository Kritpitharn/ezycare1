package com.example.easycare1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Conditionconclusion extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	

		Button backsignofheartfailure = (Button)findViewById(R.id.backsignofheartfailure);
		backsignofheartfailure.setOnClickListener(new OnClickListener() {
	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), ConditionSignofheartfailure.class);
				startActivity(i);
			}
		});
	
	}
}
