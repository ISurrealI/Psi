/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Psi Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 * 
 * Psi is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 * 
 * File Created @ [13/01/2016, 16:58:15 (GMT)]
 */
package vazkii.psi.api.internal;

import net.minecraft.entity.player.EntityPlayer;

public interface IInternalMethodHandler {

	/**
	 * Gets the player data for a given player. Player Data contains info such as the
	 * player's Psi value or level.
	 */
	public IPlayerData getDataForPlayer(EntityPlayer player);
	
}
