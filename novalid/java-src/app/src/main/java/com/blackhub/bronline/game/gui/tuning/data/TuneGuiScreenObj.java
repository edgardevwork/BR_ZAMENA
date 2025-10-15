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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiScreenObj;", "", "name", "", "footer", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiNodeObj;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getFooter", "()Ljava/util/ArrayList;", "setFooter", "(Ljava/util/ArrayList;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
