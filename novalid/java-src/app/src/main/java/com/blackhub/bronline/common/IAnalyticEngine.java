package com.blackhub.bronline.common;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: IAnalyticEngine.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/common/IAnalyticEngine;", "", "pauseSession", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "reportEvent", "name", "", "json", "resumeSession", "setNickServer", "nickServer", "setUserId", "id", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface IAnalyticEngine {
    void pauseSession(@NotNull Activity activity);

    void reportEvent(@NotNull String name, @NotNull String json);

    void resumeSession(@NotNull Activity activity);

    void setNickServer(@NotNull String nickServer);

    void setUserId(@NotNull String id);
}
