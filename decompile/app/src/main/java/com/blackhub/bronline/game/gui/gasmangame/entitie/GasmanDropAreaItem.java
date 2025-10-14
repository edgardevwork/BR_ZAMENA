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
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JQ\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanDropAreaItem;", "", "listOfDraggableItems", "", "Landroid/widget/ImageView;", "dropAreaView", "dropAreaTag", "Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanDropAreaTag;", "startAngle", "", "applyAngle", "", "plot", "Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanPlot;", "(Ljava/util/List;Landroid/widget/ImageView;Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanDropAreaTag;FLjava/util/List;Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanPlot;)V", "getApplyAngle", "()Ljava/util/List;", "getDropAreaTag", "()Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanDropAreaTag;", "getDropAreaView", "()Landroid/widget/ImageView;", "getListOfDraggableItems", "getPlot", "()Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanPlot;", "getStartAngle", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
