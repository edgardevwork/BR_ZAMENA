package com.blackhub.bronline.game.core.constants.resources;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PngConstants.kt */
@StabilityInferred(parameters = 1)

public final class PngConstantsId49 {
    public static final int $stable = 0;

    @NotNull
    public static final String BG_IMAGE_NAME = "bg_craft.png";

    @NotNull
    public static final String IMG_CRAFT_BANNER_VIP_LEFT = "img_craft_banner_vip_1.png";

    @NotNull
    public static final String IMG_CRAFT_BANNER_VIP_RIGHT = "img_craft_banner_vip_2.png";

    @NotNull
    public static final PngConstantsId49 INSTANCE = new PngConstantsId49();

    @NotNull
    public final String getActualNameOfImageForForcedTutorial(int imageId) {
        return "img_craft_tutor_" + imageId + "_ru.png";
    }
}

