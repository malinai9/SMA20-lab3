package intents;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Lab3.R;

public class IntentFilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_filter);
    }

    // Get bundle object at appropriate place in your code
//    Bundle extras = getIntent().getExtras();
//
//    // Extract data using passed keys
//    String value1 = extras.getString("Key1");
//    String value2 = extras.getString("Key2");


}