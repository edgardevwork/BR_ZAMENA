package com.blackhub.bronline.game.core.utils.payment.rustore;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger;

/* compiled from: RustoreBillingClientWrapper.kt */
@StabilityInferred(parameters = 1)

public final class PaymentLogger implements ExternalPaymentLogger {
    public static final int $stable = 0;

    @NotNull
    public final String tag;

    @NotNull
    public final String tag1;

    public PaymentLogger(@NotNull String tag, @NotNull String tag1) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tag1, "tag1");
        this.tag = tag;
        this.tag1 = tag1;
    }

    @Override // ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger
    /* renamed from: d */
    public void mo967d(@Nullable Throwable e, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(this.tag, message.invoke(), e);
        Log.d("LeftUpBy", "d: " + this.tag1);
    }

    @Override // ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger
    /* renamed from: e */
    public void mo968e(@Nullable Throwable e, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.e(this.tag, message.invoke(), e);
        Log.d("LeftUpBy", "d: " + this.tag1);
    }

    @Override // ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger
    /* renamed from: i */
    public void mo969i(@Nullable Throwable e, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(this.tag, message.invoke(), e);
        Log.d("LeftUpBy", "d: " + this.tag1);
    }

    @Override // ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger
    /* renamed from: v */
    public void mo970v(@Nullable Throwable e, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.v(this.tag, message.invoke(), e);
        Log.d("LeftUpBy", "d: " + this.tag1);
    }

    @Override // ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLogger
    /* renamed from: w */
    public void mo971w(@Nullable Throwable e, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w(this.tag, message.invoke(), e);
        Log.d("LeftUpBy", "d: " + this.tag1);
    }
}

