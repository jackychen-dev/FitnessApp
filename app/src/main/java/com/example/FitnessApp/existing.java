package com.example.FitnessApp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class existing extends AppCompatActivity {
    FileInputStream fstream, fstreamt, fstreamw, fstreamth, fstreamf, fstreamsat,fstreamsun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing);
        TextView mondayt=findViewById(R.id.mondayt);
        TextView tuesdayt=findViewById(R.id.tuesdayt);
        TextView wednesdayt=findViewById(R.id.wednesdayt);
        TextView thursdayt=findViewById(R.id.thursdayt);
        TextView fridayt=findViewById(R.id.fridayt);
        TextView saturdayt=findViewById(R.id.saturdayt);
        TextView sundayt=findViewById(R.id.sundayt);




        try{
            //monday
            fstream=openFileInput("Exercise_name");
            InputStreamReader inputStreamReader= new InputStreamReader(fstream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer=new StringBuffer();

            String lines;
            while((lines=bufferedReader.readLine())!=null) {
                stringBuffer.append(lines + " \n");
            }
            mondayt.setText(stringBuffer.toString());

            //monday



           // tuesday
            fstreamt=openFileInput("Tuesday");
            InputStreamReader inputStreamReadert= new InputStreamReader(fstreamt);
            BufferedReader bufferedReadert=new BufferedReader(inputStreamReadert);
            StringBuffer stringBuffert=new StringBuffer();

            String linest;
            while((linest=bufferedReadert.readLine())!=null) {
                stringBuffert.append(linest + " \n");
            }
            tuesdayt.setText(stringBuffert.toString());

            //tuesday

            //wednesday
            fstreamw=openFileInput("Wednesday");
            InputStreamReader inputStreamReaderw= new InputStreamReader(fstreamw);
            BufferedReader bufferedReaderw=new BufferedReader(inputStreamReaderw);
            StringBuffer stringBufferw=new StringBuffer();

            String linesw;
            while((linesw=bufferedReaderw.readLine())!=null) {
                stringBufferw.append(linesw + " \n");
            }
            wednesdayt.setText(stringBufferw.toString());
            //wednesday

            //Thursday
            fstreamth=openFileInput("Thursday");
            InputStreamReader inputStreamReaderth= new InputStreamReader(fstreamth);
            BufferedReader bufferedReaderth=new BufferedReader(inputStreamReaderth);
            StringBuffer stringBufferth=new StringBuffer();

            String linesth;
            while((linesth=bufferedReaderth.readLine())!=null) {
                stringBufferth.append(linesth + " \n");
            }
            thursdayt.setText(stringBufferth.toString());
            //Thursday

            //Friday
            fstreamf=openFileInput("Friday");
            InputStreamReader inputStreamReaderf= new InputStreamReader(fstreamf);
            BufferedReader bufferedReaderf=new BufferedReader(inputStreamReaderf);
            StringBuffer stringBufferf=new StringBuffer();

            String linesf;
            while((linesf=bufferedReaderf.readLine())!=null) {
                stringBufferf.append(linesf + " \n");
            }
            fridayt.setText(stringBufferf.toString());
            //Friday

            //Saturday
            fstreamsat=openFileInput("Saturday");
            InputStreamReader inputStreamReadersat= new InputStreamReader(fstreamsat);
            BufferedReader bufferedReadersat=new BufferedReader(inputStreamReadersat);
            StringBuffer stringBuffersat=new StringBuffer();

            String linessat;
            while((linessat=bufferedReadersat.readLine())!=null) {
                stringBuffersat.append(linessat + " \n");
            }
            saturdayt.setText(stringBuffersat.toString());
            //Saturday

            //Sunday
            fstreamsun=openFileInput("Sunday");
            InputStreamReader inputStreamReadersun= new InputStreamReader(fstreamsun);
            BufferedReader bufferedReadersun=new BufferedReader(inputStreamReadersun);
            StringBuffer stringBuffersun=new StringBuffer();

            String linessun;
            while((linessun=bufferedReadersun.readLine())!=null) {
                stringBuffersun.append(linessun + " \n");
            }
            sundayt.setText(stringBuffersun.toString());

            //Sunday

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //print to tuesday Text

}

