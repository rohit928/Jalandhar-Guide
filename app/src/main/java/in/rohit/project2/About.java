package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ishadeep on 11-06-2015.
 */
public class About extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abouts);
    }
    public void Backy(View v)

    {
        Intent i = new Intent(this,Tourism.class);
        startActivity(i);
        finish();
    }
}
