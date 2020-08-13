package in.paxtechnology.paxapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import in.paxtechnology.paxapp.R;

public class StateActivity extends AppCompatActivity {
    SearchView state_search;
    ListView state_list;
    String[] stateArray = new String[] {"Andaman and Nicobar Islands","Andhra Pradesh","Arunanchal Pradesh","Assam", "Bihar","Chandigarh","Chhattisgarh","Daman and Diu", "Dadar and Nagar Haveli", "Delhi", "Goa",
            "Gujarat", "Haryana", "Himachal Pradesh", "Jammu & Kashmir", "Jharkhand", "Karnataka", "Kerala", "Ladakh", "Lakshadweep", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram",
            "Nagaland", "Odisha", "Puducherry", "Panjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_state);

        state_search = findViewById(R.id.search_view);
        state_list = findViewById(R.id.state_list);

        final ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stateArray);
        state_list.setAdapter(adapter);

        state_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent returnintent = new Intent();
                String state_results = stateArray[position];
                returnintent.putExtra("state_results", state_results);
                setResult(1,returnintent);
                finish();


            }
        });

        state_search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
    }
}
