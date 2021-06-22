package com.example.matheussimonproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class addActivity extends AppCompatActivity {

    EditText eventText;
    EditText yearText;
    EditText monthText;
    EditText dayText;
    EditText hourText;
    EditText minuteText;

    public String event;
    public int year;
    public int month;
    public int day;
    public int hour;
    public int minute;

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        eventText = (EditText)findViewById(R.id.eventPlainText);
        yearText = (EditText)findViewById(R.id.yearPlainText);
        monthText = (EditText)findViewById(R.id.monthPlainText);
        dayText = (EditText)findViewById(R.id.dayPlainText);
        hourText = (EditText)findViewById(R.id.hourPlainText);
        minuteText = (EditText)findViewById(R.id.minutePlainText);
    }

    public void onClickAdd(View view) {

        event = eventText.getText().toString();
        year = Integer.parseInt(yearText.getText().toString());
        month = Integer.parseInt(monthText.getText().toString());
        day = Integer.parseInt(dayText.getText().toString());
        hour = Integer.parseInt(hourText.getText().toString());
        minute = Integer.parseInt(minuteText.getText().toString());

        SharedPreferences settings = getSharedPreferences("datapersistance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        editor.putString("event",event);
        editor.putInt("year",year);
        editor.putInt("month",month);
        editor.putInt("day",day);
        editor.putInt("hour",hour);
        editor.putInt("minute",minute);
        editor.putString("modification","yes");
        editor.apply();  // writes shared prefs to file

        finish();
    }

}