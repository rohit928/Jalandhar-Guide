package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class Womenss extends Activity {
    EditText edt1, edt2;
    Button btn;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.women);
        edt1 = (EditText) findViewById(R.id.editText);
        edt2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button2);


    }

    public void womens(View v)

    {
        Intent i = new Intent(this, Welcome.class);
        startActivity(i);
        finish();
    }


}



