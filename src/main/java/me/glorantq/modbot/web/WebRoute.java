package me.glorantq.modbot.web;

import me.glorantq.modbot.web.oauth.OAuthToken;
import me.glorantq.modbot.web.oauth.OAuthUser;
import spark.Request;
import spark.Response;

public interface WebRoute {

    /**
     * Method called to handle a web request
     * @param request The original request
     * @param response The response
     * @param discordUser The currently logged in user for this request
     * @param discordToken The token of the currently logged in user
     * @return The response
     */
    Object handle(Request request, Response response, OAuthUser discordUser, OAuthToken discordToken);
}
