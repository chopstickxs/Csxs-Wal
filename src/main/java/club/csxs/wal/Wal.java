package club.csxs.wal;

import club.csxs.wal.Listerners.QuitEvent;
import club.csxs.wal.Listerners.WelcomeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Wal extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();
        System.out.println(getConfig().getString("WAL.prefix") + " Wal is now working!");
        getServer().getPluginManager().registerEvents(new WelcomeEvent(), this);
        getServer().getPluginManager().registerEvents(new QuitEvent(), this);

    }

}
