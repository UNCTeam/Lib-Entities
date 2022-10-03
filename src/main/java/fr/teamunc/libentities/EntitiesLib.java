package fr.teamunc.libentities;

import fr.teamunc.libentities.controllers.UNCEntitiesController;
import org.bukkit.plugin.java.JavaPlugin;

public class EntitiesLib {
    private static JavaPlugin plugin;

    private static UNCEntitiesController uncEntitiesController;

    public static void init(JavaPlugin plugin) {
        EntitiesLib.plugin = plugin;
    }

}
