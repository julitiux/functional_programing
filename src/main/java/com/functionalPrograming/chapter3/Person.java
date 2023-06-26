package com.functionalPrograming.chapter3;

public class Person {
  String name;
  int age;

  public Person(final String theName, final int theAge) {
    this.name = theName;
    this.age = theAge;
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

  public int ageDifference(Person person){
    return this.age - person.age;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}
