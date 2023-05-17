package com.example.homework14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.xmlpull.v1.XmlPullParser;

public class WorkWithXML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_with_xml);
        XmlPullParser xpp = getResources().getXml(R.xml.users);
        UserResourceParser parser = new UserResourceParser();
        if(parser.parse(xpp))
        {
            for(User prod: parser.getUsers()){
                Log.d("XML", prod.toString());
            }
        }
        finish();
    }
}
