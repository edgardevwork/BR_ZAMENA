package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.resources.StringResource;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseProjectViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class BaseProjectViewModel extends ViewModel {
    public static final int $stable = 8;

    @Nullable
    public final LocalNotification localNotification;

    @Nullable
    public final StringResource stringResource;

    @Nullable
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Nullable
    public StringResource getStringResource() {
        return this.stringResource;
    }
}

