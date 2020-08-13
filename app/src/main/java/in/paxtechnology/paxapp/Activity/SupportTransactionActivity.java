package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class SupportTransactionActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout wallet_transaction_layout;
    TextView wallet_transaction_tx;
    ImageView help_support_back_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_support_transaction);

        help_support_back_img = findViewById(R.id.help_support_back_img);
        wallet_transaction_layout = findViewById(R.id.wallet_transaction_layout);
        wallet_transaction_tx = findViewById(R.id.wallet_transaction_tx);

        wallet_transaction_layout.setOnClickListener(this);
        help_support_back_img.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.help_support_back_img:
                Intent intent = new Intent(SupportTransactionActivity.this, HelpSupportActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.wallet_transaction_layout:
                if (wallet_transaction_tx.getVisibility() == View.VISIBLE)
                    wallet_transaction_tx.setVisibility(View.GONE);
                else
                    wallet_transaction_tx.setVisibility(View.VISIBLE);
                break;
        }

    }
}
