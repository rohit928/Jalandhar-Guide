package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Near extends Activity {


    ImageView im;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.near_places);

    }
    public void Near(View v)

    {
        Intent i = new Intent(this, NextActivity.class);
        startActivity(i);
        finish();
    }
    public void Prvs(View v)

    {
        Intent i = new Intent(this, Tourism.class);
        startActivity(i);
        finish();
    }
    public void Schools(View v)

    {
        Intent i = new Intent(this, Schools.class);
        startActivity(i);
        finish();
    }
    public void ATM(View v)

    {
        Intent i = new Intent(this, ATM.class);
        startActivity(i);
        finish();
    }
    public void Bank(View v)

    {
        Intent i = new Intent(this, Bank.class);
        startActivity(i);
        finish();
    }
    public void Colleges(View v)

    {
        Intent i = new Intent(this, College.class);
        startActivity(i);
        finish();
    }
    public void Hospitals(View v)

    {
        Intent i = new Intent(this, Hospitals.class);
        startActivity(i);
        finish();
    }
    public void Restaurents(View v)

    {
        Intent i = new Intent(this, Restaurents.class);
        startActivity(i);
        finish();
    }




}

