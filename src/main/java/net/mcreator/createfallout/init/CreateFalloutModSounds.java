/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createfallout.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.createfallout.CreateFalloutMod;

public class CreateFalloutModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CreateFalloutMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> NUKACOLADRINKING = REGISTRY.register("nukacoladrinking", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("create_fallout", "nukacoladrinking")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RADIATED = REGISTRY.register("radiated", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("create_fallout", "radiated")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RADAWAYUSESOUND = REGISTRY.register("radawayusesound", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("create_fallout", "radawayusesound")));
}