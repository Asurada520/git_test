package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

    public static void main(String[] args) {

        String a = "love23next234csdn3423javaeye";
//        String regEx="[^0-9]";
//        Pattern p = Pattern.compile(regEx);
//        Matcher m = p.matcher(a);
//        System.out.println( m.replaceAll("").trim());
//
//        String[] split = a.split(regEx);
//
//        System.out.println(Arrays.toString(split));

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(a);

        while (matcher.find()){
            System.out.print(matcher.group(0));
        }


    }
}
