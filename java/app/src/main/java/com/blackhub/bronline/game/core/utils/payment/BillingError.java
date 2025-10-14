package com.blackhub.bronline.game.core.utils.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BillingError.kt */
@StabilityInferred(parameters = 1)
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

