package com.example.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by Дмитрий on 04.01.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
