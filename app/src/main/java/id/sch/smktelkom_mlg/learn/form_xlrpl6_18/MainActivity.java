package id.sch.smktelkom_mlg.learn.form_xlrpl6_18;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etnama;
    Button daftar;
    RadioGroup rgor;
    CheckBox baca, tulis, dll;
    Spinner kelas;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.editText);
        rgor = (RadioGroup) findViewById(R.id.rgor);
        baca = (CheckBox) findViewById(R.id.baca);
        tulis = (CheckBox) findViewById(R.id.tulis);
        dll = (CheckBox) findViewById(R.id.dll);
        kelas = (Spinner) findViewById(R.id.spinnerkelas);
        tvhasil= (TextView) findViewById(R.id.textView6);
        daftar = (Button) findViewById(R.id.button);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProses();
            }
        });
    }



}
