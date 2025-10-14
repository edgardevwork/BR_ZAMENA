package com.sdkit.paylib.paylibpayment.api.network.entity.user;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/user/EmailPayload;", "", "", "component1", "email", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class EmailPayload {

    /* renamed from: a, reason: from kotlin metadata */
    public final String email;

    public EmailPayload(String str) {
        this.email = str;
    }

    public static /* synthetic */ EmailPayload copy$default(EmailPayload emailPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailPayload.email;
        }
        return emailPayload.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final EmailPayload copy(String email) {
        return new EmailPayload(email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EmailPayload) && Intrinsics.areEqual(this.email, ((EmailPayload) other).email);
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        String str = this.email;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C8032c.m1430a(new StringBuilder("EmailPayload(email="), this.email, ')');
    }
}
