package com.wang;

/**
 * 建造者模式
 *
 * @author 王念
 * @create 2020-04-06 20:13
 */
public class Student {
    private String name;
    private Integer age;
    private String sex;

    public Student() {
    }

    public Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private Integer age;
        private String sex;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
