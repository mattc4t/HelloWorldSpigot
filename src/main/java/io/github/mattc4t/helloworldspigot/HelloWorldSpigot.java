package io.github.mattc4t.helloworldspigot;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorldSpigot extends JavaPlugin {
    // Fired when plugin is first enabled
    public void onEnable() 
    {
    	getLogger().info("onEnable has been invoked!");
    }
    
    // Fired when plugin is disabled
    public void onDisable() 
    {
    	getLogger().info("onDisable has been invoked!");
    }
}
