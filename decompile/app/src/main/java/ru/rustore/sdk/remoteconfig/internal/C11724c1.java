package ru.rustore.sdk.remoteconfig.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.json.JSONException;
import ru.rustore.sdk.remoteconfig.BuildConfig;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;
import ru.rustore.sdk.remoteconfig.internal.AbstractC11730d0;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.c1 */
/* loaded from: classes5.dex */
public final class C11724c1 implements InterfaceC11721b1 {

    /* renamed from: a */
    public final C11715Z0 f10896a;

    /* renamed from: b */
    public final C11720b0 f10897b;

    /* renamed from: c */
    public final C11744j0 f10898c;

    /* renamed from: d */
    public final C11702T f10899d;

    /* renamed from: e */
    public final long f10900e;

    public C11724c1(C11715Z0 timeRepository, C11720b0 networkConfigRepository, C11744j0 persistableConfigRepository, C11702T minAvailableUpdateIntervalRepository, long j) {
        Intrinsics.checkNotNullParameter(timeRepository, "timeRepository");
        Intrinsics.checkNotNullParameter(networkConfigRepository, "networkConfigRepository");
        Intrinsics.checkNotNullParameter(persistableConfigRepository, "persistableConfigRepository");
        Intrinsics.checkNotNullParameter(minAvailableUpdateIntervalRepository, "minAvailableUpdateIntervalRepository");
        this.f10896a = timeRepository;
        this.f10897b = networkConfigRepository;
        this.f10898c = persistableConfigRepository;
        this.f10899d = minAvailableUpdateIntervalRepository;
        this.f10900e = j;
    }

    /* renamed from: a */
    public final boolean m7535a(long j) {
        Duration durationM17023boximpl = Duration.m17023boximpl(this.f10900e);
        this.f10899d.f10846a.getClass();
        Duration.Companion companion = Duration.INSTANCE;
        Integer MIN_AVAILABLE_UPDATE_INTERVAL = BuildConfig.MIN_AVAILABLE_UPDATE_INTERVAL;
        Intrinsics.checkNotNullExpressionValue(MIN_AVAILABLE_UPDATE_INTERVAL, "MIN_AVAILABLE_UPDATE_INTERVAL");
        long jM17046getInWholeSecondsimpl = Duration.m17046getInWholeSecondsimpl(((Duration) RangesKt___RangesKt.coerceAtLeast(durationM17023boximpl, Duration.m17023boximpl(DurationKt.toDuration(MIN_AVAILABLE_UPDATE_INTERVAL.intValue(), DurationUnit.SECONDS)))).getRawValue());
        this.f10896a.f10882a.getClass();
        return (System.currentTimeMillis() / ((long) 1000)) - j > jM17046getInWholeSecondsimpl;
    }

    @Override // ru.rustore.sdk.remoteconfig.internal.InterfaceC11721b1
    public final int invoke() {
        C11733e0 c11733e0;
        int i;
        synchronized (this) {
            try {
                C11744j0 c11744j0 = this.f10898c;
                C11738g0 dto = c11744j0.f10938a.m7538a();
                if (dto != null) {
                    c11744j0.f10940c.getClass();
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    c11733e0 = new C11733e0(dto.f10927a, dto.f10928b, dto.f10929c, dto.f10930d);
                } else {
                    c11733e0 = null;
                }
                i = c11733e0 == null ? 2 : m7535a(c11733e0.f10917a) ? 3 : 1;
                if (i != 1) {
                    m7534a(c11733e0);
                }
            } finally {
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void m7534a(C11733e0 persistableConfig) throws JSONException, RemoteConfigException.RemoteConfigNetworkException {
        C11708W c11708w;
        C11704U c11704u;
        C11720b0 c11720b0 = this.f10897b;
        if (persistableConfig != null) {
            c11720b0.f10889c.getClass();
            Intrinsics.checkNotNullParameter(persistableConfig, "persistableConfig");
            c11708w = new C11708W(persistableConfig.f10918b, persistableConfig.f10919c, persistableConfig.f10920d);
        } else {
            c11708w = null;
        }
        AbstractC11730d0 abstractC11730d0M7526a = c11720b0.f10887a.m7526a(c11708w);
        if (abstractC11730d0M7526a instanceof AbstractC11730d0.a) {
            C11717a0 c11717a0 = c11720b0.f10888b;
            C11708W dto = ((AbstractC11730d0.a) abstractC11730d0M7526a).f10914a;
            c11717a0.getClass();
            Intrinsics.checkNotNullParameter(dto, "dto");
            c11704u = new C11704U(dto.f10865a, dto.f10866b, dto.f10867c);
        } else if (abstractC11730d0M7526a instanceof AbstractC11730d0.b) {
            C11717a0 c11717a02 = c11720b0.f10888b;
            C11708W dto2 = ((AbstractC11730d0.b) abstractC11730d0M7526a).f10915a;
            c11717a02.getClass();
            Intrinsics.checkNotNullParameter(dto2, "dto");
            c11704u = new C11704U(dto2.f10865a, dto2.f10866b, dto2.f10867c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C11736f0 c11736f0 = this.f10898c.f10938a;
        synchronized (c11736f0) {
            try {
                C11687L c11687l = c11736f0.f10924a;
                Set filesToDelete = CollectionsKt___CollectionsKt.toSet(c11687l.m7522a());
                Intrinsics.checkNotNullParameter(filesToDelete, "filesToDelete");
                List<C11689M> listM7522a = c11687l.m7522a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM7522a) {
                    if (filesToDelete.contains((C11689M) obj)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C11689M) it.next()).f10833a.delete();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C11744j0 c11744j0 = this.f10898c;
        Map<String, String> data = c11704u.f10858a;
        C11759r configMetadata = c11704u.f10859b;
        String shortSegments = c11704u.f10860c;
        c11744j0.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configMetadata, "configMetadata");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        c11744j0.f10939b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        c11744j0.f10941d.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configMetadata, "configMetadata");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        C11733e0 persistableConfig2 = new C11733e0(jCurrentTimeMillis, data, configMetadata, shortSegments);
        c11744j0.f10940c.getClass();
        Intrinsics.checkNotNullParameter(persistableConfig2, "persistableConfig");
        c11744j0.f10938a.m7539a(new C11738g0(jCurrentTimeMillis, data, configMetadata, shortSegments));
    }
}
