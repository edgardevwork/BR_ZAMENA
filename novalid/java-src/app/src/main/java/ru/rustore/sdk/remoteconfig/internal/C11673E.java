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

/* renamed from: ru.rustore.sdk.remoteconfig.internal.E */
/* loaded from: classes5.dex */
public final class C11673E implements InterfaceC11766u0 {

    /* renamed from: a */
    public final C11748l0 f10734a;

    /* renamed from: b */
    public final InterfaceC11721b1 f10735b;

    /* renamed from: c */
    public final C11670C0 f10736c;

    /* renamed from: d */
    public final C11693O f10737d;

    /* renamed from: e */
    public final RemoteConfigClientEventListener f10738e;

    /* renamed from: f */
    public final C11752n0 f10739f;

    /* renamed from: g */
    public final Object f10740g;

    /* renamed from: h */
    public boolean f10741h;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.E$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function1<Unit, Single<RemoteConfig>> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Single<RemoteConfig> invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            C11771x c11771x = C11673E.this.f10737d.f10836a;
            c11771x.getClass();
            return SingleMapErrorKt.mapError(SingleMapKt.map(SingleDoOnSuccessKt.doOnSuccess(SingleMapKt.map(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11769w(c11771x)), Dispatchers.INSTANCE.getIo()), C11665A.f10723a), new C11667B(C11673E.this)), C11669C.f10728a), C11671D.f10732a);
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.E$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final b f10743a = new b();

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

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.E$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: a */
        public static final c f10744a = new c();

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

    public C11673E(C11748l0 syncWorkerScheduler, InterfaceC11721b1 updatePersistableConfigUseCase, C11670C0 sendShortSegmentsUseCase, C11693O getDefaultConfigUseCase, RemoteConfigClientEventListener remoteConfigClientEventListener, C11752n0 remoteConfigAnalytics) {
        Intrinsics.checkNotNullParameter(syncWorkerScheduler, "syncWorkerScheduler");
        Intrinsics.checkNotNullParameter(updatePersistableConfigUseCase, "updatePersistableConfigUseCase");
        Intrinsics.checkNotNullParameter(sendShortSegmentsUseCase, "sendShortSegmentsUseCase");
        Intrinsics.checkNotNullParameter(getDefaultConfigUseCase, "getDefaultConfigUseCase");
        Intrinsics.checkNotNullParameter(remoteConfigClientEventListener, "remoteConfigClientEventListener");
        Intrinsics.checkNotNullParameter(remoteConfigAnalytics, "remoteConfigAnalytics");
        this.f10734a = syncWorkerScheduler;
        this.f10735b = updatePersistableConfigUseCase;
        this.f10736c = sendShortSegmentsUseCase;
        this.f10737d = getDefaultConfigUseCase;
        this.f10738e = remoteConfigClientEventListener;
        this.f10739f = remoteConfigAnalytics;
        this.f10740g = new Object();
    }

    @Override // ru.rustore.sdk.remoteconfig.internal.InterfaceC11766u0
    /* renamed from: a */
    public final Task<RemoteConfig> mo7510a() {
        return C11750m0.m7546a(SingleFlatMapKt.flatMap(SingleSubscribeOnKt.subscribeOn(SingleMapErrorKt.mapError(Single.INSTANCE.from(new C11677G(this)), C11679H.f10823a), Dispatchers.INSTANCE.getIo()), new a())).addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.remoteconfig.internal.E$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                C11673E.m7508a(this.f$0, th);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.internal.InterfaceC11766u0
    /* renamed from: b */
    public final Task<Unit> mo7511b() {
        return C11750m0.m7546a(SingleSubscribeOnKt.subscribeOn(SingleMapErrorKt.mapError(Single.INSTANCE.from(new C11677G(this)), C11679H.f10823a), Dispatchers.INSTANCE.getIo())).addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.remoteconfig.internal.E$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                C11673E.m7509b(this.f$0, th);
            }
        });
    }

    /* renamed from: a */
    public static final void m7508a(C11673E this$0, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        SingleSubscribeKt.subscribe$default(this$0.f10739f.m7548a(error), null, b.f10743a, 1, null);
    }

    /* renamed from: b */
    public static final void m7509b(C11673E this$0, Throwable error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        SingleSubscribeKt.subscribe$default(this$0.f10739f.m7548a(error), null, c.f10744a, 1, null);
    }
}
