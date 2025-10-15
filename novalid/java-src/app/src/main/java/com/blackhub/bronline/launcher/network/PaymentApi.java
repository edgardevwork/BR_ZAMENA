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
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/network/PaymentApi;", "", "sendBillingDebugPostRequest", "Lretrofit2/Response;", "Lcom/blackhub/bronline/game/core/utils/payment/model/PaymentResponse;", "paymentRequest", "Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;", "(Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBillingPostRequest", "sendRustoreBillingPostRequest", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;", "(Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
