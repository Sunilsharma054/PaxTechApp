package in.paxtechnology.paxapp.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.paxtechnology.paxapp.Activity.FeatureLoked;
import in.paxtechnology.paxapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhysicalCardFragment extends Fragment implements View.OnClickListener {
    TextView activate_card;


    public PhysicalCardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_physical_card, container, false);

        activate_card = view.findViewById(R.id.activate_card_tx);
        activate_card.setOnClickListener(this);


        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activate_card_tx:
                startActivity(new Intent(getActivity(), FeatureLoked.class));
                break;
        }

    }
}
