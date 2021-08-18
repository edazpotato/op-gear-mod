package codes.edaz.op_gear

import codes.edaz.op_gear.registry.ModItems
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.LootTableSetter
import net.minecraft.item.Items
import net.minecraft.loot.LootManager
import net.minecraft.loot.condition.LootCondition
import net.minecraft.loot.entry.ItemEntry
import net.minecraft.loot.entry.LootTableEntry
import net.minecraft.loot.function.SetCountLootFunction
import net.minecraft.loot.provider.number.ConstantLootNumberProvider
import net.minecraft.loot.provider.number.UniformLootNumberProvider
import net.minecraft.resource.ResourceManager
import net.minecraft.util.Identifier

object ModLootTables {
    private val DEEPSLATE_REDSTONE_ORE_LOOT_TABLE_ID: Identifier = Identifier("minecraft", "blocks/deepslate_redstone_ore")
    private val REDSTONE_ORE_LOOT_TABLE_ID: Identifier = Identifier("minecraft", "blocks/redstone_ore")
//    private val RESTONE_ORE_INJECTABLE_LOOT_TABLE_ID: Identifier = Identifier(OPGear.MOD_ID, "custom/redstone_ore_injectable")

    fun modifyVanillaLootTables() {
        LootTableLoadingCallback.EVENT.register(LootTableLoadingCallback { resourceManager, lootManager, id, table, setter ->
            if (REDSTONE_ORE_LOOT_TABLE_ID.equals(id) or DEEPSLATE_REDSTONE_ORE_LOOT_TABLE_ID.equals(id)) {
               val poolBuilder = FabricLootPoolBuilder.builder()
                   .rolls(ConstantLootNumberProvider.create(1.0F))
//                   .with(LootTableEntry.builder(RESTONE_ORE_INJECTABLE_LOOT_TABLE_ID))
                   .withEntry(ItemEntry.builder(ModItems.RUBY).build())
                   .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(0f, 1f)).build())

                table.pool(poolBuilder)
            }
        })
    }
}