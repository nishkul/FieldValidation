package com.android.fieldvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.inputvalidation.inputField.AgeValidation;
import com.android.inputvalidation.inputField.EmailValidation;
import com.android.inputvalidation.inputField.MandetoryFieldValidation;
import com.android.inputvalidation.inputField.MobileNoValidation;
import com.android.inputvalidation.inputField.PasswordValidation;
import com.android.inputvalidation.inputField.PinCodeValidation;
import com.android.inputvalidation.inputField.UrlValidation;
import com.android.inputvalidation.inputField.UserNameValidation;
import com.android.inputvalidation.main.InputField;


public class MainActivity extends AppCompatActivity {
    private EditText emailEdtv;
    private EditText ageEdtv;
    private EditText mandertortEdtv;
    private EditText mobileEdtv;
    private EditText passwrdEdtv;
    private EditText pincodeEdtv;
    private EditText userNameEdtv;
    private EditText confrimpwdEdtv;
    private EditText urlEdtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEdtv = (EditText) findViewById(R.id.emailTv);
        ageEdtv = (EditText) findViewById(R.id.age);
        mandertortEdtv = (EditText) findViewById(R.id.mandertory);
        urlEdtv = (EditText) findViewById(R.id.url);
        mobileEdtv = (EditText) findViewById(R.id.mobile);
        passwrdEdtv = (EditText) findViewById(R.id.password);
        pincodeEdtv = (EditText) findViewById(R.id.pincode);
        userNameEdtv = (EditText) findViewById(R.id.username);
        confrimpwdEdtv = (EditText) findViewById(R.id.conPwd);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputField inputField = new InputField.InputFieldBuilder().setInputView(emailEdtv).setErrorMsg("Please Enter Proper EmailId").build();
                EmailValidation inputValidation = new EmailValidation(MainActivity.this, inputField);
                inputValidation.isValid();

                InputField age = new InputField.InputFieldBuilder().setInputView(ageEdtv).build();
                AgeValidation validation = new AgeValidation(MainActivity.this, age);
                validation.isValid();

                InputField mobile = new InputField.InputFieldBuilder().setInputView(mobileEdtv).build();
                MobileNoValidation validation1 = new MobileNoValidation( MainActivity.this,mobile);
                validation1.isValid();

                InputField pincode = new InputField.InputFieldBuilder().setInputView(pincodeEdtv).build();
                PinCodeValidation validation2 = new PinCodeValidation(MainActivity.this, pincode);
                validation2.isValid();


                InputField password = new InputField.InputFieldBuilder().setInputView(passwrdEdtv).build();
                PasswordValidation validation3 = new PasswordValidation(MainActivity.this, password);
                validation3.isValid();
                validation3.isConfrimPasswordVaild(confrimpwdEdtv);


                InputField username = new InputField.InputFieldBuilder().setInputView(userNameEdtv).build();
                UserNameValidation userNameValidation = new UserNameValidation(MainActivity.this, username);
                userNameValidation.isValid();


                InputField manderoty = new InputField.InputFieldBuilder().setInputView(mandertortEdtv).setErrorMsg("Don't leave blank ").build();
                MandetoryFieldValidation mandetoryFieldValidation = new MandetoryFieldValidation(MainActivity.this, manderoty);
                mandetoryFieldValidation.isValid();


                InputField url = new InputField.InputFieldBuilder().setInputView(urlEdtv).build();
                UrlValidation urlValidation = new UrlValidation(MainActivity.this, url);
                urlValidation.isValid();

            }
        });

    }
}