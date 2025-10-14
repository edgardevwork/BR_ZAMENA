package com.blackhub.bronline.game.core.utils.draganddrop.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OptionsDraggableItem.kt */
@StabilityInferred(parameters = 1)
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

