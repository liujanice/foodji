package com.example.tgl10.foodji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Ingredient extends AppCompatActivity {
    private EditText Ingredient;
    private EditText Quantity;
    private button Add;
    private textView Add_Ingredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient);


        Ingredient = (EditText)findViewById(R.id.etIngredientName);
        Quantity = (EditText)findViewById(R.id.etQuantity);
        Add = (Button)findViewById(R.id.btnAdd);

        Add.setOnClockListerner(new View.OnClickListener();

    }

    private void openPantry(){
        Intent intent = new Intent(Ingredient.this, Pantry.class); //change pantry class to actual activity name for that
        startActivity(intent);
    }
}
