package io.appmetrica.analytics.logger.common;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.C10069a;
import io.appmetrica.analytics.logger.common.impl.C10070b;
import io.appmetrica.analytics.logger.common.impl.C10071c;
import io.appmetrica.analytics.logger.common.impl.C10072d;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class BaseImportantLogger {

    /* renamed from: a */
    private final C10071c f9488a;

    public BaseImportantLogger(@NonNull String str) {
        this.f9488a = new C10071c(new C10072d(str), new C10069a(), new C10070b());
    }

    public void info(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        C10071c c10071c = this.f9488a;
        c10071c.f9495b.getClass();
        Iterator it = c10071c.f9496c.m7049a(C10069a.m7048a(str, str2, objArr)).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            String str4 = c10071c.f9494a.f9497a;
            if (str3 == null) {
                str3 = "";
            }
            Log.println(4, str4, str3);
        }
    }
}
