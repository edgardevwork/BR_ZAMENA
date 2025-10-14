package ru.rustore.sdk.remoteconfig.internal;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.K */
/* loaded from: classes6.dex */
public final class C11685K extends Lambda implements Function0<File> {

    /* renamed from: a */
    public final /* synthetic */ Context f10827a;

    /* renamed from: b */
    public final /* synthetic */ String f10828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11685K(String str, Context context) {
        super(0);
        this.f10827a = context;
        this.f10828b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() {
        File file = new File(this.f10827a.getNoBackupFilesDir(), this.f10828b);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
