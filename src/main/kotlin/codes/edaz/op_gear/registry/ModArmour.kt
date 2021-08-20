package codes.edaz.op_gear.registry

import codes.edaz.op_gear.ModItemGroups
import codes.edaz.op_gear.OPGear
import codes.edaz.op_gear.materials.RubyArmourMaterial
import codes.edaz.op_gear.materials.RubyToolMaterial
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModArmour {
    val RUBY_HELMET: Item = ArmorItem(RubyArmourMaterial, EquipmentSlot.HEAD, Item.Settings().group(ModItemGroups.ARMOUR).fireproof())
    val RUBY_CHESTPLATE: Item = ArmorItem(RubyArmourMaterial, EquipmentSlot.CHEST, Item.Settings().group(ModItemGroups.ARMOUR).fireproof())
    val RUBY_LEGGINGS: Item = ArmorItem(RubyArmourMaterial, EquipmentSlot.LEGS, Item.Settings().group(ModItemGroups.ARMOUR).fireproof())
    val RUBY_BOOTS: Item = ArmorItem(RubyArmourMaterial, EquipmentSlot.FEET, Item.Settings().group(ModItemGroups.ARMOUR).fireproof())
//    val RUBY_SHIELD: Item = FabricShield(FabricItemSettings().group(ModItemGroups.ARMOUR), RubyArmourMaterial.getCooldownTicks(), RubyArmourMaterial.getDurability(EquipmentSlot.OFFHAND), RubyArmourMaterial.enchantability, ModItems.RUBY)

    fun registerArmour() {
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_helmet"), RUBY_HELMET)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_boots"), RUBY_BOOTS)
//        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_shield"), RUBY_SHIELD)
    }
}