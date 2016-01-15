package com.example.sourabh.gridviewexample2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImageAdapter extends ArrayAdapter<Integer> {
    ImageAdapter(Context context,Integer[] ImageResources)  //Constructor
    {
        super(context,R.layout.list_layout,ImageResources);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { //Get a View that displays the data at the specified position in the data set
        //convertView: The old view to reuse, if possible
        //Inflating the list_layout.xml file
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View image_view=inflater.inflate(R.layout.list_layout, parent, false);

        ImageView image = (ImageView)image_view.findViewById(R.id.image);
        image.setBackgroundResource(getItem(position));
        image.setPadding(10,10,10,10);

        return image_view;
    }
}
