package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsTestingResult.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class FractionsTestingResult {
    public static final int $stable = 0;
    public final int quantityOfQuestions;
    public final int testingResult;
    public final int testingTotal;

    public static /* synthetic */ FractionsTestingResult copy$default(FractionsTestingResult fractionsTestingResult, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fractionsTestingResult.testingResult;
        }
        if ((i4 & 2) != 0) {
            i2 = fractionsTestingResult.testingTotal;
        }
        if ((i4 & 4) != 0) {
            i3 = fractionsTestingResult.quantityOfQuestions;
        }
        return fractionsTestingResult.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTestingResult() {
        return this.testingResult;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTestingTotal() {
        return this.testingTotal;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQuantityOfQuestions() {
        return this.quantityOfQuestions;
    }

    @NotNull
    public final FractionsTestingResult copy(int testingResult, int testingTotal, int quantityOfQuestions) {
        return new FractionsTestingResult(testingResult, testingTotal, quantityOfQuestions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsTestingResult)) {
            return false;
        }
        FractionsTestingResult fractionsTestingResult = (FractionsTestingResult) other;
        return this.testingResult == fractionsTestingResult.testingResult && this.testingTotal == fractionsTestingResult.testingTotal && this.quantityOfQuestions == fractionsTestingResult.quantityOfQuestions;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.testingResult) * 31) + Integer.hashCode(this.testingTotal)) * 31) + Integer.hashCode(this.quantityOfQuestions);
    }

    @NotNull
    public String toString() {
        return "FractionsTestingResult(testingResult=" + this.testingResult + ", testingTotal=" + this.testingTotal + ", quantityOfQuestions=" + this.quantityOfQuestions + ")";
    }

    public FractionsTestingResult(int i, int i2, int i3) {
        this.testingResult = i;
        this.testingTotal = i2;
        this.quantityOfQuestions = i3;
    }

    public /* synthetic */ FractionsTestingResult(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getTestingResult() {
        return this.testingResult;
    }

    public final int getTestingTotal() {
        return this.testingTotal;
    }

    public final int getQuantityOfQuestions() {
        return this.quantityOfQuestions;
    }
}

