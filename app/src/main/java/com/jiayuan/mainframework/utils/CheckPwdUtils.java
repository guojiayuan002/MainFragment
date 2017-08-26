package com.jiayuan.mainframework.utils;

import android.content.Context;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by guojiayuan on 2017/6/4.
 */

public class CheckPwdUtils {


    public static boolean checkPwd(String pwd, Context context) {
        int legth = pwd.length();
        if (legth >= 6 && legth <= 20) {
            String regex = "^[A-Za-z0-9]+$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(pwd);

            while (m.matches()) {
                return true;
            }
            //Toast.makeText(context, "密码格式不正确", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            //Toast.makeText(context, "密码长度有误", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

//    public static boolean checkPwd(String phone) {
//        boolean flag = true;
//        int leght = phone.length();
//        if (leght >= 6 && leght <= 20) {
//            char[] arr = phone.toCharArray();       //将字符串转换成字符数组
//            for (int i = 0; i < arr.length; i++) {
//                char ch = arr[i];                   //记录每一个字符
//                if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
//                    flag = false;                   //不是数字或者字母
//                    break;
//                }
//            }
//        } else {
//            flag = false;                        //长度不符合
//        }
//        return flag;
//    }


}
