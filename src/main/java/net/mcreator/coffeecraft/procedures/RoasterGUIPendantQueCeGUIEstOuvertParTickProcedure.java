package net.mcreator.coffeecraft.procedures;

import net.minecraft.world.entity.Entity;

public class RoasterGUIPendantQueCeGUIEstOuvertParTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Frame") >= 1) {
			entity.getPersistentData().putDouble("Frame", (entity.getPersistentData().getDouble("Frame") - 1));
		} else {
			entity.getPersistentData().putDouble("Frame", 8);
		}
	}
}
