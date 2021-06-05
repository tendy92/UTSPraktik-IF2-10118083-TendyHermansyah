package com.example.utspraktik_if2_10118083_tendyhermansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormPengisianDataOrangLain extends AppCompatActivity {

    //    Nim : 10118083
    //    Nama : Tendy Hermansyah
    //    Kelas : IF2
    //    Tanggal Pengerjaan : Sabtu, 05-06-2021

    public void ubah(View view){
        Intent intent = new Intent(FormPengisianDataOrangLain.this, MainActivity.class);
        startActivity(intent);
    }

    public void simpan(View view){
        Intent intent = new Intent(FormPengisianDataOrangLain.this, PopUp.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pengisian_data_orang_lain);

        Intent intent = getIntent();
    }
}