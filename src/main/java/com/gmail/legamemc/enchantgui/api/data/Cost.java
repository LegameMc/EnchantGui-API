package com.gmail.legamemc.enchantgui.api.data;

import com.gmail.legamemc.enchantgui.api.economy.IEconomy;

public interface Cost {

    /**
     * Get the amount of money player used to enchant the item
     * @return the amount of money
     */
    double getMoney();

    /**
     * Get the amount of level player used to enchant the item
     * @return the amount of level
     */
    int getLevel();

    /**
     * Get the amount of exp player used to enchant the item
     * @return the amount of exp
     */
    int getExp();

    /**
     * Get the amount of lapis player used to enchant the item
     * @return the amount of lapis
     */
    int getLapis();

    /**
     * Get the amount of custom economy player used to enchant the item
     * @param identity The custom economy's identity. This depend on what {@link IEconomy#getIdentity()} returns
     * @return the amount of custom economy <br>
     *         return 0 if identity is not found
     */
    double getCustomEconomy(String identity);
}
