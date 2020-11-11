package nikita.smirnov.n01287334;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class smirnovActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smirnov_second);
        //Listview flats = R.id.flatlist;
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);
        ListView flatlist = (ListView) findViewById(R.id.flatlist);
        flatlist.setVisibility(View.GONE);
        ListView detachedlist = (ListView) findViewById(R.id.detachedlist);
        flatlist.setVisibility(View.GONE);
        ListView semilist = (ListView) findViewById(R.id.semilist);
        flatlist.setVisibility(View.GONE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.your_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.flat: {
                //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);
                //listview.setVisibility(View.GONE);

                //listview.setVisibility(View.INVISIBLE);
                //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);
                ListView flatlist = (ListView) findViewById(R.id.flatlist);
                flatlist.setVisibility(View.VISIBLE);
                //Perform your click operation
                break;
            }
            case R.id.detached: {
                //Perform your click operation
                break;
            }
            case R.id.semi: {
                //Perform your click operation
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

 

}