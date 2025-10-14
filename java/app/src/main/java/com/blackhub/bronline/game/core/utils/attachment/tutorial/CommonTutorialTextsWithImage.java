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

