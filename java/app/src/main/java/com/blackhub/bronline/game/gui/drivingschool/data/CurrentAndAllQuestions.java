package com.blackhub.bronline.game.gui.drivingschool.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CurrentAndAllQuestions.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class CurrentAndAllQuestions {
    public static final int $stable = 8;
    public final int allValueOfQuestions;
    public int currentValueOfQuestion;

    public static /* synthetic */ CurrentAndAllQuestions copy$default(CurrentAndAllQuestions currentAndAllQuestions, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = currentAndAllQuestions.currentValueOfQuestion;
        }
        if ((i3 & 2) != 0) {
            i2 = currentAndAllQuestions.allValueOfQuestions;
        }
        return currentAndAllQuestions.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentValueOfQuestion() {
        return this.currentValueOfQuestion;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAllValueOfQuestions() {
        return this.allValueOfQuestions;
    }

    @NotNull
    public final CurrentAndAllQuestions copy(int currentValueOfQuestion, int allValueOfQuestions) {
        return new CurrentAndAllQuestions(currentValueOfQuestion, allValueOfQuestions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentAndAllQuestions)) {
            return false;
        }
        CurrentAndAllQuestions currentAndAllQuestions = (CurrentAndAllQuestions) other;
        return this.currentValueOfQuestion == currentAndAllQuestions.currentValueOfQuestion && this.allValueOfQuestions == currentAndAllQuestions.allValueOfQuestions;
    }

    public int hashCode() {
        return (Integer.hashCode(this.currentValueOfQuestion) * 31) + Integer.hashCode(this.allValueOfQuestions);
    }

    @NotNull
    public String toString() {
        return "CurrentAndAllQuestions(currentValueOfQuestion=" + this.currentValueOfQuestion + ", allValueOfQuestions=" + this.allValueOfQuestions + ")";
    }

    public CurrentAndAllQuestions(int i, int i2) {
        this.currentValueOfQuestion = i;
        this.allValueOfQuestions = i2;
    }

    public final int getCurrentValueOfQuestion() {
        return this.currentValueOfQuestion;
    }

    public final void setCurrentValueOfQuestion(int i) {
        this.currentValueOfQuestion = i;
    }

    public final int getAllValueOfQuestions() {
        return this.allValueOfQuestions;
    }
}

