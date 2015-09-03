package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class Directory extends Activity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directory);
    }
    public void Backs(View v)

    {
        Intent i = new Intent(this, Admin.class);
        startActivity(i);
        finish();
    }
}
