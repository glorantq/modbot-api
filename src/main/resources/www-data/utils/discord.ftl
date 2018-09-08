<#function getAvatarURL discordUser size>
    <#return "https://cdn.discordapp.com/avatars/${discordUser.id}/${discordUser.avatar}.png?size=${size}">
</#function>

<#function getGuildAvatarURL guild size>
    <#if guild.icon??>
        <#return "https://cdn.discordapp.com/icons/${guild.id}/${guild.icon}.png?size=${size}">
    </#if>

    <#return "https://cdn.discordapp.com/embed/avatars/2.png?size=${size}">
</#function>

<#function formatName discordUser>
    <#return "${discordUser.username}#${discordUser.discriminator}">
</#function>