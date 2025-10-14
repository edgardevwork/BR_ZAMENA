package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsShopItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionsShopList {
    public static final int $stable = 8;
    public int itemClicked;

    @SerializedName("fractionMenuStore")
    @Nullable
    public final List<FractionsShopItem> list;

    public FractionsShopList() {
        this(null, 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionsShopList copy$default(FractionsShopList fractionsShopList, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = fractionsShopList.list;
        }
        if ((i2 & 2) != 0) {
            i = fractionsShopList.itemClicked;
        }
        return fractionsShopList.copy(list, i);
    }

    @Nullable
    public final List<FractionsShopItem> component1() {
        return this.list;
    }

    /* renamed from: component2, reason: from getter */
    public final int getItemClicked() {
        return this.itemClicked;
    }

    @NotNull
    public final FractionsShopList copy(@Nullable List<FractionsShopItem> list, int itemClicked) {
        return new FractionsShopList(list, itemClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsShopList)) {
            return false;
        }
        FractionsShopList fractionsShopList = (FractionsShopList) other;
        return Intrinsics.areEqual(this.list, fractionsShopList.list) && this.itemClicked == fractionsShopList.itemClicked;
    }

    public int hashCode() {
        List<FractionsShopItem> list = this.list;
        return ((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.itemClicked);
    }

    @NotNull
    public String toString() {
        return "FractionsShopList(list=" + this.list + ", itemClicked=" + this.itemClicked + ")";
    }

    public FractionsShopList(@Nullable List<FractionsShopItem> list, int i) {
        this.list = list;
        this.itemClicked = i;
    }

    public /* synthetic */ FractionsShopList(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? -1 : i);
    }

    @Nullable
    public final List<FractionsShopItem> getList() {
        return this.list;
    }

    public final int getItemClicked() {
        return this.itemClicked;
    }

    public final void setItemClicked(int i) {
        this.itemClicked = i;
    }
}

