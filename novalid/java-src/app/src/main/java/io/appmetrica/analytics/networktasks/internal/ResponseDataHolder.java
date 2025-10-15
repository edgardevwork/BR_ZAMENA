package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ResponseDataHolder {

    /* renamed from: a */
    private int f9611a;

    /* renamed from: b */
    private byte[] f9612b;

    /* renamed from: c */
    private Map f9613c;

    /* renamed from: d */
    private final ResponseValidityChecker f9614d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f9614d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f9611a;
    }

    @Nullable
    public byte[] getResponseData() {
        return this.f9612b;
    }

    @Nullable
    public Map<String, List<String>> getResponseHeaders() {
        return this.f9613c;
    }

    public boolean isValidResponse() {
        return this.f9614d.isResponseValid(this.f9611a);
    }

    public void setResponseCode(int i) {
        this.f9611a = i;
    }

    public void setResponseData(@Nullable byte[] bArr) {
        this.f9612b = bArr;
    }

    public void setResponseHeaders(@Nullable Map<String, List<String>> map) {
        this.f9613c = map;
    }
}
