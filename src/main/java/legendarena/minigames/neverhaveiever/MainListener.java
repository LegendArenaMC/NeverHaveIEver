package legendarena.minigames.neverhaveiever;

import legendarena.api.gamemanager.GameListener;
import legendarena.api.utils.ChatUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created on 6/8/2015
 *
 * @author ThePixelDev
 */
public class MainListener implements GameListener {

    @EventHandler
    public void onClick(PlayerInteractEvent ev) {
        Player p = ev.getPlayer();
        if(ev.getAction() != Action.RIGHT_CLICK_AIR && ev.getAction() != Action.RIGHT_CLICK_BLOCK)
            return;
        ev.setCancelled(true);
        if(ev.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatUtils.getCustomMsg("Choose") + "I Have")) {
            //the player has, so keep them back
        } else {
            //the player hasn't, so move them up one
        }
    }

}
