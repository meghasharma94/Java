package com.megha.groovy

class Patient {
    def firstName, lastName, age
    static hospitalCode = 51

    void setLastName(lastName) {
        if (lastName == null) {
            throw new IllegalAccessException("Last Name cannot be null")
        }
        this.lastName = lastName
    }

    static void display() {
        println hospitalCode
    }
}

p = new Patient(firstName: 'John', lastName: 'Foster', age: 50)
p.setLastName("buffer")
println p.firstName + " " + p.lastName + " " + p.age + " " + Patient.hospitalCode