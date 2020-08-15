package com.urk17cs290.studentinformationapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private static final String FALSE = "false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout name = findViewById(R.id.name);
        final TextInputLayout regno = findViewById(R.id.regNo);
        final TextInputLayout dept = findViewById(R.id.deptName);
        final RadioGroup gender = findViewById(R.id.gender);
        final Spinner states = findViewById(R.id.state);
        Button submit = findViewById(R.id.submitButton);
        final TextInputLayout sub1 = findViewById(R.id.subject1);
        final TextInputLayout sub2 = findViewById(R.id.subject2);
        final TextInputLayout sub3 = findViewById(R.id.subject3);
        final TextInputLayout sub4 = findViewById(R.id.subject4);
        final TextInputLayout sub5 = findViewById(R.id.subject5);
        final TextInputLayout mark1 = findViewById(R.id.mark1);
        final TextInputLayout mark2 = findViewById(R.id.mark2);
        final TextInputLayout mark3 = findViewById(R.id.mark3);
        final TextInputLayout mark4 = findViewById(R.id.mark4);
        final TextInputLayout mark5 = findViewById(R.id.mark5);

        final CheckBox football = findViewById(R.id.football);
        final CheckBox gardening = findViewById(R.id.gardening);
        final CheckBox boardGames = findViewById(R.id.boardGames);
        final CheckBox videoGames = findViewById(R.id.videoGames);

        submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        try {
                            final String Name = Objects.requireNonNull(name.getEditText()).getText().toString();
                            final String regNo = Objects.requireNonNull(regno.getEditText()).getText().toString();
                            final String deptName = Objects.requireNonNull(dept.getEditText()).getText().toString();
                            RadioButton selectedGender = findViewById(gender.getCheckedRadioButtonId());
                            final String gend = selectedGender.getText().toString().trim();
                            String state = states.getSelectedItem().toString().trim();

                            double m1 = Double.parseDouble(Objects.requireNonNull(mark1.getEditText()).getText().toString().trim());
                            double m2 = Double.parseDouble(Objects.requireNonNull(mark2.getEditText()).getText().toString().trim());
                            double m3 = Double.parseDouble(Objects.requireNonNull(mark3.getEditText()).getText().toString().trim());
                            double m4 = Double.parseDouble(Objects.requireNonNull(mark4.getEditText()).getText().toString().trim());
                            double m5 = Double.parseDouble(Objects.requireNonNull(mark5.getEditText()).getText().toString().trim());
                            double tot = m1 + m2 + m3 + m4 + m5;
                            double avg = tot / 5;
                            double cgpa = avg / 10;
                            String fCheck = FALSE;
                            String gCheck = FALSE;
                            String bCheck = FALSE;
                            String vCheck = FALSE;

                            if (football.isChecked()) fCheck = "true";
                            if (gardening.isChecked()) gCheck = "true";
                            if (boardGames.isChecked()) bCheck = "true";
                            if (videoGames.isChecked()) vCheck = "true";
                            String[] grades = new String[5];
                            double[] marks = {m1, m2, m3, m4, m5};
                            for (int i = 0; i < marks.length; i++) {
                                if (marks[i] > 95) grades[i] = "O";
                                else if (marks[i] > 85) grades[i] = "S";
                                else if (marks[i] > 75) grades[i] = "A";
                                else if (marks[i] > 65) grades[i] = "B";
                                else if (marks[i] > 50) grades[i] = "P";
                                else grades[i] = "F";
                            }

                            Intent i = new Intent(getApplicationContext(), DisplayOutput.class);
                            i.putExtra("NAME", Name);
                            i.putExtra("REG_NO", regNo);
                            i.putExtra("DEPT_NAME", deptName);
                            i.putExtra("GENDER", gend);
                            i.putExtra("STATE", state);
                            i.putExtra("SUB_1", Objects.requireNonNull(sub1.getEditText()).getText().toString().trim());
                            i.putExtra("SUB_2", Objects.requireNonNull(sub2.getEditText()).getText().toString());
                            i.putExtra("SUB_3", Objects.requireNonNull(sub3.getEditText()).getText().toString());
                            i.putExtra("SUB_4", Objects.requireNonNull(sub4.getEditText()).getText().toString());
                            i.putExtra("SUB_5", Objects.requireNonNull(sub5.getEditText()).getText().toString());
                            i.putExtra("MARK_1", mark1.getEditText().getText().toString());
                            i.putExtra("MARK_2", mark2.getEditText().getText().toString());
                            i.putExtra("MARK_3", mark3.getEditText().getText().toString());
                            i.putExtra("MARK_4", mark4.getEditText().getText().toString());
                            i.putExtra("MARK_5", mark5.getEditText().getText().toString());
                            i.putExtra("CGPA", Double.toString(cgpa));
                            i.putExtra("GRADE1", grades[0]);
                            i.putExtra("GRADE2", grades[1]);
                            i.putExtra("GRADE3", grades[2]);
                            i.putExtra("GRADE4", grades[3]);
                            i.putExtra("GRADE5", grades[4]);
                            i.putExtra("F_CHECK", fCheck);
                            i.putExtra("B_CHECK", bCheck);
                            i.putExtra("V_CHECK", vCheck);
                            i.putExtra("G_CHECK", gCheck);
                            startActivity(i);


                        } catch (Exception e) {
                            Log.e("TAG", "onClick: exception: " + e.getMessage());
                        }
                    }
                });
    }
}