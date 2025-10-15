package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionsTestingResult.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsTestingResult;", "", "testingResult", "", "testingTotal", "quantityOfQuestions", "(III)V", "getQuantityOfQuestions", "()I", "getTestingResult", "getTestingTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
