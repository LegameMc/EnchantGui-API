package com.gmail.legamemc.enchantgui.api;

import com.gmail.legamemc.enchantgui.api.economy.IEconomy;
import org.bukkit.plugin.Plugin;

public interface EnchantGuiAPI {

    void registerEconomy(Plugin plugin, IEconomy economy);


}
