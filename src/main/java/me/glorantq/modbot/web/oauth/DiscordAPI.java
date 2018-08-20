package me.glorantq.modbot.web.oauth;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DiscordAPI {

    /**
     * Exchange an authorization code for a token
     * @param clientID The OAuth2 client ID
     * @param clientSecret The OAuth2 client secret
     * @param grantType The grant type
     * @param code The authorization code
     * @param redirectUri The redirect URI
     * @param scope Scopes to authorize
     * @return The token
     */
    @FormUrlEncoded
    @POST("oauth2/token")
    Call<OAuthToken> getAuthToken(@Field("client_id") String clientID,
                                  @Field("client_secret") String clientSecret,
                                  @Field("grant_type") String grantType,
                                  @Field("code") String code,
                                  @Field("redirect_uri") String redirectUri,
                                  @Field("scope") String scope);

    /**
     * Get information about the current user
     * @param token The token of the logged in user
     * @return The user
     */
    @GET("users/@me")
    Call<OAuthUser> getOwnUser(@Header("Authorization") String token);

    /**
     * Get a list of partial guild objects the user is in
     * @param token The token of the logged in user
     * @return The list of partial guild objects
     */
    @GET("users/@me/guilds")
    Call<List<OAuthGuild>> getAllGuilds(@Header("Authorization") String token);
}
