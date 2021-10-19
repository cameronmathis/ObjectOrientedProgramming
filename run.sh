#!/bin/bash
# compile all the programs in Java
javac -d ./out *.java
case $1 in
    Abstraction)
        # execute the program
        java -cp ./out Abstraction
        ;;
    Encapsulation)
        # execute the program
        java -cp ./out Encapsulation
        ;;
    Inheritance)
        # execute the program
        java -cp ./out Inheritance
        ;;
    Polymorphism)
        # execute the program
        java -cp ./out Polymorphism
        ;;
    *)
        echo command invalid or missing
        ;;
esac