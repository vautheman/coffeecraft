package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.entity.Entity;

public class RoueDisplay2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("Frame") >= 4 && entity.getPersistentData().getDouble("Frame") <= 8) {
			return true;
		}
		return false;
	}
}
