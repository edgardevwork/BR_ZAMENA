package com.sdkit.paylib.paylibnetwork.api.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/api/domain/PingInternetDetector;", "", "isConnected", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com-sdkit-assistant_paylib_network_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PingInternetDetector {
    Object isConnected(Continuation<? super Boolean> continuation);
}
