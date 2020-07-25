package com.sananda.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SecondPage extends AppCompatActivity implements OnItemSelectedListener {

    private static final String[] currency = {"Dollar(United States)","Dollar(Australia)",
            "Dollar(Singapore)","Dollar(Canada)","Pound(British)","Yuan(Chinese)","Euro","Rupee(Indian)","Yen(Japan)","Ringgit(Malaysia)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Button convert = findViewById(R.id.convert);
        final EditText editText1 = findViewById(R.id.editText1);
        final Spinner spinner1 = findViewById(R.id.spinner1);
        final EditText editText2 = findViewById(R.id.editText2);

        spinner1.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(SecondPage.this,android.R.layout.simple_spinner_item,currency);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(spinner1.getSelectedItem());
                if(str=="Dollar(United States)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 84.94;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Dollar(Australia)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 59.19;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Dollar(Singapore)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 60.89;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Dollar(Canada)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 63.26;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }

                if(str=="Pound(British)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 107.59;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Yuan(Chinese)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 11.99;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Euro")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 95.91;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Rupee(Indian)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 1.12;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Yen(Japan)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * .78;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }
                if(str=="Ringgit(Malaysia)")
                {
                    Double dollarAmount = Double.parseDouble(editText1.getText().toString());

                    Double poundAmount = dollarAmount * 19.90;
                    editText2.setText(poundAmount.toString(), TextView.BufferType.EDITABLE);
                }




            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
