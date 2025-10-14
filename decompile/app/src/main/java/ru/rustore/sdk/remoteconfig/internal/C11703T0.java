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

/* renamed from: ru.rustore.sdk.remoteconfig.internal.T0 */
/* loaded from: classes5.dex */
public final class C11703T0 implements InterfaceC11766u0 {

    /* renamed from: a */
    public final C11748l0 f10847a;

    /* renamed from: b */
    public final InterfaceC11721b1 f10848b;

    /* renamed from: c */
    public final RemoteConfigClientEventListener f10849c;

    /* renamed from: d */
    public final C11695P f10850d;

    /* renamed from: e */
    public final C11670C0 f10851e;

    /* renamed from: f */
    public final C11752n0 f10852f;

    /* renamed from: g */
    public final Object f10853g;

    /* renamed from: h */
    public boolean f10854h;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.T0$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function1<Unit, Single<RemoteConfig>> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Single<RemoteConfig> invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            C11694O0 c11694o0 = C11703T0.this.f10850d.f10841a;
            c11694o0.getClass();
            return SingleMapErrorKt.mapError(SingleMapKt.map(SingleDoOnSuccessKt.doOnSuccess(SingleMapKt.map(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11692N0(c11694o0)), Dispatchers.INSTANCE.getIo()), C11696P0.f10842a), new C11698Q0(C11703T0.this)), C11699R0.f10844a), C11701S0.f10845a);
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.T0$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final b f10856a = new b();

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

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.T0$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final c f10857a = new c();

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

    public C11703T0(C11748l0 syncWorkerScheduler, InterfaceC11721b1 updatePersistableConfigUseCase, RemoteConfigClientEventListener remoteConfigClientEventListener, C11695P getSnapshotConfigUseCase, C11670C0 sendShortSegmentsUseCase, C11752n0 remoteConfigAnalytics) {
        Intrinsics.checkNotNullParameter(syncWorkerScheduler, "syncWorkerScheduler");
        Intrinsics.checkNotNullParameter(updatePersistableConfigUseCase, "updatePersistableConfigUseCase");
        Intrinsics.checkNotNullParameter(remoteConfigClientEventListener, "remoteConfigClientEventListener");
        Intrinsics.checkNotNullParameter(getSnapshotConfigUseCase, "getSnapshotConfigUseCase");
        Intrinsics.checkNotNullParameter(sendShortSegmentsUseCase, "sendShortSegmentsUseCase");
        Intrinsics.checkNotNullParameter(remoteConfigAnalytics, "remoteConfigAnalytics");
        this.f10847a = syncWorkerScheduler;
        this.f10848b = updatePersistableConfigUseCase;
        this.f10849c = remoteConfigClientEventListener;
        this.f10850d = getSnapshotConfigUseCase;
        this.f10851e = sendShortSegmentsUseCase;
        this.f10852f = remoteConfigAnalytics;
        this.f10853g = new Object();
    }

    @Override // ru.rustore.sdk.remoteconfig.internal.InterfaceC11766u0
    /* renamed from: a */
    public final Task<RemoteConfig> mo7510a() {
        return C11750m0.m7546a(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(SingleMapErrorKt.mapError(Single.INSTANCE.from(new C11707V0(this)), C11709W0.f10868a), Dispatchers.INSTANCE.getIo()), new a())).addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.remoteconfig.internal.T0$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                C11703T0.m7524a(this.f$0, th);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.internal.InterfaceC11766u0
    /* renamed from: b */
    public final Task<Unit> mo7511b() {
        return C11750m0.m7546a(SingleSubscribeOnKt.subscribeOn(SingleMapErrorKt.mapError(Single.INSTANCE.from(new C11707V0(this)), C11709W0.f10868a), Dispatchers.INSTANCE.getIo())).addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.remoteconfig.internal.T0$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                C11703T0.m7525b(this.f$0, th);
            }
        });
    }

    /* renamed from: a */
    public static final void m7524a(C11703T0 this$0, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        SingleSubscribeKt.subscribe$default(this$0.f10852f.m7548a(error), null, b.f10856a, 1, null);
    }

    /* renamed from: b */
    public static final void m7525b(C11703T0 this$0, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        SingleSubscribeKt.subscribe$default(this$0.f10852f.m7548a(error), null, c.f10857a, 1, null);
    }
}
