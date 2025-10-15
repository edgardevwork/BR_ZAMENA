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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/CraftDialogConfirmationAttachment;", "", "typeOfDialog", "", "bodyText", "", "idSelectedElement", "nameOfSelectedElement", "valueOfElements", "(ILjava/lang/String;ILjava/lang/String;I)V", "getBodyText", "()Ljava/lang/String;", "getIdSelectedElement", "()I", "getNameOfSelectedElement", "getTypeOfDialog", "getValueOfElements", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
