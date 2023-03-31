package ru.mirea.vikulov.favouritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

    }

    public void onClickSent(View view) {
        EditText textf = (EditText) findViewById(R.id.nameBook);
        String text = textf.getText().toString();
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE,"Название Вашей любимой книги: " + text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}