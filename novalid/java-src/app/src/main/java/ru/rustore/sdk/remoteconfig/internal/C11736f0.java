package ru.rustore.sdk.remoteconfig.internal;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import kotlin.p051io.FilesKt__FileReadWriteKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.f0 */
/* loaded from: classes5.dex */
public final class C11736f0 {

    /* renamed from: a */
    public final C11687L f10924a;

    /* renamed from: b */
    public final C11746k0 f10925b;

    public C11736f0(C11687L fileSystemWrapper, C11746k0 serializer) {
        Intrinsics.checkNotNullParameter(fileSystemWrapper, "fileSystemWrapper");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f10924a = fileSystemWrapper;
        this.f10925b = serializer;
    }

    /* renamed from: a */
    public final C11738g0 m7538a() {
        synchronized (this) {
            C11689M c11689mM7521a = C11683J.m7521a(this.f10924a.m7522a());
            if (c11689mM7521a == null) {
                return null;
            }
            return this.f10925b.m7541a(StringsKt__StringsJVMKt.decodeToString(FilesKt__FileReadWriteKt.readBytes(c11689mM7521a.f10833a)));
        }
    }

    /* renamed from: a */
    public final void m7539a(C11738g0 dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        synchronized (this) {
            C11687L c11687l = this.f10924a;
            String fileName = String.valueOf(dto.f10929c.f10971a);
            c11687l.getClass();
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File((File) c11687l.f10831a.getValue(), fileName);
            file.delete();
            file.createNewFile();
            Intrinsics.checkNotNullParameter(file, "file");
            byte[] bytes = this.f10925b.m7540a(dto).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        }
    }
}
