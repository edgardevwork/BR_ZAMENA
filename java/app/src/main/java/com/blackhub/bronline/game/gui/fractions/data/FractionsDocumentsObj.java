package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionDocumentsList.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionsDocumentsObj {
    public static final int $stable = 8;

    @SerializedName("fractionDocuments")
    @NotNull
    public final List<FractionsDocumentsItem> fractionDocuments;

    @SerializedName("fractionID")
    public final int fractionId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionsDocumentsObj copy$default(FractionsDocumentsObj fractionsDocumentsObj, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fractionsDocumentsObj.fractionId;
        }
        if ((i2 & 2) != 0) {
            list = fractionsDocumentsObj.fractionDocuments;
        }
        return fractionsDocumentsObj.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFractionId() {
        return this.fractionId;
    }

    @NotNull
    public final List<FractionsDocumentsItem> component2() {
        return this.fractionDocuments;
    }

    @NotNull
    public final FractionsDocumentsObj copy(int fractionId, @NotNull List<FractionsDocumentsItem> fractionDocuments) {
        Intrinsics.checkNotNullParameter(fractionDocuments, "fractionDocuments");
        return new FractionsDocumentsObj(fractionId, fractionDocuments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsDocumentsObj)) {
            return false;
        }
        FractionsDocumentsObj fractionsDocumentsObj = (FractionsDocumentsObj) other;
        return this.fractionId == fractionsDocumentsObj.fractionId && Intrinsics.areEqual(this.fractionDocuments, fractionsDocumentsObj.fractionDocuments);
    }

    public int hashCode() {
        return (Integer.hashCode(this.fractionId) * 31) + this.fractionDocuments.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionsDocumentsObj(fractionId=" + this.fractionId + ", fractionDocuments=" + this.fractionDocuments + ")";
    }

    public FractionsDocumentsObj(int i, @NotNull List<FractionsDocumentsItem> fractionDocuments) {
        Intrinsics.checkNotNullParameter(fractionDocuments, "fractionDocuments");
        this.fractionId = i;
        this.fractionDocuments = fractionDocuments;
    }

    public final int getFractionId() {
        return this.fractionId;
    }

    @NotNull
    public final List<FractionsDocumentsItem> getFractionDocuments() {
        return this.fractionDocuments;
    }
}

