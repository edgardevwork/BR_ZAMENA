package ru.rustore.sdk.billingclient.model.common;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/common/RequestMeta;", "", "traceId", "", "(Ljava/lang/String;)V", "getTraceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RequestMeta {
    private final String traceId;

    public RequestMeta(String traceId) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        this.traceId = traceId;
    }

    public static /* synthetic */ RequestMeta copy$default(RequestMeta requestMeta, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestMeta.traceId;
        }
        return requestMeta.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    public final RequestMeta copy(String traceId) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        return new RequestMeta(traceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestMeta) && Intrinsics.areEqual(this.traceId, ((RequestMeta) other).traceId);
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return this.traceId.hashCode();
    }

    public String toString() {
        return C8032c.m1430a(new StringBuilder("RequestMeta(traceId="), this.traceId, ')');
    }
}
