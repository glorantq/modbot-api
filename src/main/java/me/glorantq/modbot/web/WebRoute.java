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
     * @param credentials Information about the currently logged in user. Contains {@link OAuthToken} and {@link OAuthUser}
     * @return The response
     */
    Object handle(Request request, Response response, OAuthCredentials credentials);
}
