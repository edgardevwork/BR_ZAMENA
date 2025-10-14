package com.blackhub.bronline.game.gui.gasmangame.entitie;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GasmanDropAreaItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class GasmanDropAreaItem {
    public static final int $stable = 8;

    @NotNull
    public final List<Float> applyAngle;

    @NotNull
    public final GasmanDropAreaTag dropAreaTag;

    @NotNull
    public final ImageView dropAreaView;

    @NotNull
    public final List<ImageView> listOfDraggableItems;

    @NotNull
    public final GasmanPlot plot;
    public final float startAngle;

    public static /* synthetic */ GasmanDropAreaItem copy$default(GasmanDropAreaItem gasmanDropAreaItem, List list, ImageView imageView, GasmanDropAreaTag gasmanDropAreaTag, float f, List list2, GasmanPlot gasmanPlot, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gasmanDropAreaItem.listOfDraggableItems;
        }
        if ((i & 2) != 0) {
            imageView = gasmanDropAreaItem.dropAreaView;
        }
        ImageView imageView2 = imageView;
        if ((i & 4) != 0) {
            gasmanDropAreaTag = gasmanDropAreaItem.dropAreaTag;
        }
        GasmanDropAreaTag gasmanDropAreaTag2 = gasmanDropAreaTag;
        if ((i & 8) != 0) {
            f = gasmanDropAreaItem.startAngle;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            list2 = gasmanDropAreaItem.applyAngle;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            gasmanPlot = gasmanDropAreaItem.plot;
        }
        return gasmanDropAreaItem.copy(list, imageView2, gasmanDropAreaTag2, f2, list3, gasmanPlot);
    }

    @NotNull
    public final List<ImageView> component1() {
        return this.listOfDraggableItems;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageView getDropAreaView() {
        return this.dropAreaView;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final GasmanDropAreaTag getDropAreaTag() {
        return this.dropAreaTag;
    }

    /* renamed from: component4, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    @NotNull
    public final List<Float> component5() {
        return this.applyAngle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final GasmanPlot getPlot() {
        return this.plot;
    }

    @NotNull
    public final GasmanDropAreaItem copy(@NotNull List<ImageView> listOfDraggableItems, @NotNull ImageView dropAreaView, @NotNull GasmanDropAreaTag dropAreaTag, float startAngle, @NotNull List<Float> applyAngle, @NotNull GasmanPlot plot) {
        Intrinsics.checkNotNullParameter(listOfDraggableItems, "listOfDraggableItems");
        Intrinsics.checkNotNullParameter(dropAreaView, "dropAreaView");
        Intrinsics.checkNotNullParameter(dropAreaTag, "dropAreaTag");
        Intrinsics.checkNotNullParameter(applyAngle, "applyAngle");
        Intrinsics.checkNotNullParameter(plot, "plot");
        return new GasmanDropAreaItem(listOfDraggableItems, dropAreaView, dropAreaTag, startAngle, applyAngle, plot);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasmanDropAreaItem)) {
            return false;
        }
        GasmanDropAreaItem gasmanDropAreaItem = (GasmanDropAreaItem) other;
        return Intrinsics.areEqual(this.listOfDraggableItems, gasmanDropAreaItem.listOfDraggableItems) && Intrinsics.areEqual(this.dropAreaView, gasmanDropAreaItem.dropAreaView) && Intrinsics.areEqual(this.dropAreaTag, gasmanDropAreaItem.dropAreaTag) && Float.compare(this.startAngle, gasmanDropAreaItem.startAngle) == 0 && Intrinsics.areEqual(this.applyAngle, gasmanDropAreaItem.applyAngle) && Intrinsics.areEqual(this.plot, gasmanDropAreaItem.plot);
    }

    public int hashCode() {
        return (((((((((this.listOfDraggableItems.hashCode() * 31) + this.dropAreaView.hashCode()) * 31) + this.dropAreaTag.hashCode()) * 31) + Float.hashCode(this.startAngle)) * 31) + this.applyAngle.hashCode()) * 31) + this.plot.hashCode();
    }

    @NotNull
    public String toString() {
        return "GasmanDropAreaItem(listOfDraggableItems=" + this.listOfDraggableItems + ", dropAreaView=" + this.dropAreaView + ", dropAreaTag=" + this.dropAreaTag + ", startAngle=" + this.startAngle + ", applyAngle=" + this.applyAngle + ", plot=" + this.plot + ")";
    }

    public GasmanDropAreaItem(@NotNull List<ImageView> listOfDraggableItems, @NotNull ImageView dropAreaView, @NotNull GasmanDropAreaTag dropAreaTag, float f, @NotNull List<Float> applyAngle, @NotNull GasmanPlot plot) {
        Intrinsics.checkNotNullParameter(listOfDraggableItems, "listOfDraggableItems");
        Intrinsics.checkNotNullParameter(dropAreaView, "dropAreaView");
        Intrinsics.checkNotNullParameter(dropAreaTag, "dropAreaTag");
        Intrinsics.checkNotNullParameter(applyAngle, "applyAngle");
        Intrinsics.checkNotNullParameter(plot, "plot");
        this.listOfDraggableItems = listOfDraggableItems;
        this.dropAreaView = dropAreaView;
        this.dropAreaTag = dropAreaTag;
        this.startAngle = f;
        this.applyAngle = applyAngle;
        this.plot = plot;
    }

    @NotNull
    public final List<ImageView> getListOfDraggableItems() {
        return this.listOfDraggableItems;
    }

    @NotNull
    public final ImageView getDropAreaView() {
        return this.dropAreaView;
    }

    @NotNull
    public final GasmanDropAreaTag getDropAreaTag() {
        return this.dropAreaTag;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    @NotNull
    public final List<Float> getApplyAngle() {
        return this.applyAngle;
    }

    @NotNull
    public final GasmanPlot getPlot() {
        return this.plot;
    }
}

