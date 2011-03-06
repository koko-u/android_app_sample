package sample.koko;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FromActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.from_activity);

		Button btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent().setClass(FromActivity.this, ToActivity.class));
			}
		});
		Log.d("koko_project", "立ち上がったぜ");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("koko_project", "おしまい。");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("koko_project", "復活した。");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("koko_project", "破壊！");
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.d("koko_project", String.format("X:%d, Y:%d", event.getX(), event.getY()));
		return true;
	}



}
