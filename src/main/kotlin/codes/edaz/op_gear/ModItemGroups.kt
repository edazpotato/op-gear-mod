package codes.edaz.op_gear

import codes.edaz.op_gear.registry.ModItems
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object ModItemGroups {
    val GENERAL = FabricItemGroupBuilder.build(
        Identifier(OPGear.MOD_ID, "general")
    ) { ItemStack(ModItems.RUBY) }
}