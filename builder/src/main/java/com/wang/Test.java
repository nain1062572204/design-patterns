package com.wang;

/**
 * @author 王念
 * @create 2020-04-06 20:19
 */
public class Test {
    public static void main(String[] args) {
        Student student = Student.builder().name("王念").age(20).sex("1").build();
        System.out.println(student);
    }
}
