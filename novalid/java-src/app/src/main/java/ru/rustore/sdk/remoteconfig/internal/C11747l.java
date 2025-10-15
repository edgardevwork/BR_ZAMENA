package ru.rustore.sdk.remoteconfig.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDoOnSuccessKt;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.remoteconfig.RemoteConfig;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.l */
/* loaded from: classes5.dex */
public final class C11747l implements InterfaceC11766u0 {

    /* renamed from: a */
    public final C11748l0 f10944a;

    /* renamed from: b */
    public final C11691N f10945b;

    /* renamed from: c */
    public final RemoteConfigClientEventListener f10946c;

    /* renamed from: d */
    public final C11752n0 f10947d;

    /* renamed from: e */
    public final C11670C0 f10948e;

    /* renamed from: f */
    public final Object f10949f;

    /* renamed from: g */
    public boolean f10950g;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.l$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function1<Unit, Single<RemoteConfig>> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Single<RemoteConfig> invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            C11739h c11739h = C11747l.this.f10945b.f10834a;
            c11739h.getClass();
            return SingleMapErrorKt.mapError(SingleMapKt.map(SingleDoOnSuccessKt.doOnSuccess(SingleSubscribeOnKt.subscribeOn(SingleMapKt.map(Single.INSTANCE.from(new C11735f(c11739h)), new C11737g(c11739h)), Dispatchers.INSTANCE.getIo()), new C11741i(C11747l.this)), C11743j.f10937a), C11745k.f10942a);
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.l$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final b f10952a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.l$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final c f10953a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public C11747l(C11748l0 syncWorkerScheduler, C11691N getActualConfigUseCase, RemoteConfigClientEventListener remoteConfigClientEventListener, C11752n0 remoteConfigAnalytics, C11670C0 sendShortSegmentsUseCase) {
        Intrinsics.checkNotNullParameter(syncWorkerScheduler, "syncWorkerScheduler");
        Intrinsics.checkNotNullParameter(getActualConfigUseCase, "getActualConfigUseCase");
        Intrinsics.checkNotNullParameter(remoteConfigClientEventListener, "remoteConfigClientEventListener");
        Intrinsics.checkNotNullParameter(remoteConfigAnalytics, "remoteConfigAnalytics");
        Intrinsics.checkNotNullParameter(sendShortSegmentsUseCase, "sendShortSegmentsUseCase");
        this.f10944a = syncWorkerScheduler;
        this.f10945b = getActualConfigUseCase;
        this.f10946c = remoteConfigClientEventListener;
        this.f10947d = remoteConfigAnalytics;
        this.f10948e = sendShortSegmentsUseCase;
        this.f10949f = new Object();
    }

    @Override // ru.rustore.sdk.remoteconfig.internal.InterfaceC11766u0
    /* renamed from: a */
    public final Task<RemoteConfig> mo7510a() {
        return C11750m0.m7546a(SingleFlatMapKt.flatMap(SingleMapErrorKt.mapError(Single.INSTANCE.from(new C11751n(this)), C11753o.f10964a), new a())).addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.remoteconfig.internal.l$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                C11747l.m7542a(this.f$0, th);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.internal.InterfaceC11766u0
    /* renamed from: b */
    public final Task<Unit> mo7511b() {
        return C11750m0.m7546a(SingleMapErrorKt.mapError(Single.INSTANCE.from(new C11751n(this)), C11753o.f10964a)).addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.remoteconfig.internal.l$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                C11747l.m7543b(this.f$0, th);
            }
        });
    }

    /* renamed from: a */
    public static final void m7542a(C11747l this$0, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        SingleSubscribeKt.subscribe$default(this$0.f10947d.m7548a(error), null, b.f10952a, 1, null);
    }

    /* renamed from: b */
    public static final void m7543b(C11747l this$0, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        SingleSubscribeKt.subscribe$default(this$0.f10947d.m7548a(error), null, c.f10953a, 1, null);
    }
}
