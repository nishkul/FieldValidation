package com.android.inputvalidation.inputField;

import android.content.Context;

import com.android.inputvalidation.R;
import com.android.inputvalidation.main.IValid;
import com.android.inputvalidation.main.InputField;
import com.android.inputvalidation.main.Validation;


/**
 * The type Mandetory field validation.
 */
public class MandetoryFieldValidation extends Validation implements IValid {

    /**
     * Instantiates a new Mandetory field validation.
     *
     * @param mContext   the m context
     * @param inputField the input field
     */
    public MandetoryFieldValidation(Context mContext, InputField inputField) {
        this.mContext = mContext;
        this.inputField = inputField;
    }

    @Override
    public boolean isValid() {
        boolean flag = false;
        try {
            inputCheck(this.inputField);
           if (!this.inputField.getInputView().getText().toString().isEmpty()){
               flag=true;
           }
            if (!flag) {
                this.inputField.getInputView().setError((this.inputField.getErrorMsg() != null) ? this.inputField.getErrorMsg() : mContext.getResources().getString(R.string.leave_blank_error));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
