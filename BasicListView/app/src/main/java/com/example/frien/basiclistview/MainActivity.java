package com.example.frien.basiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView)findViewById(R.id.listview);

        ArrayList<HashMap<String, String>> mlist = new ArrayList<HashMap<String,String>>();

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("item1", "kwanhee");
        map.put("item2", "32");
        mlist.add(map);

        map = new HashMap<String, String>();
        map.put("item1","donggun");
        map.put("item2","24");
        mlist.add(map);
        map = new HashMap<String, String>();
        map.put("item1","jungsuk");
        map.put("item2","55");
        mlist.add(map);

        SimpleAdapter sap = new SimpleAdapter(this, mlist, android.R.layout.simple_list_item_2, new String[]{"item1","item2"}, new int[]{android.R.id.text1, android.R.id.text2});
        lv.setAdapter(sap);
    }
}