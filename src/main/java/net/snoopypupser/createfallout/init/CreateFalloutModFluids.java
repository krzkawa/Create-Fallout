/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.snoopypupser.createfallout.init;

import net.snoopypupser.createfallout.fluid.NukaColaFluidFluid;
import net.snoopypupser.createfallout.CreateFalloutMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class CreateFalloutModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, CreateFalloutMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> NUKA_COLA_FLUID = REGISTRY.register("nuka_cola_fluid", () -> new NukaColaFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_NUKA_COLA_FLUID = REGISTRY.register("flowing_nuka_cola_fluid", () -> new NukaColaFluidFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NUKA_COLA_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NUKA_COLA_FLUID.get(), RenderType.translucent());
		}
	}
}