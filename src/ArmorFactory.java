import java.util.*;

public class ArmorFactory {
    private Map<String, Armor> armors = new HashMap<>();
    private EffectFactory effectFactory = new EffectFactory();

    public ArmorFactory() {
        armors.put("накидка простая", new Armor("Накидка простая", 2,
                Collections.singletonList(effectFactory.createEffect("здоровье", 5))));
        armors.put("накидка бесполезная", new Armor("Накидка бесполезная", 2,
                Collections.singletonList(effectFactory.createEffect("здоровье", 1))));

        armors.put("плащ", new Armor("Плащ", 2,
                Collections.singletonList(effectFactory.createEffect("броня", 20))));
        armors.put("кольчуга", new Armor("Кольчуга", 10,
                Collections.singletonList(effectFactory.createEffect("здоровье", 20))));
        armors.put("доспех", new Armor("Железный доспех", 20, getArmorHp()));
//todo options+comma+m

        armors.put("шлем", new Armor("Шлем веселый", 12, getEffectsForHelmet()));
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

    public Armor getArmorByName(String armorName) {
        return armors.get(armorName.toLowerCase());
    }

    public Set<String> getAllArmors() {
        return armors.keySet();
    }
}
