package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import java.io.File;
import kotlin.Unit;

/* renamed from: io.appmetrica.analytics.impl.aa */
/* loaded from: classes6.dex */
public final class C9401aa {

    /* renamed from: a */
    public volatile Boolean f7719a;

    /* renamed from: a */
    public final void m5853a(Context context) {
        if (this.f7719a == null) {
            synchronized (this) {
                try {
                    if (this.f7719a == null) {
                        boolean z = false;
                        try {
                            File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                            boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                            boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                            if (zExists || zExists2) {
                                z = true;
                            }
                        } catch (Throwable unused) {
                        }
                        this.f7719a = Boolean.valueOf(z);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
