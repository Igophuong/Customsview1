package com.example.customsview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TextVewCircle extends LinearLayout {
// Khai bao view
   TextView mTvTitle;
   ImageView mImgIcon;
   //khai bao kieu du lieu cho thuoc tinh
   String mTextTitle;
   Integer mDrawableIcon;
    public TextVewCircle(Context context) {
        super(context);
    }

    public TextVewCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public TextVewCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private void init(Context context , AttributeSet attributeSet){
        if (context != null && attributeSet != null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.layout_titel_cycle_color,this,true);
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet,R.styleable.TextVewCircle);
            mTextTitle = typedArray.getString(R.styleable.TextVewCircle_textTitle);
            mDrawableIcon = typedArray.getResourceId(R.styleable.TextVewCircle_icon,R.mipmap.ic_launcher);
            typedArray.recycle();

            mapview(view);
            setData();
        }
    }

    private void setData() {
        mTvTitle.setText(mTextTitle);
        mImgIcon.setImageResource(mDrawableIcon);
    }

    private void mapview(View view) {

    }
}






