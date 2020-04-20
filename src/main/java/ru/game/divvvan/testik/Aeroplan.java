package ru.game.divvvan.testik;

public class Aeroplan implements Flyable {
    @Override
    public void fly() {
        System.out.println("Аэроплан летит со скоростью света");
    }
}
