package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import in.paxtechnology.paxapp.R;

public class FeatureLoked extends AppCompatActivity implements View.OnClickListener {
    ImageView feature_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_feature_loked);

        feature_close = findViewById(R.id.imageView3);
        feature_close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView3:
                onBackPressed();
                break;
        }
    }
}
