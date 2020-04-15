package com.example.gmaillayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<EmailModel> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items=new ArrayList<>();
        items.add(new EmailModel("Edutila.com","$19 Only (First 10 spots) - Bestselling hiihi","Are you looking to Lean Web Des...","1:30 PM"));
        items.add(new EmailModel("Google","Cảnh báo bảo mật","Thiết bị mới đăng nhập vào tài khoản của bạn","1:30 PM"));
        items.add(new EmailModel("Zoom","Please activate your Zoom account","Welcome to Zooom! To activate your account","2:30 PM"));
        items.add(new EmailModel("The Qt Company","Qt Account email verification needed","Hi, Thank you for creating a Qt Account","12:30 PM"));
        items.add(new EmailModel("Noreply","Cisco - Account Created","Welcome to Cisco your account has been successfully create","9:30 AM"));
        items.add(new EmailModel("Edutila.com","$19 Only (First 10 spots) - Bestselling hiihi","Are you looking to Lean Web Des...","1:30 PM"));
        items.add(new EmailModel("Google","Cảnh báo bảo mật","Thiết bị mới đăng nhập vào tài khoản của bạn","1:30 PM"));
        items.add(new EmailModel("Zoom","Please activate your Zoom account","Welcome to Zooom! To activate your account","2:30 PM"));
        items.add(new EmailModel("The Qt Company","Qt Account email verification needed","Hi, Thank you for creating a Qt Account","12:30 PM"));
        items.add(new EmailModel("Noreply","Cisco - Account Created","Welcome to Cisco your account has been successfully create","9:30 AM"));
        items.add(new EmailModel("Edutila.com","$19 Only (First 10 spots) - Bestselling hiihi","Are you looking to Lean Web Des...","1:30 PM"));
        items.add(new EmailModel("Google","Cảnh báo bảo mật","Thiết bị mới đăng nhập vào tài khoản của bạn","1:30 PM"));
        items.add(new EmailModel("Zoom","Please activate your Zoom account","Welcome to Zooom! To activate your account","2:30 PM"));
        items.add(new EmailModel("The Qt Company","Qt Account email verification needed","Hi, Thank you for creating a Qt Account","12:30 PM"));
        items.add(new EmailModel("Noreply","Cisco - Account Created","Welcome to Cisco your account has been successfully create","9:30 AM"));
        items.add(new EmailModel("Edutila.com","$19 Only (First 10 spots) - Bestselling hiihi","Are you looking to Lean Web Des...","1:30 PM"));
        items.add(new EmailModel("Google","Cảnh báo bảo mật","Thiết bị mới đăng nhập vào tài khoản của bạn","1:30 PM"));
        items.add(new EmailModel("Zoom","Please activate your Zoom account","Welcome to Zooom! To activate your account","2:30 PM"));
        items.add(new EmailModel("The Qt Company","Qt Account email verification needed","Hi, Thank you for creating a Qt Account","12:30 PM"));
        items.add(new EmailModel("Noreply","Cisco - Account Created","Welcome to Cisco your account has been successfully create","9:30 AM"));

        EmailAdapter adapter=new EmailAdapter(items);
        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
