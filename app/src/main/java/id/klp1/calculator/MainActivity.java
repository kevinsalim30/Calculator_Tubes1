package id.klp1.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView prevCalcu;
    private EditText curDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prevCalcu = findViewById(R.id.previousCal);
        curDisplay = findViewById(R.id.curEditText);
    }

    private void updateText(String strToAdd){
        curDisplay.setText(strToAdd);
    }

    public void nolPush(View view){
        updateText(getResources().getString(R.string.nolText));
    }

    public void satuPush(View view){
        updateText(getResources().getString(R.string.satuText));
    }

    public void duaPush(View view){
        updateText(getResources().getString(R.string.duaText));
    }

    public void tigaPush(View view){
        updateText(getResources().getString(R.string.tigaText));
    }

    public void empatPush(View view){
        updateText(getResources().getString(R.string.empatText));
    }

    public void limaPush(View view){
        updateText(getResources().getString(R.string.limaText));
    }

    public void enamPush(View view){
        updateText(getResources().getString(R.string.enamText));
    }

    public void tujuhPush(View view){
        updateText(getResources().getString(R.string.tujuhText));
    }

    public void delapanPush(View view){
        updateText(getResources().getString(R.string.delapanText));
    }

    public void sembilanPush(View view){
        updateText(getResources().getString(R.string.sembilanText));
    }

    public void tambahPush(View view){
        updateText(getResources().getString(R.string.tambahText));
    }

    public void bagiPush(View view){
        updateText(getResources().getString(R.string.bagiText));
    }

    public void kurangPush(View view){
        updateText(getResources().getString(R.string.kurangText));
    }

    public void kaliPush(View view){
        updateText(getResources().getString(R.string.kaliText));
    }

    public void bukaPush(View view){
        updateText(getResources().getString(R.string.kurungbukaText));
    }

    public void tutupPush(View view){
        updateText(getResources().getString(R.string.kurungtutupText));
    }

    public void titikPush(View view){
        updateText(getResources().getString(R.string.titikText));
    }

    public void clearPush(View view){
        updateText("");
    }

    public void equalPush(View view){
    }

    public void deletePush(View view){
    }

}