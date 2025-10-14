package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* renamed from: io.appmetrica.analytics.impl.vc */
/* loaded from: classes7.dex */
public abstract class AbstractC9928vc {
    /* renamed from: a */
    public abstract void mo6350a(int i);

    /* renamed from: a */
    public final synchronized void m6896a(Context context) {
        try {
            int iMo6351b = mo6351b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (iMo6351b != libraryApiLevel) {
                if (iMo6351b < libraryApiLevel) {
                    SparseArray sparseArrayMo6352c = mo6352c();
                    while (true) {
                        iMo6351b++;
                        if (iMo6351b > libraryApiLevel) {
                            break;
                        }
                        InterfaceC9903uc interfaceC9903uc = (InterfaceC9903uc) sparseArrayMo6352c.get(iMo6351b);
                        if (interfaceC9903uc != null) {
                            interfaceC9903uc.mo4971a(context);
                        }
                    }
                }
                mo6350a(libraryApiLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public abstract int mo6351b();

    /* renamed from: c */
    public abstract SparseArray mo6352c();

    /* renamed from: a */
    public final int m6895a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
