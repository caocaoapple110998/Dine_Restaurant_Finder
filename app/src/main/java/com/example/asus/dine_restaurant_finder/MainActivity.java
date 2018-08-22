package com.example.asus.dine_restaurant_finder;

        import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

        import com.example.asus.dine_restaurant_finder.Navigation.Bottom_NavigationBar;


public class MainActivity extends AppCompatActivity {

    private Bottom_NavigationBar bottom_navigationBar;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bottom_navigationBar.InitEvent();

        dl = (DrawerLayout) findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this,dl,R.string.Open, R.string.Close);

        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.notification)
                {
                    Toast.makeText(MainActivity.this,"My Profile", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.news)
                {
                    Toast.makeText(MainActivity.this,"My news", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.bookmarks)
                {
                    Toast.makeText(MainActivity.this,"My bookmarks", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.offers)
                {
                    Toast.makeText(MainActivity.this,"My offers", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.orders)
                {
                    Toast.makeText(MainActivity.this,"My orders", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.payments)
                {
                    Toast.makeText(MainActivity.this,"My payments", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.comments)
                {
                    Toast.makeText(MainActivity.this,"My comments", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.profile)
                {
                    Toast.makeText(MainActivity.this,"My Profile", Toast.LENGTH_LONG).show();
                }
                if (id == R.id.settings)
                {
                    Toast.makeText(MainActivity.this,"My settings", Toast.LENGTH_LONG).show();
                }


                return true;
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
