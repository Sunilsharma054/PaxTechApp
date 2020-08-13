package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class SupportCardsActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout virtual_card_layout, cvv_card_layout, suspend_card_layout, recharge_card_layout;
    TextView virtual_card_tx, cvv_card_tx, suspend_card_tx, recharge_card_tx;
    ImageView help_support_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_support_cards);

        virtual_card_layout = findViewById(R.id.virtual_card_layout);
        cvv_card_layout = findViewById(R.id.cvv_card_layout);
        suspend_card_layout = findViewById(R.id.suspend_card_layout);
        recharge_card_layout = findViewById(R.id.recharge_card_layout);

        virtual_card_tx = findViewById(R.id.virtual_card_tx);
        cvv_card_tx = findViewById(R.id.textView81);
        suspend_card_tx = findViewById(R.id.suspend_card_tx);
        recharge_card_tx = findViewById(R.id.recharge_card_tx);
        help_support_back_img = findViewById(R.id.help_support_back_img);

        help_support_back_img.setOnClickListener(this);
        virtual_card_layout.setOnClickListener(this);
        cvv_card_layout.setOnClickListener(this);
        suspend_card_layout.setOnClickListener(this);
        recharge_card_layout.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.help_support_back_img:
                Intent intent = new Intent(SupportCardsActivity.this, HelpSupportActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.virtual_card_layout:
                if (virtual_card_tx.getVisibility() == View.VISIBLE)
                    virtual_card_tx.setVisibility(View.GONE);
                else
                    virtual_card_tx.setVisibility(View.VISIBLE);
                break;

            case R.id.cvv_card_layout:
                if (cvv_card_tx.getVisibility() == View.VISIBLE)
                    cvv_card_tx.setVisibility(View.GONE);
                else
                    cvv_card_tx.setVisibility(View.VISIBLE);
                break;

            case R.id.suspend_card_layout:
                if (suspend_card_tx.getVisibility() == View.VISIBLE)
                    suspend_card_tx.setVisibility(View.GONE);
                else
                    suspend_card_tx.setVisibility(View.VISIBLE);
                break;

            case R.id.recharge_card_layout:
                if (recharge_card_tx.getVisibility() == View.VISIBLE)
                    recharge_card_tx.setVisibility(View.GONE);
                else
                    recharge_card_tx.setVisibility(View.VISIBLE);
                break;

        }

    }
}
