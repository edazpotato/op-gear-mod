package codes.edaz.op_gear.registry

import codes.edaz.op_gear.ModItemGroups
import codes.edaz.op_gear.OPGear
import codes.edaz.op_gear.materials.RubyToolMaterial
import net.minecraft.item.*
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

// PickaxeItem, HoeItem and AxeItem have protected constructors for some reason, so I need to make these wrapper classes.
class CustomPickaxeItem(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings?) :
    PickaxeItem(material, attackDamage, attackSpeed, settings)
class CustomHoeItem(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings?) :
    HoeItem(material, attackDamage, attackSpeed, settings)
class CustomAxeItem(material: ToolMaterial?, attackDamage: Float, attackSpeed: Float, settings: Settings?) :
    AxeItem(material, attackDamage, attackSpeed, settings)

object ModTools {
    val RUBY_PICKAXE: ToolItem = CustomPickaxeItem(RubyToolMaterial, 1, -2.8f, Item.Settings().group(ModItemGroups.GENERAL))

    fun registerTools() {
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE)
    }
}