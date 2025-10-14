package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class RequestDataHolder {

    /* renamed from: a */
    private NetworkTask.Method f9606a = NetworkTask.Method.GET;

    /* renamed from: b */
    private final HashMap f9607b = new HashMap();

    /* renamed from: c */
    private byte[] f9608c = null;

    /* renamed from: d */
    private Long f9609d;

    /* renamed from: e */
    private Integer f9610e;

    public void applySendTime(long j) {
        this.f9609d = Long.valueOf(j);
        this.f9610e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j) * 1000) / 1000);
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f9607b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f9606a;
    }

    @Nullable
    public byte[] getPostData() {
        return this.f9608c;
    }

    @Nullable
    public Long getSendTimestamp() {
        return this.f9609d;
    }

    @Nullable
    public Integer getSendTimezoneSec() {
        return this.f9610e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f9607b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(@Nullable byte[] bArr) {
        this.f9606a = NetworkTask.Method.POST;
        this.f9608c = bArr;
    }
}
