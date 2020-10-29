package com.example.test2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ProgramAdapter extends ArrayAdapter<String> {

    Context context;
    int[] images;
    String[] progname;
    String[] progds;

    public ProgramAdapter(@NonNull Context context, String[] progname, int[] images, String[] progds) {
        super(context, R.layout.single_item, R.id.textview1,progname);
        this.context = context;
        this.images = images;
        this.progname = progname;
        this.progds = progds;

    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View singleItem = convertView;
        ProgramViewholder holder = null;
        if(singleItem==null){

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.single_item,parent,false);
            holder = new ProgramViewholder(singleItem);
            singleItem.setTag(holder);
        }
        else{
            holder = (ProgramViewholder) singleItem.getTag();
        }
        holder.itemImage.setImageResource(images[position]);
        holder.programTitle.setText(progname[position]);
        holder.programDescrip.setText(progds[position]);
        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You clicked"+progname[position], Toast.LENGTH_SHORT).show();
            }
        });
        return singleItem;
    }
}
