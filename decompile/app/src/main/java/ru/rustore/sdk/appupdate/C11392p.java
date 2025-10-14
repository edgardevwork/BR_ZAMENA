package ru.rustore.sdk.appupdate;

import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.util.ContextExtKt;

/* renamed from: ru.rustore.sdk.appupdate.p */
/* loaded from: classes8.dex */
public final class C11392p extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11394r f10138a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnection f10139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11392p(C11394r c11394r, ServiceConnection serviceConnection) {
        super(0);
        this.f10138a = c11394r;
        this.f10139b = serviceConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ContextExtKt.unbindServiceSafely(this.f10138a.f10141a, this.f10139b);
        return Unit.INSTANCE;
    }
}
