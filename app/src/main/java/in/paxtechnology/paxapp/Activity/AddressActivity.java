package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import in.paxtechnology.paxapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class AddressActivity extends AppCompatActivity implements View.OnClickListener {
    TextView resident_address,bill_address;
    ImageView address_back_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_address);

        resident_address = findViewById(R.id.resident_address_tx);
        bill_address = findViewById(R.id.bill_address_tx);
        address_back_img = findViewById(R.id.address_back_img);

        resident_address.setOnClickListener(this);
        bill_address.setOnClickListener(this);
        address_back_img.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

                case R.id.address_back_img:
                    Intent intent = new Intent(AddressActivity.this, ProfileActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                    break;

            case R.id.resident_address_tx:
                startActivity(new Intent(this, ResidentialAddress.class));
                break;

            case R.id.bill_address_tx:
                startActivity(new Intent(this, BillingAddressActivity.class));
                break;
        }

    }
}
