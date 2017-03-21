package edu.newwesterndev.fragmentsagain;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity implements NavFragment.NavInterface{

    DetailsFragment detailsFragment;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailsFragment = new DetailsFragment();

        addFragment(new NavFragment(), R.id.frame1);
        addFragment(detailsFragment, R.id.frame2);
    }

    private void addFragment(Fragment fragment, int containerId){
        getFragmentManager()
                .beginTransaction().replace(containerId, fragment).commit();
    }

    @Override
    public void sendMessage(String message) {
        detailsFragment.ShowMessage(message);
    }

}
