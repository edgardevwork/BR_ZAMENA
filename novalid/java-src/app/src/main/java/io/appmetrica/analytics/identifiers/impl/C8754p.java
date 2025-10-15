package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.identifiers.impl.p */
/* loaded from: classes7.dex */
public final class C8754p extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C8754p f6292a = new C8754p();

    public C8754p() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = AbstractBinderC8758t.f6296a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8759u)) ? new C8757s(iBinder) : (InterfaceC8759u) iInterfaceQueryLocalInterface;
    }
}
