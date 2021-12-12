package com.gmail.legamemc.enchantgui.api;

import com.gmail.legamemc.enchantgui.api.economy.IEconomy;
import org.bukkit.plugin.Plugin;

public interface EnchantGuiAPI {

    /**
     * Register the economy into EnchantGui
     * @param plugin The plugin's main class that
     * @param economy the class that extended IEconomy
     */
    void registerEconomy(Plugin plugin, IEconomy economy);


}
