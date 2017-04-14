package com.android.inputvalidation.main;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * The type Validation.
 */
public abstract class Validation {
    /**
     * The M context.
     */
    protected Context mContext;
    /**
     * The Input field.
     */
    protected InputField inputField;
    /**
     * The Input view.
     */
    protected    View inputView;

    /**
     * Input check.
     *
     * @param inputField the input field
     * @throws Exception the exception
     */
    protected void inputCheck(InputField inputField) throws Exception {
        if (inputField.getInputView() != null)
            inputView = inputField.getInputView();
        else
            throw new Exception("No view found");

//        if (inputField.getInputType() > 0)
//            inputType = inputField.getInputType();
//        else
//            throw new Exception("No input type is selected");

//
//        try {
//            if (inputField.getInputValue() != null && inputField.getInputValue().equalsIgnoreCase(""))
//                inputValue = inputField.getInputValue();
//            else
//                throw new Exception("No input value is found");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

//        if (inputField.getYourRegex() != null && inputField.getYourRegex().equalsIgnoreCase(""))
//            inputRegex = inputField.getYourRegex();

    }

    /**
     * Check field boolean.
     *
     * @param editText the edit text
     * @param regexExp the regex exp
     * @return the boolean
     */
    protected boolean checkField(EditText editText, String regexExp) {
        Pattern pattern = Pattern.compile((regexExp != null) ? regexExp : Constants.RegexExpression.emailPattern);
        Matcher matcher = pattern.matcher(editText.getText().toString());
        return matcher.matches();
    }
}
