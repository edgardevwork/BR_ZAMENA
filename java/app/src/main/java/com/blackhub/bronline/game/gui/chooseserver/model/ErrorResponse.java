package com.blackhub.bronline.game.gui.chooseserver.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ErrorResponse.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class ErrorResponse {
    public static final int $stable = 0;

    @NotNull
    public final String errorBody;
    public final int errorCode;

    public ErrorResponse() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = errorResponse.errorBody;
        }
        if ((i2 & 2) != 0) {
            i = errorResponse.errorCode;
        }
        return errorResponse.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getErrorBody() {
        return this.errorBody;
    }

    /* renamed from: component2, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final ErrorResponse copy(@NotNull String errorBody, int errorCode) {
        Intrinsics.checkNotNullParameter(errorBody, "errorBody");
        return new ErrorResponse(errorBody, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.areEqual(this.errorBody, errorResponse.errorBody) && this.errorCode == errorResponse.errorCode;
    }

    public int hashCode() {
        return (this.errorBody.hashCode() * 31) + Integer.hashCode(this.errorCode);
    }

    @NotNull
    public String toString() {
        return "ErrorResponse(errorBody=" + this.errorBody + ", errorCode=" + this.errorCode + ")";
    }

    public ErrorResponse(@NotNull String errorBody, int i) {
        Intrinsics.checkNotNullParameter(errorBody, "errorBody");
        this.errorBody = errorBody;
        this.errorCode = i;
    }

    public /* synthetic */ ErrorResponse(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 2) != 0 ? 0 : i);
    }

    @NotNull
    public final String getErrorBody() {
        return this.errorBody;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

