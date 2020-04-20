package ru.game.divvvan.service;

import ru.game.divvvan.character.Person;

public class HealthyService {
    private Person person;

    public HealthyService(Person person) {
        this.person = person;
    }

    public void recovery() {
        try {
            System.out.println("Вы начали лечиться");
            Thread.sleep(3000);
            person.setHp(person.getFullHp());
            System.out.println("Вы восстановили здоровье");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
