package me.baz.ancapicraft;

import items.SteelIngot;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("ancapicraft")
public class AncapiCraft {
	
	public static final String MODID = "ancapicraft";
	
	public static final DeferredRegister<Item> ITEM_REGISTER = 
			DeferredRegister.create(ForgeRegistries.ITEMS, AncapiCraft.MODID);
	
	public AncapiCraft() {
		
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();		
		
		register(eventBus);
		
		
	}
	
	public void register(IEventBus eventBus) {
		ITEM_REGISTER.register("steel_ingot", () -> new SteelIngot(new Item.Properties()));
		ITEM_REGISTER.register(eventBus);
	}
	
}
