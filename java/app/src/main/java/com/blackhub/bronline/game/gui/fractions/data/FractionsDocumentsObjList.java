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
public final /* data */ class FractionsDocumentsObjList {
    public static final int $stable = 8;

    @SerializedName("fractionMenuDocuments")
    @Nullable
    public final List<FractionsDocumentsObj> fractionDocuments;

    public FractionsDocumentsObjList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionsDocumentsObjList copy$default(FractionsDocumentsObjList fractionsDocumentsObjList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fractionsDocumentsObjList.fractionDocuments;
        }
        return fractionsDocumentsObjList.copy(list);
    }

    @Nullable
    public final List<FractionsDocumentsObj> component1() {
        return this.fractionDocuments;
    }

    @NotNull
    public final FractionsDocumentsObjList copy(@Nullable List<FractionsDocumentsObj> fractionDocuments) {
        return new FractionsDocumentsObjList(fractionDocuments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FractionsDocumentsObjList) && Intrinsics.areEqual(this.fractionDocuments, ((FractionsDocumentsObjList) other).fractionDocuments);
    }

    public int hashCode() {
        List<FractionsDocumentsObj> list = this.fractionDocuments;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionsDocumentsObjList(fractionDocuments=" + this.fractionDocuments + ")";
    }

    public FractionsDocumentsObjList(@Nullable List<FractionsDocumentsObj> list) {
        this.fractionDocuments = list;
    }

    public /* synthetic */ FractionsDocumentsObjList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @Nullable
    public final List<FractionsDocumentsObj> getFractionDocuments() {
        return this.fractionDocuments;
    }
}

