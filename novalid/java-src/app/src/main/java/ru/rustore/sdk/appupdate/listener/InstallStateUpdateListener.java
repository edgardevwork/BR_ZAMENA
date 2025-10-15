package ru.rustore.sdk.appupdate.listener;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.InstallState;

@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m7105d2 = {"Lru/rustore/sdk/appupdate/listener/InstallStateUpdateListener;", "", "onStateUpdated", "", "state", "Lru/rustore/sdk/appupdate/model/InstallState;", "sdk-public-appupdate_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface InstallStateUpdateListener {
    void onStateUpdated(@NotNull InstallState state);
}
