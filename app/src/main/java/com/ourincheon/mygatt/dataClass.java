package com.ourincheon.mygatt;

/**
 * Created by Youngdo on 2016-05-16.
 */
public class dataClass {
    private static boolean mFlag = true;

    public static void setmFlag(boolean mFlag) {
        dataClass.mFlag = mFlag;
    }

    public static boolean ismFlag() {

        return mFlag;
    }
}
