package com.example.easycare1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Newmessage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	

		ImageButton camerabutton = (ImageButton)findViewById(R.id.camerabutton);
		camerabutton.setOnClickListener(new OnClickListener() {

		public void onClick(View v) {
			Intent i = new Intent(getApplicationContext(), Newmessageorinbox.class);
			startActivity(i);
			
		}
	});
}
}

	
	
	