package net.snoopypupser.createfallout.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class JoinConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;

	public static final ModConfigSpec.ConfigValue<Boolean> JOIN_MESSAGE_ENABLED;
	static {
		BUILDER.push("----------|_playerjoinworldmessage|----------");
		JOIN_MESSAGE_ENABLED = BUILDER.comment("Set this to false if you don't want the joining message to appear.").define("enable_join_message", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}