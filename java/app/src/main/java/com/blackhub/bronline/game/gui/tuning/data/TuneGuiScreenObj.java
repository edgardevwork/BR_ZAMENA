package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuneGuiScreenObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class TuneGuiScreenObj {
    public static final int $stable = 8;

    @SerializedName("footer")
    @NotNull
    public ArrayList<TuneGuiNodeObj> footer;

    @SerializedName("name")
    @NotNull
    public String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TuneGuiScreenObj copy$default(TuneGuiScreenObj tuneGuiScreenObj, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tuneGuiScreenObj.name;
        }
        if ((i & 2) != 0) {
            arrayList = tuneGuiScreenObj.footer;
        }
        return tuneGuiScreenObj.copy(str, arrayList);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ArrayList<TuneGuiNodeObj> component2() {
        return this.footer;
    }

    @NotNull
    public final TuneGuiScreenObj copy(@NotNull String name, @NotNull ArrayList<TuneGuiNodeObj> footer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new TuneGuiScreenObj(name, footer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TuneGuiScreenObj)) {
            return false;
        }
        TuneGuiScreenObj tuneGuiScreenObj = (TuneGuiScreenObj) other;
        return Intrinsics.areEqual(this.name, tuneGuiScreenObj.name) && Intrinsics.areEqual(this.footer, tuneGuiScreenObj.footer);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.footer.hashCode();
    }

    @NotNull
    public String toString() {
        return "TuneGuiScreenObj(name=" + this.name + ", footer=" + this.footer + ")";
    }

    public TuneGuiScreenObj(@NotNull String name, @NotNull ArrayList<TuneGuiNodeObj> footer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.name = name;
        this.footer = footer;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public final ArrayList<TuneGuiNodeObj> getFooter() {
        return this.footer;
    }

    public final void setFooter(@NotNull ArrayList<TuneGuiNodeObj> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.footer = arrayList;
    }
}

