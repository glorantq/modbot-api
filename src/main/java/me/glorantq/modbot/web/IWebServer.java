package me.glorantq.modbot.web;

import me.glorantq.modbot.web.oauth.DiscordAPI;
import me.glorantq.modbot.web.oauth.OAuthUser;
import spark.route.HttpMethod;

import java.util.Map;
import java.util.UUID;

public interface IWebServer {

    /**
     * Renders a freemarker template from the {@code www-data} directory
     * @param model The model to use
     * @param template The name of the template
     * @return Rendered template
     */
    String renderTemplate(Map<String, Object> model, String template);

    /**
     * Registers a new route
     * @param httpMethod The method this route listens to
     * @param path The path to this rout
     * @param webRoute The route itself
     * @param needsAuthentication Whether this route needs OAuth2 authorisation
     */
    void registerRoute(HttpMethod httpMethod, String path, WebRoute webRoute, boolean needsAuthentication);

    /**
     * Returns an instance of the Discord API
     * @return The Discord API instance
     */
    DiscordAPI getDiscordAPI();

    /**
     * Register a new WebSocket route
     * @param path The path to listen on
     * @param webSocketHandler The handler
     */
    void registerWebSocket(String path, Object webSocketHandler);

    /**
     * Returns the root URL to the server
     * @return The URL
     */
    String getRootURL();

    /**
     * Retrieve a user from either the provided token or the cache UUID
     * @param token The encrypted token
     * @param id The cache UUID
     * @return The credentials or null if failed
     */
    OAuthCredentials retrieveUser(String token, String id);
}
