package com.blackhub.bronline.game.gui.cases.model;

import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBannerAttachment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J}\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u00063"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;", "", "bannerBgImage", "Landroid/graphics/Bitmap;", "bannerCaseImage", "bannerRightImage", "currentCaseTitle", "", "congratulationText", "currentPrizesText", "title", "Landroidx/compose/ui/text/AnnotatedString;", "description", "instructionRight", "buttonText", "selectedCase", "Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerSelectedCase;", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerSelectedCase;)V", "getBannerBgImage", "()Landroid/graphics/Bitmap;", "getBannerCaseImage", "getBannerRightImage", "getButtonText", "()Ljava/lang/String;", "getCongratulationText", "getCurrentCaseTitle", "getCurrentPrizesText", "getDescription", "()Landroidx/compose/ui/text/AnnotatedString;", "getInstructionRight", "getSelectedCase", "()Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerSelectedCase;", "getTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CasesBannerAttachment {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bannerBgImage;

    @Nullable
    public final Bitmap bannerCaseImage;

    @Nullable
    public final Bitmap bannerRightImage;

    @NotNull
    public final String buttonText;

    @NotNull
    public final String congratulationText;

    @NotNull
    public final String currentCaseTitle;

    @NotNull
    public final String currentPrizesText;

    @NotNull
    public final AnnotatedString description;

    @NotNull
    public final AnnotatedString instructionRight;

    @NotNull
    public final CasesBannerSelectedCase selectedCase;

    @NotNull
    public final AnnotatedString title;

    public CasesBannerAttachment() {
        this(null, null, null, null, null, null, null, null, null, null, null, DoubleToDecimal.BQ_MASK, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getBannerBgImage() {
        return this.bannerBgImage;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final CasesBannerSelectedCase getSelectedCase() {
        return this.selectedCase;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getBannerCaseImage() {
        return this.bannerCaseImage;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Bitmap getBannerRightImage() {
        return this.bannerRightImage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCurrentCaseTitle() {
        return this.currentCaseTitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCongratulationText() {
        return this.congratulationText;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCurrentPrizesText() {
        return this.currentPrizesText;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AnnotatedString getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AnnotatedString getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final AnnotatedString getInstructionRight() {
        return this.instructionRight;
    }

    @NotNull
    public final CasesBannerAttachment copy(@Nullable Bitmap bannerBgImage, @Nullable Bitmap bannerCaseImage, @Nullable Bitmap bannerRightImage, @NotNull String currentCaseTitle, @NotNull String congratulationText, @NotNull String currentPrizesText, @NotNull AnnotatedString title, @NotNull AnnotatedString description, @NotNull AnnotatedString instructionRight, @NotNull String buttonText, @NotNull CasesBannerSelectedCase selectedCase) {
        Intrinsics.checkNotNullParameter(currentCaseTitle, "currentCaseTitle");
        Intrinsics.checkNotNullParameter(congratulationText, "congratulationText");
        Intrinsics.checkNotNullParameter(currentPrizesText, "currentPrizesText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instructionRight, "instructionRight");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(selectedCase, "selectedCase");
        return new CasesBannerAttachment(bannerBgImage, bannerCaseImage, bannerRightImage, currentCaseTitle, congratulationText, currentPrizesText, title, description, instructionRight, buttonText, selectedCase);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesBannerAttachment)) {
            return false;
        }
        CasesBannerAttachment casesBannerAttachment = (CasesBannerAttachment) other;
        return Intrinsics.areEqual(this.bannerBgImage, casesBannerAttachment.bannerBgImage) && Intrinsics.areEqual(this.bannerCaseImage, casesBannerAttachment.bannerCaseImage) && Intrinsics.areEqual(this.bannerRightImage, casesBannerAttachment.bannerRightImage) && Intrinsics.areEqual(this.currentCaseTitle, casesBannerAttachment.currentCaseTitle) && Intrinsics.areEqual(this.congratulationText, casesBannerAttachment.congratulationText) && Intrinsics.areEqual(this.currentPrizesText, casesBannerAttachment.currentPrizesText) && Intrinsics.areEqual(this.title, casesBannerAttachment.title) && Intrinsics.areEqual(this.description, casesBannerAttachment.description) && Intrinsics.areEqual(this.instructionRight, casesBannerAttachment.instructionRight) && Intrinsics.areEqual(this.buttonText, casesBannerAttachment.buttonText) && Intrinsics.areEqual(this.selectedCase, casesBannerAttachment.selectedCase);
    }

    public int hashCode() {
        Bitmap bitmap = this.bannerBgImage;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.bannerCaseImage;
        int iHashCode2 = (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.bannerRightImage;
        return ((((((((((((((((iHashCode2 + (bitmap3 != null ? bitmap3.hashCode() : 0)) * 31) + this.currentCaseTitle.hashCode()) * 31) + this.congratulationText.hashCode()) * 31) + this.currentPrizesText.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.instructionRight.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.selectedCase.hashCode();
    }

    @NotNull
    public String toString() {
        Bitmap bitmap = this.bannerBgImage;
        Bitmap bitmap2 = this.bannerCaseImage;
        Bitmap bitmap3 = this.bannerRightImage;
        String str = this.currentCaseTitle;
        String str2 = this.congratulationText;
        String str3 = this.currentPrizesText;
        AnnotatedString annotatedString = this.title;
        AnnotatedString annotatedString2 = this.description;
        AnnotatedString annotatedString3 = this.instructionRight;
        return "CasesBannerAttachment(bannerBgImage=" + bitmap + ", bannerCaseImage=" + bitmap2 + ", bannerRightImage=" + bitmap3 + ", currentCaseTitle=" + str + ", congratulationText=" + str2 + ", currentPrizesText=" + str3 + ", title=" + ((Object) annotatedString) + ", description=" + ((Object) annotatedString2) + ", instructionRight=" + ((Object) annotatedString3) + ", buttonText=" + this.buttonText + ", selectedCase=" + this.selectedCase + ")";
    }

    public CasesBannerAttachment(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, @Nullable Bitmap bitmap3, @NotNull String currentCaseTitle, @NotNull String congratulationText, @NotNull String currentPrizesText, @NotNull AnnotatedString title, @NotNull AnnotatedString description, @NotNull AnnotatedString instructionRight, @NotNull String buttonText, @NotNull CasesBannerSelectedCase selectedCase) {
        Intrinsics.checkNotNullParameter(currentCaseTitle, "currentCaseTitle");
        Intrinsics.checkNotNullParameter(congratulationText, "congratulationText");
        Intrinsics.checkNotNullParameter(currentPrizesText, "currentPrizesText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instructionRight, "instructionRight");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(selectedCase, "selectedCase");
        this.bannerBgImage = bitmap;
        this.bannerCaseImage = bitmap2;
        this.bannerRightImage = bitmap3;
        this.currentCaseTitle = currentCaseTitle;
        this.congratulationText = congratulationText;
        this.currentPrizesText = currentPrizesText;
        this.title = title;
        this.description = description;
        this.instructionRight = instructionRight;
        this.buttonText = buttonText;
        this.selectedCase = selectedCase;
    }

    @Nullable
    public final Bitmap getBannerBgImage() {
        return this.bannerBgImage;
    }

    @Nullable
    public final Bitmap getBannerCaseImage() {
        return this.bannerCaseImage;
    }

    @Nullable
    public final Bitmap getBannerRightImage() {
        return this.bannerRightImage;
    }

    public /* synthetic */ CasesBannerAttachment(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, String str, String str2, String str3, AnnotatedString annotatedString, AnnotatedString annotatedString2, AnnotatedString annotatedString3, String str4, CasesBannerSelectedCase casesBannerSelectedCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? null : bitmap2, (i & 4) == 0 ? bitmap3 : null, (i & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i & 64) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i & 128) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString2, (i & 256) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString3, (i & 512) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i & 1024) != 0 ? new CasesBannerSelectedCase(null, null, null, null, 15, null) : casesBannerSelectedCase);
    }

    @NotNull
    public final String getCurrentCaseTitle() {
        return this.currentCaseTitle;
    }

    @NotNull
    public final String getCongratulationText() {
        return this.congratulationText;
    }

    @NotNull
    public final String getCurrentPrizesText() {
        return this.currentPrizesText;
    }

    @NotNull
    public final AnnotatedString getTitle() {
        return this.title;
    }

    @NotNull
    public final AnnotatedString getDescription() {
        return this.description;
    }

    @NotNull
    public final AnnotatedString getInstructionRight() {
        return this.instructionRight;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final CasesBannerSelectedCase getSelectedCase() {
        return this.selectedCase;
    }
}
