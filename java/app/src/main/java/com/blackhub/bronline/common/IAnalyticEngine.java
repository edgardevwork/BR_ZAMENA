package com.blackhub.bronline.common;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: IAnalyticEngine.kt */
/* loaded from: classes4.dex */
public interface IAnalyticEngine {
    void pauseSession(@NotNull Activity activity);

    void reportEvent(@NotNull String name, @NotNull String json);

    void resumeSession(@NotNull Activity activity);

    void setNickServer(@NotNull String nickServer);

    void setUserId(@NotNull String id);
}

