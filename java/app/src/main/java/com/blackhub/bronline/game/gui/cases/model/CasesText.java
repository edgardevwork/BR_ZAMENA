package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesText.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CasesText {
    public static final int $stable = 8;

    @NotNull
    public AnnotatedString dialogConfirmationOneText;

    @NotNull
    public AnnotatedString dialogConfirmationTwoText;

    @NotNull
    public final List<CommonTutorialTextsWithImage> hintAttachment;

    @NotNull
    public final AnnotatedString saleOneHintText;

    @NotNull
    public final AnnotatedString saleTenHintText;

    @NotNull
    public final AnnotatedString scaleHintText;

    @NotNull
    public final AnnotatedString uniqueCaseHintText;

    public CasesText() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CasesText copy$default(CasesText casesText, AnnotatedString annotatedString, AnnotatedString annotatedString2, AnnotatedString annotatedString3, AnnotatedString annotatedString4, AnnotatedString annotatedString5, AnnotatedString annotatedString6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = casesText.saleOneHintText;
        }
        if ((i & 2) != 0) {
            annotatedString2 = casesText.saleTenHintText;
        }
        AnnotatedString annotatedString7 = annotatedString2;
        if ((i & 4) != 0) {
            annotatedString3 = casesText.uniqueCaseHintText;
        }
        AnnotatedString annotatedString8 = annotatedString3;
        if ((i & 8) != 0) {
            annotatedString4 = casesText.scaleHintText;
        }
        AnnotatedString annotatedString9 = annotatedString4;
        if ((i & 16) != 0) {
            annotatedString5 = casesText.dialogConfirmationOneText;
        }
        AnnotatedString annotatedString10 = annotatedString5;
        if ((i & 32) != 0) {
            annotatedString6 = casesText.dialogConfirmationTwoText;
        }
        AnnotatedString annotatedString11 = annotatedString6;
        if ((i & 64) != 0) {
            list = casesText.hintAttachment;
        }
        return casesText.copy(annotatedString, annotatedString7, annotatedString8, annotatedString9, annotatedString10, annotatedString11, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AnnotatedString getSaleOneHintText() {
        return this.saleOneHintText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getSaleTenHintText() {
        return this.saleTenHintText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AnnotatedString getUniqueCaseHintText() {
        return this.uniqueCaseHintText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AnnotatedString getScaleHintText() {
        return this.scaleHintText;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AnnotatedString getDialogConfirmationOneText() {
        return this.dialogConfirmationOneText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AnnotatedString getDialogConfirmationTwoText() {
        return this.dialogConfirmationTwoText;
    }

    @NotNull
    public final List<CommonTutorialTextsWithImage> component7() {
        return this.hintAttachment;
    }

    @NotNull
    public final CasesText copy(@NotNull AnnotatedString saleOneHintText, @NotNull AnnotatedString saleTenHintText, @NotNull AnnotatedString uniqueCaseHintText, @NotNull AnnotatedString scaleHintText, @NotNull AnnotatedString dialogConfirmationOneText, @NotNull AnnotatedString dialogConfirmationTwoText, @NotNull List<CommonTutorialTextsWithImage> hintAttachment) {
        Intrinsics.checkNotNullParameter(saleOneHintText, "saleOneHintText");
        Intrinsics.checkNotNullParameter(saleTenHintText, "saleTenHintText");
        Intrinsics.checkNotNullParameter(uniqueCaseHintText, "uniqueCaseHintText");
        Intrinsics.checkNotNullParameter(scaleHintText, "scaleHintText");
        Intrinsics.checkNotNullParameter(dialogConfirmationOneText, "dialogConfirmationOneText");
        Intrinsics.checkNotNullParameter(dialogConfirmationTwoText, "dialogConfirmationTwoText");
        Intrinsics.checkNotNullParameter(hintAttachment, "hintAttachment");
        return new CasesText(saleOneHintText, saleTenHintText, uniqueCaseHintText, scaleHintText, dialogConfirmationOneText, dialogConfirmationTwoText, hintAttachment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesText)) {
            return false;
        }
        CasesText casesText = (CasesText) other;
        return Intrinsics.areEqual(this.saleOneHintText, casesText.saleOneHintText) && Intrinsics.areEqual(this.saleTenHintText, casesText.saleTenHintText) && Intrinsics.areEqual(this.uniqueCaseHintText, casesText.uniqueCaseHintText) && Intrinsics.areEqual(this.scaleHintText, casesText.scaleHintText) && Intrinsics.areEqual(this.dialogConfirmationOneText, casesText.dialogConfirmationOneText) && Intrinsics.areEqual(this.dialogConfirmationTwoText, casesText.dialogConfirmationTwoText) && Intrinsics.areEqual(this.hintAttachment, casesText.hintAttachment);
    }

    public int hashCode() {
        return (((((((((((this.saleOneHintText.hashCode() * 31) + this.saleTenHintText.hashCode()) * 31) + this.uniqueCaseHintText.hashCode()) * 31) + this.scaleHintText.hashCode()) * 31) + this.dialogConfirmationOneText.hashCode()) * 31) + this.dialogConfirmationTwoText.hashCode()) * 31) + this.hintAttachment.hashCode();
    }

    @NotNull
    public String toString() {
        AnnotatedString annotatedString = this.saleOneHintText;
        AnnotatedString annotatedString2 = this.saleTenHintText;
        AnnotatedString annotatedString3 = this.uniqueCaseHintText;
        AnnotatedString annotatedString4 = this.scaleHintText;
        AnnotatedString annotatedString5 = this.dialogConfirmationOneText;
        AnnotatedString annotatedString6 = this.dialogConfirmationTwoText;
        return "CasesText(saleOneHintText=" + ((Object) annotatedString) + ", saleTenHintText=" + ((Object) annotatedString2) + ", uniqueCaseHintText=" + ((Object) annotatedString3) + ", scaleHintText=" + ((Object) annotatedString4) + ", dialogConfirmationOneText=" + ((Object) annotatedString5) + ", dialogConfirmationTwoText=" + ((Object) annotatedString6) + ", hintAttachment=" + this.hintAttachment + ")";
    }

    public CasesText(@NotNull AnnotatedString saleOneHintText, @NotNull AnnotatedString saleTenHintText, @NotNull AnnotatedString uniqueCaseHintText, @NotNull AnnotatedString scaleHintText, @NotNull AnnotatedString dialogConfirmationOneText, @NotNull AnnotatedString dialogConfirmationTwoText, @NotNull List<CommonTutorialTextsWithImage> hintAttachment) {
        Intrinsics.checkNotNullParameter(saleOneHintText, "saleOneHintText");
        Intrinsics.checkNotNullParameter(saleTenHintText, "saleTenHintText");
        Intrinsics.checkNotNullParameter(uniqueCaseHintText, "uniqueCaseHintText");
        Intrinsics.checkNotNullParameter(scaleHintText, "scaleHintText");
        Intrinsics.checkNotNullParameter(dialogConfirmationOneText, "dialogConfirmationOneText");
        Intrinsics.checkNotNullParameter(dialogConfirmationTwoText, "dialogConfirmationTwoText");
        Intrinsics.checkNotNullParameter(hintAttachment, "hintAttachment");
        this.saleOneHintText = saleOneHintText;
        this.saleTenHintText = saleTenHintText;
        this.uniqueCaseHintText = uniqueCaseHintText;
        this.scaleHintText = scaleHintText;
        this.dialogConfirmationOneText = dialogConfirmationOneText;
        this.dialogConfirmationTwoText = dialogConfirmationTwoText;
        this.hintAttachment = hintAttachment;
    }

    public /* synthetic */ CasesText(AnnotatedString annotatedString, AnnotatedString annotatedString2, AnnotatedString annotatedString3, AnnotatedString annotatedString4, AnnotatedString annotatedString5, AnnotatedString annotatedString6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i & 2) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString2, (i & 4) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString3, (i & 8) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString4, (i & 16) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString5, (i & 32) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString6, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final AnnotatedString getSaleOneHintText() {
        return this.saleOneHintText;
    }

    @NotNull
    public final AnnotatedString getSaleTenHintText() {
        return this.saleTenHintText;
    }

    @NotNull
    public final AnnotatedString getUniqueCaseHintText() {
        return this.uniqueCaseHintText;
    }

    @NotNull
    public final AnnotatedString getScaleHintText() {
        return this.scaleHintText;
    }

    @NotNull
    public final AnnotatedString getDialogConfirmationOneText() {
        return this.dialogConfirmationOneText;
    }

    public final void setDialogConfirmationOneText(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        this.dialogConfirmationOneText = annotatedString;
    }

    @NotNull
    public final AnnotatedString getDialogConfirmationTwoText() {
        return this.dialogConfirmationTwoText;
    }

    public final void setDialogConfirmationTwoText(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        this.dialogConfirmationTwoText = annotatedString;
    }

    @NotNull
    public final List<CommonTutorialTextsWithImage> getHintAttachment() {
        return this.hintAttachment;
    }
}

