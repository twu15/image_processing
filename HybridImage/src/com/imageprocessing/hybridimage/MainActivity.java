package com.imageprocessing.hybridimage;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

	Button galleryButton;
	Button cameraButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        galleryButton = (Button) this.findViewById(R.id.galleryButton);
        cameraButton = (Button) this.findViewById(R.id.cameraButton);
        
        galleryButton.setOnClickListener(this);
        cameraButton.setOnClickListener(this);
    }
    
    @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == galleryButton) Log.i("galleryButton", "clicked");
		if(v == cameraButton) {
			Log.i("cameraButton", "clicked");
			
		}
	}

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
