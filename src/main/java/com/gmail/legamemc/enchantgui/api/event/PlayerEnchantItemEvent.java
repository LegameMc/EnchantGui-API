package com.gmail.legamemc.enchantgui.api.event;

import com.gmail.legamemc.enchantgui.api.data.Cost;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface PlayerEnchantItemEvent {

    Player getPlayer();

    ItemStack getItem();

    Enchantment getEnchantment();

    int getLevel();

    Cost getCost();
}
