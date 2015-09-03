package in.rohit.project2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class Big extends Activity {
    Button btna;
    protected void onCreate(Bundle savedInstanceState) {
        btna=(Button)findViewById(R.id.button13);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.big_cinema);
    }



}
