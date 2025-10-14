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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gasmangame/entitie/GasmanAdapterHintItem;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "text", "Landroid/text/SpannedString;", "(Landroid/graphics/drawable/Drawable;Landroid/text/SpannedString;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getText", "()Landroid/text/SpannedString;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
