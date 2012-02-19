package marimo.ojag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainmenu, menu);
		return true;
	}
	public boolean onOptionsItemSlected(MenuItem item){
		switch(item.getItemId()){
		case R.id.tomanager:
			Intent intent = new Intent(MainActivity.this , Manager.class);
			startActivity(intent);
			return true;
		default :
			return super.onOptionsItemSelected(item);
		}
	}
}
