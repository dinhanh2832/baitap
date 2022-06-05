package com.company.bai5;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                name + ": " +
                age;
    }

    public int getLength(){
        return getName().length();
    }

    @Override
    public int compareTo(Person o) {
        if (this.getLength() > o.getLength()) {
            return 1;
        } else if (this.getLength() == o.getLength()) {
            return 0;
        }
        return -1;
    }

}
