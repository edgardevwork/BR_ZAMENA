package com.blackhub.bronline.game.gui.taxi;

import android.text.SpannedString;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0002\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\u0013\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020 HÖ\u0001J\t\u00106\u001a\u00020\bHÖ\u0001R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010#R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010#¨\u00067"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxi/TaxiUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "brTaxiStart", "Landroid/text/SpannedString;", "brTaxiEnd", "brTaxiDist", "brTaxiTime", ClientCookie.COMMENT_ATTR, "", "brTaxiPrice", "brTaxiTypeText", "brTaxiRating", "brTaxiCountOrders", "brTaxiCash", "isHasComment", "", "isCommentVisible", "isNeedClose", "(Landroid/text/SpannedString;Landroid/text/SpannedString;Landroid/text/SpannedString;Landroid/text/SpannedString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getBrTaxiCash", "()Ljava/lang/String;", "getBrTaxiCountOrders", "getBrTaxiDist", "()Landroid/text/SpannedString;", "getBrTaxiEnd", "getBrTaxiPrice", "getBrTaxiRating", "getBrTaxiStart", "getBrTaxiTime", "getBrTaxiTypeText", "getComment", "commentResId", "", "getCommentResId", "()I", "()Z", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TaxiUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final String brTaxiCash;

    @NotNull
    public final String brTaxiCountOrders;

    @NotNull
    public final SpannedString brTaxiDist;

    @NotNull
    public final SpannedString brTaxiEnd;

    @NotNull
    public final String brTaxiPrice;

    @NotNull
    public final String brTaxiRating;

    @NotNull
    public final SpannedString brTaxiStart;

    @NotNull
    public final SpannedString brTaxiTime;

    @NotNull
    public final String brTaxiTypeText;

    @NotNull
    public final String comment;
    public final boolean isCommentVisible;
    public final boolean isHasComment;
    public final boolean isNeedClose;

    public TaxiUiState() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, false, 8191, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SpannedString getBrTaxiStart() {
        return this.brTaxiStart;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getBrTaxiCash() {
        return this.brTaxiCash;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsHasComment() {
        return this.isHasComment;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsCommentVisible() {
        return this.isCommentVisible;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SpannedString getBrTaxiEnd() {
        return this.brTaxiEnd;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SpannedString getBrTaxiDist() {
        return this.brTaxiDist;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SpannedString getBrTaxiTime() {
        return this.brTaxiTime;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBrTaxiPrice() {
        return this.brTaxiPrice;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getBrTaxiTypeText() {
        return this.brTaxiTypeText;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getBrTaxiRating() {
        return this.brTaxiRating;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getBrTaxiCountOrders() {
        return this.brTaxiCountOrders;
    }

    @NotNull
    public final TaxiUiState copy(@NotNull SpannedString brTaxiStart, @NotNull SpannedString brTaxiEnd, @NotNull SpannedString brTaxiDist, @NotNull SpannedString brTaxiTime, @NotNull String comment, @NotNull String brTaxiPrice, @NotNull String brTaxiTypeText, @NotNull String brTaxiRating, @NotNull String brTaxiCountOrders, @NotNull String brTaxiCash, boolean isHasComment, boolean isCommentVisible, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(brTaxiStart, "brTaxiStart");
        Intrinsics.checkNotNullParameter(brTaxiEnd, "brTaxiEnd");
        Intrinsics.checkNotNullParameter(brTaxiDist, "brTaxiDist");
        Intrinsics.checkNotNullParameter(brTaxiTime, "brTaxiTime");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(brTaxiPrice, "brTaxiPrice");
        Intrinsics.checkNotNullParameter(brTaxiTypeText, "brTaxiTypeText");
        Intrinsics.checkNotNullParameter(brTaxiRating, "brTaxiRating");
        Intrinsics.checkNotNullParameter(brTaxiCountOrders, "brTaxiCountOrders");
        Intrinsics.checkNotNullParameter(brTaxiCash, "brTaxiCash");
        return new TaxiUiState(brTaxiStart, brTaxiEnd, brTaxiDist, brTaxiTime, comment, brTaxiPrice, brTaxiTypeText, brTaxiRating, brTaxiCountOrders, brTaxiCash, isHasComment, isCommentVisible, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxiUiState)) {
            return false;
        }
        TaxiUiState taxiUiState = (TaxiUiState) other;
        return Intrinsics.areEqual(this.brTaxiStart, taxiUiState.brTaxiStart) && Intrinsics.areEqual(this.brTaxiEnd, taxiUiState.brTaxiEnd) && Intrinsics.areEqual(this.brTaxiDist, taxiUiState.brTaxiDist) && Intrinsics.areEqual(this.brTaxiTime, taxiUiState.brTaxiTime) && Intrinsics.areEqual(this.comment, taxiUiState.comment) && Intrinsics.areEqual(this.brTaxiPrice, taxiUiState.brTaxiPrice) && Intrinsics.areEqual(this.brTaxiTypeText, taxiUiState.brTaxiTypeText) && Intrinsics.areEqual(this.brTaxiRating, taxiUiState.brTaxiRating) && Intrinsics.areEqual(this.brTaxiCountOrders, taxiUiState.brTaxiCountOrders) && Intrinsics.areEqual(this.brTaxiCash, taxiUiState.brTaxiCash) && this.isHasComment == taxiUiState.isHasComment && this.isCommentVisible == taxiUiState.isCommentVisible && this.isNeedClose == taxiUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.brTaxiStart.hashCode() * 31) + this.brTaxiEnd.hashCode()) * 31) + this.brTaxiDist.hashCode()) * 31) + this.brTaxiTime.hashCode()) * 31) + this.comment.hashCode()) * 31) + this.brTaxiPrice.hashCode()) * 31) + this.brTaxiTypeText.hashCode()) * 31) + this.brTaxiRating.hashCode()) * 31) + this.brTaxiCountOrders.hashCode()) * 31) + this.brTaxiCash.hashCode()) * 31) + Boolean.hashCode(this.isHasComment)) * 31) + Boolean.hashCode(this.isCommentVisible)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        SpannedString spannedString = this.brTaxiStart;
        SpannedString spannedString2 = this.brTaxiEnd;
        SpannedString spannedString3 = this.brTaxiDist;
        SpannedString spannedString4 = this.brTaxiTime;
        return "TaxiUiState(brTaxiStart=" + ((Object) spannedString) + ", brTaxiEnd=" + ((Object) spannedString2) + ", brTaxiDist=" + ((Object) spannedString3) + ", brTaxiTime=" + ((Object) spannedString4) + ", comment=" + this.comment + ", brTaxiPrice=" + this.brTaxiPrice + ", brTaxiTypeText=" + this.brTaxiTypeText + ", brTaxiRating=" + this.brTaxiRating + ", brTaxiCountOrders=" + this.brTaxiCountOrders + ", brTaxiCash=" + this.brTaxiCash + ", isHasComment=" + this.isHasComment + ", isCommentVisible=" + this.isCommentVisible + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public TaxiUiState(@NotNull SpannedString brTaxiStart, @NotNull SpannedString brTaxiEnd, @NotNull SpannedString brTaxiDist, @NotNull SpannedString brTaxiTime, @NotNull String comment, @NotNull String brTaxiPrice, @NotNull String brTaxiTypeText, @NotNull String brTaxiRating, @NotNull String brTaxiCountOrders, @NotNull String brTaxiCash, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(brTaxiStart, "brTaxiStart");
        Intrinsics.checkNotNullParameter(brTaxiEnd, "brTaxiEnd");
        Intrinsics.checkNotNullParameter(brTaxiDist, "brTaxiDist");
        Intrinsics.checkNotNullParameter(brTaxiTime, "brTaxiTime");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(brTaxiPrice, "brTaxiPrice");
        Intrinsics.checkNotNullParameter(brTaxiTypeText, "brTaxiTypeText");
        Intrinsics.checkNotNullParameter(brTaxiRating, "brTaxiRating");
        Intrinsics.checkNotNullParameter(brTaxiCountOrders, "brTaxiCountOrders");
        Intrinsics.checkNotNullParameter(brTaxiCash, "brTaxiCash");
        this.brTaxiStart = brTaxiStart;
        this.brTaxiEnd = brTaxiEnd;
        this.brTaxiDist = brTaxiDist;
        this.brTaxiTime = brTaxiTime;
        this.comment = comment;
        this.brTaxiPrice = brTaxiPrice;
        this.brTaxiTypeText = brTaxiTypeText;
        this.brTaxiRating = brTaxiRating;
        this.brTaxiCountOrders = brTaxiCountOrders;
        this.brTaxiCash = brTaxiCash;
        this.isHasComment = z;
        this.isCommentVisible = z2;
        this.isNeedClose = z3;
    }

    public /* synthetic */ TaxiUiState(SpannedString spannedString, SpannedString spannedString2, SpannedString spannedString3, SpannedString spannedString4, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SpannedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE)) : spannedString, (i & 2) != 0 ? new SpannedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE)) : spannedString2, (i & 4) != 0 ? new SpannedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE)) : spannedString3, (i & 8) != 0 ? new SpannedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE)) : spannedString4, (i & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i & 256) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i & 512) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str6, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? false : z2, (i & 4096) == 0 ? z3 : false);
    }

    @NotNull
    public final SpannedString getBrTaxiStart() {
        return this.brTaxiStart;
    }

    @NotNull
    public final SpannedString getBrTaxiEnd() {
        return this.brTaxiEnd;
    }

    @NotNull
    public final SpannedString getBrTaxiDist() {
        return this.brTaxiDist;
    }

    @NotNull
    public final SpannedString getBrTaxiTime() {
        return this.brTaxiTime;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final String getBrTaxiPrice() {
        return this.brTaxiPrice;
    }

    @NotNull
    public final String getBrTaxiTypeText() {
        return this.brTaxiTypeText;
    }

    @NotNull
    public final String getBrTaxiRating() {
        return this.brTaxiRating;
    }

    @NotNull
    public final String getBrTaxiCountOrders() {
        return this.brTaxiCountOrders;
    }

    @NotNull
    public final String getBrTaxiCash() {
        return this.brTaxiCash;
    }

    public final boolean isHasComment() {
        return this.isHasComment;
    }

    public final boolean isCommentVisible() {
        return this.isCommentVisible;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    @DrawableRes
    public final int getCommentResId() {
        return this.isHasComment ? R.drawable.ic_comment_gradient : R.drawable.ic_comment;
    }
}
