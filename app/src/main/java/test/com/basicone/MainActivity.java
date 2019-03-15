package test.com.basicone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtPanjang;
    private EditText edtLebar;
    private EditText edtLuas;
    private Button btnHitungLuas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ini kita memanggil method atau function
        initUI();
        iniEvent();
    }

    private void initUI() {
        edtPanjang = findViewById(R.id.editText1);
        edtLebar = findViewById(R.id.editText2);
        edtLuas = findViewById(R.id.editText3);
        btnHitungLuas = findViewById(R.id.btnh);
    }

    private void iniEvent() {
        btnHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //kita mangggil method lagi sama bikin method
                hitungLuas();

            }


        });
    }

    private void hitungLuas() {
        int panjang = Integer.parseInt(edtPanjang.getText().toString());
        int lebar = Integer.parseInt(edtLebar.getText().toString());
        int luas = panjang * lebar;
        edtLuas.setText(luas + " ");

    }

}

