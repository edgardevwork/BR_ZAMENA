package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Ej */
/* loaded from: classes7.dex */
public final class C8880Ej implements ServiceStorageProvider {

    /* renamed from: a */
    public final Context f6553a;

    /* renamed from: b */
    public final InterfaceC10011yk f6554b;

    /* renamed from: c */
    public final SQLiteOpenHelper f6555c;

    public C8880Ej(@NotNull Context context, @NotNull InterfaceC10011yk interfaceC10011yk, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        this.f6553a = context;
        this.f6554b = interfaceC10011yk;
        this.f6555c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f6553a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f6553a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final SQLiteOpenHelper getDbStorage() {
        return this.f6555c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f6553a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final TempCacheStorage getTempCacheStorage() {
        C9863sm c9863sm;
        C9398a7 c9398a7M5836a = C9398a7.m5836a(this.f6553a);
        synchronized (c9398a7M5836a) {
            try {
                if (c9398a7M5836a.f7700o == null) {
                    Context context = c9398a7M5836a.f7690e;
                    EnumC9316Wl enumC9316Wl = EnumC9316Wl.SERVICE;
                    if (c9398a7M5836a.f7699n == null) {
                        c9398a7M5836a.f7699n = new C9838rm(new C9911uk(c9398a7M5836a.m5847h()), "temp_cache");
                    }
                    c9398a7M5836a.f7700o = new C9863sm(context, enumC9316Wl, c9398a7M5836a.f7699n);
                }
                c9863sm = c9398a7M5836a.f7700o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9863sm;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences legacyModulePreferences() {
        return new C9902ub(this.f6554b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C8972Ic(str, this.f6554b);
    }
}
