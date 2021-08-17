package codes.edaz.op_gear.registry

import codes.edaz.op_gear.ModItemGroups
import codes.edaz.op_gear.OPGear
import codes.edaz.op_gear.registry.ModItems.Constants.RUBY
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModItems {
    object Constants {
        val RUBY: Item = Item(Item.Settings().group(ModItemGroups.GENERAL))
    }

    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby"), RUBY)
    }
}