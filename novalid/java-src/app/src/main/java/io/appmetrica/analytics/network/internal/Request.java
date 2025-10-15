package io.appmetrica.analytics.network.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.AbstractC10081e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class Request {

    /* renamed from: a */
    private final String f9544a;

    /* renamed from: b */
    private final String f9545b;

    /* renamed from: c */
    private final byte[] f9546c;

    /* renamed from: d */
    private final Map f9547d;

    public static class Builder {

        /* renamed from: a */
        private final String f9548a;

        /* renamed from: b */
        private String f9549b;

        /* renamed from: c */
        private byte[] f9550c = new byte[0];

        /* renamed from: d */
        private final HashMap f9551d = new HashMap();

        public Builder(@NonNull String str) {
            this.f9548a = str;
        }

        @NonNull
        public Builder addHeader(@NonNull String str, @Nullable String str2) {
            this.f9551d.put(str, str2);
            return this;
        }

        public Request build() {
            return new Request(this.f9548a, this.f9549b, this.f9550c, this.f9551d, 0);
        }

        @NonNull
        public Builder post(@NonNull byte[] bArr) {
            this.f9550c = bArr;
            return withMethod("POST");
        }

        @NonNull
        public Builder withMethod(@NonNull String str) {
            this.f9549b = str;
            return this;
        }
    }

    public /* synthetic */ Request(String str, String str2, byte[] bArr, HashMap map, int i) {
        this(str, str2, bArr, map);
    }

    @NonNull
    public byte[] getBody() {
        return this.f9546c;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f9547d;
    }

    @NonNull
    public String getMethod() {
        return this.f9545b;
    }

    @NonNull
    public String getUrl() {
        return this.f9544a;
    }

    public String toString() {
        return "Request{url=" + this.f9544a + ", method='" + this.f9545b + "', bodyLength=" + this.f9546c.length + ", headers=" + this.f9547d + '}';
    }

    private Request(String str, String str2, byte[] bArr, HashMap map) {
        this.f9544a = str;
        this.f9545b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f9546c = bArr;
        this.f9547d = AbstractC10081e.m7052a(map);
    }
}
