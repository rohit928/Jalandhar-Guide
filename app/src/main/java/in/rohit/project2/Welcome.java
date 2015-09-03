package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class Welcome extends Activity {
    EditText edt1, edt2, edt3, edt4, edt5;
    RadioGroup rg;
    Button btn4;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        edt1 = (EditText) findViewById(R.id.editText3);
        edt2 = (EditText) findViewById(R.id.editText4);
        edt2 = (EditText) findViewById(R.id.editText5);
        edt3 = (EditText) findViewById(R.id.editText6);
        edt4 = (EditText) findViewById(R.id.editText7);
        edt5 = (EditText) findViewById(R.id.editText8);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        btn4 = (Button) findViewById(R.id.btns);

    }


    public void tabs(View v)

    {
        Intent i = new Intent(this, Tabs.class);
        startActivity(i);
        finish();
    }

}
