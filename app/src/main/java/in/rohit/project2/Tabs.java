package in.rohit.project2;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

/**
 * Created by Ishadeep on 27-04-2015.
 */
public class Tabs extends Activity {
    private TabHost tabs = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.womens);
        tabs = (TabHost) findViewById(R.id.tabhost);
        tabs.setup();
        TabHost.TabSpec spec = tabs.newTabSpec("btn1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("View Profile", null);
        tabs.addTab(spec);
        Intent intent = new Intent().setClass(this, Emergency.class);
       spec = tabs.newTabSpec("tab2");
        spec.setContent(R.id.tabnew);


        spec.setIndicator("Emergency");
        tabs.addTab(spec);




    }

        public void emergency(View view) {

    }

    }





