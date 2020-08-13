package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class SupportMoneyActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout wallet_money_layout;
    TextView wallet_money_tx;
    ImageView help_support_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_support_money);

        help_support_back_img = findViewById(R.id.help_support_back_img);
        wallet_money_layout = findViewById(R.id.wallet_money_layout);
        wallet_money_tx = findViewById(R.id.wallet_money_tx);

        wallet_money_layout.setOnClickListener(this);
        help_support_back_img.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.help_support_back_img:
                Intent intent = new Intent(SupportMoneyActivity.this, HelpSupportActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.wallet_money_layout:
                if (wallet_money_tx.getVisibility() == View.VISIBLE)
                    wallet_money_tx.setVisibility(View.GONE);
                else
                    wallet_money_tx.setVisibility(View.VISIBLE);
                break;

        }

    }
}
