package com.example.libapi;

import android.app.Activity;

import java.lang.reflect.Constructor;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/4/4
 */

public class InjectHelper {

    public static void inject(Activity activity){

        String classFullName = activity.getClass().getName()+"$$ViewInjector";

        try {
            Class<?> aClass = Class.forName(classFullName);
            Constructor<?> constructor = aClass.getConstructor(activity.getClass());
            constructor.newInstance(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
