package com.wang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王念
 * @create 2019-11-08 14:51
 */
public class Student {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + name.hashCode();
        result = 37 * result + age.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Student && name.equals(((Student) obj).getName());
    }

    public static void main(String[] args) {
        Map<Student, String> studentStringMap = new HashMap<Student, String>();
        studentStringMap.put(new Student("王念", 22), "19960925常信毕业");
        studentStringMap.put(new Student("王念", 22), "19960925江科大毕业");
        studentStringMap.put(new Student("王尼玛", 22), "19960925江科大毕业");
        for (Map.Entry<Student, String> entry : studentStringMap.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
