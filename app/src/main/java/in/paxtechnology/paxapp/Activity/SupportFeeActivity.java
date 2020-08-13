package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class SupportFeeActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout wallet_fees_layout;
    TextView wallet_fees_tx;
    ImageView help_support_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_support_fee);

        wallet_fees_layout = findViewById(R.id.wallet_fees_layout);
        wallet_fees_tx = findViewById(R.id.wallet_fees_tx);
        help_support_back_img = findViewById(R.id.help_support_back_img);
        wallet_fees_layout.setOnClickListener(this);
        help_support_back_img.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.help_support_back_img:
                Intent intent = new Intent(SupportFeeActivity.this, HelpSupportActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.wallet_fees_layout:
                if (wallet_fees_tx.getVisibility() == View.VISIBLE)
                    wallet_fees_tx.setVisibility(View.GONE);
                else
                    wallet_fees_tx.setVisibility(View.VISIBLE);
                break;
        }

    }
}
