package codes.edaz.op_gear
import codes.edaz.op_gear.registry.ModBlocks
import codes.edaz.op_gear.registry.ModItems
import codes.edaz.op_gear.registry.ModTools
import net.fabricmc.api.ModInitializer

object OPGear: ModInitializer {
    const val MOD_ID = "op_gear"


    override fun onInitialize() {
        ModItems.registerItems()
        ModTools.registerTools()
        ModBlocks.registerBlocks()
        ModLootTables.modifyVanillaLootTables()

        println("OP Gear by Edazpotato has been initialized.")
    }
}