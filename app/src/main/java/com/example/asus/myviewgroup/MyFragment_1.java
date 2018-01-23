package com.example.asus.myviewgroup;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFragment_1 extends Fragment {
    private int someVar;
    private TextView tv_one;

    public static MyFragment_1 newInstance(int someVar){
        MyFragment_1 oneFragment = new MyFragment_1();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        oneFragment.setArguments(args);
        return oneFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someVar = getArguments().getInt("someVar");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_fragment_1, container, false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {
        tv_one = (TextView)rootView.findViewById(R.id.tv1);
        tv_one.setText(String.valueOf(someVar));
    }


}
