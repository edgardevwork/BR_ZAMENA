package com.sdkit.paylib.paylibdomain.api.deeplink.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkDetails;", "", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "component1", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;", "component2", "sourceState", "deeplinkPaymentType", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "getSourceState", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "b", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;", "getDeeplinkPaymentType", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkPaymentType;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class DeeplinkDetails {

    /* renamed from: a, reason: from kotlin metadata */
    public final SourceState sourceState;

    /* renamed from: b, reason: from kotlin metadata */
    public final DeeplinkPaymentType deeplinkPaymentType;

    public DeeplinkDetails(SourceState sourceState, DeeplinkPaymentType deeplinkPaymentType) {
        Intrinsics.checkNotNullParameter(deeplinkPaymentType, "deeplinkPaymentType");
        this.sourceState = sourceState;
        this.deeplinkPaymentType = deeplinkPaymentType;
    }

    public static /* synthetic */ DeeplinkDetails copy$default(DeeplinkDetails deeplinkDetails, SourceState sourceState, DeeplinkPaymentType deeplinkPaymentType, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceState = deeplinkDetails.sourceState;
        }
        if ((i & 2) != 0) {
            deeplinkPaymentType = deeplinkDetails.deeplinkPaymentType;
        }
        return deeplinkDetails.copy(sourceState, deeplinkPaymentType);
    }

    /* renamed from: component1, reason: from getter */
    public final SourceState getSourceState() {
        return this.sourceState;
    }

    /* renamed from: component2, reason: from getter */
    public final DeeplinkPaymentType getDeeplinkPaymentType() {
        return this.deeplinkPaymentType;
    }

    public final DeeplinkDetails copy(SourceState sourceState, DeeplinkPaymentType deeplinkPaymentType) {
        Intrinsics.checkNotNullParameter(deeplinkPaymentType, "deeplinkPaymentType");
        return new DeeplinkDetails(sourceState, deeplinkPaymentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeeplinkDetails)) {
            return false;
        }
        DeeplinkDetails deeplinkDetails = (DeeplinkDetails) other;
        return Intrinsics.areEqual(this.sourceState, deeplinkDetails.sourceState) && Intrinsics.areEqual(this.deeplinkPaymentType, deeplinkDetails.deeplinkPaymentType);
    }

    public final DeeplinkPaymentType getDeeplinkPaymentType() {
        return this.deeplinkPaymentType;
    }

    public final SourceState getSourceState() {
        return this.sourceState;
    }

    public int hashCode() {
        SourceState sourceState = this.sourceState;
        return this.deeplinkPaymentType.hashCode() + ((sourceState == null ? 0 : sourceState.hashCode()) * 31);
    }

    public String toString() {
        return "DeeplinkDetails(sourceState=" + this.sourceState + ", deeplinkPaymentType=" + this.deeplinkPaymentType + ')';
    }
}
