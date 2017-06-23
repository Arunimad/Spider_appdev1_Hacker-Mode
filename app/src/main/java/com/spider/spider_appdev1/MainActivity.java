package com.spider.spider_appdev1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.AdapterView.OnItemClickListener;


import java.util.ArrayList;

import spider.com.Main2Activity;


import static com.spider.spider_appdev1.R.id.editText1;
import static com.spider.spider_appdev1.R.id.editText2;


public class MainActivity extends AppCompatActivity {






   ArrayList<String> items = new ArrayList<>();
    ArrayList<String> itemsnew = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final EditText ed = (EditText) findViewById(editText1);
        final EditText ed2 = (EditText) findViewById(editText2);
        final ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        final ArrayAdapter adapternew = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,itemsnew);
        final ListView list = (ListView)  findViewById(R.id.list1);






        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this ,"clicked",Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this,ed.getText(),Toast.LENGTH_LONG).show();



                items.add(ed.getText().toString());
                list.setAdapter(adapter);
                //items[0] ="me";
                //adapter.add(items);
                //adapter.notifyDataSetChanged();
                //adapter.add("me");
                //adapter.notifyDataSetChanged();



            }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      //Toast.makeText(MainActivity.this,ed2.getText(),Toast.LENGTH_LONG).show();
                                     //int l = Integer.valueOf(ed2.getText().toString());
                                      //int m = list.getCount();




                                      //int l = Integer.parseInt(lt);
                                      //int l = Integer.valueOf(ed2.getText().toString());

                                      int l =Integer.valueOf(ed2.getText().toString()).shortValue();



                                      items.remove(l);


                                      //Toast.makeText(MainActivity.this,l,Toast.LENGTH_LONG).show();


                                      // items.remove(l);
                                      adapter.notifyDataSetChanged();
                                      //itemsnew.addAll(items);


                                       //list.setAdapter(adapternew);
                                        //items.remove(ed2.getText().toString());

                                      //adapter.clear();



                                      Thread t = new Thread() {

                                          @Override
                                          public void run() {
                                              try {
                                                  while (!isInterrupted()) {
                                                      Thread
                                                              .sleep(1);
                                                      runOnUiThread(new Runnable() {
                                                          @Override
                                                          public void run() {

                                                              //adapternew.notifyDataSetChanged();


                                                          }
                                                      });
                                                  }
                                              } catch (InterruptedException e) {
                                              }
                                          }
                                      };

                                      t.start();










                                      //adapter.notifyDataSetInvalidated();
                                     // itemsnew =items;
                                     // list.setAdapter(adapter);
                                      //adapter.notifyDataSetChanged();




                                      //adapter.notifyDataSetChanged();
                                      //adapter.notifyDataSetInvalidated();
                                      //items.remove((int)l);
                                      //adapter.notifyDataSetChanged();


                                  }
                              });











        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                String entry = ((TextView) view).getText().toString();

                i.putExtra("go",entry);
                startActivity(i);
            }
        });







    }
}
