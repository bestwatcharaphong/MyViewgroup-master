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
public class MyFragment_4 extends Fragment {
    private int someVar;
    private TextView tv_fore;


    public static MyFragment_4 newInstance(int someVar){
        MyFragment_4 ForeFragment = new MyFragment_4();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        ForeFragment.setArguments(args);
        return ForeFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someVar = getArguments().getInt("someVar");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_fragment_4, container, false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {
        tv_fore = (TextView)rootView.findViewById(R.id.tv4);
        tv_fore.setText(String.valueOf(someVar));
    }

}
