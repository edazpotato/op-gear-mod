package codes.edaz.op_gear.registry

import codes.edaz.op_gear.ModItemGroups
import codes.edaz.op_gear.OPGear
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModItems {
    val RUBY: Item = Item(Item.Settings().group(ModItemGroups.GENERAL))
    val RUBY_BLOCK: BlockItem = BlockItem(ModBlocks.RUBY_BLOCK, Item.Settings().group(ModItemGroups.GENERAL))

    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby"), RUBY)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_block"), RUBY_BLOCK)
    }
}