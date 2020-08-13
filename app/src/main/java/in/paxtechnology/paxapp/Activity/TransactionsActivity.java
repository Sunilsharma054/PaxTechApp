package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import in.paxtechnology.paxapp.R;
import com.google.android.material.snackbar.Snackbar;

public class TransactionsActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView homeView, cardView, sendView, transactionMenu;
    private ConstraintLayout transaction_main;
    private RadioGroup radioGroup;
    private RadioButton all_radio, paid_radio, receive_radio, added_radio, pending_radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_transactions);

        transaction_main = findViewById(R.id.transaction_main);

        homeView = findViewById(R.id.home_img);
        cardView = findViewById(R.id.cards_img);
        sendView = findViewById(R.id.send_img);
        transactionMenu = findViewById(R.id.imageView4);
        radioGroup = findViewById(R.id.redioGroup);
        all_radio = findViewById(R.id.radioButton1);
        paid_radio = findViewById(R.id.radioButton2);
        receive_radio = findViewById(R.id.radioButton3);
        added_radio = findViewById(R.id.radioButton4);
        pending_radio = findViewById(R.id.radioButton5);

        homeView.setOnClickListener(this);
        cardView.setOnClickListener(this);
        sendView.setOnClickListener(this);
        transactionMenu.setOnClickListener(this);


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

            case R.id.send_img:
                startActivity(new Intent(this,SendsActivity.class));
                break;

            case R.id.imageView4:
                Snackbar snackbar = Snackbar.make(transaction_main,"",Snackbar.LENGTH_INDEFINITE);
                View custom = getLayoutInflater().inflate(R.layout.snackbar_custom_transaction,null);

                snackbar.getView().setBackgroundColor(Color.WHITE);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
                snackbarLayout.setPadding(0,0,0,0);

                snackbarLayout.addView(custom,0);
                snackbar.show();
                break;
        }

    }
}
