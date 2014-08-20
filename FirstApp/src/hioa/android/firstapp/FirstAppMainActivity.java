package hioa.android.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Telephony.Sms.Conversations;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FirstAppMainActivity extends Activity {

	EditText tekst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_app_main);
        
        tekst = (EditText)findViewById(R.id.temp);
        final Button gradKnapp = (Button)findViewById(R.id.tilgrader);
        final Button fahrenheitKnapp = (Button)findViewById(R.id.tilfahrenheit);
        
        gradKnapp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float innverdi = Float.parseFloat(tekst.getText().toString());
				tekst.setText(String.valueOf(convertFahrenheitToCelsius(innverdi)));
			}
		});
        
        fahrenheitKnapp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				float innverdi = Float.parseFloat(tekst.getText().toString());
				tekst.setText(String.valueOf(convertCelsiusToFahrenheit(innverdi)));
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first_app_main, menu);
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
    
    float convertFahrenheitToCelsius(float inn){
    	return((inn- 32) * 5/9);
    }
    float convertCelsiusToFahrenheit(float inn2){
    	return((inn2 * 9) / 5) + 32;
    }
    
}
