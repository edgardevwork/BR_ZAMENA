package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: io.appmetrica.analytics.impl.Td */
/* loaded from: classes5.dex */
public final class C9236Td {

    /* renamed from: a */
    public final Context f7288a;

    /* renamed from: b */
    public final C9739nn f7289b;

    /* renamed from: c */
    public final C9764on f7290c;

    public C9236Td(Context context) {
        this(context, new C9739nn(), new C9764on());
    }

    /* renamed from: a */
    public final String m5614a(String str) {
        try {
            this.f7290c.getClass();
            if (!C9764on.m6610a(str)) {
                this.f7289b.getClass();
                str = StringsKt__StringsJVMKt.replace$default(UUID.randomUUID().toString(), "-", "", false, 4, (Object) null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7288a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                AbstractC8946Ha.m5243a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C9236Td(Context context, C9739nn c9739nn, C9764on c9764on) {
        this.f7288a = context;
        this.f7289b = c9739nn;
        this.f7290c = c9764on;
    }

    /* renamed from: a */
    public final void m5615a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7288a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f7288a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
