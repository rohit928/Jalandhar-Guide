package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Curo extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pvr_curo);
    }
    public void Back2(View v)

    {
        Intent i = new Intent(this, Theaters.class);
        startActivity(i);
        finish();
    }
}
