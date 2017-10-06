package com.example.teacher.t2017100602;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    SimpleAdapter adapter;
    ArrayList<Map<String, String>> mydata = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        mydata.add(m1);
        HashMap<String, String> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        mydata.add(m2);
        HashMap<String, String> m3 = new HashMap<>();
        m3.put("city", "高雄");
        m3.put("code", "07");
        mydata.add(m3);
        adapter = new SimpleAdapter(MainActivity.this,
                mydata,
                android.R.layout.simple_list_item_2,
                new String[] {"city", "code"},
                new int[] {android.R.id.text1, android.R.id.text2});
        lv.setAdapter(adapter);

    }
}
