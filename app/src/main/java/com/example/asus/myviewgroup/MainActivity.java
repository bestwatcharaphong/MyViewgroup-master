package com.example.asus.myviewgroup;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

     private MyCustomview myCustomerview1,myCustomerview2,myCustomerview3,myCustomerview4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();
    }


    private void initInstance() {
        myCustomerview1 = (MyCustomview) findViewById(R.id.btn_1);
        myCustomerview2 = (MyCustomview) findViewById(R.id.btn_2);
        myCustomerview3 = (MyCustomview) findViewById(R.id.btn_3);
        myCustomerview4 = (MyCustomview) findViewById(R.id.btn_4);
        myCustomerview1.setName("one");
        myCustomerview2.setName("two");
        myCustomerview3.setName("three");
        myCustomerview4.setName("four");
        final ViewPager pagerview = (ViewPager)findViewById(R.id.vp1);

       // Adapter adapter = new Adapter(getSupportFragmentManager());
        pagerview.setOffscreenPageLimit(2);
        pagerview.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                switch (position){

                    case 0:
                        MyFragment_1 frist = MyFragment_1.newInstance(3654);
                        return frist;
                    case 1:
                        MyFragment_2 two = MyFragment_2.newInstance(387);
                        return two;
                    case 2:
                        MyFragment_3 three = MyFragment_3.newInstance(888);
                        return three;
                    case 3:
                        MyFragment_4 four = MyFragment_4.newInstance(777);
                        return  four;
                    default:
                        return null;

                }
            }

            @Override
            public int getCount() {
                return 4;
            }
        });

        myCustomerview1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               pagerview.setCurrentItem(0);


        }
       });
        myCustomerview2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pagerview.setCurrentItem(1);

           }
       });
        myCustomerview3.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               pagerview.setCurrentItem(2);
            }
       });
        myCustomerview4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               pagerview.setCurrentItem(3);
           }
       });
        pagerview.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Change_tab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void Change_tab(int i) {
        if(i==0){
            myCustomerview1.setActivated(true);
            myCustomerview2.setActivated(false);
            myCustomerview3.setActivated(false);
            myCustomerview4.setActivated(false);

        }if(i==1){
            myCustomerview1.setActivated(false);
            myCustomerview2.setActivated(true);
            myCustomerview3.setActivated(false);
            myCustomerview4.setActivated(false);
        }if(i==2){
            myCustomerview1.setActivated(false);
            myCustomerview2.setActivated(false);
            myCustomerview3.setActivated(true);
            myCustomerview4.setActivated(false);
        }if(i==3){
            myCustomerview1.setActivated(false);
            myCustomerview2.setActivated(false);
            myCustomerview3.setActivated(false);
            myCustomerview4.setActivated(true);

        }
    }
}
