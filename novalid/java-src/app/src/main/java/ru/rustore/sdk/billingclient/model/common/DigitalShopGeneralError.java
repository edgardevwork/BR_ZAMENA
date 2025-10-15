package ru.rustore.sdk.billingclient.model.common;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/common/DigitalShopGeneralError;", "", "name", "", "code", "", "description", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/rustore/sdk/billingclient/model/common/DigitalShopGeneralError;", "equals", "", "other", "hashCode", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DigitalShopGeneralError {
    private final Integer code;
    private final String description;
    private final String name;

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
