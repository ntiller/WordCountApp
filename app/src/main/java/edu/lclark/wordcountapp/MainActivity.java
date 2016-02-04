package edu.lclark.wordcountapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView mCountTextView, mCopyTextView;
    private EditText mInputEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clearButton = (Button) findViewById(R.id.activity_main_clear_button);
        Button inputButton = (Button) findViewById(R.id.activity_main_input_button);

        mCountTextView = (TextView) findViewById(R.id.activity_main_count_textview);
        mCopyTextView = (TextView) findViewById(R.id.activity_main_copy_textview);
        mInputEditText = (EditText) findViewById(R.id.activity_main_edittext);


        clearButton.setOnClickListener(this);
        inputButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.activity_main_clear_button:
                mInputEditText.setText("");
                mCopyTextView.setText("");
                mCountTextView.setText(R.string.zero);
                break;

            case R.id.activity_main_input_button:
                String inputStr = mInputEditText.getText().toString().trim();
                int count = inputStr.split("\\s+").length;
                mCopyTextView.setText(inputStr);
                mCountTextView.setText(Integer.toString(count));
                break;


        }


    }
}
