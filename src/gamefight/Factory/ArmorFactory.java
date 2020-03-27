package gamefight.Factory;

import gamefight.items.Armor;

import java.util.*;

public class ArmorFactory {
    private Map<Integer, Armor> armors = new HashMap<>();
    private EffectFactory effectFactory = new EffectFactory();

    public ArmorFactory() {
        armors.put(1, new Armor("Накидка простая", 2,
                Collections.singletonList(effectFactory.createEffect("здоровье", 5))));
        armors.put(2, new Armor("Накидка бесполезная", 2,
                Collections.singletonList(effectFactory.createEffect("здоровье", 1))));

        armors.put(3, new Armor("Плащ", 2,
                Collections.singletonList(effectFactory.createEffect("броня", 20))));
        armors.put(4, new Armor("Кольчуга", 10,
                Collections.singletonList(effectFactory.createEffect("здоровье", 20))));
        armors.put(5, new Armor("Железный доспех", 20, getArmorHp()));
//todo options+comma+m

        armors.put(6, new Armor("Шлем веселый", 12, getEffectsForHelmet()));
    }

    private ArrayList<Effect> getEffectsForHelmet() {
        ArrayList<Effect> effects = new ArrayList<>();
        effects.add(effectFactory.createEffect("сила", 2));
        effects.add(effectFactory.createEffect("здоровье", 22));
        effects.add(effectFactory.createEffect("броня", -10));
        return effects;
    }

    private ArrayList<Effect> getArmorHp() {
        ArrayList<Effect> effects = new ArrayList<>();
        effects.add(effectFactory.createEffect("сила", 10));
        effects.add(effectFactory.createEffect("здоровье", -2));
        effects.add(effectFactory.createEffect("броня", 15));
        return effects;
    }

    public Armor getArmorByNumber(Integer armorNumeber) {
        return armors.get(armorNumeber - 1);
    }

    public Set<String> getAllArmors() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(Armor valum : armors.values()){
            set.add(valum.getName());
        }
        return set;
    }
}
