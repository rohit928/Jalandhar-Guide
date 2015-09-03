package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Interest extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
    }
    public void Back1(View v)
    {
        Intent i = new Intent(this,Tourism.class);
        startActivity(i);
        finish();
    }
    public void Theaters(View v)
    {
        Intent i = new Intent(this, Theaters.class);
        startActivity(i);
        finish();
    }

}
