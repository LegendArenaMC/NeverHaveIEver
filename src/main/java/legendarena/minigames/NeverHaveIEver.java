package legendarena.minigames;

import legendarena.api.gamemanager.Game;
import legendarena.api.gamemanager.GameManager;
import legendarena.minigames.neverhaveiever.MainListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

/**
 * Core of the Never Have I Ever minigame
 *
 * @author ThePixelDev
 */
public class NeverHaveIEver extends JavaPlugin {

    public static Game instance;
    public static HashMap<UUID, Integer> players;

    public void onEnable() {
        instance = GameManager.getInstance();
        players = new HashMap<>();
        instance.registerListener(new MainListener());
        instance.setMaxPlayerCount(5);
        instance.setAutoStartCount(5);
    }

    public void onDisable() {
        //
    }

}
