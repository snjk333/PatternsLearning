package com.oleksandr.Creational.Builder.SecondExample;

public class Person {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                '}';
    }

    public static final class Builder{
        private final Person person;
        private Builder(){
            person = new Person();
        }
        public Builder withFirstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder withJobTitle(String jobTitle) {
            person.jobTitle = jobTitle;
            return this;
        }

        public Builder withAge(int age) {
            person.age = age;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
