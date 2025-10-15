package com.sdkit.paylib.paylibdomain.api.subscriptions;

import kotlin.Metadata;
import org.apache.commons.codec.language.p055bm.Rule;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/subscriptions/SubscriptionStatus;", "", "", "a", "I", "getValue", "()I", "value", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;II)V", "ACTIVE", "INACTIVE", Rule.ALL, "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public enum SubscriptionStatus {
    ACTIVE(1),
    INACTIVE(2),
    ALL(3);


    /* renamed from: a, reason: from kotlin metadata */
    public final int value;

    SubscriptionStatus(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
