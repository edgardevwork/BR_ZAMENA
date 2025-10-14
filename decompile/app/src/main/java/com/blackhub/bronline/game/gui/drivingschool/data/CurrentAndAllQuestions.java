package com.blackhub.bronline.game.gui.drivingschool.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CurrentAndAllQuestions.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/data/CurrentAndAllQuestions;", "", "currentValueOfQuestion", "", "allValueOfQuestions", "(II)V", "getAllValueOfQuestions", "()I", "getCurrentValueOfQuestion", "setCurrentValueOfQuestion", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
