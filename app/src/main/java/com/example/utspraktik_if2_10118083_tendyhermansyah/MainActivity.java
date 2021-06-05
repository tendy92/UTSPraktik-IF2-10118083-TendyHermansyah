package com.example.utspraktik_if2_10118083_tendyhermansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //    Nim : 10118083
    //    Nama : Tendy Hermansyah
    //    Kelas : IF2
    //    Tanggal Pengerjaan : Sabtu, 05-06-2021

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult;
    private EditText btDatePicker;

    Button bsimpan;
    EditText enpm, enama, etempatlahir;
    TextView thasil;
    RadioGroup rgjk;
    Spinner skelas, sagama;

    private void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                tvDateResult.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

//        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
//        tvDateResult = (TextView) findViewById(R.id.calendar);
//        btDatePicker = (EditText) findViewById(R.id.calendar);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        tvDateResult = (TextView) findViewById(R.id.calendar);
        btDatePicker = (EditText) findViewById(R.id.calendar);
        btDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

    }
    public void selanjutnya(View view){
        Intent intent = new Intent(MainActivity.this, FormPengisianDataOrangLain.class);
        startActivity(intent);
    }

    public void jeniskelamin(View view) {
    }

    public void Hubungan(View view) {
    }
}