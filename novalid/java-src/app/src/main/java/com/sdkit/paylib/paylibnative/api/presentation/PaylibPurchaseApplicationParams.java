package com.sdkit.paylib.paylibnative.api.presentation;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibPurchaseApplicationParams;", "", "", "component1", "component2", "applicationId", "developerPayload", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "b", "getDeveloperPayload", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final /* data */ class PaylibPurchaseApplicationParams {

    /* renamed from: a, reason: from kotlin metadata */
    public final String applicationId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String developerPayload;

    public PaylibPurchaseApplicationParams(String applicationId, String str) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.developerPayload = str;
    }

    public static /* synthetic */ PaylibPurchaseApplicationParams copy$default(PaylibPurchaseApplicationParams paylibPurchaseApplicationParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paylibPurchaseApplicationParams.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = paylibPurchaseApplicationParams.developerPayload;
        }
        return paylibPurchaseApplicationParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final PaylibPurchaseApplicationParams copy(String applicationId, String developerPayload) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return new PaylibPurchaseApplicationParams(applicationId, developerPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaylibPurchaseApplicationParams)) {
            return false;
        }
        PaylibPurchaseApplicationParams paylibPurchaseApplicationParams = (PaylibPurchaseApplicationParams) other;
        return Intrinsics.areEqual(this.applicationId, paylibPurchaseApplicationParams.applicationId) && Intrinsics.areEqual(this.developerPayload, paylibPurchaseApplicationParams.developerPayload);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public int hashCode() {
        int iHashCode = this.applicationId.hashCode() * 31;
        String str = this.developerPayload;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaylibPurchaseApplicationParams(applicationId=");
        sb.append(this.applicationId);
        sb.append(", developerPayload=");
        return C8032c.m1430a(sb, this.developerPayload, ')');
    }

    public /* synthetic */ PaylibPurchaseApplicationParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
