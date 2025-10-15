package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.SubscriptionPeriodType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public enum SubscriptionsPeriodTypeJson {
    PROMO,
    START,
    STANDARD,
    GRACE,
    HOLD;

    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public static final Lazy f5723a = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0() { // from class: com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions.SubscriptionsPeriodTypeJson$$b
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KSerializer invoke() {
            return SubscriptionsPeriodTypeJson$$a.f5730a;
        }
    });

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPeriodTypeJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPeriodTypeJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        private final /* synthetic */ KSerializer m4597a() {
            return (KSerializer) SubscriptionsPeriodTypeJson.f5723a.getValue();
        }

        public final KSerializer<SubscriptionsPeriodTypeJson> serializer() {
            return m4597a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public SubscriptionPeriodType m4593c() {
        int i = SubscriptionsPeriodTypeJson$$c.f5733a[ordinal()];
        if (i == 1) {
            return SubscriptionPeriodType.PROMO;
        }
        if (i == 2) {
            return SubscriptionPeriodType.START;
        }
        if (i == 3) {
            return SubscriptionPeriodType.STANDARD;
        }
        if (i == 4) {
            return SubscriptionPeriodType.GRACE;
        }
        if (i == 5) {
            return SubscriptionPeriodType.HOLD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
