package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaylibToken;", "", "", "isEmpty", "isNotEmpty", "", "component1", "rawToken", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getRawToken", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class PaylibToken {

    /* renamed from: a, reason: from kotlin metadata */
    public final String rawToken;

    public PaylibToken(String rawToken) {
        Intrinsics.checkNotNullParameter(rawToken, "rawToken");
        this.rawToken = rawToken;
    }

    public static /* synthetic */ PaylibToken copy$default(PaylibToken paylibToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paylibToken.rawToken;
        }
        return paylibToken.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRawToken() {
        return this.rawToken;
    }

    public final PaylibToken copy(String rawToken) {
        Intrinsics.checkNotNullParameter(rawToken, "rawToken");
        return new PaylibToken(rawToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaylibToken) && Intrinsics.areEqual(this.rawToken, ((PaylibToken) other).rawToken);
    }

    public final String getRawToken() {
        return this.rawToken;
    }

    public int hashCode() {
        return this.rawToken.hashCode();
    }

    public final boolean isEmpty() {
        return this.rawToken.length() == 0;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public String toString() {
        return C8032c.m1430a(new StringBuilder("PaylibToken(rawToken="), this.rawToken, ')');
    }
}
