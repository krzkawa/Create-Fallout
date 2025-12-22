package net.mcreator.createfallout.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.createfallout.init.CreateFalloutModItems;
import net.mcreator.createfallout.init.CreateFalloutModFluids;
import net.mcreator.createfallout.init.CreateFalloutModFluidTypes;
import net.mcreator.createfallout.init.CreateFalloutModBlocks;

public abstract class NukaColaFluidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CreateFalloutModFluidTypes.NUKA_COLA_FLUID_TYPE.get(), () -> CreateFalloutModFluids.NUKA_COLA_FLUID.get(),
			() -> CreateFalloutModFluids.FLOWING_NUKA_COLA_FLUID.get()).explosionResistance(100f).tickRate(35).levelDecreasePerBlock(2).bucket(() -> CreateFalloutModItems.NUKA_COLA_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) CreateFalloutModBlocks.NUKA_COLA_FLUID.get());

	private NukaColaFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_NECTAR;
	}

	public static class Source extends NukaColaFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NukaColaFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}