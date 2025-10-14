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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsTestingItem;", "", "testingQuestion", "", "testingAnswers", "", "answerClicked", "", "documentId", "(Ljava/lang/String;Ljava/util/List;II)V", "getAnswerClicked", "()I", "setAnswerClicked", "(I)V", "getDocumentId", "setDocumentId", "getTestingAnswers", "()Ljava/util/List;", "getTestingQuestion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
