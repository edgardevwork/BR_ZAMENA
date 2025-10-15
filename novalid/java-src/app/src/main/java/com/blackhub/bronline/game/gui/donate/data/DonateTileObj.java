package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateTileObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/data/DonateTileObj;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", Const.PAGE_KEY, "", "(Ljava/util/List;I)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getPage", "()I", "setPage", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DonateTileObj {
    public static final int $stable = 8;

    @NotNull
    public List<DonateItem> items;
    public int page;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DonateTileObj copy$default(DonateTileObj donateTileObj, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = donateTileObj.items;
        }
        if ((i2 & 2) != 0) {
            i = donateTileObj.page;
        }
        return donateTileObj.copy(list, i);
    }

    @NotNull
    public final List<DonateItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final DonateTileObj copy(@NotNull List<DonateItem> items, int page) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new DonateTileObj(items, page);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DonateTileObj)) {
            return false;
        }
        DonateTileObj donateTileObj = (DonateTileObj) other;
        return Intrinsics.areEqual(this.items, donateTileObj.items) && this.page == donateTileObj.page;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Integer.hashCode(this.page);
    }

    @NotNull
    public String toString() {
        return "DonateTileObj(items=" + this.items + ", page=" + this.page + ")";
    }

    public DonateTileObj(@NotNull List<DonateItem> items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.page = i;
    }

    @NotNull
    public final List<DonateItem> getItems() {
        return this.items;
    }

    public final void setItems(@NotNull List<DonateItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        this.page = i;
    }
}
