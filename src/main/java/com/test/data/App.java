package com.test.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        dateLocal();
        timeLocal();
        forMatLocal();
        eqLocal();
        dateTimeLocal();
        isLocal();
        beLocal();
        parseDate();
    }

    /**
     * 获取当前日期
     * */
    public static void dateLocal(){
        LocalDate today = LocalDate.now(); // now(): 静态方法，根据当前时间创建对象
        System.out.println();
        System.out.println("当前日期:"+today);
    }

    /**
     * 获取当前时间
     * */
    public static void timeLocal(){
        LocalTime time = LocalTime.now(); // now(): 静态方法，根据当前时间创建对象
        System.out.println();
        System.out.println("当前时间:"+time);
    }

    /**
     * 获取当前时间(包含日期及时间)
     * */
    public static void dateTimeLocal(){
        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println();
        System.out.println("当前时间为:"+DateTime);
    }

    /**
     * 处理特定时间
     * */
    public static void forMatLocal(){
        LocalDate dateForMat = LocalDate.of(2020,05,01);
        System.out.println();
        System.out.println("指定特定时间:"+dateForMat);
    }

    /**
     * 判断两个日期是否相等
     * */
    public static void eqLocal(){
        LocalDate today = LocalDate.now(); //获取当前日期
        LocalDate date = LocalDate.of(2020,4,20); //处理特定时间
        if (today.equals(date)){
            System.out.println();
            System.out.println("相等");
        }else {
            System.out.println();
            System.out.println("不相等");
        }
    }

    /**
     * 判断日期是早于还是晚于另一个日期
     * */
    public static void isLocal(){
        LocalDate today = LocalDate.now(); //获取当前日期
        LocalDate date = LocalDate.of(2020,4,20); //处理特定时间
        if (today.isAfter(date)){
            System.out.println();
            System.out.println(date+" 发生在当前 "+today+" 之前");
        }
        if (today.isBefore(date)){
            System.out.println();
            System.out.println(date+" 发生在当前 "+today+" 之后");
        }
    }

    /**
     * 两个日期之间的天数和月数
     * */
    public static void beLocal(){
        LocalDate date = LocalDate.now();
        LocalDate forMatData = LocalDate.of(2020,01,01);
        Period period = Period.between(date,forMatData);
        System.out.println();
        System.out.println("相差天数：" + period.getDays()); // 两个日期天位置对比的天数,不包含月
        System.out.println("相差月数：" + period.getMonths());
        System.out.println("相差年数：" + period.getYears());
    }

    /**
     * 字符串互转日期类型
     * */
    public static void parseDate(){
        //日期类型转为字符串
        LocalDateTime localDateTime = LocalDateTime.of(2020,2,1,5,6);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String str = localDateTime.format(dateTimeFormatter);
        System.out.println();
        System.out.println("日期类型转为字符串:"+str);
        //字符串类型转为日期类型
        String time = "2020/02/03 12:12:12";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(time,formatter);
        System.out.println("字符串类型转为日期类型:"+date);
    }
}
