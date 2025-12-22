/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.snoopypupser.createfallout.init;

import net.snoopypupser.createfallout.fluid.types.NukaColaFluidFluidType;
import net.snoopypupser.createfallout.CreateFalloutMod;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

public class CreateFalloutModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CreateFalloutMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> NUKA_COLA_FLUID_TYPE = REGISTRY.register("nuka_cola_fluid", () -> new NukaColaFluidFluidType());
}