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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObj;", "", "fractionId", "", "fractionDocuments", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsItem;", "(ILjava/util/List;)V", "getFractionDocuments", "()Ljava/util/List;", "getFractionId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
