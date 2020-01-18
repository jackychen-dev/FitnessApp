package com.example.FitnessApp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.widget.ToggleButton;

public class design extends AppCompatActivity {

    EditText exerciseName, repnum, setnum,weightnum;
    Button Action;
    ToggleButton Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    FileOutputStream fstream;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        exerciseName = findViewById(R.id.exerciseName);
        repnum = findViewById(R.id.repnum);
        setnum = findViewById(R.id.setnum);
        weightnum=findViewById(R.id.weightnum);
        Action = findViewById(R.id.Action);
        Monday = findViewById(R.id.Monday);
        Tuesday=findViewById(R.id.Tuesday);
        Wednesday= findViewById(R.id.Wednesday);
        Thursday=findViewById(R.id.Thursday);
        Friday=findViewById(R.id.Friday);
        Saturday=findViewById(R.id.Saturday);
        Sunday=findViewById(R.id.Sunday);

    //This is when action starts
   Action.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (Monday.isChecked()) {
                String[] ename;
                ename = new String[]{exerciseName.getText().toString() + " " + setnum.getText().toString() +
                        "x" + repnum.getText().toString() +" at" + weightnum.getText()+ " Lb" + "\n"};

                try {
                    fstream = openFileOutput("Exercise_name", Context.MODE_APPEND);
                    for (String s : ename) {
                        fstream.write(s.getBytes());
                    }
                    fstream.close();
                    Toast.makeText(getApplicationContext(), "Exercise saved succesfully to Monday", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(Tuesday.isChecked())
            {
                String[] ename;
                ename = new String[]{exerciseName.getText().toString() + " " + setnum.getText().toString() +
                        "x" + repnum.getText().toString() +" at" + weightnum.getText()+ " Lb" + "\n"};

                try {
                    fstream = openFileOutput("Tuesday", Context.MODE_APPEND);
                    for (String s : ename) {
                        fstream.write(s.getBytes());
                    }
                    fstream.close();
                    Toast.makeText(getApplicationContext(), "Exercise saved succesfully to Tuesday", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(Wednesday.isChecked())
            { String[] ename;
                ename = new String[]{exerciseName.getText().toString() + " " + setnum.getText().toString() +
                        "x" + repnum.getText().toString() +" at" + weightnum.getText()+ " Lb" + "\n"};
                try {
                    fstream = openFileOutput("Wednesday", Context.MODE_APPEND);
                    for (String s : ename) {
                        fstream.write(s.getBytes());
                    }
                    fstream.close();
                    Toast.makeText(getApplicationContext(), "Exercise saved succesfully to Wednesday", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(Thursday.isChecked())
            {
                String[] ename;
                ename = new String[]{exerciseName.getText().toString() + " " + setnum.getText().toString() +
                        "x" + repnum.getText().toString() +" at" + weightnum.getText()+ " Lb" + "\n"};
                try {
                    fstream = openFileOutput("Thursday", Context.MODE_APPEND);
                    for (String s : ename) {
                        fstream.write(s.getBytes());
                    }
                    fstream.close();
                    Toast.makeText(getApplicationContext(), "Exercise saved succesfully to Thursday", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(Friday.isChecked())
            {

                String[] ename;
                ename = new String[]{exerciseName.getText().toString() + " " + setnum.getText().toString() +
                        "x" + repnum.getText().toString() +" at" + weightnum.getText()+ " Lb" + "\n"};
                try {
                    fstream = openFileOutput("Friday", Context.MODE_APPEND);
                    for (String s : ename) {
                        fstream.write(s.getBytes());
                    }
                    fstream.close();
                    Toast.makeText(getApplicationContext(), "Exercise saved succesfully to Friday", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(Saturday.isChecked())
            {
                String[] ename;
                ename = new String[]{exerciseName.getText().toString() + " " + setnum.getText().toString() +
                        "x" + repnum.getText().toString() +" at" + weightnum.getText()+ " Lb" + "\n"};
                try {
                    fstream = openFileOutput("Saturday", Context.MODE_APPEND);
                    for (String s : ename) {
                        fstream.write(s.getBytes());
                    }
                    fstream.close();
                    Toast.makeText(getApplicationContext(), "Exercise saved succesfully to Saturday", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(Sunday.isChecked())
            {
                String[] ename;
                ename = new String[]{exerciseName.getText().toString() + " " + setnum.getText().toString() +
                        "x" + repnum.getText().toString() +" at" + weightnum.getText()+ " Lb" + "\n"};
                try {
                    fstream = openFileOutput("Sunday", Context.MODE_APPEND);
                    for (String s : ename) {
                        fstream.write(s.getBytes());
                    }
                    fstream.close();
                    Toast.makeText(getApplicationContext(), "Exercise saved succesfully to Sunday", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        });
    }

}
