package me.glorantq.modbot.web;

import lombok.*;
import me.glorantq.modbot.web.oauth.OAuthToken;
import me.glorantq.modbot.web.oauth.OAuthUser;

@Data
@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class OAuthCredentials {
    private final OAuthToken token;
    private final OAuthUser user;
}
