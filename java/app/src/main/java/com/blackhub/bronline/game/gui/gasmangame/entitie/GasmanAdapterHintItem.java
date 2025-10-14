package com.blackhub.bronline.game.gui.gasmangame.entitie;

import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GasmanAdapterHintItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class GasmanAdapterHintItem {
    public static final int $stable = 8;

    @Nullable
    public final Drawable drawable;

    @NotNull
    public final SpannedString text;

    public static /* synthetic */ GasmanAdapterHintItem copy$default(GasmanAdapterHintItem gasmanAdapterHintItem, Drawable drawable, SpannedString spannedString, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = gasmanAdapterHintItem.drawable;
        }
        if ((i & 2) != 0) {
            spannedString = gasmanAdapterHintItem.text;
        }
        return gasmanAdapterHintItem.copy(drawable, spannedString);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SpannedString getText() {
        return this.text;
    }

    @NotNull
    public final GasmanAdapterHintItem copy(@Nullable Drawable drawable, @NotNull SpannedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new GasmanAdapterHintItem(drawable, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasmanAdapterHintItem)) {
            return false;
        }
        GasmanAdapterHintItem gasmanAdapterHintItem = (GasmanAdapterHintItem) other;
        return Intrinsics.areEqual(this.drawable, gasmanAdapterHintItem.drawable) && Intrinsics.areEqual(this.text, gasmanAdapterHintItem.text);
    }

    public int hashCode() {
        Drawable drawable = this.drawable;
        return ((drawable == null ? 0 : drawable.hashCode()) * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "GasmanAdapterHintItem(drawable=" + this.drawable + ", text=" + ((Object) this.text) + ")";
    }

    public GasmanAdapterHintItem(@Nullable Drawable drawable, @NotNull SpannedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.drawable = drawable;
        this.text = text;
    }

    @Nullable
    public final Drawable getDrawable() {
        return this.drawable;
    }

    @NotNull
    public final SpannedString getText() {
        return this.text;
    }
}

