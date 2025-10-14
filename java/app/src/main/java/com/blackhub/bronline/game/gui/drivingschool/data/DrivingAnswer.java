package com.blackhub.bronline.game.gui.drivingschool.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrivingAnswer.kt */
@StabilityInferred(parameters = 0)
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

