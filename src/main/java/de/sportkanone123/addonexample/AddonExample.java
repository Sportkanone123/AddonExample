package de.sportkanone123.addonexample;

import de.sportkanone123.addonsystem.objects.Addon;

public class AddonExample extends Addon {

    @Override
    public void onEnable() {
        System.out.println("Addon loaded :)");
    }

    @Override
    public void onDisable() {
        System.out.println("Addon was disabled :(");
    }
}
