import java.util.*;

public class AccessoriesFactory {
    private Map<String, Accessories> accessories = new HashMap<>();
    private EffectFactory effectFactory = new EffectFactory();

    public AccessoriesFactory() {
        accessories.put("золотое кольцо", new Accessories("Золотое кольцо", 2,
                Collections.singletonList(effectFactory.createEffect("здоровье", 7))));
        accessories.put("серебрянный перстень", new Accessories("Серебрянный перстень", 2,
                Collections.singletonList(effectFactory.createEffect("здоровье", 2))));

        accessories.put("простое кольцо", new Accessories("Простое кольцо", 2,
                Collections.singletonList(effectFactory.createEffect("броня", 5))));
        accessories.put("ожерелье", new Accessories("Ожерелье", 10,
                Collections.singletonList(effectFactory.createEffect("здоровье", 20))));
        accessories.put("талисман", new Accessories("Талисман", 20, getArmorHp()));
//todo options+comma+m

        accessories.put("волшебная диадема", new Accessories("Волшебная диадема", 12, getEffectsForHelmet()));
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

    public Accessories getAccessoriesByName(String accessoriesName) {
        return accessories.get(accessoriesName.toLowerCase());
    }

    public Set<String> getAllAccessories() {
        return accessories.keySet();
    }
}

