package me.glorantq.modbot.commands.api;

/**
 * Interface for Commands and Sub-Commands
 * @author glorantq
 */
public interface ICommand {
    // This is a no-op interface for now, just so we can use reflections to get all the commands in a package

    enum ArgumentType {
        INT, FLOATING_POINT, LONG, STRING, USER, CHANNEL, ROLE, BOOLEAN
    }

    /**
     * Default permission level if no applicable permission node is found for the user executing
     */
    enum DefaultPermission {
        EVERYONE, ADMIN, OWNER, BOT_OWNER
    }
}
