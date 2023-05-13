package com.example.chaaing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.chaaing.databinding.ActivityPizzaitemBinding;

public class pizzaitem extends AppCompatActivity {
    ActivityPizzaitemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_pizzaitem);
        binding.btnpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                popup bottomSheetFragmentt = new popup();
                bottomSheetFragmentt.show(pizzaitem.this.getSupportFragmentManager(),bottomSheetFragmentt.getTag());
           }
        });
    }
}