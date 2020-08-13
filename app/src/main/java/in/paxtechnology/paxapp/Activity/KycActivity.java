package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import in.paxtechnology.paxapp.Activity.FeatureLoked;
import in.paxtechnology.paxapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class KycActivity extends AppCompatActivity implements View.OnClickListener {
    TextView complete_kyc_tx;
    ImageView kyc_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_kyc);

        complete_kyc_tx = findViewById(R.id.complete_kyc_tx);
        kyc_back_img = findViewById(R.id.kyc_back_img);

        complete_kyc_tx.setOnClickListener(this);
        kyc_back_img.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.complete_kyc_tx:
                startActivity(new Intent(this, FeatureLoked.class));
                break;

            case R.id.kyc_back_img:
                onBackPressed();
                break;

        }

    }
}
