package net.BlockManIII.tutorialmod.item;

import net.BlockManIII.tutorialmod.Tutorialmod;
import net.BlockManIII.tutorialmod.item.custom.EightBallItem;
import net.BlockManIII.tutorialmod.item.custom.ModTeirs;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MOD_ID);

    // Resources
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    // Items with special effects
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1).fireResistant()));

    // Tools and weapons
    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(ModTeirs.ZIRCON,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ModTeirs.ZIRCON,1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ZIRCON_AXE = ITEMS.register("zircon_axe",
            () -> new AxeItem(ModTeirs.ZIRCON,2,3f,
        new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(ModTeirs.ZIRCON,0,1f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new HoeItem(ModTeirs.ZIRCON,0,0f,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static void register(IEventBus eventBust){
        ITEMS.register(eventBust);
    }
}
