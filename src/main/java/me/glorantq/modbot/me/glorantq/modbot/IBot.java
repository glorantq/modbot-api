package me.glorantq.modbot.me.glorantq.modbot;

import me.glorantq.modbot.data.IGuildData;
import me.glorantq.modbot.module.IModuleManager;
import me.glorantq.modbot.permissions.IPermissionProvider;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

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
}
