package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Admin extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_guide);

    }
    public void Holidays(View v)
    {
        Intent i = new Intent(this, Holidays.class);
        startActivity(i);
        finish();
    }
    public void Directory(View v)
    {
        Intent i = new Intent(this, Directory.class);
        startActivity(i);
        finish();
    }

}

