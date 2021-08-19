package codes.edaz.op_gear

import codes.edaz.op_gear.registry.ModItems
import codes.edaz.op_gear.registry.ModTools
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object ModItemGroups {
    val TOOLS = FabricItemGroupBuilder.build(
        Identifier(OPGear.MOD_ID, "tools")
    ) { ItemStack(ModTools.RUBY_AXE) }

    val ARMOUR = FabricItemGroupBuilder.build(
        Identifier(OPGear.MOD_ID, "armour")
    ) { ItemStack(ModItems.RUBY_BLOCK) }

    val GENERAL = FabricItemGroupBuilder.build(
        Identifier(OPGear.MOD_ID, "general")
    ) { ItemStack(ModItems.RUBY) }
}