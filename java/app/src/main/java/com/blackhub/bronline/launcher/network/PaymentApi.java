package com.blackhub.bronline.launcher.network;

import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import com.blackhub.bronline.game.core.utils.payment.model.PaymentResponse;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: PaymentApi.kt */
/* loaded from: classes3.dex */
public interface PaymentApi {
    @POST("verify")
    @Nullable
    Object sendBillingDebugPostRequest(@Body @NotNull BillingPurchaseRequest billingPurchaseRequest, @NotNull Continuation<? super Response<PaymentResponse>> continuation);

    @POST("./")
    @Nullable
    Object sendBillingPostRequest(@Body @NotNull BillingPurchaseRequest billingPurchaseRequest, @NotNull Continuation<? super Response<PaymentResponse>> continuation);

    @POST("verify")
    @Nullable
    Object sendRustoreBillingPostRequest(@Body @NotNull RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest, @NotNull Continuation<? super Response<PaymentResponse>> continuation);
}

