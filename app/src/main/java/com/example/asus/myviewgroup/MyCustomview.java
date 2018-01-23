package com.example.asus.myviewgroup;


import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyCustomview  extends LinearLayout{
    TextView tvName;
    TextView tvDescription;

    public MyCustomview(Context context) {
        super(context);
        initInflaste(context);
        initIntance();

    }

    public MyCustomview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initInflaste(context);
        initIntance();

    }

    public MyCustomview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflaste(context);
        initIntance();

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyCustomview(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflaste(context);
        initIntance();

    }

    private void initInflaste(Context context) {

        inflate(context, R.layout.layout_view, this);
        initIntance();

    }

    public void initIntance(){
        tvName = (TextView)findViewById(R.id.tv_name);
    }
    public void setName(String name){
        tvName.setText(name);
    }








}
