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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopList;", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopItem;", "itemClicked", "", "(Ljava/util/List;I)V", "getItemClicked", "()I", "setItemClicked", "(I)V", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
