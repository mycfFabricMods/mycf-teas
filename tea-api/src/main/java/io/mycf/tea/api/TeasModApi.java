package io.mycf.tea.api;

import io.mycf.tea.api.items.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeasModApi implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("mycf-teas");

	@Override
	public void onInitialize() {
		LOGGER.info("Initialising mycf's tea mod!");

		// Register all Items
		Items.registerItems();
	}
}
