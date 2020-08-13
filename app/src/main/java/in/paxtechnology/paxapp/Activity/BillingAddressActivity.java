package in.paxtechnology.paxapp.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import in.paxtechnology.paxapp.R;

public class BillingAddressActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView billing_back_img;
    EditText state_et, country_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_billing_address);

        billing_back_img = findViewById(R.id.billing_back_img);
        state_et = findViewById(R.id.bill_state_et);
        country_et = findViewById(R.id.bill_country_et);

        billing_back_img.setOnClickListener(this);
        state_et.setOnClickListener(this);
        country_et.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.billing_back_img:
                onBackPressed();
                break;

            case R.id.bill_state_et:
                Intent state_intent = new Intent(BillingAddressActivity.this,StateActivity.class);
                startActivityForResult(state_intent, 1);
                break;

            case R.id.bill_country_et:
                Intent country_intent = new Intent(BillingAddressActivity.this,CountryActivity.class);
                startActivityForResult(country_intent, 2);
                break;
        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            String state_result = data.getStringExtra("state_results");
            state_et.setText(state_result);

        }

        if (requestCode == 2) {
            String country_result = data.getStringExtra("country_results");
            country_et.setText(country_result);

        }
    }
}
