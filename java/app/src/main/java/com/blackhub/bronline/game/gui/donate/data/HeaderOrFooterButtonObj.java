package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HeaderOrFooterButtonObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class HeaderOrFooterButtonObj {
    public static final int $stable = 8;
    public final int id;
    public boolean selected;

    @NotNull
    public final String title;

    public static /* synthetic */ HeaderOrFooterButtonObj copy$default(HeaderOrFooterButtonObj headerOrFooterButtonObj, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = headerOrFooterButtonObj.title;
        }
        if ((i2 & 2) != 0) {
            i = headerOrFooterButtonObj.id;
        }
        if ((i2 & 4) != 0) {
            z = headerOrFooterButtonObj.selected;
        }
        return headerOrFooterButtonObj.copy(str, i, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final HeaderOrFooterButtonObj copy(@NotNull String title, int id, boolean selected) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderOrFooterButtonObj(title, id, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderOrFooterButtonObj)) {
            return false;
        }
        HeaderOrFooterButtonObj headerOrFooterButtonObj = (HeaderOrFooterButtonObj) other;
        return Intrinsics.areEqual(this.title, headerOrFooterButtonObj.title) && this.id == headerOrFooterButtonObj.id && this.selected == headerOrFooterButtonObj.selected;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Integer.hashCode(this.id)) * 31) + Boolean.hashCode(this.selected);
    }

    @NotNull
    public String toString() {
        return "HeaderOrFooterButtonObj(title=" + this.title + ", id=" + this.id + ", selected=" + this.selected + ")";
    }

    public HeaderOrFooterButtonObj(@NotNull String title, int i, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.id = i;
        this.selected = z;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}

