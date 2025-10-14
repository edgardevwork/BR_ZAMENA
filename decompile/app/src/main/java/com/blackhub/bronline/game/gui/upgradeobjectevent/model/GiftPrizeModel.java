package com.blackhub.bronline.game.gui.upgradeobjectevent.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftPrizeModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/GiftPrizeModel;", "", "level", "", "ifReceived", "", FirebaseAnalytics.Param.CURRENCY, "progress", "", "prizeName", "", "(IZIFLjava/lang/String;)V", "getCurrency", "()I", "getIfReceived", "()Z", "getLevel", "getPrizeName", "()Ljava/lang/String;", "getProgress", "()F", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GiftPrizeModel {
    public static final int $stable = 0;
    public final int currency;
    public final boolean ifReceived;
    public final int level;

    @NotNull
    public final String prizeName;
    public final float progress;

    public GiftPrizeModel() {
        this(0, false, 0, 0.0f, null, 31, null);
    }

    public static /* synthetic */ GiftPrizeModel copy$default(GiftPrizeModel giftPrizeModel, int i, boolean z, int i2, float f, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = giftPrizeModel.level;
        }
        if ((i3 & 2) != 0) {
            z = giftPrizeModel.ifReceived;
        }
        boolean z2 = z;
        if ((i3 & 4) != 0) {
            i2 = giftPrizeModel.currency;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            f = giftPrizeModel.progress;
        }
        float f2 = f;
        if ((i3 & 16) != 0) {
            str = giftPrizeModel.prizeName;
        }
        return giftPrizeModel.copy(i, z2, i4, f2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIfReceived() {
        return this.ifReceived;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrency() {
        return this.currency;
    }

    /* renamed from: component4, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPrizeName() {
        return this.prizeName;
    }

    @NotNull
    public final GiftPrizeModel copy(int level, boolean ifReceived, int currency, float progress, @NotNull String prizeName) {
        Intrinsics.checkNotNullParameter(prizeName, "prizeName");
        return new GiftPrizeModel(level, ifReceived, currency, progress, prizeName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftPrizeModel)) {
            return false;
        }
        GiftPrizeModel giftPrizeModel = (GiftPrizeModel) other;
        return this.level == giftPrizeModel.level && this.ifReceived == giftPrizeModel.ifReceived && this.currency == giftPrizeModel.currency && Float.compare(this.progress, giftPrizeModel.progress) == 0 && Intrinsics.areEqual(this.prizeName, giftPrizeModel.prizeName);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.level) * 31) + Boolean.hashCode(this.ifReceived)) * 31) + Integer.hashCode(this.currency)) * 31) + Float.hashCode(this.progress)) * 31) + this.prizeName.hashCode();
    }

    @NotNull
    public String toString() {
        return "GiftPrizeModel(level=" + this.level + ", ifReceived=" + this.ifReceived + ", currency=" + this.currency + ", progress=" + this.progress + ", prizeName=" + this.prizeName + ")";
    }

    public GiftPrizeModel(int i, boolean z, int i2, float f, @NotNull String prizeName) {
        Intrinsics.checkNotNullParameter(prizeName, "prizeName");
        this.level = i;
        this.ifReceived = z;
        this.currency = i2;
        this.progress = f;
        this.prizeName = prizeName;
    }

    public final int getLevel() {
        return this.level;
    }

    public final boolean getIfReceived() {
        return this.ifReceived;
    }

    public final int getCurrency() {
        return this.currency;
    }

    public final float getProgress() {
        return this.progress;
    }

    public /* synthetic */ GiftPrizeModel(int i, boolean z, int i2, float f, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str);
    }

    @NotNull
    public final String getPrizeName() {
        return this.prizeName;
    }
}
