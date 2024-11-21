package net.runelite.client.plugins.aionly;

import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
        name = "Example Plugin",
        description = "An example plugin to demonstrate RuneLite development.",
        tags = {"example", "tutorial"}
)
public class aionly extends Plugin
{
    @Override
    protected void startUp() throws Exception
    {
        // Code to execute when the plugin starts
        System.out.println("Example Plugin started!");
    }

    @Override
    protected void shutDown() throws Exception
    {
        // Code to execute when the plugin shuts down
        System.out.println("Example Plugin stopped!");
    }
}