package com.urk17cs290.studentinformationapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textview.MaterialTextView;

import java.util.Objects;

public class DisplayOutput extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_output);

        MaterialTextView name = findViewById(R.id.name);
        MaterialTextView dname = findViewById(R.id.deptName);
        MaterialTextView regno = findViewById(R.id.regNo);
        MaterialTextView gend = findViewById(R.id.gender);
        MaterialTextView State = findViewById(R.id.state);
        MaterialTextView subj1 = findViewById(R.id.subject1);
        MaterialTextView subj2 = findViewById(R.id.subject2);
        MaterialTextView subj3 = findViewById(R.id.subject3);
        MaterialTextView subj4 = findViewById(R.id.subject4);
        MaterialTextView subj5 = findViewById(R.id.subject5);
        MaterialTextView mk1 = findViewById(R.id.mark1);
        MaterialTextView mk2 = findViewById(R.id.mark2);
        MaterialTextView mk3 = findViewById(R.id.mark3);
        MaterialTextView mk4 = findViewById(R.id.mark4);
        MaterialTextView mk5 = findViewById(R.id.mark5);
        MaterialTextView Cgpa = findViewById(R.id.cgpa);
        MaterialTextView gd1 = findViewById(R.id.grade1);
        MaterialTextView gd2 = findViewById(R.id.grade2);
        MaterialTextView gd3 = findViewById(R.id.grade3);
        MaterialTextView gd4 = findViewById(R.id.grade4);
        MaterialTextView gd5 = findViewById(R.id.grade5);
        MaterialTextView Hob = findViewById(R.id.hobby);


        Intent i = getIntent();
        String Name = i.getStringExtra("NAME");
        String regNo = i.getStringExtra("REG_NO");
        String dept = i.getStringExtra("DEPT_NAME");
        String gender = i.getStringExtra("GENDER");
        String state = i.getStringExtra("STATE");
        String sub1 = i.getStringExtra("SUB_1");
        String sub2 = i.getStringExtra("SUB_2");
        String sub3 = i.getStringExtra("SUB_3");
        String sub4 = i.getStringExtra("SUB_4");
        String sub5 = i.getStringExtra("SUB_5");
        String mark1 = i.getStringExtra("MARK_1");
        String mark2 = i.getStringExtra("MARK_2");
        String mark3 = i.getStringExtra("MARK_3");
        String mark4 = i.getStringExtra("MARK_4");
        String mark5 = i.getStringExtra("MARK_5");
        String cgpa = i.getStringExtra("CGPA");
        String grade1 = i.getStringExtra("GRADE1");
        String grade2 = i.getStringExtra("GRADE2");
        String grade3 = i.getStringExtra("GRADE3");
        String grade4 = i.getStringExtra("GRADE4");
        String grade5 = i.getStringExtra("GRADE5");
        String fCheck = i.getStringExtra("F_CHECK");
        String vCheck = i.getStringExtra("V_CHECK");
        String bCheck = i.getStringExtra("B_CHECK");
        String gCheck = i.getStringExtra("G_CHECK");


        name.setText(Name);
        dname.setText(dept);
        regno.setText(regNo);
        gend.setText(gender);
        State.setText(state);
        subj1.setText(sub1);
        subj2.setText(sub2);
        subj3.setText(sub3);
        subj4.setText(sub4);
        subj5.setText(sub5);
        mk1.setText(mark1);
        mk2.setText(mark2);
        mk3.setText(mark3);
        mk4.setText(mark4);
        mk5.setText(mark5);
        Cgpa.setText(cgpa);
        gd1.setText(grade1);
        gd2.setText(grade2);
        gd3.setText(grade3);
        gd4.setText(grade4);
        gd5.setText(grade5);

        StringBuilder stringBuilder = new StringBuilder();
        if (Objects.equals(vCheck, "true"))
            stringBuilder.append("Video Games,");
        if (Objects.equals(fCheck, "true"))
            stringBuilder.append("Foot Ball,");
        if (Objects.equals(bCheck, "true"))
            stringBuilder.append("Board Games,");
        if (Objects.equals(gCheck, "true"))
            stringBuilder.append("Gardening");
        Hob.setText(stringBuilder.toString());
    }
}