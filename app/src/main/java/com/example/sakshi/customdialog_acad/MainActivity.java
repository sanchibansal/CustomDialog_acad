package com.example.sakshi.customdialog_acad;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //declaring button
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //associating button
       button=(Button)findViewById(R.id.button);
        //set on click listener for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating dialog
                final Dialog dialog = new Dialog(MainActivity.this);
                //setting set cancellable to false
                dialog.setCanceledOnTouchOutside(false);
                //setting dialog layout for custom dialog
                dialog.setContentView(R.layout.dialoglayout);
                //show dialog
                dialog.show();
                //declaring and associating buttons on custom dialog
                Button yes = (Button)dialog.findViewById(R.id.yes);
                Button no = (Button)dialog.findViewById(R.id.no);
                //on click listener for button yes
               yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //quits app
                        finish();
                    }
                });
                //on click listener for button no
                no.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //dismisses dialog
                        dialog.dismiss();
                    }
                });

            }
        });
    }
}
