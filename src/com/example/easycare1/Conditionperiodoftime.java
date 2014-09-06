package com.example.easycare1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Conditionperiodoftime extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Button morningbutton = (Button)findViewById(R.id.morningbutton);
		morningbutton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditiondoseoflasix.class);
				startActivity(i);
			}
			
		});
		
		Button afternoon = (Button)findViewById(R.id.afternoonbutton);
		afternoon.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditiondoseoflasix.class);
				startActivity(i);
	}
		});
	
		Button evening = (Button)findViewById(R.id.eveningbutton);
		evening.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditiondoseoflasix.class);
				startActivity(i);
			}
		});
		
		Button backtoweight = (Button)findViewById(R.id.backtoweight);
		backtoweight.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditionweight.class);
				startActivity(i);
			}
		});
		
	
}
}