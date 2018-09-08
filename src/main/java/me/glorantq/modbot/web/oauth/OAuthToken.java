package me.glorantq.modbot.web.oauth;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;
import spark.Request;
import spark.Response;

@Data
@NoArgsConstructor
public class OAuthToken {
    /**
     * The token used for making requests
     */
    @SerializedName("access_token")
    private String accessToken;

    /**
     * The token used for refreshing access to this account
     */
    @SerializedName("refresh_token")
    private String refreshToken;

    /**
     * TTL for this token in seconds
     */
    @SerializedName("expires_in")
    private int expiresIn;

    /**
     * The type of this token
     */
    @SerializedName("token_type")
    private String tokenType;

    /**
     * The scopes this token has been authorized access to
     */
    private String scope;

    /**
     * The token used for calls in {@link DiscordAPI}.
     * @see DiscordAPI
     */
    private String bearer;
}
