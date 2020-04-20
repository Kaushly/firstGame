package ru.game.divvvan.factory;

import java.util.HashMap;
import java.util.Map;

public class EffectFactory {
    private Map<String, Effect> map = new HashMap<>();

    public EffectFactory() {
        map.put("здоровье", new Effect("Добавить жизни", EffectType.HEALS));
        map.put("броня", new Effect("Добавить броню", EffectType.DEFFENCE));
        map.put("сила", new Effect("Добавить силу", EffectType.STRONG));
    }

    public Effect createEffect(String effectName, int value) {
        Effect effect = map.get(effectName.toLowerCase());
        effect.setValue(value);
        return effect;
    }
}
