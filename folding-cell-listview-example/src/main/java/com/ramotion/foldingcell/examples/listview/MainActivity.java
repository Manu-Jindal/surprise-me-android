package com.ramotion.foldingcell.examples.listview;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ramotion.foldingcell.FoldingCell;
import com.ramotion.foldingcell.examples.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Example of using Folding Cell with ListView and ListAdapter
 */
public class MainActivity extends AppCompatActivity {
    Button selectDate;
    TextView date;
    Button selectDate1;
    Button proceed;
    TextView date1;

    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    DatePickerDialog datePickerDialog1;
    int year1;
    int month1;
    int dayOfMonth1;
    Calendar calendar1;

    String check_in_date,check_out_date;

    String arr[]=new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectDate = findViewById(R.id.btnDate);
        date = findViewById(R.id.tvSelectedDate);
        proceed = findViewById(R.id.proceed);

        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                date.setText(day + "/" + (month + 1) + "/" + year);
                            }
                        }, year, month, dayOfMonth);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });

        selectDate1 = findViewById(R.id.btnDate1);
        date1 = findViewById(R.id.tvSelectedDate1);

        selectDate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar1 = Calendar.getInstance();
                year1 = calendar1.get(Calendar.YEAR);
                month1 = calendar1.get(Calendar.MONTH);
                dayOfMonth1 = calendar1.get(Calendar.DAY_OF_MONTH);
                datePickerDialog1 = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year1, int month1, int day1) {
                                date1.setText(day1 + "/" + (month1 + 1) + "/" + year1);
                            }
                        }, year1, month1, dayOfMonth1);
                datePickerDialog1.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog1.show();
            }
        });


        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SwipePreference.class);
                startActivity(intent);

            }
        });

    }
    public void getDetails(View view){
        TextView a = (TextView) findViewById(R.id.tvSelectedDate);
        check_in_date = a.getText() + "";

        TextView b = (TextView) findViewById(R.id.tvSelectedDate1);
        check_out_date = b.getText() + "";

        EditText e1 = (EditText) findViewById(R.id.budget);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String text = spinner.getSelectedItem().toString();



        arr[0] = format(check_in_date);
        arr[1] = format(check_out_date);
        arr[2] = ""+e1.getText() + "";
        arr[3] = text;

    }

    public String format(String s){
        String a=s.substring(0,s.indexOf('/'));
        String b=s.substring(s.indexOf('/')+1,s.lastIndexOf('/'));
        String c=s.substring(s.lastIndexOf('/')+1);
        if(a.length()<=1)
            a="0"+a;
        if(b.length()<=1)
            b="0"+b;
        s=c+"-"+b+"-"+a;
        return s;
    }
}