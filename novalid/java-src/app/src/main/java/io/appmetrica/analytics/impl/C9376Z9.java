package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p048io.FileUtils;
import java.io.File;
import kotlin.p051io.FilesKt__FileReadWriteKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Z9 */
/* loaded from: classes5.dex */
public final class C9376Z9 implements InterfaceC8784An {

    /* renamed from: a */
    public final Context f7629a;

    /* renamed from: b */
    public final String f7630b;

    public C9376Z9(@NotNull Context context, @NotNull String str) {
        this.f7629a = context;
        this.f7630b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    @Nullable
    /* renamed from: a */
    public final String mo4978a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7629a, this.f7630b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f7629a, this.f7630b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return FilesKt__FileReadWriteKt.readText$default(fileFromSdkStorage, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    /* renamed from: a */
    public final void mo4979a(@NotNull String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f7629a, this.f7630b);
            if (fileFromSdkStorage != null) {
                FilesKt__FileReadWriteKt.writeText$default(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
