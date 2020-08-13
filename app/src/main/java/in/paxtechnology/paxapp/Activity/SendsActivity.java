package in.paxtechnology.paxapp.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class SendsActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView homeView, cardView, trasactionView, contact_img;
    EditText mobileText;
    TextView submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sends);

        homeView = findViewById(R.id.home_img);
        cardView = findViewById(R.id.cards_img);
        trasactionView = findViewById(R.id.trans_img);
        contact_img = findViewById(R.id.contact_img);
        submit = findViewById(R.id.transfer_tx);

        mobileText = findViewById(R.id.mobile_no_tx);

        homeView.setOnClickListener(this);
        cardView.setOnClickListener(this);
        contact_img.setOnClickListener(this);
        trasactionView.setOnClickListener(this);
        submit.setOnClickListener(this);


        mobileText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text_value = mobileText.getText().toString().trim();

                if(text_value.equalsIgnoreCase("+91"))
                {
                    mobileText.setText("");
                }else
                {
                    if(!text_value.startsWith("+91") && text_value.length()>0 && text_value.length()<10) {
                        mobileText.setText("+91" + " " +s.toString());
                        Selection.setSelection(mobileText.getText(), mobileText.getText().length());
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_img:
                startActivity(new Intent(this,HomeActivity.class));
                break;

            case R.id.cards_img:
                startActivity(new Intent(this,CardsActivity.class));
                break;

            case R.id.trans_img:
                startActivity(new Intent(this,TransactionsActivity.class));
                break;

            case R.id.contact_img:
                Intent state_intent = new Intent(SendsActivity.this,ContactActivity.class);
                startActivityForResult(state_intent, 1);
                break;

            case R.id.transfer_tx:
                startActivity(new Intent(this,SendMoneyActivity.class));
                mobileText.setText("");
                break;
        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            String contact_name = data.getStringExtra("name_contact_id");
            String contact_number = data.getStringExtra("phone_contact_id");
            mobileText.setText(contact_name +"  "+ contact_number);

        }

    }
}
