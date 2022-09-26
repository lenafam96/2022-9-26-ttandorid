package com.example.bai4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class bai6 extends Activity implements SearchView.OnQueryTextListener{
    private ListView list;
    private ListViewAdapter_bai6 adapter;
    private SearchView editsearch;
    private String[] animalNameList;
    private ArrayList<AnimalNames_bai6> arraylist = new ArrayList<AnimalNames_bai6>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);
        Init();
        Action();
    }

    private void Init() {
        animalNameList = new String[]{"Lion", "Tiger", "Dog",
                "Cat", "Tortoise", "Rat", "Elephant", "Fox",
                "Cow","Donkey","Monkey"};

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listview_bai6);

        for (int i = 0; i < animalNameList.length; i++) {
            AnimalNames_bai6 animalNamesBai6 = new AnimalNames_bai6(animalNameList[i]);
            // Binds all strings into an array
            arraylist.add(animalNamesBai6);
        }

        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter_bai6(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);

        // Locate the EditText in listview_main.xml
        editsearch = (SearchView) findViewById(R.id.searchView_bai6);
        editsearch.setOnQueryTextListener(this);
    }

    private void Action() {

    }

    @Override
    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
    }
}