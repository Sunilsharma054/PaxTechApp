package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView profile_back_img;
    TextView upgrade_account;
    LinearLayout personal_layout, address_layout, languages_layout, password_layout, activity_layout, help_support_layout, privacy_policy_layout, term_condition_layout, logout_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_profile);

        profile_back_img = findViewById(R.id.imageView8);
        upgrade_account = findViewById(R.id.upgrade_account_tx);
        personal_layout = findViewById(R.id.personal_layout);
        address_layout = findViewById(R.id.address_layout);
        languages_layout = findViewById(R.id.languages_layout);
        password_layout = findViewById(R.id.password_layout);
        activity_layout = findViewById(R.id.activity_layout);
        help_support_layout = findViewById(R.id.help_support_layout);
        privacy_policy_layout = findViewById(R.id.privacy_policy_layout);
        term_condition_layout = findViewById(R.id.term_condition_layout);
        logout_layout = findViewById(R.id.logout_layout);

        profile_back_img.setOnClickListener(this);
        upgrade_account.setOnClickListener(this);
        personal_layout.setOnClickListener(this);
        address_layout.setOnClickListener(this);
        languages_layout.setOnClickListener(this);
        password_layout.setOnClickListener(this);
        activity_layout.setOnClickListener(this);
        help_support_layout.setOnClickListener(this);
        privacy_policy_layout.setOnClickListener(this);
        term_condition_layout.setOnClickListener(this);
        logout_layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView8:
                Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;

            case R.id.upgrade_account_tx:
                startActivity(new Intent(this,KycActivity.class));
                break;
            case R.id.personal_layout:
                startActivity(new Intent(this,PersonalDetailsActivity.class));
                break;

            case R.id.address_layout:
                startActivity(new Intent(this,AddressActivity.class));
                break;

            case R.id.languages_layout:
                startActivity(new Intent(this,FeatureLoked.class));
                break;

            case R.id.password_layout:
                startActivity(new Intent(this,ChangePasswordActivity.class));
                break;

            case R.id.activity_layout:
                startActivity(new Intent(this,NotificationActivity.class));
                break;

            case R.id.help_support_layout:
                startActivity(new Intent(this,HelpSupportActivity.class));
                break;

            case R.id.privacy_policy_layout:
                startActivity(new Intent(this,PrivacyPolicyActivity.class));
                break;

            case R.id.term_condition_layout:
                startActivity(new Intent(this,TermConditionActivity.class));
                break;

            case R.id.logout_layout:
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(ProfileActivity.this);
                alertDialog.setMessage("Are you sure you want to logout?");
                alertDialog.setPositiveButton("LOGOUT", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which) {

                        startActivity(new Intent(ProfileActivity.this,LoginActivity.class));
                    }
                });
                alertDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alertDialog.show();
                break;


        }

    }
}
