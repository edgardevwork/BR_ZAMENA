package com.blackhub.bronline.game.gui.brsimbanner.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerItem.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/brsimbanner/model/BrSimBannerItem;", "", "text", "", "listOfTopItems", "", "Lcom/blackhub/bronline/game/gui/brsimbanner/model/BrSimBannerItemForRowStateModel;", "listOfBotItems", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getListOfBotItems", "()Ljava/util/List;", "getListOfTopItems", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
