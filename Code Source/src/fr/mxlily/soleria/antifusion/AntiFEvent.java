package fr.mxlily.soleria.antifusion;

import com.SirBlobman.combatlogx.api.ICombatLogX;
import com.SirBlobman.combatlogx.api.utility.ICombatManager;
import fr.mxlily.soleria.antifusion.config.Lang;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;


public class AntiFEvent implements Listener {

    @EventHandler
    public void OnCraft(CraftItemEvent event) {
        Material type = event.getInventory().getResult().getType();
        if (type.name().contains("DIAMOND") && (type.name().contains("SWORD") ||
                type.name().contains("HELMET") || type.name().contains("CHESTPLATE") || type.name().contains("LEGGINGS") || type.name().contains("BOOTS")) && isInCombat((Player) event.getWhoClicked())) {
            event.getWhoClicked().sendMessage(Lang.ItemFusionInCombat);

            event.setCancelled(true);
        }
    }

    public boolean isInCombat(Player player) {
        ICombatLogX plugin = (ICombatLogX) Bukkit.getPluginManager().getPlugin("CombatLogX");
        ICombatManager combatManager = plugin.getCombatManager();
        return combatManager.isInCombat(player);
    }
}
