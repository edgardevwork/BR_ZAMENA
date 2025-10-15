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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chooseserver/model/ErrorResponse;", "", "errorBody", "", "errorCode", "", "(Ljava/lang/String;I)V", "getErrorBody", "()Ljava/lang/String;", "getErrorCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
