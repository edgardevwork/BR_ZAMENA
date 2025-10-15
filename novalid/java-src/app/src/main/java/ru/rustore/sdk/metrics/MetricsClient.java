package ru.rustore.sdk.metrics;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.metrics.internal.C11605X;
import ru.rustore.sdk.metrics.internal.C11626m;
import ru.rustore.sdk.metrics.internal.C11627n;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, m7105d2 = {"Lru/rustore/sdk/metrics/MetricsClient;", "", "Lru/rustore/sdk/metrics/internal/n;", "metricsClientController", SegmentConstantPool.INITSTRING, "(Lru/rustore/sdk/metrics/internal/n;)V", "Lru/rustore/sdk/metrics/MetricsEvent;", "metricsEvent", "Lru/rustore/sdk/reactive/single/Single;", "", "send", "(Lru/rustore/sdk/metrics/MetricsEvent;)Lru/rustore/sdk/reactive/single/Single;", "Lru/rustore/sdk/metrics/internal/n;", "Companion", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes7.dex */
public final class MetricsClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final C11627n metricsClientController;

    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/metrics/MetricsClient$Companion;", "", "()V", "getInstance", "Lru/rustore/sdk/metrics/MetricsClient;", "context", "Landroid/content/Context;", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public final MetricsClient getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return C11605X.f10657c.m7492a(context).f10660b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MetricsClient(C11627n metricsClientController) {
        Intrinsics.checkNotNullParameter(metricsClientController, "metricsClientController");
        this.metricsClientController = metricsClientController;
    }

    public final Single<Unit> send(MetricsEvent metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        C11627n c11627n = this.metricsClientController;
        c11627n.getClass();
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        return SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11626m(c11627n, metricsEvent)), c11627n.f10686d);
    }
}
