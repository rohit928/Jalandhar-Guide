package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Tourism extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourism);
    }
    public void Nearby(View v)
    {
        Intent i = new Intent(this, Near.class);
        startActivity(i);
        finish();
    }
    public void Places(View v)
    {
        Intent i = new Intent(this, Interest.class);
        startActivity(i);
        finish();
    }
    public void Back(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
    public void About(View v)
    {
        Intent i = new Intent(this, About.class);
        startActivity(i);
        finish();
    }


}
