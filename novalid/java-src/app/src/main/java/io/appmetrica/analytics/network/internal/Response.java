package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.AbstractC10081e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Response {

    /* renamed from: a */
    private final boolean f9552a;

    /* renamed from: b */
    private final int f9553b;

    /* renamed from: c */
    private final byte[] f9554c;

    /* renamed from: d */
    private final byte[] f9555d;

    /* renamed from: e */
    private final Map f9556e;

    /* renamed from: f */
    private final Throwable f9557f;

    public Response(@Nullable Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f9553b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f9555d;
    }

    @Nullable
    public Throwable getException() {
        return this.f9557f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f9556e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f9554c;
    }

    public boolean isCompleted() {
        return this.f9552a;
    }

    public String toString() {
        return "Response{completed=" + this.f9552a + ", code=" + this.f9553b + ", responseDataLength=" + this.f9554c.length + ", errorDataLength=" + this.f9555d.length + ", headers=" + this.f9556e + ", exception=" + this.f9557f + '}';
    }

    public Response(boolean z, int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th) {
        this.f9552a = z;
        this.f9553b = i;
        this.f9554c = bArr;
        this.f9555d = bArr2;
        this.f9556e = map == null ? Collections.emptyMap() : AbstractC10081e.m7052a(map);
        this.f9557f = th;
    }
}
