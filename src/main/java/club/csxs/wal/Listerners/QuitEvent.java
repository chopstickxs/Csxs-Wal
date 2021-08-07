package club.csxs.wal.Listerners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class QuitEvent extends JavaPlugin implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        p.sendMessage(getConfig().getString("WAL.quit_msg"));
    }

}
