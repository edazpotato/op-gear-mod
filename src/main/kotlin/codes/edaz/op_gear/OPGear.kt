package codes.edaz.op_gear
import codes.edaz.op_gear.registry.ModBlocks
import codes.edaz.op_gear.registry.ModItems
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier


object OPGear: ModInitializer {
    const val MOD_ID = "op_gear"

    override fun onInitialize() {
        ModItems.registerItems()
        ModBlocks.registerBlocks()

        println("OP Gear by Edazpotato has been initialized.")
    }
}