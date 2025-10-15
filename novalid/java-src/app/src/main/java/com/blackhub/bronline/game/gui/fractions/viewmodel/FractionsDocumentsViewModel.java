package com.blackhub.bronline.game.gui.fractions.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsObj;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsObjList;
import com.blackhub.bronline.game.gui.fractions.data.FractionsTestingItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionsTestingResult;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: FractionsDocumentsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0007J\u0016\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007J\u0016\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007J\u0016\u0010&\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bJ\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0007J\u0010\u0010+\u001a\u00020\u001b2\b\u0010,\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\t¨\u0006-"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJSON", "Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;)V", "documentIdLiveData", "Landroidx/lifecycle/LiveData;", "", "getDocumentIdLiveData", "()Landroidx/lifecycle/LiveData;", "documentsListLivedata", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsItem;", "getDocumentsListLivedata", "mutableDocumentIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "mutableDocumentsListLiveData", "mutableFractionIdLiveData", "mutableTestingLiveData", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsTestingItem;", "mutableTestingResultLiveData", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsTestingResult;", "testingLiveData", "getTestingLiveData", "testingResultLiveData", "getTestingResultLiveData", "getDocumentsAndTestingLists", "", "documentsObj", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObjList;", "sendAnswerChosen", "chosenAnswerIndex", "sendButtonAcquaintedPressed", "documentId", "documentNumber", "sendButtonPressed", "currentLayout", "typeKey", "setDisplayButtonAcquainted", "displayButtonAcquainted", "setFractionId", "fractionId", "setTestingList", "setTestingResult", "item", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFractionsDocumentsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FractionsDocumentsViewModel.kt\ncom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsDocumentsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes3.dex */
public final class FractionsDocumentsViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    @NotNull
    public final LiveData<Integer> documentIdLiveData;

    @NotNull
    public final LiveData<List<FractionsDocumentsItem>> documentsListLivedata;

    @NotNull
    public final MutableLiveData<Integer> mutableDocumentIdLiveData;

    @NotNull
    public final MutableLiveData<List<FractionsDocumentsItem>> mutableDocumentsListLiveData;

    @NotNull
    public final MutableLiveData<Integer> mutableFractionIdLiveData;

    @NotNull
    public final MutableLiveData<List<FractionsTestingItem>> mutableTestingLiveData;

    @NotNull
    public MutableLiveData<FractionsTestingResult> mutableTestingResultLiveData;

    @NotNull
    public final LiveData<List<FractionsTestingItem>> testingLiveData;

    @NotNull
    public final LiveData<FractionsTestingResult> testingResultLiveData;

    @Inject
    public FractionsDocumentsViewModel(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
        MutableLiveData<List<FractionsDocumentsItem>> mutableLiveData = new MutableLiveData<>();
        this.mutableDocumentsListLiveData = mutableLiveData;
        this.documentsListLivedata = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mutableDocumentIdLiveData = mutableLiveData2;
        this.documentIdLiveData = mutableLiveData2;
        MutableLiveData<List<FractionsTestingItem>> mutableLiveData3 = new MutableLiveData<>();
        this.mutableTestingLiveData = mutableLiveData3;
        this.testingLiveData = mutableLiveData3;
        MutableLiveData<FractionsTestingResult> mutableLiveData4 = new MutableLiveData<>();
        this.mutableTestingResultLiveData = mutableLiveData4;
        this.testingResultLiveData = mutableLiveData4;
        this.mutableFractionIdLiveData = new MutableLiveData<>();
    }

    @NotNull
    public final LiveData<List<FractionsDocumentsItem>> getDocumentsListLivedata() {
        return this.documentsListLivedata;
    }

    @NotNull
    public final LiveData<Integer> getDocumentIdLiveData() {
        return this.documentIdLiveData;
    }

    @NotNull
    public final LiveData<List<FractionsTestingItem>> getTestingLiveData() {
        return this.testingLiveData;
    }

    @NotNull
    public final LiveData<FractionsTestingResult> getTestingResultLiveData() {
        return this.testingResultLiveData;
    }

    public final void setFractionId(int fractionId) {
        this.mutableFractionIdLiveData.setValue(Integer.valueOf(fractionId));
    }

    public final void sendButtonPressed(int currentLayout, int typeKey) throws JSONException {
        this.actionsWithJSON.sendButtonPressed(currentLayout, typeKey);
    }

    public final void sendButtonAcquaintedPressed(int documentId, int documentNumber) throws JSONException {
        this.actionsWithJSON.sendButtonAcquaintedPressed(documentId, documentNumber);
    }

    public final void sendAnswerChosen(int chosenAnswerIndex) throws JSONException {
        this.actionsWithJSON.sendAnswerChosen(chosenAnswerIndex + 1);
    }

    public final void setTestingList(int documentId) {
        FractionsDocumentsItem fractionsDocumentsItem;
        Object next;
        List<FractionsDocumentsItem> value = this.mutableDocumentsListLiveData.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((FractionsDocumentsItem) next).getDocumentId() == documentId) {
                        break;
                    }
                }
            }
            fractionsDocumentsItem = (FractionsDocumentsItem) next;
        } else {
            fractionsDocumentsItem = null;
        }
        this.mutableDocumentIdLiveData.setValue(Integer.valueOf(documentId));
        this.mutableTestingLiveData.setValue(fractionsDocumentsItem != null ? fractionsDocumentsItem.getTestingItemList() : null);
    }

    public final void setTestingResult(@Nullable FractionsTestingResult item) {
        this.mutableTestingResultLiveData.setValue(item);
    }

    public final void getDocumentsAndTestingLists(@NotNull FractionsDocumentsObjList documentsObj) {
        Object next;
        FractionsDocumentsItem fractionsDocumentsItem;
        Object next2;
        Intrinsics.checkNotNullParameter(documentsObj, "documentsObj");
        List<FractionsDocumentsObj> fractionDocuments = documentsObj.getFractionDocuments();
        if (fractionDocuments == null) {
            fractionDocuments = CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator<T> it = fractionDocuments.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int fractionId = ((FractionsDocumentsObj) next).getFractionId();
            Integer value = this.mutableFractionIdLiveData.getValue();
            if (value != null && fractionId == value.intValue()) {
                break;
            }
        }
        FractionsDocumentsObj fractionsDocumentsObj = (FractionsDocumentsObj) next;
        List<FractionsDocumentsItem> fractionDocuments2 = fractionsDocumentsObj != null ? fractionsDocumentsObj.getFractionDocuments() : null;
        if (fractionDocuments2 != null) {
            if (this.mutableDocumentsListLiveData.getValue() != null) {
                List<FractionsDocumentsItem> value2 = this.mutableDocumentsListLiveData.getValue();
                if (value2 != null) {
                    Iterator<T> it2 = value2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            if (((FractionsDocumentsItem) next2).isClicked()) {
                                break;
                            }
                        }
                    }
                    fractionsDocumentsItem = (FractionsDocumentsItem) next2;
                } else {
                    fractionsDocumentsItem = null;
                }
                if (fractionsDocumentsItem != null) {
                    List<FractionsDocumentsItem> value3 = this.mutableDocumentsListLiveData.getValue();
                    int orZero = IntExtensionKt.getOrZero(value3 != null ? Integer.valueOf(value3.indexOf(fractionsDocumentsItem)) : null);
                    if (orZero < fractionDocuments2.size()) {
                        fractionDocuments2.get(orZero).setClicked(true);
                    } else {
                        fractionDocuments2.get(0).setClicked(true);
                    }
                } else {
                    fractionDocuments2.get(0).setClicked(true);
                }
            } else {
                fractionDocuments2.get(0).setClicked(true);
            }
            this.mutableDocumentsListLiveData.postValue(fractionDocuments2);
        }
    }

    public final void setDisplayButtonAcquainted(@NotNull List<Integer> displayButtonAcquainted) {
        Intrinsics.checkNotNullParameter(displayButtonAcquainted, "displayButtonAcquainted");
        if (this.mutableDocumentsListLiveData.getValue() != null) {
            List<FractionsDocumentsItem> value = this.mutableDocumentsListLiveData.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.MutableList<com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsItem>");
            List<FractionsDocumentsItem> listAsMutableList = TypeIntrinsics.asMutableList(value);
            int size = listAsMutableList.size();
            for (int i = 0; i < size; i++) {
                if (i < displayButtonAcquainted.size()) {
                    FractionsDocumentsItem fractionsDocumentsItem = listAsMutableList.get(i);
                    Integer num = displayButtonAcquainted.get(i);
                    fractionsDocumentsItem.setDocumentStatus((num != null ? num.intValue() : 0) != 0);
                }
            }
            this.mutableDocumentsListLiveData.setValue(listAsMutableList);
        }
    }
}
