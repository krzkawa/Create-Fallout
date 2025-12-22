/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.snoopypupser.createfallout.init;

import net.snoopypupser.createfallout.CreateFalloutMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class CreateFalloutModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateFalloutMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATEFALLOUT = REGISTRY.register("createfallout",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_fallout.createfallout")).icon(() -> new ItemStack(CreateFalloutModItems.STIMPACK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateFalloutModItems.NUKA_COLA.get());
				tabData.accept(CreateFalloutModItems.SUGARBOMBS.get());
				tabData.accept(CreateFalloutModItems.NUKA_COLA_GLASS.get());
				tabData.accept(CreateFalloutModItems.NUKA_COLA_FLUID_BUCKET.get());
				tabData.accept(CreateFalloutModItems.NUKA_CAPS.get());
				tabData.accept(CreateFalloutModItems.BROWNING_SAUCE.get());
				tabData.accept(CreateFalloutModItems.QUANTUM_COLA.get());
				tabData.accept(CreateFalloutModItems.STIMPACK.get());
				tabData.accept(CreateFalloutModItems.RADAWAY.get());
			}).build());
}