package com.blackhub.bronline.game.gui.entertainmentsystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EntertainmentGamesFilter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class EntertainmentGamesFilter {
    public static final int $stable = 8;
    public final int id;
    public boolean isClicked;

    @NotNull
    public final String name;

    public static /* synthetic */ EntertainmentGamesFilter copy$default(EntertainmentGamesFilter entertainmentGamesFilter, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = entertainmentGamesFilter.id;
        }
        if ((i2 & 2) != 0) {
            str = entertainmentGamesFilter.name;
        }
        if ((i2 & 4) != 0) {
            z = entertainmentGamesFilter.isClicked;
        }
        return entertainmentGamesFilter.copy(i, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final EntertainmentGamesFilter copy(int id, @NotNull String name, boolean isClicked) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new EntertainmentGamesFilter(id, name, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntertainmentGamesFilter)) {
            return false;
        }
        EntertainmentGamesFilter entertainmentGamesFilter = (EntertainmentGamesFilter) other;
        return this.id == entertainmentGamesFilter.id && Intrinsics.areEqual(this.name, entertainmentGamesFilter.name) && this.isClicked == entertainmentGamesFilter.isClicked;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "EntertainmentGamesFilter(id=" + this.id + ", name=" + this.name + ", isClicked=" + this.isClicked + ")";
    }

    public EntertainmentGamesFilter(int i, @NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.isClicked = z;
    }

    public /* synthetic */ EntertainmentGamesFilter(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

