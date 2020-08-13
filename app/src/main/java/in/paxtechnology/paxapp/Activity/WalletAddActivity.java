package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import in.paxtechnology.paxapp.R;

public class WalletAddActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView close_img;
    ConstraintLayout add100, add250, add500;
    EditText wallet_balance_et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_wallet_add);

        close_img = findViewById(R.id.close_img);
        add100 = findViewById(R.id.constraintLayout8);
        add250 = findViewById(R.id.constraintLayout10);
        add500 = findViewById(R.id.constraintLayout11);
        wallet_balance_et = findViewById(R.id.wallet_balance_et);

        close_img.setOnClickListener(this);
        add100.setOnClickListener(this);
        add250.setOnClickListener(this);
        add500.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.close_img:
                Intent intent = new Intent(WalletAddActivity.this, HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.constraintLayout8:
                if (wallet_balance_et.getText().toString().isEmpty()) {
                    wallet_balance_et.setText("00");

                    int num1 = Integer.parseInt(wallet_balance_et.getText().toString());
                    int result = num1 + 100;
                    wallet_balance_et.setText("" + Integer.toString(result));
                    wallet_balance_et.setSelection(wallet_balance_et.getText().length());

                }else {
                    int num1 = Integer.parseInt(wallet_balance_et.getText().toString());
                    int result = num1 + 100;
                    wallet_balance_et.setText("" + Integer.toString(result));
                    wallet_balance_et.setSelection(wallet_balance_et.getText().length());
                }

                break;

            case R.id.constraintLayout10:
                if (wallet_balance_et.getText().toString().isEmpty()) {
                    wallet_balance_et.setText("00");

                    int num1 = Integer.parseInt(wallet_balance_et.getText().toString());
                    int result = num1 + 250;
                    wallet_balance_et.setText("" + Integer.toString(result));
                    wallet_balance_et.setSelection(wallet_balance_et.getText().length());

                }else {
                    int num1 = Integer.parseInt(wallet_balance_et.getText().toString());
                    int result = num1 + 250;
                    wallet_balance_et.setText("" + Integer.toString(result));

                    wallet_balance_et.setSelection(wallet_balance_et.getText().length());
                }

                break;

            case R.id.constraintLayout11:
                if (wallet_balance_et.getText().toString().isEmpty()) {
                    wallet_balance_et.setText("00");

                    int num1 = Integer.parseInt(wallet_balance_et.getText().toString());
                    int result = num1 + 500;
                    wallet_balance_et.setText("" + Integer.toString(result));
                    wallet_balance_et.setSelection(wallet_balance_et.getText().length());

                }else {
                    int num1 = Integer.parseInt(wallet_balance_et.getText().toString());
                    int result = num1 + 500;
                    wallet_balance_et.setText("" + Integer.toString(result));
                    wallet_balance_et.setSelection(wallet_balance_et.getText().length());
                }

                break;

        }

    }
}
