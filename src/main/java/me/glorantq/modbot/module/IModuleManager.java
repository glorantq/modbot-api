package me.glorantq.modbot.module;

import java.util.List;
import java.util.Optional;

/**
 * API for interacting with the module manager
 * @author glorantq
 */
public interface IModuleManager {

    /**
     * Get a module by its name
     * @param name The name of the module
     * @return Optionally, the module
     */
    Optional<JavaModule> getModule(String name);

    /**
     * List all loaded modules
     * @return A list of all modules
     */
    List<JavaModule> getModules();
}
