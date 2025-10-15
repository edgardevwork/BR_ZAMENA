package com.sdkit.paylib.paylibpayment.api.network.response;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/DigitalShopGeneralError;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "name", "code", "description", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/network/response/DigitalShopGeneralError;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getCode", "c", "getDescription", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class DigitalShopGeneralError {

    /* renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* renamed from: b, reason: from kotlin metadata */
    public final Integer code;

    /* renamed from: c, reason: from kotlin metadata */
    public final String description;

    public DigitalShopGeneralError(String str, Integer num, String str2) {
        this.name = str;
        this.code = num;
        this.description = str2;
    }

    public static /* synthetic */ DigitalShopGeneralError copy$default(DigitalShopGeneralError digitalShopGeneralError, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = digitalShopGeneralError.name;
        }
        if ((i & 2) != 0) {
            num = digitalShopGeneralError.code;
        }
        if ((i & 4) != 0) {
            str2 = digitalShopGeneralError.description;
        }
        return digitalShopGeneralError.copy(str, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final DigitalShopGeneralError copy(String name, Integer code, String description) {
        return new DigitalShopGeneralError(name, code, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalShopGeneralError)) {
            return false;
        }
        DigitalShopGeneralError digitalShopGeneralError = (DigitalShopGeneralError) other;
        return Intrinsics.areEqual(this.name, digitalShopGeneralError.name) && Intrinsics.areEqual(this.code, digitalShopGeneralError.code) && Intrinsics.areEqual(this.description, digitalShopGeneralError.description);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DigitalShopGeneralError(name=");
        sb.append(this.name);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", description=");
        return C8032c.m1430a(sb, this.description, ')');
    }
}
