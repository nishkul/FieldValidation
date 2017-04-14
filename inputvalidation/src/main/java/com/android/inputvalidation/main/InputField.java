package com.android.inputvalidation.main;

import android.widget.EditText;


/**
 * The type Input field.
 */
public class InputField {

    private EditText inputView;
    private String errorMsg;
    private String yourRegex;

    private InputField(InputFieldBuilder builder) {
        this.inputView = builder.inputView;
        this.errorMsg = builder.errorMsg;

        this.yourRegex = builder.yourRegex;
    }

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * Gets your regex.
     *
     * @return the your regex
     */
    public String getYourRegex() {
        return yourRegex;
    }

    /**
     * Sets your regex.
     *
     * @param yourRegex the your regex
     */
    public void setYourRegex(String yourRegex) {
        this.yourRegex = yourRegex;
    }

    /**
     * Gets input view.
     *
     * @return the input view
     */
    public EditText getInputView() {
        return inputView;
    }

    /**
     * Sets input view.
     *
     * @param inputView the input view
     */
    public void setInputView(EditText inputView) {
        this.inputView = inputView;
    }

    /**
     * The type Input field builder.
     */
    public static class InputFieldBuilder {
        private EditText inputView;
        private String errorMsg;
        private String yourRegex;

        /**
         * Sets error msg.
         *
         * @param errorMsg the error msg
         * @return the error msg
         */
        public InputFieldBuilder setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Sets your regex.
         *
         * @param yourRegex the your regex
         * @return the your regex
         */
        public InputFieldBuilder setYourRegex(String yourRegex) {
            this.yourRegex = yourRegex;
            return this;
        }

        /**
         * Sets input view.
         *
         * @param inputView the input view
         * @return the input view
         */
        public InputFieldBuilder setInputView(EditText inputView) {
            this.inputView = inputView;
            return this;
        }

        /**
         * Build input field.
         *
         * @return the input field
         */
        public InputField build() {
            return new InputField(this);
        }
    }

}
