package hioa.android.sumapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class SumApp extends Activity {

	EditText siffer1, siffer2;
	TextView tekst;
	ImageView image;
	int trykk = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_app);
        
        tekst = (TextView)findViewById(R.id.tekstS);
        siffer1 = (EditText)findViewById(R.id.siffer1);
        siffer2 = (EditText)findViewById(R.id.siffer2);
        image = (ImageView)findViewById(R.id.imageView1);
        final Button add = (Button)findViewById(R.id.add);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				trykk++;
				try{
					double tall1 = Double.parseDouble(siffer1.getText().toString());
					double tall2 = Double.parseDouble(siffer2.getText().toString());
				
					tekst.setText((tall1 + tall2)+" ");
				}catch( Exception e)
				{
					tekst.setText("Kun siffer i feltene...");
				}
				if((trykk % 2)==0)
					image.setImageResource(R.drawable.and_ic);
				else
					image.setImageResource(R.drawable.test2);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sum_app, menu);
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
