package me.glorantq.modbot.bot;

import me.glorantq.modbot.data.IGuildData;
import me.glorantq.modbot.embed.IEmbedUtils;
import me.glorantq.modbot.module.IModuleManager;
import me.glorantq.modbot.module.JavaModule;
import me.glorantq.modbot.permissions.IPermissionProvider;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

import java.io.File;
import java.util.Optional;

/**
 * API for accessing information about the Bot
 * @author glorantq
 */
public interface IBot {

    /**
     * Get the command handler used by the Bot
     * @return The CommandHandler
     */
    ICommandHandler getCommandHandler();

    /**
     * Get the module manager used by the Bot
     * @return The ModuleManager
     */
    IModuleManager getModuleManager();

    /**
     * Get the permission provider used by the Bot
     * @return The PermissionProvider
     */
    IPermissionProvider getPermissionProvider();

    /**
     * Get the guild-specific configuration used to store data
     * @param guild The guild to get the configuration for
     * @return Optionally, the configuration
     */
    Optional<IGuildData> getGuildData(IGuild guild);

    /**
     * Get the owner of the Bot
     * @return The Bot's owner
     */
    IUser getApplicationOwner();

    /**
     * Create a new EmbedUtils object
     * @return The created object
     */
    IEmbedUtils createEmbedUtils();

    /**
     * Returns the prefix override for the specified guild
     * @param guild The guild to check
     * @return The prefix override for that guild, or the default prefix
     */
    String getGuildPrefix(IGuild guild);

    /**
     * Changes the bot's prefix for a specified guild
     * @param guild The guild to modify
     * @param prefix The new prefix
     */
    void changeGuildPrefix(IGuild guild, String prefix);

    /**
     * Get a recommended data directory for the specified module. Creates the folder upon execution
     * @param module The module
     * @return The directory
     */
    File getRecommendedModuleDirectory(JavaModule module);
}
