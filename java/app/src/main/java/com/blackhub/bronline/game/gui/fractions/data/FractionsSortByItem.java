package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsSortByItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionsSortByItem {
    public static final int $stable = 8;
    public boolean isClicked;

    @NotNull
    public final String title;

    public static /* synthetic */ FractionsSortByItem copy$default(FractionsSortByItem fractionsSortByItem, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fractionsSortByItem.title;
        }
        if ((i & 2) != 0) {
            z = fractionsSortByItem.isClicked;
        }
        return fractionsSortByItem.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FractionsSortByItem copy(@NotNull String title, boolean isClicked) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new FractionsSortByItem(title, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsSortByItem)) {
            return false;
        }
        FractionsSortByItem fractionsSortByItem = (FractionsSortByItem) other;
        return Intrinsics.areEqual(this.title, fractionsSortByItem.title) && this.isClicked == fractionsSortByItem.isClicked;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "FractionsSortByItem(title=" + this.title + ", isClicked=" + this.isClicked + ")";
    }

    public FractionsSortByItem(@NotNull String title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.isClicked = z;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

