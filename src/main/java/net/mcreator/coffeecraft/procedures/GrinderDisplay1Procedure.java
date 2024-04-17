package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.entity.Entity;

public class GrinderDisplay1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("Frame") >= 0) {
			return true;
		}
		return false;
	}
}
