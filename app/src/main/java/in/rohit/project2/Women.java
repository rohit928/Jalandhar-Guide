package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class Women  extends Activity {
    EditText edt1, edt2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.women);
        EditText edt1 = (EditText) findViewById(R.id.editText);
        EditText edt2 = (EditText) findViewById(R.id.editText2);


    }

    public void womens(View v)

    {
        Intent i = new Intent(this, Welcome.class);
        startActivity(i);
        finish();
    }

}