package com.gmail.legamemc.enchantgui.api.event;

import com.gmail.legamemc.enchantgui.api.data.Cost;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public  class PlayerEnchantItemEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    private final Player player;
    private final ItemStack item;
    private final Enchantment enchantment;
    private final int level;
    private final Cost cost;

    public PlayerEnchantItemEvent(Player player, ItemStack item, Enchantment enchantment, int level, Cost cost){
        this.player = player;
        this.item = item;
        this.enchantment = enchantment;
        this.level = level;
        this.cost = cost;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * Get the player who enchant the item
     * @return The player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Get the item player enchanted
     * @return The item player enchanted
     */
    public ItemStack getItem() {
        return item;
    }

    /**
     * Get the enchantment that player enchanted into the item
     * @return The enchantment
     */
    public Enchantment getEnchantment() {
        return enchantment;
    }

    /**
     * Get the level of the enchantment
     * @return The level of the enchantment
     */
    public int getLevel() {
        return level;
    }

    /**
     * Get the cost of enchanting the item
     * @return The cost of enchanting
     */
    public Cost getCost() {
        return cost;
    }


}
