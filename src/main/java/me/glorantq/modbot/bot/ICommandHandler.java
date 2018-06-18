package me.glorantq.modbot.bot;

import me.glorantq.modbot.commands.api.ICommand;
import me.glorantq.modbot.module.JavaModule;

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
}
