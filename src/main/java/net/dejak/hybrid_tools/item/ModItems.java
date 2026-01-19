package net.dejak.hybrid_tools.item;

import net.dejak.hybrid_tools.HybridTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WOODEN_PICK_N_AXE = registerItem("wooden_pick_n_axe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(HybridTools.MOD_ID,"wooden_pick_n_axe")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(HybridTools.MOD_ID, name), item);
    }

    public static void registerModItems(){
        HybridTools.LOGGER.info("Registering Mod Items for " + HybridTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(WOODEN_PICK_N_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(WOODEN_PICK_N_AXE));
    }
}
