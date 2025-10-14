package com.blackhub.bronline.game.gui.drivingschool.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrivingAnswer.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingAnswer;", "", "answersText", "", "isChecked", "", "(Ljava/lang/String;Z)V", "getAnswersText", "()Ljava/lang/String;", "setAnswersText", "(Ljava/lang/String;)V", "()Z", "setChecked", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DrivingAnswer {
    public static final int $stable = 8;

    @NotNull
    public String answersText;
    public boolean isChecked;

    public static /* synthetic */ DrivingAnswer copy$default(DrivingAnswer drivingAnswer, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drivingAnswer.answersText;
        }
        if ((i & 2) != 0) {
            z = drivingAnswer.isChecked;
        }
        return drivingAnswer.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAnswersText() {
        return this.answersText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final DrivingAnswer copy(@NotNull String answersText, boolean isChecked) {
        Intrinsics.checkNotNullParameter(answersText, "answersText");
        return new DrivingAnswer(answersText, isChecked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingAnswer)) {
            return false;
        }
        DrivingAnswer drivingAnswer = (DrivingAnswer) other;
        return Intrinsics.areEqual(this.answersText, drivingAnswer.answersText) && this.isChecked == drivingAnswer.isChecked;
    }

    public int hashCode() {
        return (this.answersText.hashCode() * 31) + Boolean.hashCode(this.isChecked);
    }

    @NotNull
    public String toString() {
        return "DrivingAnswer(answersText=" + this.answersText + ", isChecked=" + this.isChecked + ")";
    }

    public DrivingAnswer(@NotNull String answersText, boolean z) {
        Intrinsics.checkNotNullParameter(answersText, "answersText");
        this.answersText = answersText;
        this.isChecked = z;
    }

    public /* synthetic */ DrivingAnswer(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    @NotNull
    public final String getAnswersText() {
        return this.answersText;
    }

    public final void setAnswersText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answersText = str;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }
}
