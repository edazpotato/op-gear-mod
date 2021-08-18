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
    val RUBY_BLOCK: Block = Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 69f).sounds(BlockSoundGroup.METAL).luminance(5))

    fun registerBlocks() {
        Registry.register(Registry.BLOCK, Identifier(OPGear.MOD_ID, "ruby_block"), RUBY_BLOCK)
    }
}