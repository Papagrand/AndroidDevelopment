package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
//Программное создание OptionsMenu
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add("Светлая тема");
        menu.add("Темная тема");
        menu.add("Лиловая тема");
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        LinearLayout layout = findViewById(R.id.Lay);
        int id = item.getItemId();
        switch(id){
            case R.id.Light_theme:
                layout.setBackgroundColor(getColor(R.color.lightTheme));
                item.setChecked(true);
                return true;
            case R.id.Dark_theme:
                layout.setBackgroundColor(getColor(R.color.darkSlateGrey));
                item.setChecked(true);
                return true;
            case R.id.LightPurple_theme:
                layout.setBackgroundColor(getColor(R.color.Lavender));
                item.setChecked(true);
                return true;
            case R.id.themeDefault:
                layout.setBackgroundColor(getColor(R.color.lightTheme));
                item.setChecked(true);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



    public void onClickSwitch(View view) {
        switch (view.getId()) {
            case R.id.buttonStyle: {
                Intent intent = new Intent(this, SwitchStyle.class);

                startActivity(intent);
                break;
            }
            case R.id.buttonMyTheme: {
                Intent intent = new Intent(this, MyThemeAct.class);

                startActivity(intent);
                break;
            }
        }
    }
}
//8.	Программное создание групп в меню и подменю
/*@Override
public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);

    menu.add(0 ,1 ,0 ,"Светлая тема");
    menu.add(0,2,1,"Темная тема");
    menu.add(0,3,2,"Лиловая тема");
    return true;
    }
@Override
public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        LinearLayout layout = findViewById(R.id.Lay);        switch(id){
        case 1 :
            case R.id.Light_theme:
                layout.setBackgroundColor(getColor(R.color.lightTheme));
                item.setChecked(true);
                return true;
            case R.id.Dark_theme:
                layout.setBackgroundColor(getColor(R.color.darkSlateGrey));
                item.setChecked(true);
                return true;
            case R.id.LightPurple_theme:
                layout.setBackgroundColor(getColor(R.color.Lavender));
                item.setChecked(true);
                return true;
            case R.id.themeDefault:
                layout.setBackgroundColor(getColor(R.color.lightTheme));
                item.setChecked(true);
                return true;
        }
        return super.onOptionsItemSelected(item);
        }
}*/



