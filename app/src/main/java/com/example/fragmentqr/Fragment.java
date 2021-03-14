package com.example.fragmentqr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class Fragment extends AppCompatActivity {
    TabLayout tabs;
    ViewPager viewPager1;
    MyPagerAdapter myPagerAdapter;
    Button btnQRcam;
    int pos;
    String title[]={"홈", "배송 페이지", "반품 페이지", "오류 페이지"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        tabs=findViewById(R.id.tabs);
        viewPager1=findViewById(R.id.viewPager1);

        tabs.addTab(tabs.newTab().setText("인사하기"));
        tabs.addTab(tabs.newTab().setText("동물선택"));
        tabs.addTab(tabs.newTab().setText("코로나예방"));
        tabs.setTabGravity(tabs.GRAVITY_FILL);
        myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager(),3);
        viewPager1.setAdapter(myPagerAdapter);
        //탭메뉴 클릭하면 해당 프래그먼트로 변경>>싱크화
        tabs.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager1));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pos=tabs.getSelectedTabPosition();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //뷰페이저를 밀면 해당 탭메뉴로 이동
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
    }
}