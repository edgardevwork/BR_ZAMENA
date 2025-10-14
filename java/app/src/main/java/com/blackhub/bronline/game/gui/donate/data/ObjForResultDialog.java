package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ObjForResultDialog.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class ObjForResultDialog {
    public static final int $stable = 0;

    @NotNull
    public final String boldMessage;

    @NotNull
    public final String buttonOK;

    @NotNull
    public final String caption;
    public final int currentAction;

    @NotNull
    public final String message;
    public final int success;

    public static /* synthetic */ ObjForResultDialog copy$default(ObjForResultDialog objForResultDialog, String str, int i, String str2, String str3, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = objForResultDialog.message;
        }
        if ((i3 & 2) != 0) {
            i = objForResultDialog.success;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = objForResultDialog.boldMessage;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = objForResultDialog.caption;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            str4 = objForResultDialog.buttonOK;
        }
        String str7 = str4;
        if ((i3 & 32) != 0) {
            i2 = objForResultDialog.currentAction;
        }
        return objForResultDialog.copy(str, i4, str5, str6, str7, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBoldMessage() {
        return this.boldMessage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getButtonOK() {
        return this.buttonOK;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCurrentAction() {
        return this.currentAction;
    }

    @NotNull
    public final ObjForResultDialog copy(@NotNull String message, int success, @NotNull String boldMessage, @NotNull String caption, @NotNull String buttonOK, int currentAction) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(boldMessage, "boldMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(buttonOK, "buttonOK");
        return new ObjForResultDialog(message, success, boldMessage, caption, buttonOK, currentAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObjForResultDialog)) {
            return false;
        }
        ObjForResultDialog objForResultDialog = (ObjForResultDialog) other;
        return Intrinsics.areEqual(this.message, objForResultDialog.message) && this.success == objForResultDialog.success && Intrinsics.areEqual(this.boldMessage, objForResultDialog.boldMessage) && Intrinsics.areEqual(this.caption, objForResultDialog.caption) && Intrinsics.areEqual(this.buttonOK, objForResultDialog.buttonOK) && this.currentAction == objForResultDialog.currentAction;
    }

    public int hashCode() {
        return (((((((((this.message.hashCode() * 31) + Integer.hashCode(this.success)) * 31) + this.boldMessage.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.buttonOK.hashCode()) * 31) + Integer.hashCode(this.currentAction);
    }

    @NotNull
    public String toString() {
        return "ObjForResultDialog(message=" + this.message + ", success=" + this.success + ", boldMessage=" + this.boldMessage + ", caption=" + this.caption + ", buttonOK=" + this.buttonOK + ", currentAction=" + this.currentAction + ")";
    }

    public ObjForResultDialog(@NotNull String message, int i, @NotNull String boldMessage, @NotNull String caption, @NotNull String buttonOK, int i2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(boldMessage, "boldMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(buttonOK, "buttonOK");
        this.message = message;
        this.success = i;
        this.boldMessage = boldMessage;
        this.caption = caption;
        this.buttonOK = buttonOK;
        this.currentAction = i2;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getSuccess() {
        return this.success;
    }

    @NotNull
    public final String getBoldMessage() {
        return this.boldMessage;
    }

    @NotNull
    public final String getCaption() {
        return this.caption;
    }

    @NotNull
    public final String getButtonOK() {
        return this.buttonOK;
    }

    public final int getCurrentAction() {
        return this.currentAction;
    }
}

