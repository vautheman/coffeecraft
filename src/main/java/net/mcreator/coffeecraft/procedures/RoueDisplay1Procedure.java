package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.entity.Entity;

public class RoueDisplay1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("Frame") >= 1 && entity.getPersistentData().getDouble("Frame") <= 3) {
			return true;
		}
		return false;
	}
}
