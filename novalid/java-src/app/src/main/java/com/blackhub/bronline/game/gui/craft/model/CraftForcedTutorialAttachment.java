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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/CraftForcedTutorialAttachment;", "", "tutorialTitle", "", "tutorialImg", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getTutorialImg", "()Landroid/graphics/Bitmap;", "getTutorialTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
