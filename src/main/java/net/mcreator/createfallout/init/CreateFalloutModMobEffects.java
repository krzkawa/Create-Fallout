/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createfallout.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.createfallout.potion.RadiatedMobEffect;
import net.mcreator.createfallout.CreateFalloutMod;

public class CreateFalloutModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CreateFalloutMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> RADIATED = REGISTRY.register("radiated", () -> new RadiatedMobEffect());
}