package at.evoloxi.damage;

import at.evoloxi.damage.event.ModEntityDamage;
import at.evoloxi.damage.event.UnBanBesondere;
import org.bukkit.plugin.java.JavaPlugin;

public final class Damage extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getLogger().info("§aDein Plugin wurde nun geladen!");
        getServer().getPluginManager().registerEvents(new ModEntityDamage(this),this);
        getServer().getPluginManager().registerEvents(new UnBanBesondere(this),this);
        saveDefaultConfig();
    }


    @Override
    public void onDisable() {
        getServer().getLogger().warning("§4Dein Plugin wurde nun entladen!");
    }


}
