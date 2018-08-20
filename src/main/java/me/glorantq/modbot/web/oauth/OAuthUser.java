
package me.glorantq.modbot.web.oauth;

import lombok.Data;

@Data
public class OAuthUser {
    /**
     * Avatar hash of the user
     */
    private String avatar;

    /**
     * The discriminator of the user
     */
    private String discriminator;

    /**
     * The e-mail of the user. Only present if the {@code email} scope was used
     */
    private String email;

    /**
     * The ID of this user
     */
    private String id;

    /**
     * The name of this user
     */
    private String username;

    /**
     * Whether this account is verified
     */
    private boolean verified;
}
