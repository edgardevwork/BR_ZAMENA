package io.appmetrica.analytics.ndkcrashesapi.internal;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f¨\u0006\u001e"}, m7105d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash;", "", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "a", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "getSource", "()Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "source", "", "b", "Ljava/lang/String;", "getHandlerVersion", "()Ljava/lang/String;", "handlerVersion", "c", "getUuid", CommonUrlParts.UUID, "d", "getDumpFile", "dumpFile", "", "e", "J", "getCreationTime", "()J", "creationTime", "f", "getMetadata", "metadata", "Builder", "ndkcrashes-api_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class NativeCrash {

    /* renamed from: a, reason: from kotlin metadata */
    private final NativeCrashSource source;

    /* renamed from: b, reason: from kotlin metadata */
    private final String handlerVersion;

    /* renamed from: c, reason: from kotlin metadata */
    private final String uuid;

    /* renamed from: d, reason: from kotlin metadata */
    private final String dumpFile;

    /* renamed from: e, reason: from kotlin metadata */
    private final long creationTime;

    /* renamed from: f, reason: from kotlin metadata */
    private final String metadata;

    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, m7105d2 = {"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash$Builder;", "", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash;", "build", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;", "source", "", "handlerVersion", CommonUrlParts.UUID, "dumpFile", "", "creationTime", "metadata", SegmentConstantPool.INITSTRING, "(Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "ndkcrashes-api_release"}, m7106k = 1, m7107mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a */
        private final NativeCrashSource f9517a;

        /* renamed from: b */
        private final String f9518b;

        /* renamed from: c */
        private final String f9519c;

        /* renamed from: d */
        private final String f9520d;

        /* renamed from: e */
        private final long f9521e;

        /* renamed from: f */
        private final String f9522f;

        public Builder(@NotNull NativeCrashSource nativeCrashSource, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
            this.f9517a = nativeCrashSource;
            this.f9518b = str;
            this.f9519c = str2;
            this.f9520d = str3;
            this.f9521e = j;
            this.f9522f = str4;
        }

        @NotNull
        public final NativeCrash build() {
            return new NativeCrash(this.f9517a, this.f9518b, this.f9519c, this.f9520d, this.f9521e, this.f9522f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCrashSource, str, str2, str3, j, str4);
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    @NotNull
    public final String getDumpFile() {
        return this.dumpFile;
    }

    @NotNull
    public final String getHandlerVersion() {
        return this.handlerVersion;
    }

    @NotNull
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final NativeCrashSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, String str4) {
        this.source = nativeCrashSource;
        this.handlerVersion = str;
        this.uuid = str2;
        this.dumpFile = str3;
        this.creationTime = j;
        this.metadata = str4;
    }
}
