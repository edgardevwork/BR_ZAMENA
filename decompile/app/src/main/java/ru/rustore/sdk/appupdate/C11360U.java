package ru.rustore.sdk.appupdate;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: ru.rustore.sdk.appupdate.U */
/* loaded from: classes7.dex */
public final class C11360U extends Lambda implements Function0<C11394r> {

    /* renamed from: a */
    public final /* synthetic */ Context f10064a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11360U(Context context) {
        super(0);
        this.f10064a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11394r invoke() {
        C11383i0 c11383i0 = new C11383i0();
        return new C11394r(this.f10064a, new C11391o(new AppUpdateInfo.Factory(c11383i0), c11383i0));
    }
}
