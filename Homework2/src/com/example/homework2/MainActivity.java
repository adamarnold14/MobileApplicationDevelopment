package com.example.homework2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	EditText listPrice;
	EditText saved;
	EditText pay;
	int savedAmount;
	int payAmount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listPrice = (EditText) findViewById(R.id.editText1);
		saved = (EditText) findViewById(R.id.editText2);
		pay = (EditText) findViewById(R.id.editText3);
		
		RadioButton rb = (RadioButton) findViewById(R.id.radio0);
		rb.setOnCheckedChangeListener( new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				savedAmount = Integer.parseInt(listPrice) * 0.9;
				
			});
		}
		
		
		rb = (RadioButton) findViewById(R.id.radio1);
		rb.setOnCheckedChangeListener((OnCheckedChangeListener) this);
		
		rb = (RadioButton) findViewById(R.id.radio2);
		rb.setOnCheckedChangeListener((OnCheckedChangeListener) this);
		
		rb = (RadioButton) findViewById(R.id.radioButton1);
		rb.setOnCheckedChangeListener((OnCheckedChangeListener) this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
