package com.android.inputvalidation.inputField;

import android.content.Context;

import com.android.inputvalidation.R;
import com.android.inputvalidation.main.Constants;
import com.android.inputvalidation.main.IValid;
import com.android.inputvalidation.main.InputField;
import com.android.inputvalidation.main.Validation;


/**
 * The type Email validation.
 */
public class EmailValidation extends Validation implements IValid {

    /**
     * Instantiates a new Email validation.
     *
     * @param mContext   the m context
     * @param inputField the input field
     */
    public EmailValidation(Context mContext, InputField inputField) {
        this.mContext = mContext;
        this.inputField = inputField;
    }

    @Override
    public boolean isValid() {
        boolean flag = false;
        try {
            inputCheck(this.inputField);

            this.inputField.setYourRegex((this.inputField.getYourRegex() != null) ? this.inputField.getYourRegex() : Constants.RegexExpression.emailPattern);
            flag = checkField(this.inputField.getInputView(), this.inputField.getYourRegex());
            if (!flag) {
                this.inputField.getInputView().setError((this.inputField.getErrorMsg() != null) ? this.inputField.getErrorMsg() : mContext.getResources().getString(R.string.please_enter_proper_email));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
