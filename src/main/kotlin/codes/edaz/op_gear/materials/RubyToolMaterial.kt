package codes.edaz.op_gear.materials

import codes.edaz.op_gear.registry.ModItems
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

object RubyToolMaterial : ToolMaterial {
    private const val durability = 180
    private const val miningSpeedMultiplier = 14.8f
    private const val attackDamage = 3.5f
    private const val miningLevel = 2
    private const val enchantability = 15
    private val repairIngredient = Ingredient.ofItems(ModItems.RUBY)

    override fun getDurability(): Int {
        return durability
    }

    override fun getMiningSpeedMultiplier(): Float {
        return miningSpeedMultiplier
    }

    override fun getAttackDamage(): Float {
        return attackDamage
    }

    override fun getMiningLevel(): Int {
        return miningLevel
    }

    override fun getEnchantability(): Int {
        return enchantability
    }

    override fun getRepairIngredient(): Ingredient {
        return repairIngredient
    }
}