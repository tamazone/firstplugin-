package me.tamazone.last;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Last extends JavaPlugin implements Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       sender.sendMessage("調子乗んな");
        return true;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("helloworld");
        getCommand("monkey").setExecutor(this);
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public  void onLogin(PlayerJoinEvent e){
        e.getPlayer().sendMessage("たまぞぉのサーバーへようこそ");
    }
}
