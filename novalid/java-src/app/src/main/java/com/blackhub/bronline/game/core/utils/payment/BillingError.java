package com.blackhub.bronline.game.core.utils.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BillingError.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/BillingError;", "", "responseCode", "", "debugMessage", "", "(ILjava/lang/String;)V", "getDebugMessage", "()Ljava/lang/String;", "getResponseCode", "()I", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class BillingError {
    public static final int $stable = 0;

    @NotNull
    public final String debugMessage;
    public final int responseCode;

    public BillingError(int i, @NotNull String debugMessage) {
        Intrinsics.checkNotNullParameter(debugMessage, "debugMessage");
        this.responseCode = i;
        this.debugMessage = debugMessage;
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }
}
