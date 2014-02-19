package com.vfonte.filesync.view;

import com.vfonte.filesync.R;
import com.vfonte.filesync.R.layout;
import com.vfonte.filesync.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FileListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.file_list, menu);
		return true;
	}

}
