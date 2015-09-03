package in.rohit.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Places extends Activity {
    Button btn1,btn2,btn3,btn4,btn5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_interest);
        btn1=(Button)findViewById(R.id.button8);
        btn2=(Button)findViewById(R.id.button9);
        btn3=(Button)findViewById(R.id.button10);
        btn4=(Button)findViewById(R.id.button11);
        btn5=(Button)findViewById(R.id.button12);

    }
    public void Big(View v)

    {
        Intent i = new Intent(this, Big.class);
        startActivity(i);
        finish();
    }

}

