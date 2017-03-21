package edu.newwesterndev.fragmentsagain;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavFragment extends Fragment {

    EditText messageEditText;
    Button sendMessageButton;

    NavInterface parent;


    public NavFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout =  inflater.inflate(R.layout.fragment_nav, container, false);

        messageEditText = (EditText) layout.findViewById(R.id.nav_editText);
        sendMessageButton = (Button) layout.findViewById(R.id.nav_button);

        sendMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageEditText.getText().toString();
                parent.sendMessage(message);
            }
        });
        return layout;
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);

        if(activity instanceof NavInterface){
            parent = (NavInterface) activity;
        } else{
            throw new RuntimeException("Not Implemented");
        }
    }

    public interface NavInterface {
        void sendMessage(String message);
    }

}
