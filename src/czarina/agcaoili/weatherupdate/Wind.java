package czarina.agcaoili.weatherupdate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

public class Wind extends Activity {
    Button home, hotlines,forecast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    
		setContentView(R.layout.wind);

		
		home = (Button)findViewById(R.id.home);
		hotlines = (Button)findViewById(R.id.hotlines);
		forecast = (Button)findViewById(R.id.forecast);
		
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
		
		forecast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(),
                        Forecast.class);
                startActivity(intent);
                finish();
            }
        });
        
		
	}

	

}
