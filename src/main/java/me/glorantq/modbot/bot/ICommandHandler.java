package me.glorantq.modbot.bot;

import me.glorantq.modbot.commands.api.ICommand;
import me.glorantq.modbot.module.JavaModule;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

/**
 * API for interacting with the Command Handler. Allows registration of commands, removing commands, etc...
 * @author glorantq
 */
public interface ICommandHandler {

    /**
     * Register a new command
     * @param module The module which owns this Command
     * @param commandClass The main command class
     * @return Whether the registration was successful
     */
    boolean registerCommand(JavaModule module, Class<? extends ICommand> commandClass);

    /**
     * Removes an already registered command
     * @param commandClass The command's class
     * @return Whether the removal was successful
     */
    boolean removeCommand(Class<? extends ICommand> commandClass);

    /**
     * Check if a user has permissions to run a command in the specified guild
     * @param guild The guild to check in
     * @param user The user to check
     * @param command The command
     * @return Whether the user can run the command or not
     */
    boolean canRunCommand(IGuild guild, IUser user, ICommand command);

    /**
     * Finds a registered command based on its class
     * @param commandClass The class of the command
     * @return The command, or null if not found
     */
    ICommand findCommand(Class<? extends ICommand> commandClass);
}
