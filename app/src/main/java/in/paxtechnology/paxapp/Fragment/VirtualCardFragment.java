package in.paxtechnology.paxapp.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.paxtechnology.paxapp.Activity.VirtualCardsActivity;
import in.paxtechnology.paxapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VirtualCardFragment extends Fragment implements View.OnClickListener {
    LinearLayout copy_layout;
    TextView activate_card_tx;


    public VirtualCardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_virtual_card, container, false);

        copy_layout = view.findViewById(R.id.copy_layout);
        activate_card_tx = view.findViewById(R.id.activate_card_tx);

        copy_layout.setOnClickListener(this);
        activate_card_tx.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.copy_layout:
               /* ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                String getstring = textView.getText().toString();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText(label, text);
                clipboard.setPrimaryClip(clip);*/

                break;

            case R.id.activate_card_tx:
                startActivity(new Intent(getActivity(), VirtualCardsActivity.class));
                break;
        }

    }
}
