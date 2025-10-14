package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionDocumentsList.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionsTestingItem {
    public static final int $stable = 8;
    public int answerClicked;
    public int documentId;

    @SerializedName("testingAnswers")
    @NotNull
    public final List<String> testingAnswers;

    @SerializedName("testingQuestion")
    @NotNull
    public final String testingQuestion;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionsTestingItem copy$default(FractionsTestingItem fractionsTestingItem, String str, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = fractionsTestingItem.testingQuestion;
        }
        if ((i3 & 2) != 0) {
            list = fractionsTestingItem.testingAnswers;
        }
        if ((i3 & 4) != 0) {
            i = fractionsTestingItem.answerClicked;
        }
        if ((i3 & 8) != 0) {
            i2 = fractionsTestingItem.documentId;
        }
        return fractionsTestingItem.copy(str, list, i, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTestingQuestion() {
        return this.testingQuestion;
    }

    @NotNull
    public final List<String> component2() {
        return this.testingAnswers;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAnswerClicked() {
        return this.answerClicked;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDocumentId() {
        return this.documentId;
    }

    @NotNull
    public final FractionsTestingItem copy(@NotNull String testingQuestion, @NotNull List<String> testingAnswers, int answerClicked, int documentId) {
        Intrinsics.checkNotNullParameter(testingQuestion, "testingQuestion");
        Intrinsics.checkNotNullParameter(testingAnswers, "testingAnswers");
        return new FractionsTestingItem(testingQuestion, testingAnswers, answerClicked, documentId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsTestingItem)) {
            return false;
        }
        FractionsTestingItem fractionsTestingItem = (FractionsTestingItem) other;
        return Intrinsics.areEqual(this.testingQuestion, fractionsTestingItem.testingQuestion) && Intrinsics.areEqual(this.testingAnswers, fractionsTestingItem.testingAnswers) && this.answerClicked == fractionsTestingItem.answerClicked && this.documentId == fractionsTestingItem.documentId;
    }

    public int hashCode() {
        return (((((this.testingQuestion.hashCode() * 31) + this.testingAnswers.hashCode()) * 31) + Integer.hashCode(this.answerClicked)) * 31) + Integer.hashCode(this.documentId);
    }

    @NotNull
    public String toString() {
        return "FractionsTestingItem(testingQuestion=" + this.testingQuestion + ", testingAnswers=" + this.testingAnswers + ", answerClicked=" + this.answerClicked + ", documentId=" + this.documentId + ")";
    }

    public FractionsTestingItem(@NotNull String testingQuestion, @NotNull List<String> testingAnswers, int i, int i2) {
        Intrinsics.checkNotNullParameter(testingQuestion, "testingQuestion");
        Intrinsics.checkNotNullParameter(testingAnswers, "testingAnswers");
        this.testingQuestion = testingQuestion;
        this.testingAnswers = testingAnswers;
        this.answerClicked = i;
        this.documentId = i2;
    }

    public /* synthetic */ FractionsTestingItem(String str, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i3 & 4) != 0 ? -1 : i, i2);
    }

    @NotNull
    public final String getTestingQuestion() {
        return this.testingQuestion;
    }

    @NotNull
    public final List<String> getTestingAnswers() {
        return this.testingAnswers;
    }

    public final int getAnswerClicked() {
        return this.answerClicked;
    }

    public final void setAnswerClicked(int i) {
        this.answerClicked = i;
    }

    public final int getDocumentId() {
        return this.documentId;
    }

    public final void setDocumentId(int i) {
        this.documentId = i;
    }
}

