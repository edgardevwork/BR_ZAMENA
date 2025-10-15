package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsSortByItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsSortByItem;", "", "title", "", "isClicked", "", "(Ljava/lang/String;Z)V", "()Z", "setClicked", "(Z)V", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
