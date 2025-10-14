package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.p051io.CloseableKt;

/* renamed from: io.appmetrica.analytics.network.impl.e */
/* loaded from: classes7.dex */
public abstract class AbstractC10081e {
    /* renamed from: a */
    public static byte[] m7053a(int i, Function0 function0) {
        try {
            InputStream inputStream = (InputStream) function0.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i2 = 0;
                            while (true) {
                                int i3 = inputStream.read(bArr);
                                if (-1 == i3 || i2 > i) {
                                    break;
                                }
                                if (i3 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i3);
                                    i2 += i3;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return byteArray;
                        } finally {
                        }
                    } catch (Throwable unused) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(byteArrayOutputStream, null);
                        CloseableKt.closeFinally(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static final Map m7052a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
