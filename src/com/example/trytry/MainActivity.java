package com.example.trytry;

import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.lang.StringBuilder;
import java.util.HashSet;
import java.util.Set;

/**
 * A simple Android app having a button which when pressed by user invokes the startListener() method
 * @author Aniya
 *
 */
public class MainActivity extends ActionBarActivity {

	/**
	 * This method is the entry point for app's lifecycle
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b = (Button)findViewById(R.id.button1);
		b.setOnClickListener(startListener);		//invokes the button click listener "startListener" which contains the relevant code snippets
		
	}
	
	private OnClickListener startListener = new OnClickListener() {
		public void onClick(View v) {
			 long time = System.currentTimeMillis();
			 
			for(int i = 0 ;i < 5 ; i++){
				Set<Integer> s = new HashSet<Integer>();
				s.add(i);
  				System.out.println(s.toString());
			}
			System.out.println( System.currentTimeMillis()-time );
		}
	};

	
	/**
	 * Optimized version using setLength()
	 */
	/*private OnClickListener startListener = new OnClickListener() {
		public void onClick(View v) {
			 long time = System.currentTimeMillis();
			StringBuilder sb = new StringBuilder();
             
			for(int i = 0 ;i < 5 ; i++){
				sb.setLength(0);   				//resets sb
				sb.append("abc");

				sb.append(i);

				System.out.println(sb.toString());
			}
			System.out.println( System.currentTimeMillis()-time );
		}
	}; */
	
	
	/**
	 * Optimized version using delete()
	 */
	/*private OnClickListener startListener = new OnClickListener() {
		public void onClick(View v) {
			 long time = System.currentTimeMillis();
			StringBuilder sb = new StringBuilder();
             
			for(int i = 0 ;i < 5 ; i++){
				sb = sb.delete(0, sb.length());			//resets sb
				sb.append("abc");

				sb.append(i);

				System.out.println(sb.toString());
			}
			System.out.println( System.currentTimeMillis()-time );
		}
	}; */
	
/*	
 *Unoptimized version
 * 
 */
	/*private OnClickListener startListener = new OnClickListener() {
		public void onClick(View v) {
			 long time = System.currentTimeMillis();
			 
			for(int i = 0 ;i < 5 ; i++){
				StringBuilder sb = new StringBuilder("abc");
                sb.append(i);

				System.out.println(sb.toString());
			}
			System.out.println( System.currentTimeMillis()-time );
		}
	};*/
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

