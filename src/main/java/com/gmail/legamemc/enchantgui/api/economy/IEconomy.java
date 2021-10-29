package com.gmail.legamemc.enchantgui.api.economy;

import java.util.UUID;

public interface IEconomy {

    double getBalance(UUID playerUUID);

    void withdraw(UUID playerUUID, double amount);
}
