package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.paxtechnology.paxapp.Adapter.MyPagerAdapter;
import in.paxtechnology.paxapp.PrefrenceManager;
import in.paxtechnology.paxapp.R;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager  mPager;
    private  int[] layouts = {R.layout.first_slide,R.layout.second_slide};
    private MyPagerAdapter myPagerAdapter;

    private LinearLayout Dot_layout;
    private ImageView[] dots;

    private TextView next,getStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (new PrefrenceManager(this).checkPrefrence()){
            loadHome();
        }

      /*  if (Build.VERSION.SDK_INT >= 19){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }*/
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        next = findViewById(R.id.next_text);
        getStart = findViewById(R.id.get_text);
        next.setOnClickListener(this);
        getStart.setOnClickListener(this);
        mPager = findViewById(R.id.viewPager);
        myPagerAdapter = new MyPagerAdapter(layouts,this);
        mPager.setAdapter(myPagerAdapter);

        Dot_layout = findViewById(R.id.dotsLayout);
        createDots(0);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                createDots(position);
                if (position == layouts.length-1){
                    next.setVisibility(View.GONE);
                    getStart.setVisibility(View.VISIBLE);
                }
                else {
                    next.setVisibility(View.VISIBLE);
                    getStart.setVisibility(View.GONE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

private void createDots(int current_position)
{
if (Dot_layout != null)
    Dot_layout.removeAllViews();

    dots = new ImageView[layouts.length];

    for (int i=0; i<layouts.length;i++)
    {
        dots[i] = new ImageView(this);
        if (i == current_position){
            dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.active_dots));
        }
        else {
            dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.default_dots));
        }

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(10,0,10,0);
        Dot_layout.addView(dots[i],params);
    }
}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next_text:
                loadNextSlide();
                break;
            case R.id.get_text:
                new PrefrenceManager(this).writePrefrence();
                loadHome();
                break;
        }

    }

    private void loadHome(){
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }

    private void loadNextSlide(){
        int next_slide = mPager.getCurrentItem()+1;

        if (next_slide < layouts.length){
            mPager.setCurrentItem(next_slide);
        }
        else {
            loadHome();
            new PrefrenceManager(this).writePrefrence();
        }
    }
}
