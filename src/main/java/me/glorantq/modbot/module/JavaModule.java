package me.glorantq.modbot.module;

import me.glorantq.modbot.me.glorantq.modbot.IBot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for all modules
 * @author glorantq
 */
public abstract class JavaModule {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private boolean isEnabled = false;

    public abstract void onInit(IBot bot);
    public abstract void onEnable();
    public abstract void onDisable();

    protected Logger getLogger() {
        return logger;
    }

    void setEnabled(boolean b) {
        isEnabled = b;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
