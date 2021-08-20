package codes.edaz.op_gear.registry

import codes.edaz.op_gear.ModItemGroups
import codes.edaz.op_gear.OPGear
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.World


class RubyItem(settings: Settings) : Item(settings) {
    override fun appendTooltip(
        itemStack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text?>,
        tooltipContext: TooltipContext?
    ) {
        tooltip.add(TranslatableText("item.op_gear.ruby.tooltip").formatted(Formatting.RED, Formatting.ITALIC))
    }
}

object ModItems {
    val RUBY: Item = RubyItem(Item.Settings().group(ModItemGroups.GENERAL).fireproof())
    val RUBY_BLOCK: BlockItem = BlockItem(ModBlocks.RUBY_BLOCK, Item.Settings().group(ModItemGroups.GENERAL).fireproof())
    val SHINY_RUBY_BLOCK: BlockItem = BlockItem(ModBlocks.SHINY_RUBY_BLOCK, Item.Settings().group(ModItemGroups.GENERAL).fireproof())


    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby"), RUBY)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "ruby_block"), RUBY_BLOCK)
        Registry.register(Registry.ITEM, Identifier(OPGear.MOD_ID, "shiny_ruby_block"), SHINY_RUBY_BLOCK)
    }
}