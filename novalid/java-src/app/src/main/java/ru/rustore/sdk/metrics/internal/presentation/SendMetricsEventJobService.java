package ru.rustore.sdk.metrics.internal.presentation;

import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.metrics.internal.C11605X;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDoOnDisposeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lru/rustore/sdk/metrics/internal/presentation/SendMetricsEventJobService;", "Landroid/app/job/JobService;", SegmentConstantPool.INITSTRING, "()V", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes8.dex */
public final class SendMetricsEventJobService extends JobService {

    /* renamed from: a */
    public final Lazy f10691a = LazyKt__LazyJVMKt.lazy(new C11630a());

    /* renamed from: b */
    public Disposable f10692b;

    /* renamed from: c */
    public volatile boolean f10693c;

    /* renamed from: ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService$a */
    /* loaded from: classes5.dex */
    public static final class C11630a extends Lambda implements Function0<C11605X> {
        public C11630a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11605X invoke() {
            return C11605X.f10657c.m7492a(SendMetricsEventJobService.this);
        }
    }

    /* renamed from: ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService$b */
    /* loaded from: classes5.dex */
    public static final class C11631b extends Lambda implements Function0<Unit> {
        public C11631b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((C11605X) SendMetricsEventJobService.this.f10691a.getValue()).f10659a.m7490a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService$c */
    /* loaded from: classes5.dex */
    public static final class C11632c extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        public final /* synthetic */ JobParameters f10697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11632c(JobParameters jobParameters) {
            super(0);
            this.f10697b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SendMetricsEventJobService.m7498a(SendMetricsEventJobService.this, this.f10697b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService$d */
    /* loaded from: classes5.dex */
    public static final class C11633d extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public final /* synthetic */ JobParameters f10699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11633d(JobParameters jobParameters) {
            super(1);
            this.f10699b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
            SendMetricsEventJobService.m7498a(SendMetricsEventJobService.this, this.f10699b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService$e */
    /* loaded from: classes5.dex */
    public static final class C11634e extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: b */
        public final /* synthetic */ JobParameters f10701b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11634e(JobParameters jobParameters) {
            super(1);
            this.f10701b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            SendMetricsEventJobService.m7498a(SendMetricsEventJobService.this, this.f10701b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final void m7498a(SendMetricsEventJobService sendMetricsEventJobService, JobParameters jobParameters) {
        if (sendMetricsEventJobService.f10693c) {
            return;
        }
        sendMetricsEventJobService.jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f10692b = SingleSubscribeKt.subscribe(SingleDoOnDisposeKt.doOnDispose(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11631b()), Dispatchers.INSTANCE.getIo()), new C11632c(params)), new C11633d(params), new C11634e(params));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.f10693c = true;
        Disposable disposable = this.f10692b;
        if (disposable != null) {
            disposable.dispose();
        }
        return true;
    }
}
