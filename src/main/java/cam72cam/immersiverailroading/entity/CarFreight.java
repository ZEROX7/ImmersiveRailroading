package cam72cam.immersiverailroading.entity;

import cam72cam.immersiverailroading.registry.CarFreightDefinition;
import net.minecraft.world.World;

public class CarFreight extends Freight {
	public CarFreight(World world) {
		this(world, null);
	}
	
	public CarFreight(World world, String defID) {
		super(world, defID);
	}
	
	public CarFreightDefinition getDefinition() {
		return super.getDefinition(CarFreightDefinition.class);
	}

	@Override
	public int getInventorySize() {
		return this.getDefinition().getInventorySize();
	}
	
	public int getInventoryWidth() {
		return this.getDefinition().getInventoryWidth();
	}
	
	//TODO filter inventory
}
