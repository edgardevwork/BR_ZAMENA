package com.sdkit.paylib.paylibpayment.api.domain;

import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibContext;
import com.sdkit.paylib.paylibpayment.api.domain.entity.PaylibToken;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider;", "", "requestToken", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaylibToken;", "cause", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider$RequestCause;", "context", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaylibContext;", "(Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider$RequestCause;Lcom/sdkit/paylib/paylibpayment/api/domain/entity/PaylibContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RequestCause", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibTokenProvider {

    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider$RequestCause;", "", "(Ljava/lang/String;I)V", "REFRESH", "AUTHORIZATION_ERROR", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public enum RequestCause {
        REFRESH,
        AUTHORIZATION_ERROR
    }

    Object requestToken(RequestCause requestCause, PaylibContext paylibContext, Continuation<? super PaylibToken> continuation);
}
