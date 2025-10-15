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

/* renamed from: ru.rustore.sdk.remoteconfig.internal.n */
/* loaded from: classes6.dex */
public final class C11751n extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11747l f10959a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11751n(C11747l c11747l) {
        super(0);
        this.f10959a = c11747l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11747l c11747l = this.f10959a;
        synchronized (c11747l.f10949f) {
            if (!c11747l.f10950g) {
                c11747l.f10944a.m7544a();
                C11752n0 c11752n0 = c11747l.f10947d;
                C11754o0 event = new C11754o0("sdkInfo", (Map) c11752n0.f10962c.getValue());
                C11764t0 c11764t0 = c11752n0.f10960a;
                c11764t0.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11758q0(c11764t0, event)), new C11760r0(c11764t0)), Dispatchers.INSTANCE.getIo()), C11762s0.f10974a), null, C11749m.f10956a, 1, null);
                c11747l.f10946c.initComplete();
                c11747l.f10950g = true;
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
