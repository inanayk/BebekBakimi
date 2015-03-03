package com.makaleler.bebekbakimi;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Index extends ListActivity {

	String classes[] = { "Start from first page","Newsfeed", "Profile", "ProfileSettings" , "Friends", "Invite", "Create Your Profile" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		setListAdapter(new ArrayAdapter<String>(Index.this, R.layout.activity_main, classes));   //android.R.layout.simple_selectable_list_item 
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		super.onListItemClick(l, v, position, id);
		String localClasses = classes[position];
				
		try {
			Class ourClass = Class.forName("com.makaleler.bebekbakimi"+localClasses);
			Intent ourIntent = new Intent(Index.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
