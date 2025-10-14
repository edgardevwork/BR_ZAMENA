package com.sdkit.paylib.paylibpayment.impl.domain.network.cards;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.d */
/* loaded from: classes8.dex */
public final class C8526d {
    /* renamed from: a */
    public final String m3993a() {
        return "smartpay/v1/cards/";
    }

    /* renamed from: a */
    public final String m3994a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return "smartpay/v1/cards/" + cardId;
    }
}
