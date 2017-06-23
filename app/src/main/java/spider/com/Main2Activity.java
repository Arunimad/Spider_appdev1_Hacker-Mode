package spider.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.spider.spider_appdev1.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        String j = (String) b.get("go");


        TextView textt = (TextView) findViewById(R.id.textt);
        textt.setText(j);


    }
}

