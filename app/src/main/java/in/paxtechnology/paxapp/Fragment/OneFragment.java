package in.paxtechnology.paxapp.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import in.paxtechnology.paxapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {
    EditText editText;
    Button button;


    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        button = view.findViewById(R.id.button);
        editText = view.findViewById(R.id.name_et);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("key", editText.getText().toString());


                TwoFragment twoFragment = new TwoFragment();
                twoFragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.container_frame, twoFragment).commit();

            }
        });

        return view;
    }

}
