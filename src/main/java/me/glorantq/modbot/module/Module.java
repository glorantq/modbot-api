package me.glorantq.modbot.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Module {
    String name();
    String[] authors();
    String version();
    String description();
    String iconUrl() default "https://emojipedia-us.s3.amazonaws.com/thumbs/240/google/119/white-question-mark-ornament_2754.png";
}
