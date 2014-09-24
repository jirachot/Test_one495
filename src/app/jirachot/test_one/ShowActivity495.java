package app.jirachot.test_one;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class ShowActivity495 extends Activity {
	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show495);
		
		listView = (ListView) findViewById(R.id.listView1);
		mydbClass495 mydbClass = new mydbClass495(this);
		ArrayList<HashMap<String, String>> arrayList = mydbClass
				.SelectAllData();

		SimpleAdapter adapter;
		adapter = new SimpleAdapter(ShowActivity495.this, arrayList,
				R.layout.show_item495, new String[] { "userID", "Name", "Score", "Grade" },
				new int[] { R.id.ColuserID, R.id.ColName, R.id.ColScore, R.id.ColGrade });
		listView.setAdapter(adapter);
	}

}
