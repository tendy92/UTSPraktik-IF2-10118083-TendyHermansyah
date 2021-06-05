package com.example.utspraktik_if2_10118083_tendyhermansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PopUp extends AppCompatActivity {

    //    Nim : 10118083
    //    Nama : Tendy Hermansyah
    //    Kelas : IF2
    //    Tanggal Pengerjaan : Sabtu, 05-06-2021

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        Intent intent = getIntent();
    }

    public void ok(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}