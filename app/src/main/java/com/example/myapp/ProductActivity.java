package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ProductActivity extends AppCompatActivity {

    TextView result_text;
    Button result_button;
    GridView grid_View;

    // 상품명, 이미지, 가격, 수량
    String pdt_name[] = {"아메리카노", "카페라떼", "쥬스", "콜라"};
    int pdt_image[] = {R.drawable.coffee2, R.drawable.coffee1, R.drawable.drink1, R.drawable.drink2};
    int pdt_price[] = {5000, 8000, 7000, 4000};
    int pdt_count[] = {0, 0, 0, 0};
    int total_price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        // 화면과 변수를 연결
        result_text = findViewById(R.id.result_text);
        result_button = findViewById(R.id.result_button);
        grid_View = findViewById(R.id.gird_view);

        // 버튼 클릭 기능 추가(결제하기)
        result_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // PG사와 연결해서 결제진행하는 페이지로 이동
                Toast.makeText(getApplicationContext(), total_price+"원 결제 완료", Toast.LENGTH_LONG).show();
            }
        });
    }
}