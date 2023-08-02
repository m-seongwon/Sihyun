package com.example.sihyun;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private Button showSelectedDateTimeButton;
    private TextView selectedDateTimeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        showSelectedDateTimeButton = findViewById(R.id.showSelectedDateTimeButton);
        selectedDateTimeTextView = findViewById(R.id.selectedDateTimeTextView);

        showSelectedDateTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = datePicker.getYear();
                int month = datePicker.getMonth() + 1; // Month는 0부터 시작하므로 +1을 해줍니다.
                int day = datePicker.getDayOfMonth();

                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                String selectedDateTime = year + "-" + month + "-" + day + " " + hour + ":" + minute;
                selectedDateTimeTextView.setText("선택한 날짜와 시간: " + selectedDateTime);
            }
        });
    }
}