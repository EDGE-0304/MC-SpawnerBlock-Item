package hanmin.testmod.item;

import hanmin.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TestItem extends Item {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	
	public TestItem() {
		super(new Properties());
	}
	
	public static RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",() -> {
		return new TestItem();}
	);
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}