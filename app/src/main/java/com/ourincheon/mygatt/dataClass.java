package com.ourincheon.mygatt;

/**
 * Created by Youngdo on 2016-05-16.
 */
public class dataClass {
    private static String mFlag = null;
    private static String mValue;//0이 꺼지고 1이 켜지고



    public static void setmValue(String mValue) {
        dataClass.mValue = mValue;
    }

    public static String getmValue() {

        return mValue;
    }

    public static void setmFlag(String mFlag) {
        dataClass.mFlag = mFlag;
    }

    public static String getmFlag() {

        return mFlag;
    }
}
