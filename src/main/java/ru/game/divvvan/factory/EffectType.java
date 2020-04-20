package ru.game.divvvan.factory;

public enum EffectType {
    HEALS("здоровье"),
    STRONG("сила"),
    DEFFENCE("броня");

    String effect;

    EffectType(String effect) {
        this.effect = effect;
    }

}
