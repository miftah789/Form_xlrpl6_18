package id.sch.smktelkom_mlg.learn.form_xlrpl6_18;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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

    private void doProses() {
        if (isValid()) {
        }
    }
    private boolean isValid() {
        boolean valid = true;
        String nama = etnama.getText().toString();

        if (nama.isEmpty()) {
            etnama.setError("Nama Belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etnama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etnama.setError(null);
        }

        String hobi = " \n";
        int startlen = hobi.length();
        if (baca.isChecked()) hobi += baca.getText() + "\n";
        if (tulis.isChecked()) hobi += tulis.getText() + "\n";
        if (dll.isChecked()) hobi += dll.getText() + "\n";

        String or = null;
        if (rgor.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(rgor.getCheckedRadioButtonId());
            or = rb.getText().toString();
        }

        if (or == null) {
            tvhasil.setText("Belum memilih Organisasi");
            valid = false;
        } else {
            tvhasil.setText(" Nama : " + nama + "\nOrganisasi yang Anda pilih :" + or + "\n\nSudah Tetdaftar Sesuai Pilihan Anda.\n");
        }
        return valid;
    }
}
