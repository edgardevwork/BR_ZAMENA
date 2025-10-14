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

