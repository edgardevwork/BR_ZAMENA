package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateItemList.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/data/DonateItemList;", "", "array", "", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "(Ljava/util/List;)V", "getArray", "()Ljava/util/List;", "setArray", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DonateItemList {
    public static final int $stable = 8;

    @SerializedName("array")
    @NotNull
    public List<DonateItem> array;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DonateItemList copy$default(DonateItemList donateItemList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = donateItemList.array;
        }
        return donateItemList.copy(list);
    }

    @NotNull
    public final List<DonateItem> component1() {
        return this.array;
    }

    @NotNull
    public final DonateItemList copy(@NotNull List<DonateItem> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new DonateItemList(array);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DonateItemList) && Intrinsics.areEqual(this.array, ((DonateItemList) other).array);
    }

    public int hashCode() {
        return this.array.hashCode();
    }

    @NotNull
    public String toString() {
        return "DonateItemList(array=" + this.array + ")";
    }

    public DonateItemList(@NotNull List<DonateItem> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @NotNull
    public final List<DonateItem> getArray() {
        return this.array;
    }

    public final void setArray(@NotNull List<DonateItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.array = list;
    }
}
