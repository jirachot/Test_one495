package app.jirachot.test_one;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import app.jirachot.test_one.R.id;

public class AddActivity495 extends Activity {

	private Button btn_save, btngrade;
	private EditText edtname, edtscore;
	private TextView txtgrade;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.add_495);

		btn_save = (Button) findViewById(R.id.btn_save);
		btngrade = (Button) findViewById(R.id.btn_grade);
		edtscore = (EditText) findViewById(R.id.edtscore);
		txtgrade = (TextView) findViewById(R.id.txtgrade);
		btn_save.setOnClickListener(new OnClickListener() {
		
		
		
			@Override
			public void onClick(View v) {

				SaveData();
			
			}

		});
		btngrade.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float grade = Float.valueOf(edtscore.getText().toString());
				
				if(grade >= 80 && grade <=100){
					txtgrade.setText("A");
				}
				else if(grade >=75 && grade <80){
					txtgrade.setText("B+");
				}
				else if(grade >=70 && grade <75){
					txtgrade.setText("B");
				}
				else if(grade >=65 && grade <70){
					txtgrade.setText("C+");
				}
				else if(grade >=60 && grade <65){
					txtgrade.setText("C");
				}
				else if(grade >=55 && grade <60){
					txtgrade.setText("D+");
				}
				else if(grade >=50 && grade <55){
					txtgrade.setText("D");
				}
				else {
					txtgrade.setText("F");
				}
			}
		});
		
	}

	private void SaveData() {
		edtname = (EditText) findViewById(R.id.edtname);
		edtscore = (EditText) findViewById(R.id.edtscore);
		mydbClass495 mydbClass = new mydbClass495(this);

		long saveStatus = mydbClass.InsertData(edtname.getText().toString(),
				edtscore.getText().toString(),txtgrade.getText().toString() );

		if (saveStatus <= 0) {
			Log.d("Error Save", "Error!");
		}

		Toast.makeText(getApplicationContext(), "Add Data Successfully",
				Toast.LENGTH_SHORT).show();

	}
	

}
