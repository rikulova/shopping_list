package com.example.rikul_000.groceryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public static String[] foods = {"Milk", "Sugar", "Bread", "Eggs"};
    ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList(foods));
//    ArrayList<String> completedList = new ArrayList<>(Arrays.asList());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void shoppingList(View view){
        setContentView(R.layout.shopping_list);

        ListAdapter foodListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shoppingList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(foodListAdapter);





    }

    public void addItem(View view) {
        EditText newItem = (EditText) findViewById(R.id.new_item);

        if (newItem.getText().toString().equals("")) {
            Toast.makeText(this, "Please type something to be added", Toast.LENGTH_SHORT).show();

        }
        else {
            shoppingList.add(newItem.getText().toString());
            Toast.makeText(this, newItem.getText(), Toast.LENGTH_SHORT).show();
        }

        shoppingList(view);
    }

    public void recipes(View view){
        setContentView(R.layout.recipes);
    }

    public void pantry(View view){
        setContentView(R.layout.pantry);
    }

    public void calendar(View view) {
        setContentView(R.layout.calendar);
    }


}
