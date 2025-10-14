package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.V0 */
/* loaded from: classes6.dex */
public final class C11707V0 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11703T0 f10864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11707V0(C11703T0 c11703t0) {
        super(0);
        this.f10864a = c11703t0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RemoteConfigClientEventListener remoteConfigClientEventListener;
        C11703T0 c11703t0 = this.f10864a;
        synchronized (c11703t0.f10853g) {
            try {
                if (!c11703t0.f10854h) {
                    int iM7531a = C11718a1.m7531a(c11703t0.f10848b.invoke());
                    if (iM7531a == 1) {
                        c11703t0.f10849c.firstLoadComplete();
                        remoteConfigClientEventListener = c11703t0.f10849c;
                    } else if (iM7531a != 2) {
                        c11703t0.f10847a.m7545b();
                        C11752n0 c11752n0 = c11703t0.f10852f;
                        C11754o0 event = new C11754o0("sdkInfo", (Map) c11752n0.f10962c.getValue());
                        C11764t0 c11764t0 = c11752n0.f10960a;
                        c11764t0.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11758q0(c11764t0, event)), new C11760r0(c11764t0)), Dispatchers.INSTANCE.getIo()), C11762s0.f10974a), null, C11705U0.f10861a, 1, null);
                        c11703t0.f10849c.initComplete();
                        c11703t0.f10854h = true;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        remoteConfigClientEventListener = c11703t0.f10849c;
                    }
                    remoteConfigClientEventListener.persistentStorageUpdated();
                    c11703t0.f10847a.m7545b();
                    C11752n0 c11752n02 = c11703t0.f10852f;
                    C11754o0 event2 = new C11754o0("sdkInfo", (Map) c11752n02.f10962c.getValue());
                    C11764t0 c11764t02 = c11752n02.f10960a;
                    c11764t02.getClass();
                    Intrinsics.checkNotNullParameter(event2, "event");
                    SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11758q0(c11764t02, event2)), new C11760r0(c11764t02)), Dispatchers.INSTANCE.getIo()), C11762s0.f10974a), null, C11705U0.f10861a, 1, null);
                    c11703t0.f10849c.initComplete();
                    c11703t0.f10854h = true;
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }
}
