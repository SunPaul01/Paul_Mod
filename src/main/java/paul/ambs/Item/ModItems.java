package paul.ambs.Item;

import paul.ambs.Paul_Mod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(Paul_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Paul_Mod.LOGGER.info("Register Mod Items for " + Paul_Mod.MOD_ID);
    }
}
