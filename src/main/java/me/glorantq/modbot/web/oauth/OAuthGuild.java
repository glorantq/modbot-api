
package me.glorantq.modbot.web.oauth;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OAuthGuild {
    private String icon;
    private String id;
    private String name;
    private Boolean owner;
    private Long permissions;
}
