package com.sdkit.paylib.paylibdomain.api.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SbolPayFinishState;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.SourceState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason;", "", "()V", "SbolPayCompleted", "SbolPayCompletedWithState", "SbpPayCompletedWithState", "TPayCompletedWithState", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$SbolPayCompleted;", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$SbolPayCompletedWithState;", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$SbpPayCompletedWithState;", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$TPayCompletedWithState;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public abstract class FinishReason {

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$SbolPayCompleted;", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;", "component1", "state", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;", "getState", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class SbolPayCompleted extends FinishReason {

        /* renamed from: a, reason: from kotlin metadata */
        public final SbolPayFinishState state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SbolPayCompleted(SbolPayFinishState state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public static /* synthetic */ SbolPayCompleted copy$default(SbolPayCompleted sbolPayCompleted, SbolPayFinishState sbolPayFinishState, int i, Object obj) {
            if ((i & 1) != 0) {
                sbolPayFinishState = sbolPayCompleted.state;
            }
            return sbolPayCompleted.copy(sbolPayFinishState);
        }

        /* renamed from: component1, reason: from getter */
        public final SbolPayFinishState getState() {
            return this.state;
        }

        public final SbolPayCompleted copy(SbolPayFinishState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new SbolPayCompleted(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SbolPayCompleted) && this.state == ((SbolPayCompleted) other).state;
        }

        public final SbolPayFinishState getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "SbolPayCompleted(state=" + this.state + ')';
        }
    }

    @Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$SbolPayCompletedWithState;", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;", "component1", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "component2", "state", "sourceState", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;", "getState", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;", "b", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "getSourceState", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SbolPayFinishState;Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class SbolPayCompletedWithState extends FinishReason {

        /* renamed from: a, reason: from kotlin metadata */
        public final SbolPayFinishState state;

        /* renamed from: b, reason: from kotlin metadata */
        public final SourceState sourceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SbolPayCompletedWithState(SbolPayFinishState state, SourceState sourceState) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(sourceState, "sourceState");
            this.state = state;
            this.sourceState = sourceState;
        }

        public static /* synthetic */ SbolPayCompletedWithState copy$default(SbolPayCompletedWithState sbolPayCompletedWithState, SbolPayFinishState sbolPayFinishState, SourceState sourceState, int i, Object obj) {
            if ((i & 1) != 0) {
                sbolPayFinishState = sbolPayCompletedWithState.state;
            }
            if ((i & 2) != 0) {
                sourceState = sbolPayCompletedWithState.sourceState;
            }
            return sbolPayCompletedWithState.copy(sbolPayFinishState, sourceState);
        }

        /* renamed from: component1, reason: from getter */
        public final SbolPayFinishState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final SourceState getSourceState() {
            return this.sourceState;
        }

        public final SbolPayCompletedWithState copy(SbolPayFinishState state, SourceState sourceState) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(sourceState, "sourceState");
            return new SbolPayCompletedWithState(state, sourceState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SbolPayCompletedWithState)) {
                return false;
            }
            SbolPayCompletedWithState sbolPayCompletedWithState = (SbolPayCompletedWithState) other;
            return this.state == sbolPayCompletedWithState.state && Intrinsics.areEqual(this.sourceState, sbolPayCompletedWithState.sourceState);
        }

        public final SourceState getSourceState() {
            return this.sourceState;
        }

        public final SbolPayFinishState getState() {
            return this.state;
        }

        public int hashCode() {
            return this.sourceState.hashCode() + (this.state.hashCode() * 31);
        }

        public String toString() {
            return "SbolPayCompletedWithState(state=" + this.state + ", sourceState=" + this.sourceState + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$SbpPayCompletedWithState;", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "component1", "sourceState", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "getSourceState", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class SbpPayCompletedWithState extends FinishReason {

        /* renamed from: a, reason: from kotlin metadata */
        public final SourceState sourceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SbpPayCompletedWithState(SourceState sourceState) {
            super(null);
            Intrinsics.checkNotNullParameter(sourceState, "sourceState");
            this.sourceState = sourceState;
        }

        public static /* synthetic */ SbpPayCompletedWithState copy$default(SbpPayCompletedWithState sbpPayCompletedWithState, SourceState sourceState, int i, Object obj) {
            if ((i & 1) != 0) {
                sourceState = sbpPayCompletedWithState.sourceState;
            }
            return sbpPayCompletedWithState.copy(sourceState);
        }

        /* renamed from: component1, reason: from getter */
        public final SourceState getSourceState() {
            return this.sourceState;
        }

        public final SbpPayCompletedWithState copy(SourceState sourceState) {
            Intrinsics.checkNotNullParameter(sourceState, "sourceState");
            return new SbpPayCompletedWithState(sourceState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SbpPayCompletedWithState) && Intrinsics.areEqual(this.sourceState, ((SbpPayCompletedWithState) other).sourceState);
        }

        public final SourceState getSourceState() {
            return this.sourceState;
        }

        public int hashCode() {
            return this.sourceState.hashCode();
        }

        public String toString() {
            return "SbpPayCompletedWithState(sourceState=" + this.sourceState + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0007\u0010\u0016¨\u0006\u0019"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason$TPayCompletedWithState;", "Lcom/sdkit/paylib/paylibdomain/api/entity/FinishReason;", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "component1", "", "component2", "sourceState", "isSuccessful", "copy", "", "toString", "", "hashCode", "", "other", "equals", "a", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "getSourceState", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;", "b", "Z", "()Z", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/SourceState;Z)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    public static final /* data */ class TPayCompletedWithState extends FinishReason {

        /* renamed from: a, reason: from kotlin metadata */
        public final SourceState sourceState;

        /* renamed from: b, reason: from kotlin metadata */
        public final boolean isSuccessful;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TPayCompletedWithState(SourceState sourceState, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(sourceState, "sourceState");
            this.sourceState = sourceState;
            this.isSuccessful = z;
        }

        public static /* synthetic */ TPayCompletedWithState copy$default(TPayCompletedWithState tPayCompletedWithState, SourceState sourceState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                sourceState = tPayCompletedWithState.sourceState;
            }
            if ((i & 2) != 0) {
                z = tPayCompletedWithState.isSuccessful;
            }
            return tPayCompletedWithState.copy(sourceState, z);
        }

        /* renamed from: component1, reason: from getter */
        public final SourceState getSourceState() {
            return this.sourceState;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSuccessful() {
            return this.isSuccessful;
        }

        public final TPayCompletedWithState copy(SourceState sourceState, boolean isSuccessful) {
            Intrinsics.checkNotNullParameter(sourceState, "sourceState");
            return new TPayCompletedWithState(sourceState, isSuccessful);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TPayCompletedWithState)) {
                return false;
            }
            TPayCompletedWithState tPayCompletedWithState = (TPayCompletedWithState) other;
            return Intrinsics.areEqual(this.sourceState, tPayCompletedWithState.sourceState) && this.isSuccessful == tPayCompletedWithState.isSuccessful;
        }

        public final SourceState getSourceState() {
            return this.sourceState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.sourceState.hashCode() * 31;
            boolean z = this.isSuccessful;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return iHashCode + i;
        }

        public final boolean isSuccessful() {
            return this.isSuccessful;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TPayCompletedWithState(sourceState=");
            sb.append(this.sourceState);
            sb.append(", isSuccessful=");
            return C8030a.m1428a(sb, this.isSuccessful, ')');
        }
    }

    public FinishReason() {
    }

    public /* synthetic */ FinishReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
