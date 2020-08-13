package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class SupportKycActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout wallet_limit_layout, wallet_limit_kyc_layout, wallet_complete_kyc_layout, wallet_full_kyc_layout;
    TextView wallet_limit_tx, wallet_limit_kyc_tx, wallet_complete_kyc_tx, wallet_full_kyc_tx;
    ImageView help_support_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_support_kyc);

        help_support_back_img = findViewById(R.id.help_support_back_img);
        wallet_limit_layout = findViewById(R.id.wallet_limit_layout);
        wallet_limit_kyc_layout = findViewById(R.id.wallet_limit_kyc_layout);
        wallet_complete_kyc_layout = findViewById(R.id.wallet_complete_kyc_layout);
        wallet_full_kyc_layout = findViewById(R.id.wallet_full_kyc_layout);

        wallet_limit_tx = findViewById(R.id.wallet_limit_tx);
        wallet_limit_kyc_tx = findViewById(R.id.wallet_limit_kyc_tx);
        wallet_complete_kyc_tx = findViewById(R.id.wallet_complete_kyc_tx);
        wallet_full_kyc_tx = findViewById(R.id.wallet_full_kyc_tx);

        wallet_limit_layout.setOnClickListener(this);
        wallet_limit_kyc_layout.setOnClickListener(this);
        wallet_complete_kyc_layout.setOnClickListener(this);
        wallet_full_kyc_layout.setOnClickListener(this);
        help_support_back_img.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.help_support_back_img:
                Intent intent = new Intent(SupportKycActivity.this, HelpSupportActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.wallet_limit_layout:
                if (wallet_limit_tx.getVisibility() == View.VISIBLE)
                    wallet_limit_tx.setVisibility(View.GONE);
                else
                    wallet_limit_tx.setVisibility(View.VISIBLE);
                break;

            case R.id.wallet_limit_kyc_layout:
                if (wallet_limit_kyc_tx.getVisibility() == View.VISIBLE)
                    wallet_limit_kyc_tx.setVisibility(View.GONE);
                else
                    wallet_limit_kyc_tx.setVisibility(View.VISIBLE);
                break;

            case R.id.wallet_complete_kyc_layout:
                if (wallet_complete_kyc_tx.getVisibility() == View.VISIBLE)
                    wallet_complete_kyc_tx.setVisibility(View.GONE);
                else
                    wallet_complete_kyc_tx.setVisibility(View.VISIBLE);
                break;

            case R.id.wallet_full_kyc_layout:
                if (wallet_full_kyc_tx.getVisibility() == View.VISIBLE)
                    wallet_full_kyc_tx.setVisibility(View.GONE);
                else
                    wallet_full_kyc_tx.setVisibility(View.VISIBLE);
                break;

        }

    }
}
