package paul.ambs.Item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import paul.ambs.PaulMod;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroups {

    public static void registerItemGroups() {
        //Eigentlich public static final baer das is nicht erlaubt
        final ItemGroup PAULMOD = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(PaulMod.MOD_ID, "paulmod"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paulmod"))
                        .icon(() -> new ItemStack(ModItems.PAULTELEPORTER)).entries((displayContext, entries) -> {
                            entries.add(ModItems.PAULTELEPORTER);

                        }).build());

        PaulMod.LOGGER.info("Registering for Item Groups for " + PaulMod.MOD_ID);
    }
}

