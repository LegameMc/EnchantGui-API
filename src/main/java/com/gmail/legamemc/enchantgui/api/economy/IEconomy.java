package com.gmail.legamemc.enchantgui.api.economy;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public interface IEconomy {

    Plugin getPlugin();

    String getIdentity();

    String getName();

    double getBalance(Player player);

    void withdraw(Player player, double amount);
}
