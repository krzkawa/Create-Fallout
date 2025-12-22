package net.snoopypupser.createfallout.block;

import net.snoopypupser.createfallout.init.CreateFalloutModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class NukaColaFluidBlock extends LiquidBlock {
	public NukaColaFluidBlock() {
		super(CreateFalloutModFluids.NUKA_COLA_FLUID.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}