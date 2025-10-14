package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z8 */
/* loaded from: classes5.dex */
public class C10024z8 implements StateSerializer {

    /* renamed from: a */
    public final StateSerializer f9396a;

    /* renamed from: b */
    public final AESEncrypter f9397b;

    public C10024z8(@NonNull StateSerializer<Object> stateSerializer, @NonNull AESEncrypter aESEncrypter) {
        this.f9396a = stateSerializer;
        this.f9397b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return this.f9396a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final byte[] toByteArray(@NonNull Object obj) {
        try {
            return this.f9397b.encrypt(this.f9396a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object toState(@NonNull byte[] bArr) throws IOException {
        try {
            return this.f9396a.toState(this.f9397b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
