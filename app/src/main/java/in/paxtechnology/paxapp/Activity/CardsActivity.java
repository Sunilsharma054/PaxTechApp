package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import in.paxtechnology.paxapp.Adapter.OrderedPagerAdapter;

import in.paxtechnology.paxapp.R;
import com.google.android.material.tabs.TabLayout;

public class CardsActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView homeView, sendView, trasactionView;
    ViewPager viewPager;
    TabLayout tabLayout;
    OrderedPagerAdapter orderedPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cards);

        homeView = findViewById(R.id.home_img);
        sendView = findViewById(R.id.send_img);
        trasactionView = findViewById(R.id.trans_img);

        homeView.setOnClickListener(this);
        sendView.setOnClickListener(this);
        trasactionView.setOnClickListener(this);


        viewPager = (ViewPager) findViewById(R.id.tab_viewpager);
        orderedPagerAdapter = new OrderedPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(orderedPagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_img:
                startActivity(new Intent(this,HomeActivity.class));
                break;

            case R.id.send_img:
                startActivity(new Intent(this,SendsActivity.class));
                break;

            case R.id.trans_img:
                startActivity(new Intent(this,TransactionsActivity.class));
                break;
        }

    }
}
