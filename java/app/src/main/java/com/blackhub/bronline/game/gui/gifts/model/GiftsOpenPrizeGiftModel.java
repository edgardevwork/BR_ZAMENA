package com.blackhub.bronline.game.gui.gifts.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsOpenPrizeGiftModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class GiftsOpenPrizeGiftModel {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int giftId;

    @SerializedName("pn")
    @NotNull
    public final String textGift;

    @SerializedName("ct")
    public final int value;

    public GiftsOpenPrizeGiftModel() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ GiftsOpenPrizeGiftModel copy$default(GiftsOpenPrizeGiftModel giftsOpenPrizeGiftModel, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = giftsOpenPrizeGiftModel.giftId;
        }
        if ((i3 & 2) != 0) {
            i2 = giftsOpenPrizeGiftModel.value;
        }
        if ((i3 & 4) != 0) {
            str = giftsOpenPrizeGiftModel.textGift;
        }
        return giftsOpenPrizeGiftModel.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGiftId() {
        return this.giftId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTextGift() {
        return this.textGift;
    }

    @NotNull
    public final GiftsOpenPrizeGiftModel copy(int giftId, int value, @NotNull String textGift) {
        Intrinsics.checkNotNullParameter(textGift, "textGift");
        return new GiftsOpenPrizeGiftModel(giftId, value, textGift);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftsOpenPrizeGiftModel)) {
            return false;
        }
        GiftsOpenPrizeGiftModel giftsOpenPrizeGiftModel = (GiftsOpenPrizeGiftModel) other;
        return this.giftId == giftsOpenPrizeGiftModel.giftId && this.value == giftsOpenPrizeGiftModel.value && Intrinsics.areEqual(this.textGift, giftsOpenPrizeGiftModel.textGift);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.giftId) * 31) + Integer.hashCode(this.value)) * 31) + this.textGift.hashCode();
    }

    @NotNull
    public String toString() {
        return "GiftsOpenPrizeGiftModel(giftId=" + this.giftId + ", value=" + this.value + ", textGift=" + this.textGift + ")";
    }

    public GiftsOpenPrizeGiftModel(int i, int i2, @NotNull String textGift) {
        Intrinsics.checkNotNullParameter(textGift, "textGift");
        this.giftId = i;
        this.value = i2;
        this.textGift = textGift;
    }

    public final int getGiftId() {
        return this.giftId;
    }

    public final int getValue() {
        return this.value;
    }

    public /* synthetic */ GiftsOpenPrizeGiftModel(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str);
    }

    @NotNull
    public final String getTextGift() {
        return this.textGift;
    }
}

