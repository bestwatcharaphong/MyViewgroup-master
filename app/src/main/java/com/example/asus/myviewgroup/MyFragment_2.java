package com.example.asus.myviewgroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFragment_2 extends Fragment {
    private int someVar;
    private TextView tv_two;


    public static MyFragment_2 newInstance(int someVar){
        MyFragment_2 TwoFragment = new MyFragment_2();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        TwoFragment.setArguments(args);
        return TwoFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someVar = getArguments().getInt("someVar");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_fragment_2, container, false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {
        tv_two = (TextView)rootView.findViewById(R.id.tv2);
        tv_two.setText(String.valueOf(someVar));
    }

}
