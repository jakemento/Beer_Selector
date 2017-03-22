package jws.beer_selector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    String[] beer_colors = {"light", "amber", "brown","dark"};
    @Bind(R.id.beer_color) Spinner mColorSpinner;
    @Bind(R.id.brands) TextView mBrands;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayAdapter<String> BeerColorAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, beer_colors);
        BeerColorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mColorSpinner.setAdapter(BeerColorAdapter);
    }


    // HIDE AND SHOW THE VISIBILITY and set a RUNNABLE on postDELAY to HIDE TEXT VIEW //
    public void onClickFindBeer(View view) {
        if (mBrands.getVisibility() == View.INVISIBLE) {
            mBrands.setVisibility(View.VISIBLE);
        }
        mBrands.setText(String.valueOf("you've selected " + mColorSpinner.getSelectedItem()));
        mBrands.postDelayed(new Runnable() {
            public void run() {
                mBrands.setVisibility(View.INVISIBLE);
            }
           }, 1850);

    }

}


