package com.android.inputvalidation.inputField;

import android.content.Context;
import android.widget.EditText;

import com.android.inputvalidation.R;
import com.android.inputvalidation.main.Constants;
import com.android.inputvalidation.main.IValid;
import com.android.inputvalidation.main.InputField;
import com.android.inputvalidation.main.Validation;


/**
 * The type Password validation.
 */
public class PasswordValidation extends Validation implements IValid {

    /**
     * Instantiates a new Password validation.
     *
     * @param mContext   the m context
     * @param inputField the input field
     */
    public PasswordValidation(Context mContext, InputField inputField) {
        this.mContext = mContext;
        this.inputField = inputField;
    }


    @Override
    public boolean isValid() {
        boolean flag = false;
        try {
            inputCheck(this.inputField);

            this.inputField.setYourRegex((this.inputField.getYourRegex() != null) ? this.inputField.getYourRegex() : Constants.RegexExpression.passWord);
            flag = checkField(this.inputField.getInputView(), this.inputField.getYourRegex());
            if (!flag) {
                this.inputField.getInputView().setError((this.inputField.getErrorMsg() != null) ? this.inputField.getErrorMsg() : mContext.getResources().getString(R.string.please_enter_proper_password));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * Is confrim password vaild boolean.
     *
     * @param editText the edit text
     * @return the boolean
     */
    public boolean isConfrimPasswordVaild(EditText editText) {

        boolean flag = (editText.getText().toString().equals(this.inputField.getInputView().getText().toString()));
        if (!flag) {
            editText.setError("Enter proper password  ");
        }

        return flag;
    }
}
