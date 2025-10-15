package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OptionsDraggableItem.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/model/OptionsDraggableItem;", "", "degree", "", "scale", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getDegree", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getScale", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/blackhub/bronline/game/core/utils/draganddrop/model/OptionsDraggableItem;", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OptionsDraggableItem {
    public static final int $stable = 0;

    @Nullable
    public final Float degree;

    @Nullable
    public final Float scale;

    public OptionsDraggableItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OptionsDraggableItem copy$default(OptionsDraggableItem optionsDraggableItem, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = optionsDraggableItem.degree;
        }
        if ((i & 2) != 0) {
            f2 = optionsDraggableItem.scale;
        }
        return optionsDraggableItem.copy(f, f2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Float getDegree() {
        return this.degree;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getScale() {
        return this.scale;
    }

    @NotNull
    public final OptionsDraggableItem copy(@Nullable Float degree, @Nullable Float scale) {
        return new OptionsDraggableItem(degree, scale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDraggableItem)) {
            return false;
        }
        OptionsDraggableItem optionsDraggableItem = (OptionsDraggableItem) other;
        return Intrinsics.areEqual((Object) this.degree, (Object) optionsDraggableItem.degree) && Intrinsics.areEqual((Object) this.scale, (Object) optionsDraggableItem.scale);
    }

    public int hashCode() {
        Float f = this.degree;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.scale;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OptionsDraggableItem(degree=" + this.degree + ", scale=" + this.scale + ")";
    }

    public OptionsDraggableItem(@Nullable Float f, @Nullable Float f2) {
        this.degree = f;
        this.scale = f2;
    }

    public /* synthetic */ OptionsDraggableItem(Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2);
    }

    @Nullable
    public final Float getDegree() {
        return this.degree;
    }

    @Nullable
    public final Float getScale() {
        return this.scale;
    }
}
