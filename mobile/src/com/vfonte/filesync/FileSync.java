package com.vfonte.filesync;

import android.app.Application;
import android.content.Context;


public class FileSync extends Application {

	private static Context context;

	public void onCreate() {
		super.onCreate();
		FileSync.context = getApplicationContext();
	}

	public static Context getAppContext() {
		return FileSync.context;
	}

}
