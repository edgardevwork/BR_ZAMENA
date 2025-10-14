package com.sdkit.paylib.paylibdomain.impl.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/impl/entity/PaylibDomainException;", "", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "a", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "meta", "b", "I", "getCode", "()I", "code", "c", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "d", "getErrorDescription", ActivityLauncherAnalytics.ERROR_DESCRIPTION, SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;ILjava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_domain"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class PaylibDomainException extends Throwable {

    /* renamed from: a, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: b, reason: from kotlin metadata */
    public final int code;

    /* renamed from: c, reason: from kotlin metadata */
    public final String errorMessage;

    /* renamed from: d, reason: from kotlin metadata */
    public final String errorDescription;

    public PaylibDomainException(RequestMeta requestMeta, int i, String str, String str2) {
        this.meta = requestMeta;
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaylibDomainException)) {
            return false;
        }
        PaylibDomainException paylibDomainException = (PaylibDomainException) other;
        return Intrinsics.areEqual(this.meta, paylibDomainException.meta) && this.code == paylibDomainException.code && Intrinsics.areEqual(this.errorMessage, paylibDomainException.errorMessage) && Intrinsics.areEqual(this.errorDescription, paylibDomainException.errorDescription);
    }

    public int hashCode() {
        RequestMeta requestMeta = this.meta;
        int iM1525a = C8054b.m1525a(this.code, (requestMeta == null ? 0 : requestMeta.hashCode()) * 31, 31);
        String str = this.errorMessage;
        int iHashCode = (iM1525a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDescription;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("PaylibDomainException(meta=");
        sb.append(this.meta);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", errorDescription=");
        return C8032c.m1430a(sb, this.errorDescription, ')');
    }
}
