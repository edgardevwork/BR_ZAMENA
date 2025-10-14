package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.p048io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import kotlin.p051io.ByteStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.id */
/* loaded from: classes8.dex */
public final class C9604id implements Function {

    /* renamed from: a */
    public final C9629jd f8360a;

    /* renamed from: b */
    public final C9579hd f8361b;

    public C9604id(@NotNull C9629jd c9629jd, @NotNull C9579hd c9579hd) {
        this.f8360a = c9629jd;
        this.f8361b = c9579hd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x0015, B:13:0x0020, B:17:0x0027, B:22:0x002e, B:10:0x001a), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String apply(@NotNull File file) {
        byte[] bytes;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                    try {
                        bytes = ByteStreamsKt.readBytes(fileInputStream);
                        AbstractC9664kn.m6341a((Closeable) fileInputStream);
                    } catch (Throwable unused) {
                        AbstractC9664kn.m6341a((Closeable) fileInputStream);
                        bytes = null;
                        if (bytes != null) {
                        }
                    }
                } catch (Throwable unused2) {
                    fileInputStream = null;
                }
            } else {
                bytes = null;
            }
            if (bytes != null) {
                return null;
            }
            if (!(!(bytes.length == 0))) {
                bytes = null;
            }
            if (bytes != null) {
                return Base64Utils.compressBase64(MessageNano.toByteArray(this.f8361b.fromModel(new C9654kd(bytes, this.f8360a))));
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
