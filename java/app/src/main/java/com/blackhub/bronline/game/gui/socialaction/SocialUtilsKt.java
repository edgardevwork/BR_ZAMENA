package com.blackhub.bronline.game.gui.socialaction;

import android.util.Log;
import com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocialUtils.kt */

public final class SocialUtilsKt {
    public static final void logThisAction(@Nullable SocialInteraction socialInteraction) {
        Log.v(SocialConstants.LOG_TAG, "id = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getId()) : null) + ", name = " + (socialInteraction != null ? socialInteraction.getName() : null) + ", type = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getType()) : null) + ", org = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getOrg()) : null) + ", page = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getPage()) : null));
    }
}

