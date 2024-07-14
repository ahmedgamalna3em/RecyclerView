package com.example.recyclerview1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView rvContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();


    }

    ContactRecyclerAdapter contactsAdapter;

    ArrayList<Contact> contacts;

    private void initViews(){
        rvContacts = findViewById(R.id.rv_contact);
        createContactsList();
        contactsAdapter = new ContactRecyclerAdapter(contacts);
        //this next line mistake when put on the first lina
        rvContacts.setAdapter(contactsAdapter);
       // rvContacts.setLayoutManager();
    }
    //this function to training with recyclerview this list not save with me we can call that
    // and when used DB we not use this function

    private void createContactsList() {
        contacts = new ArrayList<>();
        contacts.add(new Contact("1234567", "Network", "Busy", R.drawable.ic_wifi));
        contacts.add(new Contact("1234567", "Person", "Single", R.drawable.ic_profile));
        contacts.add(new Contact("1234567", "Network", "Busy", R.drawable.ic_airplane));
        for (int i = 0; i < 1000; i++) {
            contacts.add(new Contact("1234567", "Person", "Single", R.drawable.ic_profile));

        }


    }