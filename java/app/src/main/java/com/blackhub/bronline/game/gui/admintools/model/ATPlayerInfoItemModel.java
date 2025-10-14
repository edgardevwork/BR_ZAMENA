package com.blackhub.bronline.game.gui.admintools.model;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATPlayerInfoItemModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class ATPlayerInfoItemModel {
    public static final int $stable = 0;

    @SerializedName("p")
    @Nullable
    public final Integer imageId;

    @SerializedName("n")
    @NotNull
    public final String text;

    @SerializedName("v")
    public final int value;

    public ATPlayerInfoItemModel() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ATPlayerInfoItemModel copy$default(ATPlayerInfoItemModel aTPlayerInfoItemModel, Integer num, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = aTPlayerInfoItemModel.imageId;
        }
        if ((i2 & 2) != 0) {
            str = aTPlayerInfoItemModel.text;
        }
        if ((i2 & 4) != 0) {
            i = aTPlayerInfoItemModel.value;
        }
        return aTPlayerInfoItemModel.copy(num, str, i);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getImageId() {
        return this.imageId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final ATPlayerInfoItemModel copy(@Nullable Integer imageId, @NotNull String text, int value) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ATPlayerInfoItemModel(imageId, text, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ATPlayerInfoItemModel)) {
            return false;
        }
        ATPlayerInfoItemModel aTPlayerInfoItemModel = (ATPlayerInfoItemModel) other;
        return Intrinsics.areEqual(this.imageId, aTPlayerInfoItemModel.imageId) && Intrinsics.areEqual(this.text, aTPlayerInfoItemModel.text) && this.value == aTPlayerInfoItemModel.value;
    }

    public int hashCode() {
        Integer num = this.imageId;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "ATPlayerInfoItemModel(imageId=" + this.imageId + ", text=" + this.text + ", value=" + this.value + ")";
    }

    public ATPlayerInfoItemModel(@Nullable Integer num, @NotNull String text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.imageId = num;
        this.text = text;
        this.value = i;
    }

    @Nullable
    public final Integer getImageId() {
        return this.imageId;
    }

    public /* synthetic */ ATPlayerInfoItemModel(Integer num, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }

    @DrawableRes
    public final int getImageRes() {
        Integer num = this.imageId;
        return (num != null && num.intValue() == 1) ? R.drawable.ic_player_info_level : (num != null && num.intValue() == 2) ? R.drawable.ic_player_info_hp : (num != null && num.intValue() == 3) ? R.drawable.ic_player_info_armor : (num != null && num.intValue() == 4) ? R.drawable.ic_player_info_speed : (num != null && num.intValue() == 5) ? R.drawable.ic_player_info_ping : (num != null && num.intValue() == 6) ? R.drawable.ic_player_info_money : (num != null && num.intValue() == 7) ? R.drawable.ic_player_info_transport : (num != null && num.intValue() == 8) ? R.drawable.ic_player_info_transport_strength : R.drawable.ic_br_logo;
    }
}

