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

/* renamed from: ru.rustore.sdk.remoteconfig.internal.G */
/* loaded from: classes6.dex */
public final class C11677G extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11673E f10755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11677G(C11673E c11673e) {
        super(0);
        this.f10755a = c11673e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RemoteConfigClientEventListener remoteConfigClientEventListener;
        C11673E c11673e = this.f10755a;
        synchronized (c11673e.f10740g) {
            try {
                if (!c11673e.f10741h) {
                    int iM7531a = C11718a1.m7531a(c11673e.f10735b.invoke());
                    if (iM7531a == 1) {
                        c11673e.f10738e.firstLoadComplete();
                        remoteConfigClientEventListener = c11673e.f10738e;
                    } else if (iM7531a != 2) {
                        c11673e.f10734a.m7545b();
                        C11752n0 c11752n0 = c11673e.f10739f;
                        C11754o0 event = new C11754o0("sdkInfo", (Map) c11752n0.f10962c.getValue());
                        C11764t0 c11764t0 = c11752n0.f10960a;
                        c11764t0.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11758q0(c11764t0, event)), new C11760r0(c11764t0)), Dispatchers.INSTANCE.getIo()), C11762s0.f10974a), null, C11675F.f10746a, 1, null);
                        c11673e.f10738e.initComplete();
                        c11673e.f10741h = true;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        remoteConfigClientEventListener = c11673e.f10738e;
                    }
                    remoteConfigClientEventListener.persistentStorageUpdated();
                    c11673e.f10734a.m7545b();
                    C11752n0 c11752n02 = c11673e.f10739f;
                    C11754o0 event2 = new C11754o0("sdkInfo", (Map) c11752n02.f10962c.getValue());
                    C11764t0 c11764t02 = c11752n02.f10960a;
                    c11764t02.getClass();
                    Intrinsics.checkNotNullParameter(event2, "event");
                    SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11758q0(c11764t02, event2)), new C11760r0(c11764t02)), Dispatchers.INSTANCE.getIo()), C11762s0.f10974a), null, C11675F.f10746a, 1, null);
                    c11673e.f10738e.initComplete();
                    c11673e.f10741h = true;
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }
}
