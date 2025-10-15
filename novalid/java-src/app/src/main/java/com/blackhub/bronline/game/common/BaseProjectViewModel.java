package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.resources.StringResource;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseProjectViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/BaseProjectViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
