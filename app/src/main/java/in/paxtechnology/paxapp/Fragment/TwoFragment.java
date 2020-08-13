package in.paxtechnology.paxapp.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.paxtechnology.paxapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {
    TextView textView;


    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        textView = view.findViewById(R.id.tv);

        Bundle bundle = this.getArguments();
        String sunilData = bundle.getString("key");
        textView.setText(sunilData);

        return view;
    }

}
