package com.example.pracitce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button yes,no;
TextView textView;
public int score=0;
boolean [] answers={true,false,true,true,false,false};
String []questions={"Nepal is located in South Asia?","Nepal is a developed country","Mt Everest lies in South Asia","The current prime minister of Nepal is Sher Bahadur Deuba",
"Nepal has rectangular flag","Nepal is most richest country in terms of water resources"};
public int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.button);
        no = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        textView.setText(questions[index]);
       yes.setOnClickListener(view -> {
           if(index<questions.length) {
               if (answers[index]) {
                   score++;
               }
               index++;
               if (index < questions.length) {
                   textView.setText(questions[index]);
               } else {
                   Toast.makeText(this,"YOUR SCORE IS:"+" "+score+"/"+index, Toast.LENGTH_SHORT).show();
               }
           }
           else{
               Toast.makeText(this,"Restart the app", Toast.LENGTH_SHORT).show();
           }
       });
        no.setOnClickListener(view -> {
            if(index<questions.length) {
                if (!answers[index]) {
                    score++;
                }
                index++;
                if (index < questions.length) {
                    textView.setText(questions[index]);
                } else {
                    Toast.makeText(this,"YOUR SCORE IS:"+" "+score+"/"+(index), Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(this,"Restart the app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}