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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J \u0010\b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J \u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J \u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J \u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/rustore/PaymentLogger;", "Lru/rustore/sdk/billingclient/provider/logger/ExternalPaymentLogger;", "tag", "", "tag1", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "", "e", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "Lkotlin/Function0;", "i", "v", "w", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
