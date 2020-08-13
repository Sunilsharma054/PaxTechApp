package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import in.paxtechnology.paxapp.R;

public class HelpSupportActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout cardsLayout, wallet_kyc_layout, fees_layout, send_money_layout, trans_help_layout, wallet_help_layout;
    ImageView help_support_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_help_support);

        help_support_back_img = findViewById(R.id.help_support_back_img);
        cardsLayout = findViewById(R.id.cards_layout);
        wallet_kyc_layout = findViewById(R.id.wallet_kyc_layout);
        fees_layout = findViewById(R.id.fees_layout);
        send_money_layout = findViewById(R.id.send_money_layout);
        trans_help_layout = findViewById(R.id.trans_help_layout);
        wallet_help_layout = findViewById(R.id.wallet_help_layout);

        help_support_back_img.setOnClickListener(this);
        cardsLayout.setOnClickListener(this);
        wallet_kyc_layout.setOnClickListener(this);
        fees_layout.setOnClickListener(this);
        send_money_layout.setOnClickListener(this);
        trans_help_layout.setOnClickListener(this);
        wallet_help_layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.help_support_back_img:
                Intent intent = new Intent(HelpSupportActivity.this, ProfileActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;


            case R.id.cards_layout:
                startActivity(new Intent(this,SupportCardsActivity.class));
                break;

            case R.id.wallet_kyc_layout:
                startActivity(new Intent(this,SupportKycActivity.class));
                break;
            case R.id.fees_layout:
                startActivity(new Intent(this,SupportFeeActivity.class));
                break;

            case R.id.send_money_layout:
                startActivity(new Intent(this,SupportMoneyActivity.class));
                break;

            case R.id.trans_help_layout:
                startActivity(new Intent(this,SupportTransactionActivity.class));
                break;

            case R.id.wallet_help_layout:
                startActivity(new Intent(this,SupportWalletActivity.class));
                break;
        }

    }
}
