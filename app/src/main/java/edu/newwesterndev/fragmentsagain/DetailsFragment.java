package edu.newwesterndev.fragmentsagain;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    TextView messageTextView;


    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_details, container, false);

        messageTextView = (TextView) layout.findViewById(R.id.message_text_view);

        return layout;
    }

    public void ShowMessage(String message){
        messageTextView.setText(message);
    }

}
