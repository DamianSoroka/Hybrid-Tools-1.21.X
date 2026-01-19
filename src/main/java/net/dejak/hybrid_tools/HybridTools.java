package net.dejak.hybrid_tools;

import net.dejak.hybrid_tools.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HybridTools implements ModInitializer {
	public static final String MOD_ID = "hybrid_tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}