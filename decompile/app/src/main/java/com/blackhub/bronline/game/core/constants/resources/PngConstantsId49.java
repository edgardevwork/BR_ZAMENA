package com.blackhub.bronline.game.core.constants.resources;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PngConstants.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/constants/resources/PngConstantsId49;", "", "()V", "BG_IMAGE_NAME", "", "IMG_CRAFT_BANNER_VIP_LEFT", "IMG_CRAFT_BANNER_VIP_RIGHT", "getActualNameOfImageForForcedTutorial", "imageId", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
