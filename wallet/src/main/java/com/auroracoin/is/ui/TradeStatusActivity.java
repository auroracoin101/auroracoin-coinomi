package com.auroracoin.is.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.auroracoin.is.R;

// TODO: REMOVE

public class TradeStatusActivity extends BaseWalletActivity implements TradeStatusFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_wrapper);

        if (savedInstanceState == null) {
            Fragment fragment = new TradeStatusFragment();
            fragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();
        }
    }

    @Override
    public void onFinish() {
        finish();
    }
}
