//Nikita Smirnov n01287334 RNB

package nikita.smirnov.n01287334;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nikitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Enter button */
    public void goToSecond(View view) {
        Intent intent = new Intent(this, smirnovActivitySecond.class);
        startActivity(intent);
    }

    }