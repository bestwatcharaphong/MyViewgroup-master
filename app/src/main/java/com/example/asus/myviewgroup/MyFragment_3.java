package com.example.asus.myviewgroup;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment_3 extends Fragment {
    private int someVar;
    private TextView tv_three;

    public static MyFragment_3 newInstance(int someVar){
        MyFragment_3 ThreeFragment = new MyFragment_3();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        ThreeFragment.setArguments(args);
        return ThreeFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someVar = getArguments().getInt("someVar");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_fragment_3, container, false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {
        tv_three = (TextView)rootView.findViewById(R.id.tv3);
        tv_three.setText(String.valueOf(someVar));
    }


}
