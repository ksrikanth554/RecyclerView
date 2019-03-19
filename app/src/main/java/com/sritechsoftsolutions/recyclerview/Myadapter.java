package com.sritechsoftsolutions.recyclerview;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.File;

public class Myadapter extends RecyclerView.Adapter<MyHolder> {

    String path="/storage/emulated/0/WhatsApp/Media/WhatsApp Images/";
    File f=new File(path);
    String[] files=f.list();

    MainActivity mActivity;
    public Myadapter(MainActivity mainActivity) {
        mActivity=mainActivity;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater lInflater=LayoutInflater.from(mActivity);
        View v=lInflater.inflate(R.layout.indiview,viewGroup,false);
        MyHolder myholder=new MyHolder(v);
        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        String new_path=path+files[i];
        final File f_new=new File(new_path);

        myHolder.imageView.setImageURI(Uri.fromFile(f_new));
        myHolder.fileName.setText(files[i]);
        myHolder.fileSize.setText(f_new.length()+"bytes");
        myHolder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f_new.delete();
            }
        });


    }

    @Override
    public int getItemCount() {
        return files.length;
    }
}
