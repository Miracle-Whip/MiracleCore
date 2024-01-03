package miracle.whip.miraclecore;

import org.bukkit.plugin.java.JavaPlugin;

public class MiracleCore extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("help").setExecutor(new HelpCommand());

    }

    @Override
    public void onDisable() {
    }
}
