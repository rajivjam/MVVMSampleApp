package com.aapps.mvvm.sampleapp.utils;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aapps.mvvm.sampleapp.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class GlideBindingAdapter {

    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView imageView, int imageUrl){
        Context context = imageView.getContext();
        RequestOptions options = new RequestOptions()
                //.placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(imageView);
    }

    @BindingAdapter("imageUrl")
    public static void setImageResource(ImageView imageView, String imageUrl){
        Context context = imageView.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher);

        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(imageView);
    }

    @BindingAdapter("imageUrl")
    public static void setImageResource1(TextView imageView, int imageUrl){
        imageView.setText(""+imageView);
    }

    public void click(){
        System.out.println("clicked");
    }
}
