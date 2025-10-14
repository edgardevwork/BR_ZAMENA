package com.blackhub.bronline.game.gui.bprewards.model;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsText.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class BpRewardsText {
    public static final int $stable = 0;

    @NotNull
    public final AnnotatedString titleText;

    @NotNull
    public final AnnotatedString tutorialOpenCasesText;

    public BpRewardsText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BpRewardsText copy$default(BpRewardsText bpRewardsText, AnnotatedString annotatedString, AnnotatedString annotatedString2, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = bpRewardsText.titleText;
        }
        if ((i & 2) != 0) {
            annotatedString2 = bpRewardsText.tutorialOpenCasesText;
        }
        return bpRewardsText.copy(annotatedString, annotatedString2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AnnotatedString getTitleText() {
        return this.titleText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getTutorialOpenCasesText() {
        return this.tutorialOpenCasesText;
    }

    @NotNull
    public final BpRewardsText copy(@NotNull AnnotatedString titleText, @NotNull AnnotatedString tutorialOpenCasesText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(tutorialOpenCasesText, "tutorialOpenCasesText");
        return new BpRewardsText(titleText, tutorialOpenCasesText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BpRewardsText)) {
            return false;
        }
        BpRewardsText bpRewardsText = (BpRewardsText) other;
        return Intrinsics.areEqual(this.titleText, bpRewardsText.titleText) && Intrinsics.areEqual(this.tutorialOpenCasesText, bpRewardsText.tutorialOpenCasesText);
    }

    public int hashCode() {
        return (this.titleText.hashCode() * 31) + this.tutorialOpenCasesText.hashCode();
    }

    @NotNull
    public String toString() {
        return "BpRewardsText(titleText=" + ((Object) this.titleText) + ", tutorialOpenCasesText=" + ((Object) this.tutorialOpenCasesText) + ")";
    }

    public BpRewardsText(@NotNull AnnotatedString titleText, @NotNull AnnotatedString tutorialOpenCasesText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(tutorialOpenCasesText, "tutorialOpenCasesText");
        this.titleText = titleText;
        this.tutorialOpenCasesText = tutorialOpenCasesText;
    }

    public /* synthetic */ BpRewardsText(AnnotatedString annotatedString, AnnotatedString annotatedString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            annotatedString = new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null);
        }
        if ((i & 2) != 0) {
            annotatedString2 = new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null);
        }
        this(annotatedString, annotatedString2);
    }

    @NotNull
    public final AnnotatedString getTitleText() {
        return this.titleText;
    }

    @NotNull
    public final AnnotatedString getTutorialOpenCasesText() {
        return this.tutorialOpenCasesText;
    }
}

