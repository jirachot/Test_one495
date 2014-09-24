package app.jirachot.test_one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn_add, btn_show;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//mydbClass495 class495 = new mydbClass495(this);
		//class495.getWritableDatabase();

		btn_add = (Button) findViewById(R.id.btn_add);
		btn_show = (Button) findViewById(R.id.btn_show);
		btn_add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (v == btn_add) {

					Intent add = new Intent(MainActivity.this,
							AddActivity495.class);
					startActivity(add);
				}

			}
		});
		btn_show.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (v == btn_show) {

					Intent show = new Intent(MainActivity.this,
							ShowActivity495.class);
					startActivity(show);
				}

			}
		});
	}

}
