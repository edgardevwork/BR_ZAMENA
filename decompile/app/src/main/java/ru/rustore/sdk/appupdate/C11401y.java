package ru.rustore.sdk.appupdate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.reactive.single.Single;

/* renamed from: ru.rustore.sdk.appupdate.y */
/* loaded from: classes8.dex */
public final class C11401y extends Lambda implements Function1<Unit, Single<Unit>> {

    /* renamed from: a */
    public final /* synthetic */ C11394r f10152a;

    /* renamed from: b */
    public final /* synthetic */ int f10153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11401y(C11394r c11394r, int i) {
        super(1);
        this.f10152a = c11394r;
        this.f10153b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<Unit> invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        C11394r c11394r = this.f10152a;
        int i = this.f10153b;
        c11394r.getClass();
        return Single.INSTANCE.create(new C11343D(c11394r, i));
    }
}
