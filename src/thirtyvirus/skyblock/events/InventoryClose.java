package thirtyvirus.skyblock.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClose implements Listener {

    @EventHandler
    private void onCloseInventory(InventoryCloseEvent event) {
        // add items back to a player's inventory if closing the UberItem crafting menu
        if (event.getView().getTitle().contains("UberItems - UnCraft Item") && event.getView().getTopInventory().getLocation() == null) {
            ItemStack item = event.getInventory().getItem(19);
            if (item != null) event.getPlayer().getInventory().addItem(item);
        }
    }

}
