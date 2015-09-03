package in.rohit.project2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import yweathergetter4a.YahooWeather;


public class MainActivity extends ActionBarActivity  {
    private ImageView mIvWeather0;
    private TextView mTvWeather0;
    private TextView mTvErrorMessage;
    private TextView mTvTitle;
    private EditText mEtAreaOfCity;
    private Button mBtSearch;
    private Button mBtGPS;
    private LinearLayout mWeatherInfosLayout;
    private YahooWeather mYahooWeather = YahooWeather.getInstance(5000, 5000, true);

    private ProgressDialog mProgressDialog;
    ImageButton img;
    EditText edt1, edt2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        // mYahooWeather.setExceptionListener(this);



        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.activity_main);
                // close this activity
                //       finish();
            }
        }, 4 * 1000); // wait for 5 seconds


        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.second1);
                // close this activity
                //       finish();
            }
        }, 4 * 500); // wait for 5 seconds

        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.second2);
                // close this activity
                //       finish();
            }
        }, 5 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.second3);
                // close this activity
                //       finish();
            }
        }, 6 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.second4);
                // close this activity
                //       finish();
            }
        }, 7 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.third);
                // close this activity
                //       finish();
            }
        }, 8 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.third2);
                // close this activity
                //       finish();
            }
        }, 9 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.third4);
                // close this activity
                //       finish();
            }
        }, 10 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.fourth);
                // close this activity
                //       finish();
            }
        }, 11 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.fifth);
                // close this activity
                //       finish();
            }
        }, 12 * 500); // wait for 5 seconds
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                //    Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                //  startActivity(i);
                setContentView(R.layout.mainpage);


                // close this activity
                //inish();
            }
        }, 13 * 500); // wait for 5 seconds
    }
        public void Clicks(View v)
        {
            Intent i = new Intent(this, Women.class);
            startActivity(i);
            finish();
        }

    public void Logos(View v)
         {
        Intent i = new Intent(this, Logos.class);
        startActivity(i);
        finish();
    }
    public void Tourism(View v)
    {
        Intent i = new Intent(this, Tourism.class);
        startActivity(i);
        finish();
    }
    public void Touch(View v)
    {
        Intent i = new Intent(this, OneTouch.class);
        startActivity(i);
        finish();
    }
    public void Admin(View v)
    {
        Intent i = new Intent(this, Admin.class);
        startActivity(i);
        finish();
    }




    }
