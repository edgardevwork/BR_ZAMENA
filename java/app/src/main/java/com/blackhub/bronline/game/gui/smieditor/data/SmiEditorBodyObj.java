package com.blackhub.bronline.game.gui.smieditor.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SmiEditorBodyObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class SmiEditorBodyObj {
    public static final int $stable = 8;

    @SerializedName("body")
    @Nullable
    public List<SmiEditorBodyObj> body;

    @SerializedName("column")
    @Nullable
    public Integer column;
    public boolean isChecked;

    @SerializedName("text_for_ad")
    @Nullable
    public String textForAd;

    @SerializedName("title")
    @NotNull
    public String title;

    @SerializedName("type")
    @Nullable
    public Integer type;

    public static /* synthetic */ SmiEditorBodyObj copy$default(SmiEditorBodyObj smiEditorBodyObj, String str, String str2, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smiEditorBodyObj.title;
        }
        if ((i & 2) != 0) {
            str2 = smiEditorBodyObj.textForAd;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = smiEditorBodyObj.type;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = smiEditorBodyObj.column;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            list = smiEditorBodyObj.body;
        }
        return smiEditorBodyObj.copy(str, str3, num3, num4, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTextForAd() {
        return this.textForAd;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getColumn() {
        return this.column;
    }

    @Nullable
    public final List<SmiEditorBodyObj> component5() {
        return this.body;
    }

    @NotNull
    public final SmiEditorBodyObj copy(@NotNull String title, @Nullable String textForAd, @Nullable Integer type, @Nullable Integer column, @Nullable List<SmiEditorBodyObj> body) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new SmiEditorBodyObj(title, textForAd, type, column, body);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmiEditorBodyObj)) {
            return false;
        }
        SmiEditorBodyObj smiEditorBodyObj = (SmiEditorBodyObj) other;
        return Intrinsics.areEqual(this.title, smiEditorBodyObj.title) && Intrinsics.areEqual(this.textForAd, smiEditorBodyObj.textForAd) && Intrinsics.areEqual(this.type, smiEditorBodyObj.type) && Intrinsics.areEqual(this.column, smiEditorBodyObj.column) && Intrinsics.areEqual(this.body, smiEditorBodyObj.body);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.textForAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.column;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SmiEditorBodyObj> list = this.body;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SmiEditorBodyObj(title=" + this.title + ", textForAd=" + this.textForAd + ", type=" + this.type + ", column=" + this.column + ", body=" + this.body + ")";
    }

    public SmiEditorBodyObj(@NotNull String title, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<SmiEditorBodyObj> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.textForAd = str;
        this.type = num;
        this.column = num2;
        this.body = list;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @Nullable
    public final String getTextForAd() {
        return this.textForAd;
    }

    public final void setTextForAd(@Nullable String str) {
        this.textForAd = str;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @Nullable
    public final Integer getColumn() {
        return this.column;
    }

    public final void setColumn(@Nullable Integer num) {
        this.column = num;
    }

    @Nullable
    public final List<SmiEditorBodyObj> getBody() {
        return this.body;
    }

    public final void setBody(@Nullable List<SmiEditorBodyObj> list) {
        this.body = list;
    }

    /* renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }
}

