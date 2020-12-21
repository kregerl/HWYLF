package com.loucaskreger.controlf.config;

import com.loucaskreger.controlf.ControlF;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class ClientConfig {

	public static ConfigValue<Integer> red;
	public static ConfigValue<Integer> green;
	public static ConfigValue<Integer> blue;

	public ClientConfig(ForgeConfigSpec.Builder builder) {
		builder.push("Color");
		red = builder.translation(createTranslationKey("red")).defineInRange("red", 255, 0, 255);
		green = builder.translation(createTranslationKey("green")).defineInRange("green", 255, 0, 255);
		blue = builder.translation(createTranslationKey("blue")).defineInRange("blue", 255, 0, 255);
	}

	private String createTranslationKey(String s) {
		return ControlF.MOD_ID + ".config" + "." + s;
	}

}