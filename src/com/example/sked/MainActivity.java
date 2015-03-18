package com.example.sked;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	public static Context appContext;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appContext = getApplicationContext();

       //Dodavanje tabova
        ActionBar actionbar = getActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        ActionBar.Tab PTab = actionbar.newTab().setText("Preddiplomski");
        ActionBar.Tab DTab = actionbar.newTab().setText("Diplomski");
        ActionBar.Tab STab = actionbar.newTab().setText("Stručni");
        
        Fragment PredFragment = new AFragment();
        Fragment DiplFragment = new BFragment();
        Fragment StrFragment = new CFragment();

        PTab.setTabListener(new MyTabsListener(PredFragment));
        DTab.setTabListener(new MyTabsListener(DiplFragment));
        STab.setTabListener(new MyTabsListener(StrFragment));

        actionbar.addTab(PTab);
        actionbar.addTab(DTab);
        actionbar.addTab(STab);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    //Action barovi
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		//Otvaranje kalendara
			case R.id.menuitem_cal:
				Calendar cal = new GregorianCalendar(); 
				long time = cal.getTime().getTime(); 
				Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon(); 
				builder.appendPath("time"); 
				builder.appendPath(Long.toString(time)); 
				Intent intent = new Intent(Intent.ACTION_VIEW, builder.build()); 
				startActivity(intent); 
				return true;
				
		 //Otvaranje teksta o informacijama
			case R.id.menuitem_about:
				Toast.makeText(appContext, "Aplikaciju izradio: Nikola Ravnjak", Toast.LENGTH_LONG).show();
				return true;
		 //Zatvaranje aplikacije
			case R.id.menuitem_quit:
				System.exit(0);
				return true;
		}
		return false;
	}

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("tab", getActionBar().getSelectedNavigationIndex());
    }
    //Funkcija koja se pokreće prilikom pritiska gumbova
    public void OpenIt(View v) {
    	 Intent i = new Intent(getApplicationContext(), Otvaraj.class);
    	 switch(v.getId()){
         case R.id.Button1:
        	 i.putExtra("button_id", 1);
         break;
         case R.id.Button2:
        	 i.putExtra("button_id", 2);
         break;
         case R.id.Button3:
        	 i.putExtra("button_id", 3);
         break;
         case R.id.Button4:
        	 i.putExtra("button_id", 4);
         break;
         case R.id.Button5:
        	 i.putExtra("button_id", 5);
         break;
         case R.id.Button6:
        	 i.putExtra("button_id", 6);
         break;
         case R.id.Button7:
        	 i.putExtra("button_id", 7);
         break;
         case R.id.Button8:
        	 i.putExtra("button_id", 8);
         break;
         case R.id.Button9:
        	 i.putExtra("button_id", 9);
         break;
         case R.id.Button10:
        	 i.putExtra("button_id", 10);
         break;
         case R.id.Button11:
        	 i.putExtra("button_id", 11);
         break;
         case R.id.Button12:
        	 i.putExtra("button_id", 12);
         break;
         case R.id.Button13:
        	 i.putExtra("button_id", 13);
         break;
         case R.id.Button14:
        	 i.putExtra("button_id", 14);
         break;
         case R.id.Button15:
        	 i.putExtra("button_id", 15);
         break;
         case R.id.Button16:
        	 i.putExtra("button_id", 16);
         break;
         case R.id.Button17:
        	 i.putExtra("button_id", 17);
         break;
         case R.id.Button18:
        	 i.putExtra("button_id", 18);
         break;
         case R.id.Button19:
        	 i.putExtra("button_id", 19);
         break;
         case R.id.Button20:
        	 i.putExtra("button_id", 20);
         break;
         case R.id.Button21:
        	 i.putExtra("button_id", 21);
         break;
    	 }
    	startActivity(i);
    }
}


//Rutina koja se obavlja prilikom klikanja na tabove
class MyTabsListener implements ActionBar.TabListener {
	public Fragment fragment;

	public MyTabsListener(Fragment fragment) {
		this.fragment = fragment;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		//Toast.makeText(MainActivity.appContext, "Reselected!", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		ft.replace(R.id.fragment_container, fragment);
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}

}
