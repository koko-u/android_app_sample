package example.koko2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Touch extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button copy_button = (Button)findViewById(R.id.button1);

        copy_button.setOnClickListener(new OnClickListener() {

        	TextView out_view = (TextView)findViewById(R.id.text1);
        	EditText in_view = (EditText)findViewById(R.id.editText1);

			@Override
			public void onClick(View view) {
				out_view.setText(in_view.getText());
			}

        });

    }

}