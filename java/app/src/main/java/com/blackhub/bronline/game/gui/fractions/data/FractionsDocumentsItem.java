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
public final /* data */ class FractionsDocumentsItem {
    public static final int $stable = 8;

    @SerializedName("documentsContent")
    @NotNull
    public final String description;

    @SerializedName("documentID")
    public final int documentId;
    public boolean documentStatus;
    public boolean isClicked;

    @SerializedName("documentTesting")
    @NotNull
    public final List<FractionsTestingItem> testingItemList;

    @SerializedName("documentTitle")
    @NotNull
    public final String title;

    public static /* synthetic */ FractionsDocumentsItem copy$default(FractionsDocumentsItem fractionsDocumentsItem, int i, String str, String str2, List list, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fractionsDocumentsItem.documentId;
        }
        if ((i2 & 2) != 0) {
            str = fractionsDocumentsItem.title;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = fractionsDocumentsItem.description;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            list = fractionsDocumentsItem.testingItemList;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            z = fractionsDocumentsItem.documentStatus;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = fractionsDocumentsItem.isClicked;
        }
        return fractionsDocumentsItem.copy(i, str3, str4, list2, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDocumentId() {
        return this.documentId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<FractionsTestingItem> component4() {
        return this.testingItemList;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDocumentStatus() {
        return this.documentStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FractionsDocumentsItem copy(int documentId, @NotNull String title, @NotNull String description, @NotNull List<FractionsTestingItem> testingItemList, boolean documentStatus, boolean isClicked) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(testingItemList, "testingItemList");
        return new FractionsDocumentsItem(documentId, title, description, testingItemList, documentStatus, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionsDocumentsItem)) {
            return false;
        }
        FractionsDocumentsItem fractionsDocumentsItem = (FractionsDocumentsItem) other;
        return this.documentId == fractionsDocumentsItem.documentId && Intrinsics.areEqual(this.title, fractionsDocumentsItem.title) && Intrinsics.areEqual(this.description, fractionsDocumentsItem.description) && Intrinsics.areEqual(this.testingItemList, fractionsDocumentsItem.testingItemList) && this.documentStatus == fractionsDocumentsItem.documentStatus && this.isClicked == fractionsDocumentsItem.isClicked;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.documentId) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.testingItemList.hashCode()) * 31) + Boolean.hashCode(this.documentStatus)) * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "FractionsDocumentsItem(documentId=" + this.documentId + ", title=" + this.title + ", description=" + this.description + ", testingItemList=" + this.testingItemList + ", documentStatus=" + this.documentStatus + ", isClicked=" + this.isClicked + ")";
    }

    public FractionsDocumentsItem(int i, @NotNull String title, @NotNull String description, @NotNull List<FractionsTestingItem> testingItemList, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(testingItemList, "testingItemList");
        this.documentId = i;
        this.title = title;
        this.description = description;
        this.testingItemList = testingItemList;
        this.documentStatus = z;
        this.isClicked = z2;
    }

    public final int getDocumentId() {
        return this.documentId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<FractionsTestingItem> getTestingItemList() {
        return this.testingItemList;
    }

    public final boolean getDocumentStatus() {
        return this.documentStatus;
    }

    public final void setDocumentStatus(boolean z) {
        this.documentStatus = z;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

