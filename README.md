# FieldValidation
Android library designed for easy to use  and customizable form validation.




Can be used with different type of edit field
Ex.Email,Mobile no, username and etc 

Sample code to use 



                 InputField inputField = new InputField.InputFieldBuilder().setInputView(emailEdtv).setErrorMsg("Please Enter                                           Proper EmailId").build();   
             
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


                InputField manderoty = new InputField.InputFieldBuilder().setInputView(mandertortEdtv).setErrorMsg("Don't                                               leave blank ").build();
                MandetoryFieldValidation mandetoryFieldValidation = new MandetoryFieldValidation(MainActivity.this,                                                                                 manderoty);
                mandetoryFieldValidation.isValid();

                InputField url = new InputField.InputFieldBuilder().setInputView(urlEdtv).build();
                UrlValidation urlValidation = new UrlValidation(MainActivity.this, url);
                urlValidation.isValid();


Please use these libary in your project and let me know if any issue and suggestion is there 

Thanks in advances
