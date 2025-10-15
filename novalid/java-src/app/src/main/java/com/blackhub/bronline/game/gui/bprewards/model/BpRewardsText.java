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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsText;", "", "titleText", "Landroidx/compose/ui/text/AnnotatedString;", "tutorialOpenCasesText", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;)V", "getTitleText", "()Landroidx/compose/ui/text/AnnotatedString;", "getTutorialOpenCasesText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
