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

/* compiled from: CraftForcedTutorialAttachment.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class CraftForcedTutorialAttachment {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap tutorialImg;

    @NotNull
    public final String tutorialTitle;

    public CraftForcedTutorialAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CraftForcedTutorialAttachment copy$default(CraftForcedTutorialAttachment craftForcedTutorialAttachment, String str, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = craftForcedTutorialAttachment.tutorialTitle;
        }
        if ((i & 2) != 0) {
            bitmap = craftForcedTutorialAttachment.tutorialImg;
        }
        return craftForcedTutorialAttachment.copy(str, bitmap);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTutorialTitle() {
        return this.tutorialTitle;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getTutorialImg() {
        return this.tutorialImg;
    }

    @NotNull
    public final CraftForcedTutorialAttachment copy(@NotNull String tutorialTitle, @Nullable Bitmap tutorialImg) {
        Intrinsics.checkNotNullParameter(tutorialTitle, "tutorialTitle");
        return new CraftForcedTutorialAttachment(tutorialTitle, tutorialImg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftForcedTutorialAttachment)) {
            return false;
        }
        CraftForcedTutorialAttachment craftForcedTutorialAttachment = (CraftForcedTutorialAttachment) other;
        return Intrinsics.areEqual(this.tutorialTitle, craftForcedTutorialAttachment.tutorialTitle) && Intrinsics.areEqual(this.tutorialImg, craftForcedTutorialAttachment.tutorialImg);
    }

    public int hashCode() {
        int iHashCode = this.tutorialTitle.hashCode() * 31;
        Bitmap bitmap = this.tutorialImg;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "CraftForcedTutorialAttachment(tutorialTitle=" + this.tutorialTitle + ", tutorialImg=" + this.tutorialImg + ")";
    }

    public CraftForcedTutorialAttachment(@NotNull String tutorialTitle, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(tutorialTitle, "tutorialTitle");
        this.tutorialTitle = tutorialTitle;
        this.tutorialImg = bitmap;
    }

    public /* synthetic */ CraftForcedTutorialAttachment(String str, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 2) != 0 ? null : bitmap);
    }

    @NotNull
    public final String getTutorialTitle() {
        return this.tutorialTitle;
    }

    @Nullable
    public final Bitmap getTutorialImg() {
        return this.tutorialImg;
    }
}

