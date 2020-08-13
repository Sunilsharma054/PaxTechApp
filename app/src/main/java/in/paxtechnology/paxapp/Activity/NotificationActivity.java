package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import in.paxtechnology.paxapp.R;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView notification_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_notification);

        notification_back = findViewById(R.id.notification_back_img);
        notification_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.notification_back_img:
                onBackPressed();
                break;

        }


    }
}
