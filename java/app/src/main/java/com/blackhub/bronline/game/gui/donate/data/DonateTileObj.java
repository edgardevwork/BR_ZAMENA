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

