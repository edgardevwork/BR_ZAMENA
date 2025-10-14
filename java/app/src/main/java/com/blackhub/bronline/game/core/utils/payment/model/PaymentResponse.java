package com.blackhub.bronline.game.core.utils.payment.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PaymentResponse.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class PaymentResponse {
    public static final int $stable = 0;

    @SerializedName(ThrowableDeserializer.PROP_NAME_MESSAGE)
    @Nullable
    public final String message;

    public static /* synthetic */ PaymentResponse copy$default(PaymentResponse paymentResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentResponse.message;
        }
        return paymentResponse.copy(str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final PaymentResponse copy(@Nullable String message) {
        return new PaymentResponse(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaymentResponse) && Intrinsics.areEqual(this.message, ((PaymentResponse) other).message);
    }

    public int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaymentResponse(message=" + this.message + ")";
    }

    public PaymentResponse(@Nullable String str) {
        this.message = str;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }
}

