package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuningBoxItemObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class TuningBoxItemObj {
    public static final int $stable = 8;
    public int id;

    @NotNull
    public String name;

    public static /* synthetic */ TuningBoxItemObj copy$default(TuningBoxItemObj tuningBoxItemObj, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tuningBoxItemObj.id;
        }
        if ((i2 & 2) != 0) {
            str = tuningBoxItemObj.name;
        }
        return tuningBoxItemObj.copy(i, str);
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

    @NotNull
    public final TuningBoxItemObj copy(int id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new TuningBoxItemObj(id, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TuningBoxItemObj)) {
            return false;
        }
        TuningBoxItemObj tuningBoxItemObj = (TuningBoxItemObj) other;
        return this.id == tuningBoxItemObj.id && Intrinsics.areEqual(this.name, tuningBoxItemObj.name);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "TuningBoxItemObj(id=" + this.id + ", name=" + this.name + ")";
    }

    public TuningBoxItemObj(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }
}

