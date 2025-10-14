package com.blackhub.bronline.game.gui.craft.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftDialogConfirmationAttachment.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class CraftDialogConfirmationAttachment {
    public static final int $stable = 0;

    @NotNull
    public final String bodyText;
    public final int idSelectedElement;

    @NotNull
    public final String nameOfSelectedElement;
    public final int typeOfDialog;
    public final int valueOfElements;

    public CraftDialogConfirmationAttachment() {
        this(0, null, 0, null, 0, 31, null);
    }

    public static /* synthetic */ CraftDialogConfirmationAttachment copy$default(CraftDialogConfirmationAttachment craftDialogConfirmationAttachment, int i, String str, int i2, String str2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = craftDialogConfirmationAttachment.typeOfDialog;
        }
        if ((i4 & 2) != 0) {
            str = craftDialogConfirmationAttachment.bodyText;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i2 = craftDialogConfirmationAttachment.idSelectedElement;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            str2 = craftDialogConfirmationAttachment.nameOfSelectedElement;
        }
        String str4 = str2;
        if ((i4 & 16) != 0) {
            i3 = craftDialogConfirmationAttachment.valueOfElements;
        }
        return craftDialogConfirmationAttachment.copy(i, str3, i5, str4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTypeOfDialog() {
        return this.typeOfDialog;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIdSelectedElement() {
        return this.idSelectedElement;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getNameOfSelectedElement() {
        return this.nameOfSelectedElement;
    }

    /* renamed from: component5, reason: from getter */
    public final int getValueOfElements() {
        return this.valueOfElements;
    }

    @NotNull
    public final CraftDialogConfirmationAttachment copy(int typeOfDialog, @NotNull String bodyText, int idSelectedElement, @NotNull String nameOfSelectedElement, int valueOfElements) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(nameOfSelectedElement, "nameOfSelectedElement");
        return new CraftDialogConfirmationAttachment(typeOfDialog, bodyText, idSelectedElement, nameOfSelectedElement, valueOfElements);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftDialogConfirmationAttachment)) {
            return false;
        }
        CraftDialogConfirmationAttachment craftDialogConfirmationAttachment = (CraftDialogConfirmationAttachment) other;
        return this.typeOfDialog == craftDialogConfirmationAttachment.typeOfDialog && Intrinsics.areEqual(this.bodyText, craftDialogConfirmationAttachment.bodyText) && this.idSelectedElement == craftDialogConfirmationAttachment.idSelectedElement && Intrinsics.areEqual(this.nameOfSelectedElement, craftDialogConfirmationAttachment.nameOfSelectedElement) && this.valueOfElements == craftDialogConfirmationAttachment.valueOfElements;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.typeOfDialog) * 31) + this.bodyText.hashCode()) * 31) + Integer.hashCode(this.idSelectedElement)) * 31) + this.nameOfSelectedElement.hashCode()) * 31) + Integer.hashCode(this.valueOfElements);
    }

    @NotNull
    public String toString() {
        return "CraftDialogConfirmationAttachment(typeOfDialog=" + this.typeOfDialog + ", bodyText=" + this.bodyText + ", idSelectedElement=" + this.idSelectedElement + ", nameOfSelectedElement=" + this.nameOfSelectedElement + ", valueOfElements=" + this.valueOfElements + ")";
    }

    public CraftDialogConfirmationAttachment(int i, @NotNull String bodyText, int i2, @NotNull String nameOfSelectedElement, int i3) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(nameOfSelectedElement, "nameOfSelectedElement");
        this.typeOfDialog = i;
        this.bodyText = bodyText;
        this.idSelectedElement = i2;
        this.nameOfSelectedElement = nameOfSelectedElement;
        this.valueOfElements = i3;
    }

    public final int getTypeOfDialog() {
        return this.typeOfDialog;
    }

    public /* synthetic */ CraftDialogConfirmationAttachment(int i, String str, int i2, String str2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i4 & 16) != 0 ? 0 : i3);
    }

    @NotNull
    public final String getBodyText() {
        return this.bodyText;
    }

    public final int getIdSelectedElement() {
        return this.idSelectedElement;
    }

    @NotNull
    public final String getNameOfSelectedElement() {
        return this.nameOfSelectedElement;
    }

    public final int getValueOfElements() {
        return this.valueOfElements;
    }
}

