package com.sdkit.paylib.paylibpayment.api.network.response;

import com.sdkit.paylib.paylibpayment.api.network.entity.ErrorModel;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithError;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/BaseResponse;", "error", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "getError", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/ErrorModel;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface ResponseWithError extends BaseResponse {
    ErrorModel getError();
}
