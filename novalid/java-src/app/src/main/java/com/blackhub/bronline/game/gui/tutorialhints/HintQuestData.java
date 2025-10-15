package com.blackhub.bronline.game.gui.tutorialhints;

import android.text.Spanned;
import android.text.SpannedString;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HintQuestData.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0016\u0010\u001c\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;", "", "questsText", "Landroid/text/Spanned;", "thisQuestsStatus", "", "maxQuestsStatus", "progressBarColor", "Landroidx/compose/ui/graphics/Color;", "ifMainQuest", "", "(Landroid/text/Spanned;IIJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIfMainQuest", "()Z", "getMaxQuestsStatus", "()I", "setMaxQuestsStatus", "(I)V", "getProgressBarColor-0d7_KjU", "()J", "J", "getQuestsText", "()Landroid/text/Spanned;", "getThisQuestsStatus", "setThisQuestsStatus", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "copy", "copy-42QJj7c", "(Landroid/text/Spanned;IIJZ)Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;", "equals", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHintQuestData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HintQuestData.kt\ncom/blackhub/bronline/game/gui/tutorialhints/HintQuestData\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,16:1\n28#2:17\n*S KotlinDebug\n*F\n+ 1 HintQuestData.kt\ncom/blackhub/bronline/game/gui/tutorialhints/HintQuestData\n*L\n10#1:17\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class HintQuestData {
    public static final int $stable = 8;
    public final boolean ifMainQuest;
    public int maxQuestsStatus;
    public final long progressBarColor;

    @NotNull
    public final Spanned questsText;
    public int thisQuestsStatus;

    public /* synthetic */ HintQuestData(Spanned spanned, int i, int i2, long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanned, i, i2, j, z);
    }

    /* renamed from: copy-42QJj7c$default, reason: not valid java name */
    public static /* synthetic */ HintQuestData m14759copy42QJj7c$default(HintQuestData hintQuestData, Spanned spanned, int i, int i2, long j, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            spanned = hintQuestData.questsText;
        }
        if ((i3 & 2) != 0) {
            i = hintQuestData.thisQuestsStatus;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = hintQuestData.maxQuestsStatus;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j = hintQuestData.progressBarColor;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            z = hintQuestData.ifMainQuest;
        }
        return hintQuestData.m14761copy42QJj7c(spanned, i4, i5, j2, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Spanned getQuestsText() {
        return this.questsText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getThisQuestsStatus() {
        return this.thisQuestsStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxQuestsStatus() {
        return this.maxQuestsStatus;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getProgressBarColor() {
        return this.progressBarColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIfMainQuest() {
        return this.ifMainQuest;
    }

    @NotNull
    /* renamed from: copy-42QJj7c, reason: not valid java name */
    public final HintQuestData m14761copy42QJj7c(@NotNull Spanned questsText, int thisQuestsStatus, int maxQuestsStatus, long progressBarColor, boolean ifMainQuest) {
        Intrinsics.checkNotNullParameter(questsText, "questsText");
        return new HintQuestData(questsText, thisQuestsStatus, maxQuestsStatus, progressBarColor, ifMainQuest, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintQuestData)) {
            return false;
        }
        HintQuestData hintQuestData = (HintQuestData) other;
        return Intrinsics.areEqual(this.questsText, hintQuestData.questsText) && this.thisQuestsStatus == hintQuestData.thisQuestsStatus && this.maxQuestsStatus == hintQuestData.maxQuestsStatus && Color.m11341equalsimpl0(this.progressBarColor, hintQuestData.progressBarColor) && this.ifMainQuest == hintQuestData.ifMainQuest;
    }

    public int hashCode() {
        return (((((((this.questsText.hashCode() * 31) + Integer.hashCode(this.thisQuestsStatus)) * 31) + Integer.hashCode(this.maxQuestsStatus)) * 31) + Color.m11347hashCodeimpl(this.progressBarColor)) * 31) + Boolean.hashCode(this.ifMainQuest);
    }

    @NotNull
    public String toString() {
        Spanned spanned = this.questsText;
        return "HintQuestData(questsText=" + ((Object) spanned) + ", thisQuestsStatus=" + this.thisQuestsStatus + ", maxQuestsStatus=" + this.maxQuestsStatus + ", progressBarColor=" + Color.m11348toStringimpl(this.progressBarColor) + ", ifMainQuest=" + this.ifMainQuest + ")";
    }

    public HintQuestData(Spanned questsText, int i, int i2, long j, boolean z) {
        Intrinsics.checkNotNullParameter(questsText, "questsText");
        this.questsText = questsText;
        this.thisQuestsStatus = i;
        this.maxQuestsStatus = i2;
        this.progressBarColor = j;
        this.ifMainQuest = z;
    }

    public /* synthetic */ HintQuestData(Spanned spanned, int i, int i2, long j, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? SpannedString.valueOf(AnyExtensionKt.empty(StringCompanionObject.INSTANCE)) : spanned, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j, (i3 & 16) == 0 ? z : false, null);
    }

    @NotNull
    public final Spanned getQuestsText() {
        return this.questsText;
    }

    public final int getThisQuestsStatus() {
        return this.thisQuestsStatus;
    }

    public final void setThisQuestsStatus(int i) {
        this.thisQuestsStatus = i;
    }

    public final int getMaxQuestsStatus() {
        return this.maxQuestsStatus;
    }

    public final void setMaxQuestsStatus(int i) {
        this.maxQuestsStatus = i;
    }

    /* renamed from: getProgressBarColor-0d7_KjU, reason: not valid java name */
    public final long m14762getProgressBarColor0d7_KjU() {
        return this.progressBarColor;
    }

    public final boolean getIfMainQuest() {
        return this.ifMainQuest;
    }
}
