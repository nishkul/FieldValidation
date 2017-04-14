package com.android.inputvalidation.main;


/**
 * The type Constants.
 */
public class Constants {

    /**
     * The type Regex expression.
     */
    public static class RegexExpression {
        /**
         * The constant emailPattern.
         */
        public static final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        /**
         * The constant emailPattern2.
         */
        public static final String emailPattern2 = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+\\.+[a-z]+";
        /**
         * The constant pincode.
         */
        public static final String pincode = "^[0-9]{6}$";
        /**
         * The constant age.
         */
        public static final String age = "^[1-9]{1,3}$";
        /**
         * The constant url.
         */
        public static final String url = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        /**
         * The constant mobileNo.
         */
        public static final String mobileNo = "^[789]\\d{9,9}$";
        /**
         * The constant userName.
         */
        public static final String userName = "^[a-zA-Z]{3,20}$";
        /**
         * The constant passWord.
         */
        public static final String passWord = "((?!\\s)\\A)(\\s|(?<!\\s)\\S){8,20}\\Z";
    }


}
