package czarina.agcaoili.weatherupdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

public class Forecast extends Activity {
    Button home, hotlines;
    Button stormsignals,rainfall,thunderstorm,icons,sky,rain,wind,sea;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    
		setContentView(R.layout.forecast);

		
		home = (Button)findViewById(R.id.home);
		hotlines = (Button)findViewById(R.id.hotlines);
		stormsignals = (Button)findViewById(R.id.stormsignals);
		rainfall = (Button)findViewById(R.id.rainfall);
		thunderstorm = (Button)findViewById(R.id.thunderstorm);
		icons = (Button)findViewById(R.id.icons);
		sky = (Button)findViewById(R.id.sky);
		rain = (Button)findViewById(R.id.rain);
		wind = (Button)findViewById(R.id.wind);
		sea = (Button)findViewById(R.id.sea);
		
		home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Home.class);
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
		
		
		// buttons
		
		stormsignals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        StormSignals.class);
                startActivity(intent);
                finish();
            }
        });
		rainfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Rainfall.class);
                startActivity(intent);
                finish();
            }
        });
		thunderstorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Thunderstorm.class);
                startActivity(intent);
                finish();
            }
        });
		icons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Icons.class);
                startActivity(intent);
                finish();
            }
        });
		sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Sky.class);
                startActivity(intent);
                finish();
            }
        });
		rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Rain.class);
                startActivity(intent);
                finish();
            }
        });
		wind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Wind.class);
                startActivity(intent);
                finish();
            }
        });
		sea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Sea.class);
                startActivity(intent);
                finish();
            }
        });
        
		
	}

	

}
