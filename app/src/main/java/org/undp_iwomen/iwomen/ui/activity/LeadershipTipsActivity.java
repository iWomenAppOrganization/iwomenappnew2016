package org.undp_iwomen.iwomen.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;

import org.smk.iwomen.BaseActionBarActivity;
import org.undp_iwomen.iwomen.R;
import org.undp_iwomen.iwomen.ui.fragment.LeadershipTipsFragment;

public class LeadershipTipsActivity extends BaseActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leadership_tips);

        // Set up the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(null == savedInstanceState){
            initFragment(LeadershipTipsFragment.newInstance());
        }
    }

    private void initFragment(Fragment leadershipTipsFragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.contentFrame, leadershipTipsFragment);
        transaction.commit();
    }
}
