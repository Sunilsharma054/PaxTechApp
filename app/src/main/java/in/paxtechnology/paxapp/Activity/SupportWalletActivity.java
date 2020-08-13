package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class SupportWalletActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout wallet_wallet_layout;
    TextView wallet_wallet_tx;
    ImageView help_support_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_support_wallet);

        help_support_back_img = findViewById(R.id.help_support_back_img);
        wallet_wallet_layout = findViewById(R.id.wallet_wallet_layout);
        wallet_wallet_tx = findViewById(R.id.wallet_wallet_tx);

        wallet_wallet_layout.setOnClickListener(this);
        help_support_back_img.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.help_support_back_img:
                Intent intent = new Intent(SupportWalletActivity.this, HelpSupportActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.wallet_wallet_layout:
                if (wallet_wallet_tx.getVisibility() == View.VISIBLE)
                    wallet_wallet_tx.setVisibility(View.GONE);
                else
                    wallet_wallet_tx.setVisibility(View.VISIBLE);
                break;
        }

    }
}
