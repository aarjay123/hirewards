package com.nugget.rewards;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.nugget.rewards.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    //SHOW TOOLBARICON
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbaricon, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //ONCLICK LISTENERS GOING TO PAGES ON TOOLBAR POPUP
    public boolean settings(MenuItem item) {
        //TEMPORARY TOAST - REPLACE ONCE ACTIVITY CREATED
        Toast toast = Toast.makeText(getApplicationContext(), "SettingsActivity", Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();

        //startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        return true;
    }

    public boolean help(MenuItem item) {
        //TEMPORARY TOAST - REPLACE ONCE ACTIVITY CREATED
        Toast toast = Toast.makeText(getApplicationContext(), "HelpcenterActivity", Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();

        //startActivity(new Intent(MainActivity.this, HelpcenterActivity.class));
        return true;
    }

    public boolean feedback(MenuItem item) {
        //TEMPORARY TOAST - REPLACE ONCE ACTIVITY CREATED
        Toast toast = Toast.makeText(getApplicationContext(), "FeedbackActivity", Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();

        //startActivity(new Intent(MainActivity.this, FeedbackActivity.class));
        return true;
    }
}