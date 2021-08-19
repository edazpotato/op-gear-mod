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
    val RUBY_SWORD: ToolItem = SwordItem(RubyToolMaterial, 6, -1.8f, Item.Settings().group(ModItemGroups.TOOLS).fireproof())
    val RUBY_AXE: ToolItem = CustomAxeItem(RubyToolMaterial, 10f, -3.2f, Item.Settings().group(ModItemGroups.TOOLS).fireproof())
    val RUBY_PICKAXE: ToolItem = CustomPickaxeItem(RubyToolMaterial, 4, -2.8f, Item.Settings().group(ModItemGroups.TOOLS).fireproof())
    val RUBY_SHOVEL: ToolItem = ShovelItem(RubyToolMaterial, 4.2f, -2.8f, Item.Settings().group(ModItemGroups.TOOLS).fireproof())
    val RUBY_HOE: ToolItem = CustomHoeItem(RubyToolMaterial, 5, -2.8f, Item.Settings().group(ModItemGroups.TOOLS).fireproof())


    fun registerTools() {
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_sword"), RUBY_SWORD)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_axe"), RUBY_AXE)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_shovel"), RUBY_SHOVEL)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_hoe"), RUBY_HOE)
    }
}