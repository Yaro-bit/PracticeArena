package controller;
import model.*;

public class Main {
    public static void main(String[] args) {
        Person yaro = new Person("Yaroslav", 30);
        Student nika = new Student("Nika", 29, "JKU");
        Teacher vali = new Teacher("Valentin", 35, "Economy");

        yaro.introduce();
        nika.introduce();
        vali.introduce();
    }
}