package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout kycLayout;
    ImageView cardView, sendView, trasactionView,notification_img;
    CircleImageView profile_image;
    TextView profile_name, see_all,add_tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);

        cardView = findViewById(R.id.cards_img);
        sendView = findViewById(R.id.send_img);
        trasactionView = findViewById(R.id.trans_img);
        profile_image = findViewById(R.id.profile_image);
        profile_name = findViewById(R.id.profile_name);
        notification_img = findViewById(R.id.notification_img);
        kycLayout = findViewById(R.id.kyc_lay);
        see_all = findViewById(R.id.see_all_tx);
        add_tx = findViewById(R.id.add_tx);

        sendView.setOnClickListener(this);
        cardView.setOnClickListener(this);
        trasactionView.setOnClickListener(this);
        profile_image.setOnClickListener(this);
        profile_name.setOnClickListener(this);
        notification_img.setOnClickListener(this);
        kycLayout.setOnClickListener(this);
        see_all.setOnClickListener(this);
        add_tx.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.cards_img:
                startActivity(new Intent(this,CardsActivity.class));
                break;

            case R.id.send_img:
                startActivity(new Intent(this,SendsActivity.class));
                break;

            case R.id.trans_img:
                startActivity(new Intent(this,TransactionsActivity.class));
                break;

            case R.id.profile_image:
                startActivity(new Intent(this,ProfileActivity.class));
                break;

            case R.id.profile_name:
                startActivity(new Intent(this,ProfileActivity.class));
                break;

            case R.id.notification_img:
                startActivity(new Intent(this,NotificationActivity.class));
                break;

            case R.id.kyc_lay:
                startActivity(new Intent(this,KycActivity.class));
                break;

            case R.id.see_all_tx:
                startActivity(new Intent(this,TransactionsActivity.class));
                break;

            case R.id.add_tx:
                startActivity(new Intent(this,WalletAddActivity.class));
                break;
        }

    }
}
