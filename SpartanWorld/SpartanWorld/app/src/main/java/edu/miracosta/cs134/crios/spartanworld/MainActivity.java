package edu.miracosta.cs134.crios.spartanworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Instance variable = named views in our layout
    private ImageView logoImageView;
    private Button swapImageButton;

    private boolean isMCCLogo = true;


    //Equivalent of main method (entry point to code)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //wire up (hook up) the controller to the view
        logoImageView = findViewById(R.id.logoImageView);
        swapImageButton = findViewById(R.id.swapImageButton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void swapImage(View v){
            if (isMCCLogo){
                logoImageView.setImageResource(R.drawable.spartan_logo);
            }
            else{
                logoImageView.setImageResource(R.drawable.miracosta_logo);
                isMCCLogo = !isMCCLogo;
            }
        }




}
