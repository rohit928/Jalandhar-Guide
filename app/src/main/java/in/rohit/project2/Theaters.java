package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Theaters extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theatre_jal);
    }
    public void Big(View v)

    {
        Intent i = new Intent(this, Cinema.class);
        startActivity(i);
        finish();
    }
    public void Back(View v)

    {
        Intent i = new Intent(this, Interest.class);
        startActivity(i);
        finish();
    }
    public void Pvr (View v)

    {
        Intent i = new Intent(this, PVR.class);
        startActivity(i);
        finish();
    }
    public void Sarb (View v)

    {
        Intent i = new Intent(this, Sarb.class);
        startActivity(i);
        finish();
    }
    public void Curo (View v)

    {
        Intent i = new Intent(this, Curo.class);
        startActivity(i);
        finish();
    }

}
