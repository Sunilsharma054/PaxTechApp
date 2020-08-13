package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class VirtualCardsActivity extends AppCompatActivity implements View.OnClickListener {
    TextView see_all_virtual_tx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_virtual_cards);

        see_all_virtual_tx = findViewById(R.id.see_all_virtual_tx);
        see_all_virtual_tx.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.see_all_virtual_tx:
                startActivity(new Intent(this,TransactionsActivity.class));
                break;
        }

    }
}
