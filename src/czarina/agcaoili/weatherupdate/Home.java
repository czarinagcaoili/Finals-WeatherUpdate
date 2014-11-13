package czarina.agcaoili.weatherupdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

public class Home extends Activity {
    WebView webView;
    Button forecast, hotlines;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    
		setContentView(R.layout.home);

		webView = (WebView)findViewById(R.id.webView);
		forecast = (Button)findViewById(R.id.forecast);
		hotlines = (Button)findViewById(R.id.hotlines);
		
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("https://mobile.twitter.com/dost_pagasa");
		webView.getSettings().setUseWideViewPort(false);
		webView.getSettings().setBuiltInZoomControls(false);
		
		forecast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Forecast.class);
                startActivity(intent);
                finish();
            }
        });
		
		hotlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Hotlines.class);
                startActivity(intent);
                finish();
            }
        });
		
	}

	

}
