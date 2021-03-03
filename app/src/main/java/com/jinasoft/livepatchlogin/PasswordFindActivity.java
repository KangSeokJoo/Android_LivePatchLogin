package com.jinasoft.livepatchlogin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PasswordFindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_find);
    }

    //에디트 셀렉트시 밑줄 색깔, X 버튼 표시 밑줄 총 3개 , 이메일 맞나 확인, 글씨 표출 버튼색깔 교체 / @이와 , null값이면 버튼 활성화 x
}