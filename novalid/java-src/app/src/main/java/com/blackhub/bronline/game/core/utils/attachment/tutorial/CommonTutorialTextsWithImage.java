package com.blackhub.bronline.game.core.utils.attachment.tutorial;

import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTutorialTextsWithImage.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/tutorial/CommonTutorialTextsWithImage;", "", "image", "Landroid/graphics/Bitmap;", "title", "Landroidx/compose/ui/text/AnnotatedString;", "text1", "text2", "text3", "bottomText", "", "(Landroid/graphics/Bitmap;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;)V", "getBottomText", "()Ljava/lang/String;", "getImage", "()Landroid/graphics/Bitmap;", "getText1", "()Landroidx/compose/ui/text/AnnotatedString;", "getText2", "getText3", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonTutorialTextsWithImage {
    public static final int $stable = 8;

    @NotNull
    public final String bottomText;

    @Nullable
    public final Bitmap image;

    @NotNull
    public final AnnotatedString text1;

    @Nullable
    public final AnnotatedString text2;

    @Nullable
    public final AnnotatedString text3;

    @NotNull
    public final AnnotatedString title;

    public CommonTutorialTextsWithImage() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CommonTutorialTextsWithImage copy$default(CommonTutorialTextsWithImage commonTutorialTextsWithImage, Bitmap bitmap, AnnotatedString annotatedString, AnnotatedString annotatedString2, AnnotatedString annotatedString3, AnnotatedString annotatedString4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = commonTutorialTextsWithImage.image;
        }
        if ((i & 2) != 0) {
            annotatedString = commonTutorialTextsWithImage.title;
        }
        AnnotatedString annotatedString5 = annotatedString;
        if ((i & 4) != 0) {
            annotatedString2 = commonTutorialTextsWithImage.text1;
        }
        AnnotatedString annotatedString6 = annotatedString2;
        if ((i & 8) != 0) {
            annotatedString3 = commonTutorialTextsWithImage.text2;
        }
        AnnotatedString annotatedString7 = annotatedString3;
        if ((i & 16) != 0) {
            annotatedString4 = commonTutorialTextsWithImage.text3;
        }
        AnnotatedString annotatedString8 = annotatedString4;
        if ((i & 32) != 0) {
            str = commonTutorialTextsWithImage.bottomText;
        }
        return commonTutorialTextsWithImage.copy(bitmap, annotatedString5, annotatedString6, annotatedString7, annotatedString8, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AnnotatedString getText1() {
        return this.text1;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final AnnotatedString getText2() {
        return this.text2;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AnnotatedString getText3() {
        return this.text3;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    @NotNull
    public final CommonTutorialTextsWithImage copy(@Nullable Bitmap image, @NotNull AnnotatedString title, @NotNull AnnotatedString text1, @Nullable AnnotatedString text2, @Nullable AnnotatedString text3, @NotNull String bottomText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text1, "text1");
        Intrinsics.checkNotNullParameter(bottomText, "bottomText");
        return new CommonTutorialTextsWithImage(image, title, text1, text2, text3, bottomText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTutorialTextsWithImage)) {
            return false;
        }
        CommonTutorialTextsWithImage commonTutorialTextsWithImage = (CommonTutorialTextsWithImage) other;
        return Intrinsics.areEqual(this.image, commonTutorialTextsWithImage.image) && Intrinsics.areEqual(this.title, commonTutorialTextsWithImage.title) && Intrinsics.areEqual(this.text1, commonTutorialTextsWithImage.text1) && Intrinsics.areEqual(this.text2, commonTutorialTextsWithImage.text2) && Intrinsics.areEqual(this.text3, commonTutorialTextsWithImage.text3) && Intrinsics.areEqual(this.bottomText, commonTutorialTextsWithImage.bottomText);
    }

    public int hashCode() {
        Bitmap bitmap = this.image;
        int iHashCode = (((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.title.hashCode()) * 31) + this.text1.hashCode()) * 31;
        AnnotatedString annotatedString = this.text2;
        int iHashCode2 = (iHashCode + (annotatedString == null ? 0 : annotatedString.hashCode())) * 31;
        AnnotatedString annotatedString2 = this.text3;
        return ((iHashCode2 + (annotatedString2 != null ? annotatedString2.hashCode() : 0)) * 31) + this.bottomText.hashCode();
    }

    @NotNull
    public String toString() {
        Bitmap bitmap = this.image;
        AnnotatedString annotatedString = this.title;
        AnnotatedString annotatedString2 = this.text1;
        AnnotatedString annotatedString3 = this.text2;
        AnnotatedString annotatedString4 = this.text3;
        return "CommonTutorialTextsWithImage(image=" + bitmap + ", title=" + ((Object) annotatedString) + ", text1=" + ((Object) annotatedString2) + ", text2=" + ((Object) annotatedString3) + ", text3=" + ((Object) annotatedString4) + ", bottomText=" + this.bottomText + ")";
    }

    public CommonTutorialTextsWithImage(@Nullable Bitmap bitmap, @NotNull AnnotatedString title, @NotNull AnnotatedString text1, @Nullable AnnotatedString annotatedString, @Nullable AnnotatedString annotatedString2, @NotNull String bottomText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text1, "text1");
        Intrinsics.checkNotNullParameter(bottomText, "bottomText");
        this.image = bitmap;
        this.title = title;
        this.text1 = text1;
        this.text2 = annotatedString;
        this.text3 = annotatedString2;
        this.bottomText = bottomText;
    }

    @Nullable
    public final Bitmap getImage() {
        return this.image;
    }

    public /* synthetic */ CommonTutorialTextsWithImage(Bitmap bitmap, AnnotatedString annotatedString, AnnotatedString annotatedString2, AnnotatedString annotatedString3, AnnotatedString annotatedString4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i & 4) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString2, (i & 8) != 0 ? null : annotatedString3, (i & 16) == 0 ? annotatedString4 : null, (i & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str);
    }

    @NotNull
    public final AnnotatedString getTitle() {
        return this.title;
    }

    @NotNull
    public final AnnotatedString getText1() {
        return this.text1;
    }

    @Nullable
    public final AnnotatedString getText2() {
        return this.text2;
    }

    @Nullable
    public final AnnotatedString getText3() {
        return this.text3;
    }

    @NotNull
    public final String getBottomText() {
        return this.bottomText;
    }
}
