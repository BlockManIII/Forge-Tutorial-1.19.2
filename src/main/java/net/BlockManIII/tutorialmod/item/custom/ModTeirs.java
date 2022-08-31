package net.BlockManIII.tutorialmod.item.custom;

import net.BlockManIII.tutorialmod.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTeirs {
    public static ForgeTier ZIRCON = new ForgeTier(3, 800, 7.0f, 12f,
            22, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.ZIRCON.get()));
}
