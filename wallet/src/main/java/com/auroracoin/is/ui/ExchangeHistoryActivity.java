package com.auroracoin.is.ui;

import android.os.Bundle;

import com.auroracoin.is.R;

/**
 * @author John L. Jegutanis
 */
// TODO: REMOVE

public class ExchangeHistoryActivity extends BaseWalletActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_wrapper);

        if (savedInstanceState == null) {
            ExchangeHistoryFragment fragment = new ExchangeHistoryFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }
}
