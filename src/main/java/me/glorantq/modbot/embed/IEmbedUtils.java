package me.glorantq.modbot.embed;

import sx.blah.discord.api.internal.json.objects.EmbedObject;
import sx.blah.discord.handle.obj.IUser;
import sx.blah.discord.util.EmbedBuilder;

public interface IEmbedUtils {
    EmbedBuilder simpleEmbed(IUser sender);
    EmbedObject exceptionEmbed(Throwable t, IUser user);
}
