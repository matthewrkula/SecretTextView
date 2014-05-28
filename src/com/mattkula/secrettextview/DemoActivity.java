package com.mattkula.secrettextview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import com.mattkula.secrettextview.R;

/**
 * Created by matt on 5/27/14.
 */
public class DemoActivity extends Activity {

    SecretTextView secretTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        secretTextView = (SecretTextView)findViewById(R.id.textview);
        secretTextView.setmDuration(3000);
        secretTextView.setIsVisible(true);
        secretTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secretTextView.toggle();
            }
        });
    }
}
