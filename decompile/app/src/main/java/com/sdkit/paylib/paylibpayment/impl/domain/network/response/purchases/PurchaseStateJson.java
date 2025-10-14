package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public enum PurchaseStateJson {
    CREATED,
    INVOICE_CREATED,
    CONFIRMED,
    PAID,
    PAUSED,
    CANCELLED,
    CONSUMED,
    CLOSED,
    TERMINATED;

    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public static final Lazy f5639a = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson$$b
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KSerializer invoke() {
            return PurchaseStateJson$$a.f5650a;
        }
    });

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/PurchaseStateJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/PurchaseStateJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        private final /* synthetic */ KSerializer m4545a() {
            return (KSerializer) PurchaseStateJson.f5639a.getValue();
        }

        public final KSerializer<PurchaseStateJson> serializer() {
            return m4545a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public PurchaseState m4541c() {
        switch (PurchaseStateJson$$c.f5653a[ordinal()]) {
            case 1:
                return PurchaseState.CREATED;
            case 2:
                return PurchaseState.INVOICE_CREATED;
            case 3:
                return PurchaseState.CONFIRMED;
            case 4:
                return PurchaseState.PAID;
            case 5:
                return PurchaseState.PAUSED;
            case 6:
                return PurchaseState.CANCELLED;
            case 7:
                return PurchaseState.CONSUMED;
            case 8:
                return PurchaseState.CLOSED;
            case 9:
                return PurchaseState.TERMINATED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
