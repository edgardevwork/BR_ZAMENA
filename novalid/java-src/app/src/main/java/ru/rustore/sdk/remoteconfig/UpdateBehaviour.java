package ru.rustore.sdk.remoteconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;

@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/UpdateBehaviour;", "", "()V", "Actual", "Default", "Snapshot", "Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Actual;", "Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Default;", "Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Snapshot;", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public abstract class UpdateBehaviour {

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Actual;", "Lru/rustore/sdk/remoteconfig/UpdateBehaviour;", "()V", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Actual extends UpdateBehaviour {
        public static final Actual INSTANCE = new Actual();

        public Actual() {
            super(null);
        }
    }

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Default;", "Lru/rustore/sdk/remoteconfig/UpdateBehaviour;", "minUpdateInterval", "Lkotlin/time/Duration;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinUpdateInterval-UwyO8pc", "()J", "J", "component1", "component1-UwyO8pc", "copy", "copy-LRDsOJo", "(J)Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Default;", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class Default extends UpdateBehaviour {
        public final long minUpdateInterval;

        public Default(long j) {
            super(null);
            this.minUpdateInterval = j;
        }

        /* renamed from: copy-LRDsOJo$default */
        public static /* synthetic */ Default m17662copyLRDsOJo$default(Default r0, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = r0.minUpdateInterval;
            }
            return r0.m17664copyLRDsOJo(j);
        }

        /* renamed from: component1-UwyO8pc, reason: from getter */
        public final long getMinUpdateInterval() {
            return this.minUpdateInterval;
        }

        /* renamed from: copy-LRDsOJo */
        public final Default m17664copyLRDsOJo(long minUpdateInterval) {
            return new Default(minUpdateInterval, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && Duration.m17030equalsimpl0(this.minUpdateInterval, ((Default) other).minUpdateInterval);
        }

        /* renamed from: getMinUpdateInterval-UwyO8pc */
        public final long m17665getMinUpdateIntervalUwyO8pc() {
            return this.minUpdateInterval;
        }

        public int hashCode() {
            return Duration.m17053hashCodeimpl(this.minUpdateInterval);
        }

        public String toString() {
            return "Default(minUpdateInterval=" + ((Object) Duration.m17074toStringimpl(this.minUpdateInterval)) + ')';
        }

        public /* synthetic */ Default(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Snapshot;", "Lru/rustore/sdk/remoteconfig/UpdateBehaviour;", "minUpdateInterval", "Lkotlin/time/Duration;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinUpdateInterval-UwyO8pc", "()J", "J", "component1", "component1-UwyO8pc", "copy", "copy-LRDsOJo", "(J)Lru/rustore/sdk/remoteconfig/UpdateBehaviour$Snapshot;", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class Snapshot extends UpdateBehaviour {
        public final long minUpdateInterval;

        public Snapshot(long j) {
            super(null);
            this.minUpdateInterval = j;
        }

        /* renamed from: copy-LRDsOJo$default */
        public static /* synthetic */ Snapshot m17666copyLRDsOJo$default(Snapshot snapshot, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = snapshot.minUpdateInterval;
            }
            return snapshot.m17668copyLRDsOJo(j);
        }

        /* renamed from: component1-UwyO8pc, reason: from getter */
        public final long getMinUpdateInterval() {
            return this.minUpdateInterval;
        }

        /* renamed from: copy-LRDsOJo */
        public final Snapshot m17668copyLRDsOJo(long minUpdateInterval) {
            return new Snapshot(minUpdateInterval, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Snapshot) && Duration.m17030equalsimpl0(this.minUpdateInterval, ((Snapshot) other).minUpdateInterval);
        }

        /* renamed from: getMinUpdateInterval-UwyO8pc */
        public final long m17669getMinUpdateIntervalUwyO8pc() {
            return this.minUpdateInterval;
        }

        public int hashCode() {
            return Duration.m17053hashCodeimpl(this.minUpdateInterval);
        }

        public String toString() {
            return "Snapshot(minUpdateInterval=" + ((Object) Duration.m17074toStringimpl(this.minUpdateInterval)) + ')';
        }

        public /* synthetic */ Snapshot(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    public UpdateBehaviour() {
    }

    public /* synthetic */ UpdateBehaviour(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
