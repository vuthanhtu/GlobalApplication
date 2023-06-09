package com.example.globalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnXacNhan;
    EditText edtHoTen,edtSoDienThoai,edtEmail;
    TextView textviewThongBao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtEmail.getText().toString();
                String hoten = edtHoTen.getText().toString();
                String sdt = edtSoDienThoai.getText().toString();
                String text_ChaoBan = getResources().getString(R.string.text_ChaoBan);
                String textEmail = getResources().getString(R.string.text_Email);
                String textSoDienThoai = getResources().getString(R.string.text_SoDienThoai);
                textviewThongBao.setText(text_ChaoBan+": "+hoten+"\n"+textEmail+": "+email+"\n"+textSoDienThoai+": "+sdt);
            }
        });
    }
    private void AnhXa(){
        btnXacNhan = (Button) findViewById(R.id.btnXacNhan);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtHoTen = (EditText) findViewById(R.id.edtHoTen);
        edtSoDienThoai = (EditText) findViewById(R.id.edtSoDienThoai);
        textviewThongBao = (TextView) findViewById(R.id.textviewThongBao);
    }
}