package com.vfonte.filesync.view;

import com.vfonte.filesync.FileSync;
import com.vfonte.filesync.R;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AccountsFragment extends Fragment  {
	private ListView listView;
	private SimpleArrayAdapter adapter;
	private String[] accounts;

	public AccountsFragment() {
		// Empty constructor required for fragment subclasses
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_list, container, false);
		listView = (ListView) rootView.findViewById(android.R.id.list);

		accounts = new String[] {"A", "B", "C"};

		adapter = new SimpleArrayAdapter(FileSync.getAppContext(), accounts);

		// set the adapter for the ListFragment
		listView.setAdapter(adapter);
		// set selection mode
	    listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

	        @Override
	        public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
				// setup new account
				startActivity(new Intent(FileSync.getAppContext(), CreateAccountActivity.class));
	        }

	      });
		return rootView;
	}

	public class SimpleArrayAdapter extends ArrayAdapter<String> {
		private final Context context;
		private final String[] values;
		private final static int layout = R.layout.accounts_list_item;

		public SimpleArrayAdapter(Context context, String[] values) {
			super(context, layout, values);
			this.context = context;
			this.values = values;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			// inflate the item view
		    View rowView = inflater.inflate(layout, parent, false);

		    // Set the session name text view to name
		    TextView textView = (TextView) rowView.findViewById(R.id.account_text_view);
		    textView.setText(this.values[position]);
			return rowView;
		}
	}
}