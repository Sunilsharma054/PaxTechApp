package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import in.paxtechnology.paxapp.Fragment.OneFragment;
import in.paxtechnology.paxapp.R;

import android.os.Bundle;

public class SunilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sunil);

        //default add first fragment
        getSupportFragmentManager().beginTransaction().add(R.id.container_frame, new OneFragment()).commit();
    }
}
