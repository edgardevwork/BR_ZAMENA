package com.sdkit.paylib.paylibnative.api.deviceauth;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthDelegate;", "", "getRequiredAuthType", "Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthType;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAuthorized", "", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface DeviceAuthDelegate {
    Object getRequiredAuthType(Continuation<? super DeviceAuthType> continuation);

    void onAuthorized();
}
