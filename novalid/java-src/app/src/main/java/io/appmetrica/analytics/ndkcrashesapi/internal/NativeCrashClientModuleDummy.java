package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, m7105d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientModuleDummy;", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientModule;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientConfig;", "config", "", "initHandling", "", "metadata", "updateAppMetricaMetadata", SegmentConstantPool.INITSTRING, "()V", "ndkcrashes-api_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class NativeCrashClientModuleDummy extends NativeCrashClientModule {
    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule
    public void initHandling(@NotNull Context context, @NotNull NativeCrashClientConfig config) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule
    public void updateAppMetricaMetadata(@NotNull String metadata) {
    }
}
