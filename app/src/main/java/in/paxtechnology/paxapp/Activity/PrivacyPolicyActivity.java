package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import in.paxtechnology.paxapp.R;

public class PrivacyPolicyActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView policy_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_privacy_policy);

        policy_close = findViewById(R.id.policy_close);
        policy_close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.policy_close:
                Intent intent = new Intent(PrivacyPolicyActivity.this, ProfileActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;
        }

    }
}
