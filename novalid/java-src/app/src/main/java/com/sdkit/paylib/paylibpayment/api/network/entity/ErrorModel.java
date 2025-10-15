package com.sdkit.paylib.paylibpayment.api.network.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "", "", "component1", "component2", "", "component3", "userMessage", "description", "code", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserMessage", "()Ljava/lang/String;", "b", "getDescription", "c", "I", "getCode", "()I", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;I)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class ErrorModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final String userMessage;

    /* renamed from: b, reason: from kotlin metadata */
    public final String description;

    /* renamed from: c, reason: from kotlin metadata */
    public final int code;

    public ErrorModel() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ErrorModel copy$default(ErrorModel errorModel, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorModel.userMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = errorModel.description;
        }
        if ((i2 & 4) != 0) {
            i = errorModel.code;
        }
        return errorModel.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final ErrorModel copy(String userMessage, String description, int code) {
        Intrinsics.checkNotNullParameter(userMessage, "userMessage");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ErrorModel(userMessage, description, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorModel)) {
            return false;
        }
        ErrorModel errorModel = (ErrorModel) other;
        return Intrinsics.areEqual(this.userMessage, errorModel.userMessage) && Intrinsics.areEqual(this.description, errorModel.description) && this.code == errorModel.code;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public int hashCode() {
        return Integer.hashCode(this.code) + C8031b.m1429a(this.description, this.userMessage.hashCode() * 31, 31);
    }

    public String toString() {
        return "ErrorModel(userMessage=" + this.userMessage + ", description=" + this.description + ", code=" + this.code + ')';
    }

    public ErrorModel(String userMessage, String description, int i) {
        Intrinsics.checkNotNullParameter(userMessage, "userMessage");
        Intrinsics.checkNotNullParameter(description, "description");
        this.userMessage = userMessage;
        this.description = description;
        this.code = i;
    }

    public /* synthetic */ ErrorModel(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
