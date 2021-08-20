package codes.edaz.op_gear.materials

import codes.edaz.op_gear.registry.ModItems
import com.google.common.collect.ImmutableMap
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents


object RubyArmourMaterial : ArmorMaterial {
    private val BASE_DURABILITY = ImmutableMap.builder<EquipmentSlot, Int>().put(EquipmentSlot.HEAD, 13).put(EquipmentSlot.CHEST, 16).put(EquipmentSlot.LEGS,15).put(EquipmentSlot.FEET, 11).put(EquipmentSlot.OFFHAND, 16).build()
    private val PROTECTION_VALUES = intArrayOf(3, 7, 6, 3)
    private val ENCHANTABILITY = 7
    private val TOUGHNESS = 0.3f
    private val REPAIR_INGREDIENT = Ingredient.ofItems(ModItems.RUBY)
    private val COOLDOWN_TICKS = 10

    fun getCooldownTicks(): Int {
        return COOLDOWN_TICKS
    }

    override fun getDurability(slot: EquipmentSlot): Int {
        val durability = BASE_DURABILITY.get(slot)
        if (durability != null) {
            return durability
        }
        return 13
    }

    override fun getProtectionAmount(slot: EquipmentSlot): Int {
        return PROTECTION_VALUES[slot.entitySlotId]
    }
    override fun getEnchantability(): Int {
        return ENCHANTABILITY
    }

    override fun getEquipSound(): SoundEvent? {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND
    }

    override fun getRepairIngredient(): Ingredient? {
        return REPAIR_INGREDIENT
    }

    override fun getName(): String {
        return "ruby"
    }

    override fun getToughness(): Float {
        return TOUGHNESS
    }

    override fun getKnockbackResistance(): Float {
        return 0f // No knockback resistance. NOTE: When adding knockback resistance to armour, one also needs to do something with mixins. See https://fabricmc.net/wiki/tutorial:armor
    }
}