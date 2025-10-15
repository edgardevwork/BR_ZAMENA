package ru.rustore.sdk.activitylauncher;

import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnReceiveResultCallback.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m7105d2 = {"Lru/rustore/sdk/activitylauncher/OnReceiveResultCallback;", "", "onReceiveResult", "", "launcherResult", "Lru/rustore/sdk/activitylauncher/ActivityLauncherResult;", "resultData", "Landroid/os/Bundle;", "sdk-public-activitylauncher_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface OnReceiveResultCallback {
    void onReceiveResult(@NotNull ActivityLauncherResult launcherResult, @Nullable Bundle resultData);
}
