package com.example.sked;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.support.v4.app.NavUtils;

public class Otvaraj extends Activity {
	WebView myWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		WebView myWebView = (WebView) findViewById(R.id.webview);
		//Otvara slike rasporeda ovisno o pritisnutom gumbu
		int id = getIntent().getIntExtra("button_id", 200);
		switch (id) {
		 case 1:
			 myWebView.loadUrl("http://www.etfos.unios.hr/raspored/pred1_ele_17.jpg");
        break;
         case 2:
        	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/pred2_ele_17.jpg");
        break;
         case 3:
        	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/pred3_ele_17.jpg");
        break;
         case 4:
			 myWebView.loadUrl("http://www.etfos.unios.hr/raspored/pred1_rac_17.jpg");
        break;
         case 5:
        	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/pred2_rac_17.jpg");
        break;
         case 6:
        	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/pred3_rac_17.jpg");
        break;
         case 7:
         	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/dipl1_ene_17.jpg");
        break;
         case 8:
           	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/dipl2_ene_17.jpg");
          break;
         case 9:
          	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/dipl1_kom_17.jpg");
         break;
         case 10:
           	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/dipl2_kom_17.jpg");
          break;
         case 11:
           	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/dipl1_rac_17.jpg");
          break;
         case 12:
           	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/dipl2_rac_17.jpg");
          break;
         case 13:
            	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str1_ele_17.jpg");
           break;
         case 14:
         	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str2_ene_17.jpg");
        break;
         case 15:
         	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str3_ene_17.jpg");
        break;
         case 16:
          	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str1_ele_17.jpg");
         break;
         case 17:
          	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str2_aut_17.jpg");
         break;
         case 18:
          	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str3_aut_17.jpg");
         break;
         case 19:
           	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str1_inf_17.jpg");
          break;
         case 20:
           	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str2_inf_17.jpg");
          break;
         case 21:
           	myWebView.loadUrl("http://www.etfos.unios.hr/raspored/str3_inf_17.jpg");
          break;
         case 200:
        	myWebView.loadUrl("http://www.google.hr");
        break;
   	 }
			

	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.otvaraj, menu);
		return true;
	}
	
// Pamti stanje nakon pritiska tipke Home
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
