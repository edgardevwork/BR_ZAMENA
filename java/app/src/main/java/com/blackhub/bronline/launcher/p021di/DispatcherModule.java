package com.blackhub.bronline.launcher.p021di;

import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: DispatchersModule.kt */
@StabilityInferred(parameters = 1)
@Module
/* loaded from: classes3.dex */
public final class DispatcherModule {
    public static final int $stable = 0;

    @Provides
    @DefaultDispatcher
    @NotNull
    public final CoroutineDispatcher providesDefaultDispatcher() {
        return Dispatchers.getDefault();
    }

    @Provides
    @IoDispatcher
    @NotNull
    public final CoroutineDispatcher providesIoDispatcher() {
        return Dispatchers.getIO();
    }

    @Provides
    @MainDispatcher
    @NotNull
    public final CoroutineDispatcher providesMainDispatcher() {
        return Dispatchers.getMain();
    }
}

