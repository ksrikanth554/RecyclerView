package com.sritechsoftsolutions.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {
    ImageView imageView,imgDelete;
    TextView  fileName,fileSize;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imgView);
        imgDelete=itemView.findViewById(R.id.imgdelete);
        fileName=itemView.findViewById(R.id.txtfname);
        fileSize=itemView.findViewById(R.id.txtfsize);
    }
}
