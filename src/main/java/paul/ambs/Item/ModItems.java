package paul.ambs.Item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import paul.ambs.PaulMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item PAULTELEPORTER = registerItem("paulteleporter", 1);

    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(PAULTELEPORTER);
    }

    private static Item registerItem(String name, int stackCount) {

        Identifier id = Identifier.of(PaulMod.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);



        return Registry.register(Registries.ITEM, key, new Item(new Item.Settings().registryKey(key).maxCount(stackCount)));
    }
    public static void registerModItems() {
        PaulMod.LOGGER.info("Register Mod Items for " + PaulMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
    }
}
