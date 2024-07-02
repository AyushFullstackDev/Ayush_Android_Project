package com.example.ayush_android_second_project;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ayush_android_second_project.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.abc);
       @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn = findViewById(R.id.submit_button_text);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               myFunction();
           }
       });
    }

    @SuppressLint("SetTextI18n")
    private void myFunction(){
//        Input
        EditText a = findViewById(R.id.age_input_text);
        EditText b =findViewById(R.id.weight_w);
        EditText f = findViewById(R.id.height_h);
        EditText i = findViewById(R.id.height_hh);
        TextView result = findViewById(R.id.bmi_text);
        TextView result_r = findViewById(R.id.bmi_text_age);

        String age = String.valueOf(a.getText());
        String weight_w = String.valueOf(b.getText());
        String height_f = String.valueOf(f.getText());
        String height_i = String.valueOf(i.getText());
//        Process

        double ag = Double.valueOf(age);
        double weight = Double.valueOf(weight_w);
        float heightF = Float.parseFloat(height_f);
        float heightI = Float.parseFloat(height_i);

//        convert in meter height(0.3048 =feet to meter) and (0.0254 =Inch to meter)
        float height = (float) ((heightF * 0.3048) + (heightI * 0.0254));

        double calculate = weight / (height * height);

//        Round figure

        double r = Math.round(calculate);
//       Output

        result_r.setText("Age:"+age);
        result.setText("BMI INDEX IS: "+ String.valueOf(r));

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        return NavigationUI.navigateUp(navController, appBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
}