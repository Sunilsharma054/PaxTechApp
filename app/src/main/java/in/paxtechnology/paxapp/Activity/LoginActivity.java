package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.paxtechnology.paxapp.PrefrenceManager;
import in.paxtechnology.paxapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    TextView forgetPass, haveAccount, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        forgetPass = findViewById(R.id.forgot_pass);
        haveAccount = findViewById(R.id.haveAccount);
        login = findViewById(R.id.login_tx);

        forgetPass.setOnClickListener(this);
        haveAccount.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    public void loadSlides(View view){
        new PrefrenceManager(this).clearPrefrence();
        startActivity(new Intent(this,SplashActivity.class));
        finish();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.forgot_pass:
                startActivity(new Intent(this,FeatureLoked.class));
                break;

            case R.id.haveAccount:
                startActivity(new Intent(this,FeatureLoked.class));
                break;

            case R.id.login_tx:
                startActivity(new Intent(this,HomeActivity.class));
                break;
        }

    }

    @Override
    public void onBackPressed() {


    }
}
