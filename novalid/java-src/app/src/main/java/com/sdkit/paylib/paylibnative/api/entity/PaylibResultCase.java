package com.sdkit.paylib.paylibnative.api.entity;

import com.sdkit.paylib.paylibnative.api.entity.PaylibResultCasePayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004:\u0003\b\t\nR\u0012\u0010\u0005\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "TCompletion", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "TFailure", "", "payload", "getPayload", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "Cancelled", "Failed", "Succeed", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Cancelled;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Failed;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Succeed;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibResultCase<TCompletion extends PaylibResultCasePayload, TFailure extends PaylibResultCasePayload> {

    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\u0007\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Cancelled;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "TCompletion", "TFailure", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "component1", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "payload", "copy", "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;)Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Cancelled;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "getPayload", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class Cancelled<TCompletion extends PaylibResultCasePayload, TFailure extends PaylibResultCasePayload> implements PaylibResultCase<TCompletion, TFailure> {

        /* renamed from: a, reason: from kotlin metadata */
        public final PaylibResultCasePayload payload;

        public Cancelled(TCompletion payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Cancelled copy$default(Cancelled cancelled, PaylibResultCasePayload paylibResultCasePayload, int i, Object obj) {
            if ((i & 1) != 0) {
                paylibResultCasePayload = cancelled.payload;
            }
            return cancelled.copy(paylibResultCasePayload);
        }

        public final TCompletion component1() {
            return (TCompletion) this.payload;
        }

        public final Cancelled<TCompletion, TFailure> copy(TCompletion payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new Cancelled<>(payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cancelled) && Intrinsics.areEqual(this.payload, ((Cancelled) other).payload);
        }

        @Override // com.sdkit.paylib.paylibnative.api.entity.PaylibResultCase
        public TCompletion getPayload() {
            return (TCompletion) this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "Cancelled(payload=" + this.payload + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\u0007\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Failed;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "TCompletion", "TFailure", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "component1", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "payload", "copy", "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;)Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Failed;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "getPayload", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class Failed<TCompletion extends PaylibResultCasePayload, TFailure extends PaylibResultCasePayload> implements PaylibResultCase<TCompletion, TFailure> {

        /* renamed from: a, reason: from kotlin metadata */
        public final PaylibResultCasePayload payload;

        public Failed(TFailure payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failed copy$default(Failed failed, PaylibResultCasePayload paylibResultCasePayload, int i, Object obj) {
            if ((i & 1) != 0) {
                paylibResultCasePayload = failed.payload;
            }
            return failed.copy(paylibResultCasePayload);
        }

        public final TFailure component1() {
            return (TFailure) this.payload;
        }

        public final Failed<TCompletion, TFailure> copy(TFailure payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new Failed<>(payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.payload, ((Failed) other).payload);
        }

        @Override // com.sdkit.paylib.paylibnative.api.entity.PaylibResultCase
        public TFailure getPayload() {
            return (TFailure) this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "Failed(payload=" + this.payload + ')';
        }
    }

    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\u0007\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0017"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Succeed;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "TCompletion", "TFailure", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase;", "component1", "()Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "payload", "copy", "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;)Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCase$Succeed;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;", "getPayload", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResultCasePayload;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public static final /* data */ class Succeed<TCompletion extends PaylibResultCasePayload, TFailure extends PaylibResultCasePayload> implements PaylibResultCase<TCompletion, TFailure> {

        /* renamed from: a, reason: from kotlin metadata */
        public final PaylibResultCasePayload payload;

        public Succeed(TCompletion payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Succeed copy$default(Succeed succeed, PaylibResultCasePayload paylibResultCasePayload, int i, Object obj) {
            if ((i & 1) != 0) {
                paylibResultCasePayload = succeed.payload;
            }
            return succeed.copy(paylibResultCasePayload);
        }

        public final TCompletion component1() {
            return (TCompletion) this.payload;
        }

        public final Succeed<TCompletion, TFailure> copy(TCompletion payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new Succeed<>(payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Succeed) && Intrinsics.areEqual(this.payload, ((Succeed) other).payload);
        }

        @Override // com.sdkit.paylib.paylibnative.api.entity.PaylibResultCase
        public TCompletion getPayload() {
            return (TCompletion) this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        public String toString() {
            return "Succeed(payload=" + this.payload + ')';
        }
    }

    PaylibResultCasePayload getPayload();
}
