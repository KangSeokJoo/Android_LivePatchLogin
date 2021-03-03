package com.jinasoft.livepatchlogin;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView error1, error2, error3, error4, error5, findpass, signin;
    Button btn1;
    EditText idedt, passedt;
//tv 1 이메일+비번 , tv2 이메일 없음 tv3 @ + com tv4 이메일입력x tv5 패스입력x       tv1 ,tv 2는 서버 연동 필요
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        error1.findViewById(R.id.tv1);
        error2.findViewById(R.id.tv2);
        error3.findViewById(R.id.tv3);
        error4.findViewById(R.id.tv4);
        idedt.findViewById(R.id.id);
        passedt.findViewById(R.id.pass);
        btn1.findViewById(R.id.login);

        idedt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!Patterns.EMAIL_ADDRESS.matcher(s.toString()).matches()){ // 안드로이드에서 제공하는 e메일 형식
                    error3.setVisibility(View.VISIBLE);
                    idedt.setBackgroundResource(R.drawable.sqaure_rect_select);
                }else {
                    error3.setVisibility(View.GONE);
                    idedt.setBackgroundResource(R.drawable.sqaure_rect_normal);
                }
            }
        });



        btn1.setOnClickListener(v -> {
            if (idedt == null || idedt.equals("")) {
                error4.setVisibility(View.VISIBLE);
                idedt.setBackgroundResource(R.drawable.sqaure_rect_select);
            }else {
                error4.setVisibility(View.GONE);
                idedt.setBackgroundResource(R.drawable.sqaure_rect_normal);
            }
            if (passedt == null || passedt.equals("")) {
                error5.setVisibility(View.VISIBLE);
                passedt.setBackgroundResource(R.drawable.sqaure_rect_select);
            }else {
                error5.setVisibility(View.GONE);
                passedt.setBackgroundResource(R.drawable.sqaure_rect_normal);
            }
        });

    }
}