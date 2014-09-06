package com.example.easycare1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menupage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.menupage);
		super.onCreate(savedInstanceState);

		Button sendmessage = (Button)findViewById(R.id.sendmessage);
		sendmessage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Newmessageorinbox.class);
				startActivity(i);
				
			}
		});	
		

		Button watchgraph = (Button)findViewById(R.id.watchgraph);	
		watchgraph.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Watchgraph.class);
				startActivity(i);
			}
		});
		
		Button sendcondition = (Button)findViewById(R.id.sendcondition);
		sendcondition.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Conditionweight.class);
				startActivity(i);
			}
		});
		
		
	
}
}