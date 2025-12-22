/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.snoopypupser.createfallout.init;

import net.snoopypupser.createfallout.block.NukaColaFluidBlock;
import net.snoopypupser.createfallout.CreateFalloutMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class CreateFalloutModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CreateFalloutMod.MODID);
	public static final DeferredBlock<Block> NUKA_COLA_FLUID;
	static {
		NUKA_COLA_FLUID = REGISTRY.register("nuka_cola_fluid", NukaColaFluidBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}