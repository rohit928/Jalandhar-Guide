package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Traffic extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traffic);
    }
    public void Back7(View v)

    {
        Intent i = new Intent(this, OneTouch.class);
        startActivity(i);
        finish();
    }
}
