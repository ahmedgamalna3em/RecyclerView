package com.example.recyclerview1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.ArrayList;

            public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerAdapter.ContactViewHolder> {
                ArrayList<Contact> items;

                public ContactRecyclerAdapter(ArrayList<Contact> items) {
                    this.items = items;
                }


                @Override
                public ContactViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
                    Log.d("recyclerView","creating View Holder");
                    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                    View view = inflater.inflate(R.layout.item_contact, parent, false);
                    return new ContactViewHolder(view);
                }

                @Override
                public void onBindViewHolder(ContactViewHolder holder, int position) {
                    Log.d("recyclerView","Binding item num"+position);
                    Contact contact = items.get(position);
                    holder.name.setText(contact.name);
                    holder.status.setText(contact.status);
                    holder.image.setImageResource(contact.profileImage);
                    holder.image.setOnClickListener(new View.OnClickListener(){

                        @Override
                        public void onClick(View view){
                            Intent intent = new Intent(this);

                        }

                    });


                }

                @Override
                public int getItemCount() {
                    if(items==null) return 0;
                    return items.size();
                }

                public class ContactRecyclerAdapter {
                    class ContactViewHolder extends RecyclerView.ViewHolder {
                        ImageView image;
                        TextView name;
                        TextView status;

                        public ContactViewHolder(View itemView) {
                            super(itemView);
                            image = itemView.findViewById(R.id.iv_profile);
                            status = itemView.findViewById(R.id.tv_status);
                            name = itemView.findViewById(R.id.tv_name);


                        }


                    }
                }

            }

