package com.puttysoftware.ack.internal;

import java.io.IOException;

import com.puttysoftware.ack.AvatarImageModel;
import com.puttysoftware.ack.ColorReplaceRules;
import com.puttysoftware.images.BufferedImageIcon;

public class AvatarImageLoader {
    public static BufferedImageIcon load(final int familyID,
            final ColorReplaceRules rules) throws IOException {
        final String imageExt = ".png";
        final String name = "/assets/avatar/"
                + Integer.toHexString(familyID).toUpperCase() + imageExt;
        return rules.applyAll(ImageLoader.load(name,
                AvatarImageLoader.class.getResource(name)));
    }

    public static BufferedImageIcon loadFromModel(final AvatarImageModel model)
            throws IOException {
        final String imageExt = ".png";
        final String name = "/assets/avatar/"
                + Integer.toHexString(model.getAvatarFamilyID()).toUpperCase()
                + imageExt;
        return model.getRules().applyAll(ImageLoader.load(name,
                AvatarImageLoader.class.getResource(name)));
    }

    public static BufferedImageIcon loadWeapon(final int weaponID,
            final ColorReplaceRules rules) throws IOException {
        final String imageExt = ".png";
        final String name = "/assets/weapon/"
                + Integer.toHexString(weaponID).toUpperCase() + imageExt;
        return rules.applyAll(ImageLoader.load(name,
                AvatarImageLoader.class.getResource(name)));
    }

    public static BufferedImageIcon loadAccessory(final int accessoryID,
            final ColorReplaceRules rules) throws IOException {
        final String imageExt = ".png";
        final String name = "/assets/accessory/"
                + Integer.toHexString(accessoryID).toUpperCase() + imageExt;
        return rules.applyAll(ImageLoader.load(name,
                AvatarImageLoader.class.getResource(name)));
    }
}
