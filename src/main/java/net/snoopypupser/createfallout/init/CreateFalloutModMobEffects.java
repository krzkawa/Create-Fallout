/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.snoopypupser.createfallout.init;

import net.snoopypupser.createfallout.potion.RadiatedMobEffect;
import net.snoopypupser.createfallout.CreateFalloutMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

public class CreateFalloutModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CreateFalloutMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> RADIATED = REGISTRY.register("radiated", () -> new RadiatedMobEffect());
}