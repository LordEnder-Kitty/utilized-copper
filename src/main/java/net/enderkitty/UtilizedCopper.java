package net.enderkitty;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilizedCopper implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("utilized-copper");

	public static final Item COPPER_NUGGET = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("utilized-copper", "copper_nugget"), COPPER_NUGGET);
	}
}
