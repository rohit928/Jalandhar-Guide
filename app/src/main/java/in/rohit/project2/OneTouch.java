package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ishadeep on 14-05-2015.
 */
public class OneTouch extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_touch);


    }

    public void Touch(View view) {

        Intent i = new Intent(this,OneTouch.class);
        startActivity(i);
        finish();
    }
    public void Back5(View view) {

        Intent i = new Intent(this,Police.class);
        startActivity(i);
        finish();
    }
    public void Police(View v)

    {
        Intent i = new Intent(this, Police.class);
        startActivity(i);
        finish();
    }
    public void Traffic(View v)

    {
        Intent i = new Intent(this, Traffic.class);
        startActivity(i);
        finish();
    }


}