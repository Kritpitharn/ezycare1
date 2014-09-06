package com.example.easycare1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Conditionweight extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	

		Button nextconditionweight = (Button)findViewById(R.id.nextconclusion);
		nextconditionweight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditionperiodoftime.class);
				startActivity(i);
			}
	});
		Button backconditionweight = (Button)findViewById(R.id.backbloodpressure);
		backconditionweight.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Menupage.class);
				startActivity(i);
			}
		});
	
	}
}
