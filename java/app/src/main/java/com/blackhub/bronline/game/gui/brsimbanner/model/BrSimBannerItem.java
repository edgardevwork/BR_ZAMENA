package com.blackhub.bronline.game.gui.brsimbanner.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class BrSimBannerItem {
    public static final int $stable = 8;

    @NotNull
    public final List<BrSimBannerItemForRowStateModel> listOfBotItems;

    @NotNull
    public final List<BrSimBannerItemForRowStateModel> listOfTopItems;

    @NotNull
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrSimBannerItem copy$default(BrSimBannerItem brSimBannerItem, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brSimBannerItem.text;
        }
        if ((i & 2) != 0) {
            list = brSimBannerItem.listOfTopItems;
        }
        if ((i & 4) != 0) {
            list2 = brSimBannerItem.listOfBotItems;
        }
        return brSimBannerItem.copy(str, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<BrSimBannerItemForRowStateModel> component2() {
        return this.listOfTopItems;
    }

    @NotNull
    public final List<BrSimBannerItemForRowStateModel> component3() {
        return this.listOfBotItems;
    }

    @NotNull
    public final BrSimBannerItem copy(@NotNull String text, @NotNull List<BrSimBannerItemForRowStateModel> listOfTopItems, @NotNull List<BrSimBannerItemForRowStateModel> listOfBotItems) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(listOfTopItems, "listOfTopItems");
        Intrinsics.checkNotNullParameter(listOfBotItems, "listOfBotItems");
        return new BrSimBannerItem(text, listOfTopItems, listOfBotItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrSimBannerItem)) {
            return false;
        }
        BrSimBannerItem brSimBannerItem = (BrSimBannerItem) other;
        return Intrinsics.areEqual(this.text, brSimBannerItem.text) && Intrinsics.areEqual(this.listOfTopItems, brSimBannerItem.listOfTopItems) && Intrinsics.areEqual(this.listOfBotItems, brSimBannerItem.listOfBotItems);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.listOfTopItems.hashCode()) * 31) + this.listOfBotItems.hashCode();
    }

    @NotNull
    public String toString() {
        return "BrSimBannerItem(text=" + this.text + ", listOfTopItems=" + this.listOfTopItems + ", listOfBotItems=" + this.listOfBotItems + ")";
    }

    public BrSimBannerItem(@NotNull String text, @NotNull List<BrSimBannerItemForRowStateModel> listOfTopItems, @NotNull List<BrSimBannerItemForRowStateModel> listOfBotItems) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(listOfTopItems, "listOfTopItems");
        Intrinsics.checkNotNullParameter(listOfBotItems, "listOfBotItems");
        this.text = text;
        this.listOfTopItems = listOfTopItems;
        this.listOfBotItems = listOfBotItems;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<BrSimBannerItemForRowStateModel> getListOfTopItems() {
        return this.listOfTopItems;
    }

    @NotNull
    public final List<BrSimBannerItemForRowStateModel> getListOfBotItems() {
        return this.listOfBotItems;
    }
}

