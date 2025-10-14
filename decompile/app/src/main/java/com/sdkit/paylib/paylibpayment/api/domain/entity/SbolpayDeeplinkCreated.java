package com.sdkit.paylib.paylibpayment.api.domain.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/SbolpayDeeplinkCreated;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaymentAction;", "", "component1", "deeplink", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class SbolpayDeeplinkCreated extends PaymentAction {

    /* renamed from: a, reason: from kotlin metadata */
    public final String deeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbolpayDeeplinkCreated(String deeplink) {
        super(null);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.deeplink = deeplink;
    }

    public static /* synthetic */ SbolpayDeeplinkCreated copy$default(SbolpayDeeplinkCreated sbolpayDeeplinkCreated, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sbolpayDeeplinkCreated.deeplink;
        }
        return sbolpayDeeplinkCreated.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final SbolpayDeeplinkCreated copy(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new SbolpayDeeplinkCreated(deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SbolpayDeeplinkCreated) && Intrinsics.areEqual(this.deeplink, ((SbolpayDeeplinkCreated) other).deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        return this.deeplink.hashCode();
    }

    public String toString() {
        return C8032c.m1430a(new StringBuilder("SbolpayDeeplinkCreated(deeplink="), this.deeplink, ')');
    }
}
