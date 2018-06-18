package me.glorantq.modbot.commands.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Command {
    String commandName();
    String[] aliases() default {};
    String description() default "No information.";
    ICommand.DefaultPermission defaultPermission() default ICommand.DefaultPermission.EVERYONE;
}
