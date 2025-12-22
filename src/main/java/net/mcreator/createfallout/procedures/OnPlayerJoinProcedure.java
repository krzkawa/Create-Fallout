package net.mcreator.createfallout.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.createfallout.configuration.JoinConfigConfiguration;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OnPlayerJoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (JoinConfigConfiguration.JOIN_MESSAGE_ENABLED.get()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getSpawnPos().getX())
										: 0),
										((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
												? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null)
														? _player.getRespawnPosition().getY()
														: _player.level().getLevelData().getSpawnPos().getY())
												: 0),
										((entity instanceof ServerPlayer _player && !_player.level().isClientSide())
												? ((_player.getRespawnDimension().equals(_player.level().dimension())
														&& _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getSpawnPos().getZ())
												: 0)),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"tellraw @p {   \"text\": \"\",   \"extra\": [     {       \"text\": \"Create: Fallout\\n\",       \"color\": \"gold\",       \"bold\": true     },     {       \"text\": \"\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\\n\",       \"color\": \"dark_green\"     },     {       \"text\": \"Required Mods:\\n\",       \"color\": \"yellow\"     },     {       \"text\": \"\u2022 Create\\n\u2022 Create: Food\\n\u2022 Farmer's Delight\\n\",       \"color\": \"gold\"     },     {       \"text\": \"Recipes will NOT work without these mods.\\n\",       \"color\": \"red\"     },     {       \"text\": \"This message can be disabled in the config.\\n\",       \"color\": \"gray\",       \"italic\": true     },     {       \"text\": \"- Join Discord\",       \"color\": \"aqua\",       \"clickEvent\": {         \"action\": \"open_url\",         \"value\": \"https://discord.gg/uc7\"       }     }   ] }");
		}
	}
}