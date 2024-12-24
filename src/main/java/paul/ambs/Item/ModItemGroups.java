package paul.ambs.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import paul.ambs.Paul_Mod;

import net.minecraft.item.ItemStack;

import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroups {

    public static void registerItemGroups() {
        //Eigentlich public static final baer das is nicht erlaubt
        final ItemGroup PAUL_MOD = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(Paul_Mod.MOD_ID, "Paul_Mod"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.Paul_Mod"))
                        .icon(() -> new ItemStack(ModItems.PAULTELEPORTER)).entries((displayContext, entries) -> {
                            entries.add(ModItems.PAULTELEPORTER);

                        }).build());

        Paul_Mod.LOGGER.info("Registering for Item Groups for " +Paul_Mod.MOD_ID);
    }
}

