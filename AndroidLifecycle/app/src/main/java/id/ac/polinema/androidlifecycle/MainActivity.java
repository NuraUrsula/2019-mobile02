package id.ac.polinema.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.logging.SocketHandler;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	//TODO: tambahkan callback onStart() di sini
	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText( this,  "App on Start", Toast.LENGTH_SHORT).show();
	}

	//TODO: tambahkan callback onStop() di sini
	@Override
	protected void onStop () {
		super.onStop();
		Toast.makeText(this,"App on Stop", Toast.LENGTH_SHORT).show();
	}

	//TODO: lengkapi callback untuk onRestart() onResume() onPause() onDestroy()
	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText( this,"App on Resume", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this,"App on Pause", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this,"App on Destroy", Toast.LENGTH_SHORT).show();

	}

	public void handleSubmit(View view) {
	}
}
