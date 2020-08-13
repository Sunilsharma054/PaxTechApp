package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import in.paxtechnology.paxapp.R;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SendMoneyActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView add_message_tx;
    private EditText add_message_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_send_money);

        add_message_tx = findViewById(R.id.add_message_tx);
        add_message_et = findViewById(R.id.add_message_et);
        add_message_tx.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add_message_tx:
                add_message_tx.setVisibility(View.GONE);
                add_message_et.setVisibility(View.VISIBLE);
                break;
        }

    }
}
