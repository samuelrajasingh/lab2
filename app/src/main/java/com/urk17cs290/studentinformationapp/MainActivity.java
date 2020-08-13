package com.urk17cs290.studentinformationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final TextInputLayout name= findViewById(R.id.name);
//        final TextInputLayout regno= findViewById(R.id.regNo);
//        final TextInputLayout dept= findViewById(R.id.deptName);
//        final RadioGroup Gender= findViewById(R.id.gender);
//        final RadioButton Male= findViewById(R.id.male);
//        final RadioButton FeMale= findViewById(R.id.female);
//        final Spinner States=findViewById(R.id.state);
//        Button Submit=findViewById(R.id.submitButton);
//        final  TextInputLayout sub1=findViewById(R.id.subject1);
//        final  TextInputLayout sub2=findViewById(R.id.subject2);
//        final  TextInputLayout sub3=findViewById(R.id.subject3);
//        final  TextInputLayout sub4=findViewById(R.id.subject4);
//        final  TextInputLayout sub5=findViewById(R.id.subject5);
//        final  TextInputLayout mark1=findViewById(R.id.mark1);
//        final  TextInputLayout mark2=findViewById(R.id.mark2);
//        final  TextInputLayout mark3=findViewById(R.id.mark3);
//        final  TextInputLayout mark4=findViewById(R.id.mark4);
//        final  TextInputLayout mark5=findViewById(R.id.mark5);
//
//        final CheckBox football=findViewById(R.id.football);
//        final CheckBox gardening=findViewById(R.id.gardening);
//        final CheckBox boardGames=findViewById(R.id.boardGames);
//        final CheckBox videoGames=findViewById(R.id.videoGames);
//
//


//        Submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                final String Name=name.getText().toString();
//                final String regNo =regno.getText().toString();
//                final String deptName =dept.getText().toString();
//                RadioButton selectedGender=(RadioButton)findViewById(Gender.getCheckedRadioButtonId());
//                final String gend=selectedGender.getText().toString();
//                String state = States.getSelectedItem().toString();
//
//                double total=Double.parseDouble(mark1.get().toString())+
//                        Double.parseDouble(mark2.getText().toString())+
//                        Double.parseDouble(mark3.getText().toString())+
//                        Double.parseDouble(mark4.getText().toString())+
//                        Double.parseDouble(mark5.getText().toString());
//                double cgpa=total/5;
//
//                boolean fCheck = false,gCheck=false,bCheck=false,vCheck=false;
//                if(football.isChecked())
//                    fCheck=true;
//                if(gardening.isChecked())
//                    gCheck=true;
//                if(boardGames.isChecked())
//                    bCheck=true;
//                if(videoGames.isChecked())
//                    vCheck=true;
//                String grade;
//
//                if (cgpa>95)
//                    grade="O";
//                else if(cgpa>85)
//                    grade="S";
//                else if(cgpa>75)
//                    grade="A";
//                else if(cgpa>65)
//                    grade="B";
//                else if(cgpa>50)
//                    grade="P";
//                else
//                    grade="F";
//
//                Intent i=new Intent(getApplicationContext(),DisplayOutput.class);
//                i.putExtra("NAME",Name);
//                i.putExtra("REG_NO",regNo);
//                i.putExtra("DEPT_NAME",deptName);
//                i.putExtra("GENDER",gend);
//                i.putExtra("STATE",state);
//                i.putExtra("SUB_1",sub1.getText().toString());
//                i.putExtra("SUB_2",sub2.getText().toString());
//                i.putExtra("SUB_3",sub3.getText().toString());
//                i.putExtra("SUB_4",sub4.getText().toString());
//                i.putExtra("SUB_5",sub5.getText().toString());
//                i.putExtra("MARK_1",mark1.getText().toString());
//                i.putExtra("MARK_2",mark2.getText().toString());
//                i.putExtra("MARK_3",mark3.getText().toString());
//                i.putExtra("MARK_4",mark4.getText().toString());
//                i.putExtra("MARK_5",mark5.getText().toString());
//                i.putExtra("CGPA",cgpa);
//                i.putExtra("GRADE",grade);
//                i.putExtra("F_CHECK",fCheck);
//                i.putExtra("B_CHECK",bCheck);
//                i.putExtra("V_CHECK",vCheck);
//                i.putExtra("G_CHECK",gCheck);
//
//                startActivity(i);
//            }
//        });
//


    }
}