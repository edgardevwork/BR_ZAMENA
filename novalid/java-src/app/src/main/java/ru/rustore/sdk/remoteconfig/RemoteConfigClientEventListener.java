package ru.rustore.sdk.remoteconfig;

import kotlin.Metadata;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigClientEventListener;", "", "backgroundJobErrors", "", "exception", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$BackgroundConfigUpdateError;", "firstLoadComplete", "initComplete", "memoryCacheUpdated", "persistentStorageUpdated", "remoteConfigNetworkRequestFailure", "throwable", "", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface RemoteConfigClientEventListener {
    void backgroundJobErrors(RemoteConfigException.BackgroundConfigUpdateError exception);

    void firstLoadComplete();

    void initComplete();

    void memoryCacheUpdated();

    void persistentStorageUpdated();

    void remoteConfigNetworkRequestFailure(Throwable throwable);
}
