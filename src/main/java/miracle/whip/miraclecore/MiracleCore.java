package miracle.whip.miraclecore;

import org.bukkit.plugin.java.JavaPlugin;

public class MiracleCore extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("main").setExecutor(new MainCommandExecutor());

    }

    @Override
    public void onDisable() {
    }
}
