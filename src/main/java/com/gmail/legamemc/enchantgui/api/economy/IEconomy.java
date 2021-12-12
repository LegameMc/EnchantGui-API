package com.gmail.legamemc.enchantgui.api.economy;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * Interface for registering custom economy into EnchantGui <br>
 * To know how to register custom economy, check <a href="https://github.com/LegameMc/EnchantGui-API/wiki/Make-EnchantGui-use-your-economy-plugin#tutorial">this</a>
 *
 */
public interface IEconomy {

    /**
     * Get the plugin main class.
     * <br>
     * <b>Note: This method has to return your plugin main class!</b>
     * @return plugin main class
     */
    Plugin getPlugin();

    /**
     * EnchantGui will use the value returned by this method
     * to identity what type of economy it is
     * For information about this method, see <a href="https://github.com/LegameMc/EnchantGui-API/wiki/Make-EnchantGui-use-your-economy-plugin#tutorial">this</a>
     * <br>
     * <b>Note: the identity can't be the same as others!</b>
     * @return the identity of the economy
     */
    String getIdentity();

    /**
     * To replace the {NAME} in the message
     * @return the name of your economy
     */
    String getName();

    /**
     * @param player the target player
     * @return the amount of balance the player has
     */
    double getBalance(Player player);

    /**
     * Withdraw balance from the player
     * @param player the target player
     * @param amount the amount needed to withdraw
     */
    void withdraw(Player player, double amount);

}
