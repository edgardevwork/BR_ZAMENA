package com.blackhub.bronline.game.gui.socialaction;

import android.util.Log;
import com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocialUtils.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, m7105d2 = {"logThisAction", "", "thisAction", "Lcom/blackhub/bronline/game/gui/socialaction/data/SocialInteraction;", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class SocialUtilsKt {
    public static final void logThisAction(@Nullable SocialInteraction socialInteraction) {
        Log.v(SocialConstants.LOG_TAG, "id = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getId()) : null) + ", name = " + (socialInteraction != null ? socialInteraction.getName() : null) + ", type = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getType()) : null) + ", org = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getOrg()) : null) + ", page = " + (socialInteraction != null ? Integer.valueOf(socialInteraction.getPage()) : null));
    }
}
