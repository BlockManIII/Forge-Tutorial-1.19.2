package net.BlockManIII.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {// makes tab and gives it a name
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());// Link the item that is used in display
        }
    };

    // How to make a second tab
    public static final CreativeModeTab TUTORIAL_TAB_2 = new CreativeModeTab("tutorialtab_2") { // makes tab and gives it a name
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ZIRCON.get()); // Link the item that is used in display
        }
    };
}
