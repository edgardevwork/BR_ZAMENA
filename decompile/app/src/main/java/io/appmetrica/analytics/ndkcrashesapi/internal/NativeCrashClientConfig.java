package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, m7105d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashClientConfig;", "", "", "a", "Ljava/lang/String;", "getNativeCrashFolder", "()Ljava/lang/String;", "nativeCrashFolder", "b", "getNativeCrashMetadata", "nativeCrashMetadata", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "ndkcrashes-api_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class NativeCrashClientConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final String nativeCrashFolder;

    /* renamed from: b, reason: from kotlin metadata */
    private final String nativeCrashMetadata;

    public NativeCrashClientConfig(@NotNull String str, @NotNull String str2) {
        this.nativeCrashFolder = str;
        this.nativeCrashMetadata = str2;
    }

    @NotNull
    public final String getNativeCrashFolder() {
        return this.nativeCrashFolder;
    }

    @NotNull
    public final String getNativeCrashMetadata() {
        return this.nativeCrashMetadata;
    }
}
