package at.evoloxi.damage.event;

import at.evoloxi.damage.Damage;
import at.evoloxi.damage.EntityModifier;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.Random;

public class ModEntityDamage implements Listener {
    Damage main;


    public ModEntityDamage(Damage main) {
        this.main = main;
    }

    public boolean onLadder(Player p) {
        if (p.getLocation().clone().subtract(0, 0.1, 0).getBlock().getType() == Material.LADDER) {
            return true;
        }
        return false;
    }

    public String coloredHp(String original) {
        char[] chars = new char[]{'f', 'e', 'c', 'c', '4', '4'};
        int index = 0;
        String returnValue = "";
        for (char c : original.toCharArray()) {
            returnValue += "&" + chars[index] + c;
            index++;
            if (index == chars.length) {
                index = 0;
            }
        }
        return ChatColor.translateAlternateColorCodes('&', returnValue);
    }
    public String gifted(String original) {
        char[] chars = new char[]{'2', 'a', '2', 'a', 'a', '2'};
        int index = 0;
        String returnValue = "";
        for (char c : original.toCharArray()) {
            returnValue += "&" + chars[index] + c;
            index++;
            if (index == chars.length) {
                index = 0;
            }
        }
        return ChatColor.translateAlternateColorCodes('&', returnValue);
    }

    @EventHandler
    public void motd(ServerListPingEvent event) throws InterruptedException {



            event.setMotd("§aDamage Indicator by §eBesonderer" );



    }

    @EventHandler
    public void eventAttack(EntityDamageByEntityEvent e) {

        Entity target = e.getEntity();
        LivingEntity indicator = target.getLocation().getWorld().spawn(new Location(target.getWorld(), ((int) getRandom((int)target.getLocation().getX() - 1, (int)target.getLocation().getX() + 1)),target.getLocation().getY() -1,((int) getRandom((int)target.getLocation().getZ() - 1, (int)target.getLocation().getZ() + 1))), ArmorStand.class);
        EntityModifier modifier = new EntityModifier(indicator,main);
        modifier.modify().setInvulnerable(true);
        if(e.getCause() == EntityDamageEvent.DamageCause.POISON || e.getCause() == EntityDamageEvent.DamageCause.MAGIC){
            modifier.modify().setDisplayName("" + gifted(Math.round(e.getDamage()) + "") + "");
        }else{
            modifier.modify().setDisplayName(main.getConfig().getString("custome.prefix") + coloredHp(Math.round(e.getDamage()) + "") + "§r✧");
        }

        indicator.setInvisible(true);
//        indicator.setGravity(false);

//       indicator.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,30,0,false,false));
//        indicator.setVelocity(new Vector(0,0.13,0));
//        modifier.modify().noClip(true);
        modifier.modify().setDisplayNameVisible(true);


        indicator.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION,30,(int)0.5));

        Bukkit.getScheduler().runTaskLater(main, new Runnable() {
            @Override
            public void run() {
                indicator.remove();
            }
        }, 30);

        e.setCancelled(true);

        ((Damageable) e.getEntity()).damage(e.getDamage());





    }



    public int getRandom(int lower, int upper) {
        Random random = new Random();
        return random.nextInt((upper - lower) + 1) + lower;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDamageEvent(final EntityDamageEvent e) {

        if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {

            Entity target = e.getEntity();
            LivingEntity indicator = target.getLocation().getWorld().spawn(new Location(target.getWorld(), ((int) getRandom((int)target.getLocation().getX() - 1, (int)target.getLocation().getX() + 1)),target.getLocation().getY() -1,((int) getRandom((int)target.getLocation().getZ() - 1, (int)target.getLocation().getZ() + 1))), ArmorStand.class);
            EntityModifier modifier = new EntityModifier(indicator,main);
            modifier.modify().setDisplayName("✧" + coloredHp(Math.round(e.getDamage()) + "") + "§r✧");
            modifier.modify().setInvisible(true);


            modifier.modify().setInvulnerable(true);
            indicator.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION,30,(int)0.5));



            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    indicator.remove();
                }
            }, 30);

            e.setCancelled(true);

            ((Damageable) e.getEntity()).damage(e.getDamage());
        }
    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDamageEvent(final EntityDamageByBlockEvent e) {
        if (!(e.getCause() == EntityDamageEvent.DamageCause.FALL)) {



            Entity target = e.getEntity();
            LivingEntity indicator = target.getLocation().getWorld().spawn(new Location(target.getWorld(), ((int) getRandom((int)target.getLocation().getX() - 1, (int)target.getLocation().getX() + 1)),target.getLocation().getY() -1,((int) getRandom((int)target.getLocation().getZ() - 1, (int)target.getLocation().getZ() + 1))), ArmorStand.class);
            EntityModifier modifier = new EntityModifier(indicator,main);
            modifier.modify().setDisplayName("✧" + coloredHp(Math.round(e.getDamage()) + "") + "§r✧");
            modifier.modify().setInvisible(true);


            modifier.modify().setInvulnerable(true);
            indicator.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION,30,(int)0.5));



            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    indicator.remove();
                }
            }, 30);

            e.setCancelled(true);

            ((Damageable) e.getEntity()).damage(e.getDamage());
        }
    }


}
