package ru.rustore.sdk.reactive.core;

import com.blackhub.bronline.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchersPlugin.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m7105d2 = {"Lru/rustore/sdk/reactive/core/DispatchersPlugin;", "", "()V", "value", "Lru/rustore/sdk/reactive/core/Dispatcher;", "io", "getIo", "()Lru/rustore/sdk/reactive/core/Dispatcher;", "setIo", "(Lru/rustore/sdk/reactive/core/Dispatcher;)V", BuildConfig.CDN_USERNAME, "getMain", "setMain", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class DispatchersPlugin {

    @NotNull
    public static final DispatchersPlugin INSTANCE = new DispatchersPlugin();

    @Nullable
    public static Dispatcher io;

    @Nullable
    public static Dispatcher main;

    @Nullable
    public final Dispatcher getMain() {
        Dispatcher dispatcher;
        synchronized (this) {
            dispatcher = main;
        }
        return dispatcher;
    }

    public final void setMain(@Nullable Dispatcher dispatcher) {
        synchronized (this) {
            main = dispatcher;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public final Dispatcher getIo() {
        Dispatcher dispatcher;
        synchronized (this) {
            dispatcher = io;
        }
        return dispatcher;
    }

    public final void setIo(@Nullable Dispatcher dispatcher) {
        synchronized (this) {
            io = dispatcher;
            Unit unit = Unit.INSTANCE;
        }
    }
}
