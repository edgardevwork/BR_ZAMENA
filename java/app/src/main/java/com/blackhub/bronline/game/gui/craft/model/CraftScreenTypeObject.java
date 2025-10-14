package com.blackhub.bronline.game.gui.craft.model;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftScreenTypeObject.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CraftScreenTypeObject {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap titleIcon;

    @NotNull
    public final String titleText;

    public CraftScreenTypeObject() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CraftScreenTypeObject copy$default(CraftScreenTypeObject craftScreenTypeObject, Bitmap bitmap, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = craftScreenTypeObject.titleIcon;
        }
        if ((i & 2) != 0) {
            str = craftScreenTypeObject.titleText;
        }
        return craftScreenTypeObject.copy(bitmap, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getTitleIcon() {
        return this.titleIcon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    public final CraftScreenTypeObject copy(@Nullable Bitmap titleIcon, @NotNull String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        return new CraftScreenTypeObject(titleIcon, titleText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftScreenTypeObject)) {
            return false;
        }
        CraftScreenTypeObject craftScreenTypeObject = (CraftScreenTypeObject) other;
        return Intrinsics.areEqual(this.titleIcon, craftScreenTypeObject.titleIcon) && Intrinsics.areEqual(this.titleText, craftScreenTypeObject.titleText);
    }

    public int hashCode() {
        Bitmap bitmap = this.titleIcon;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.titleText.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftScreenTypeObject(titleIcon=" + this.titleIcon + ", titleText=" + this.titleText + ")";
    }

    public CraftScreenTypeObject(@Nullable Bitmap bitmap, @NotNull String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        this.titleIcon = bitmap;
        this.titleText = titleText;
    }

    @Nullable
    public final Bitmap getTitleIcon() {
        return this.titleIcon;
    }

    public /* synthetic */ CraftScreenTypeObject(Bitmap bitmap, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str);
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }
}

