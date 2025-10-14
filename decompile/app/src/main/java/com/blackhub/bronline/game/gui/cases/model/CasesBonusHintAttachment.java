package com.blackhub.bronline.game.gui.cases.model;

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

/* compiled from: CasesBonusHintAttachment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CasesBonusHintAttachment;", "", "image", "Landroid/graphics/Bitmap;", "title", "", "hintText1", "Landroidx/compose/ui/text/AnnotatedString;", "hintText2", "hintText3", "hintText4", "(Landroid/graphics/Bitmap;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;)V", "getHintText1", "()Landroidx/compose/ui/text/AnnotatedString;", "getHintText2", "()Ljava/lang/String;", "getHintText3", "getHintText4", "getImage", "()Landroid/graphics/Bitmap;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CasesBonusHintAttachment {
    public static final int $stable = 8;

    @NotNull
    public final AnnotatedString hintText1;

    @NotNull
    public final String hintText2;

    @NotNull
    public final AnnotatedString hintText3;

    @NotNull
    public final AnnotatedString hintText4;

    @Nullable
    public final Bitmap image;

    @NotNull
    public final String title;

    public CasesBonusHintAttachment() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CasesBonusHintAttachment copy$default(CasesBonusHintAttachment casesBonusHintAttachment, Bitmap bitmap, String str, AnnotatedString annotatedString, String str2, AnnotatedString annotatedString2, AnnotatedString annotatedString3, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = casesBonusHintAttachment.image;
        }
        if ((i & 2) != 0) {
            str = casesBonusHintAttachment.title;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            annotatedString = casesBonusHintAttachment.hintText1;
        }
        AnnotatedString annotatedString4 = annotatedString;
        if ((i & 8) != 0) {
            str2 = casesBonusHintAttachment.hintText2;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            annotatedString2 = casesBonusHintAttachment.hintText3;
        }
        AnnotatedString annotatedString5 = annotatedString2;
        if ((i & 32) != 0) {
            annotatedString3 = casesBonusHintAttachment.hintText4;
        }
        return casesBonusHintAttachment.copy(bitmap, str3, annotatedString4, str4, annotatedString5, annotatedString3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AnnotatedString getHintText1() {
        return this.hintText1;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getHintText2() {
        return this.hintText2;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AnnotatedString getHintText3() {
        return this.hintText3;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AnnotatedString getHintText4() {
        return this.hintText4;
    }

    @NotNull
    public final CasesBonusHintAttachment copy(@Nullable Bitmap image, @NotNull String title, @NotNull AnnotatedString hintText1, @NotNull String hintText2, @NotNull AnnotatedString hintText3, @NotNull AnnotatedString hintText4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hintText1, "hintText1");
        Intrinsics.checkNotNullParameter(hintText2, "hintText2");
        Intrinsics.checkNotNullParameter(hintText3, "hintText3");
        Intrinsics.checkNotNullParameter(hintText4, "hintText4");
        return new CasesBonusHintAttachment(image, title, hintText1, hintText2, hintText3, hintText4);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesBonusHintAttachment)) {
            return false;
        }
        CasesBonusHintAttachment casesBonusHintAttachment = (CasesBonusHintAttachment) other;
        return Intrinsics.areEqual(this.image, casesBonusHintAttachment.image) && Intrinsics.areEqual(this.title, casesBonusHintAttachment.title) && Intrinsics.areEqual(this.hintText1, casesBonusHintAttachment.hintText1) && Intrinsics.areEqual(this.hintText2, casesBonusHintAttachment.hintText2) && Intrinsics.areEqual(this.hintText3, casesBonusHintAttachment.hintText3) && Intrinsics.areEqual(this.hintText4, casesBonusHintAttachment.hintText4);
    }

    public int hashCode() {
        Bitmap bitmap = this.image;
        return ((((((((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.title.hashCode()) * 31) + this.hintText1.hashCode()) * 31) + this.hintText2.hashCode()) * 31) + this.hintText3.hashCode()) * 31) + this.hintText4.hashCode();
    }

    @NotNull
    public String toString() {
        Bitmap bitmap = this.image;
        String str = this.title;
        AnnotatedString annotatedString = this.hintText1;
        return "CasesBonusHintAttachment(image=" + bitmap + ", title=" + str + ", hintText1=" + ((Object) annotatedString) + ", hintText2=" + this.hintText2 + ", hintText3=" + ((Object) this.hintText3) + ", hintText4=" + ((Object) this.hintText4) + ")";
    }

    public CasesBonusHintAttachment(@Nullable Bitmap bitmap, @NotNull String title, @NotNull AnnotatedString hintText1, @NotNull String hintText2, @NotNull AnnotatedString hintText3, @NotNull AnnotatedString hintText4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hintText1, "hintText1");
        Intrinsics.checkNotNullParameter(hintText2, "hintText2");
        Intrinsics.checkNotNullParameter(hintText3, "hintText3");
        Intrinsics.checkNotNullParameter(hintText4, "hintText4");
        this.image = bitmap;
        this.title = title;
        this.hintText1 = hintText1;
        this.hintText2 = hintText2;
        this.hintText3 = hintText3;
        this.hintText4 = hintText4;
    }

    @Nullable
    public final Bitmap getImage() {
        return this.image;
    }

    public /* synthetic */ CasesBonusHintAttachment(Bitmap bitmap, String str, AnnotatedString annotatedString, String str2, AnnotatedString annotatedString2, AnnotatedString annotatedString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 4) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 16) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString2, (i & 32) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString3);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final AnnotatedString getHintText1() {
        return this.hintText1;
    }

    @NotNull
    public final String getHintText2() {
        return this.hintText2;
    }

    @NotNull
    public final AnnotatedString getHintText3() {
        return this.hintText3;
    }

    @NotNull
    public final AnnotatedString getHintText4() {
        return this.hintText4;
    }
}
