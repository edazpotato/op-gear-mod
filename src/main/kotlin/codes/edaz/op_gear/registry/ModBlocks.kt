package codes.edaz.op_gear.registry

import codes.edaz.op_gear.OPGear
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Material
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.AxeItem
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.Identifier
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry
import net.minecraft.world.World

// Custom class for shiny ruby block to implement
// copper-like system where the player can use an
// axe to remove the glowing effect from it.
class ShinyRubyBlock(settings: FabricBlockSettings) : Block(settings) {
    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        System.out.println("Right clicked")

        if (player.getStackInHand(hand).item !is AxeItem) {
            return ActionResult.FAIL
        }
        // The client says it is ok, so it will pass to the server (also makes the player's arm swing)
        if (world.isClient) {
            return ActionResult.SUCCESS
        }

        world.setBlockState(pos, ModBlocks.RUBY_BLOCK.defaultState)
        world.playSound(null, pos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1f, 9f)
        return ActionResult.SUCCESS
    }
}

object ModBlocks {
    val RUBY_BLOCK: Block = Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(1.1f, 5f).sounds(BlockSoundGroup.METAL))
    val SHINY_RUBY_BLOCK: Block = ShinyRubyBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(0.9f, 4f).sounds(BlockSoundGroup.METAL).luminance(12))

    fun registerBlocks() {
        Registry.register(Registry.BLOCK, Identifier(OPGear.MOD_ID, "ruby_block"), RUBY_BLOCK)
        Registry.register(Registry.BLOCK, Identifier(OPGear.MOD_ID, "shiny_ruby_block"), SHINY_RUBY_BLOCK)
    }
}