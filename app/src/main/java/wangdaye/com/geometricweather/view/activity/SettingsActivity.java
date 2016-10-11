package wangdaye.com.geometricweather.view.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import wangdaye.com.geometricweather.R;
import wangdaye.com.geometricweather.view.fragment.SettingsFragment;

/**
 * Settings activity.
 * */

public class SettingsActivity extends GeoActivity
        implements View.OnClickListener {

    /** <br> life cycle. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_settings);
    }

    @Override
    public View getSnackbarContainer() {
        return findViewById(R.id.activity_settings_container);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!isStarted()) {
            setStarted();
            initToolbar();
            SettingsFragment settingsFragment = new SettingsFragment();
            getFragmentManager().beginTransaction()
                    .replace(R.id.activity_settings_fragment, settingsFragment)
                    .commit();
        }
    }

    /** <br> UI. */

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_settings_toolbar);
        toolbar.setTitle(getString(R.string.action_settings));
        toolbar.setNavigationIcon(R.drawable.ic_toolbar_back);
        toolbar.setNavigationOnClickListener(this);
    }

    /** <br> listener. */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case -1:
                finish();
                break;
        }
    }
}