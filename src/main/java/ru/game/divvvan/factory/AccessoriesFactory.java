package ru.game.divvvan.factory;

import ru.game.divvvan.items.Accessories;

import java.util.*;

public class AccessoriesFactory {
    private Map<Integer, Accessories> accessories = new HashMap<>();
    private EffectFactory effectFactory = new EffectFactory();

    public AccessoriesFactory() {
        accessories.put(1, new Accessories("Золотое кольцо",
                Collections.singletonList(effectFactory.createEffect("здоровье", 7))));
        accessories.put(2, new Accessories("Серебрянный перстень",
                Collections.singletonList(effectFactory.createEffect("здоровье", 2))));
        accessories.put(3, new Accessories("Простое кольцо",
                Collections.singletonList(effectFactory.createEffect("броня", 5))));
        accessories.put(4, new Accessories("Ожерелье",
                Collections.singletonList(effectFactory.createEffect("здоровье", 20))));
        accessories.put(5, new Accessories("Талисман", getArmorHp()));
        accessories.put(6, new Accessories("Волшебная диадема", getEffectsForHelmet()));
    }

    private ArrayList<Effect> getEffectsForHelmet() {
        ArrayList<Effect> effects = new ArrayList<>();
        effects.add(effectFactory.createEffect("сила", 2));
        effects.add(effectFactory.createEffect("здоровье", 7));
        effects.add(effectFactory.createEffect("броня", 5));
        return effects;
    }

    private ArrayList<Effect> getArmorHp() {
        ArrayList<Effect> effects = new ArrayList<>();
        effects.add(effectFactory.createEffect("сила", 10));
        effects.add(effectFactory.createEffect("здоровье", -2));
        effects.add(effectFactory.createEffect("броня", 0));
        return effects;
    }

    public Accessories getAccessoriesByNumber(Integer accessoriesNumber) {
        return accessories.get(accessoriesNumber - 1);
    }

//    public Set<String> getAllAccessories() {
//        return accessories.values()
//                .stream()
//                .map(Accessories::getName)
//                .collect(Collectors.toSet());
//    }

    public Set<String> getAllAccessories() {
        LinkedHashSet<String > set = new LinkedHashSet<>();
        for (Accessories value : accessories.values()) {
            set.add(value.getName());
        }
        return set;
    }
}

