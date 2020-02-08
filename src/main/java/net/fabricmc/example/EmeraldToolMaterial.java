package net.fabricmc.example;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum EmeraldToolMaterial implements ToolMaterial {
    emerald;

    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeed() {
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}
