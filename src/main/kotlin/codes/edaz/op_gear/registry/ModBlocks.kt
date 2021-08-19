package codes.edaz.op_gear.registry

import codes.edaz.op_gear.OPGear
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModBlocks {
    val RUBY_BLOCK: Block = Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(1.1f, 5f).sounds(BlockSoundGroup.METAL))
    val SHINY_RUBY_BLOCK: Block = Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(0.9f, 4f).sounds(BlockSoundGroup.METAL).luminance(12))

    fun registerBlocks() {
        Registry.register(Registry.BLOCK, Identifier(OPGear.MOD_ID, "ruby_block"), RUBY_BLOCK)
        Registry.register(Registry.BLOCK, Identifier(OPGear.MOD_ID, "shiny_ruby_block"), SHINY_RUBY_BLOCK)
    }
}