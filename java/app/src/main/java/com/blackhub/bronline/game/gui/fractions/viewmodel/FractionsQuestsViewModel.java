package com.blackhub.bronline.game.gui.fractions.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsItem;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsList;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsObj;
import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: FractionsQuestsViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFractionsQuestsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FractionsQuestsViewModel.kt\ncom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1#2:46\n1855#3,2:47\n*S KotlinDebug\n*F\n+ 1 FractionsQuestsViewModel.kt\ncom/blackhub/bronline/game/gui/fractions/viewmodel/FractionsQuestsViewModel\n*L\n27#1:47,2\n*E\n"})
/* loaded from: classes3.dex */
public final class FractionsQuestsViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final FractionActionsWithJSON actionsWithJSON;

    @NotNull
    public final MutableLiveData<List<FractionQuestsItem>> mutableQuestsLiveData;

    @NotNull
    public final LiveData<List<FractionQuestsItem>> questsLiveData;

    @NotNull
    public final MutableLiveData<List<FractionQuestsList>> questsObjMutableLivedata;

    @Inject
    public FractionsQuestsViewModel(@NotNull FractionActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(actionsWithJSON, "actionsWithJSON");
        this.actionsWithJSON = actionsWithJSON;
        this.questsObjMutableLivedata = new MutableLiveData<>();
        MutableLiveData<List<FractionQuestsItem>> mutableLiveData = new MutableLiveData<>();
        this.mutableQuestsLiveData = mutableLiveData;
        this.questsLiveData = mutableLiveData;
    }

    @NotNull
    public final LiveData<List<FractionQuestsItem>> getQuestsLiveData() {
        return this.questsLiveData;
    }

    public final void getQuestsObj(@NotNull FractionQuestsObj questsObj) {
        Intrinsics.checkNotNullParameter(questsObj, "questsObj");
        MutableLiveData<List<FractionQuestsList>> mutableLiveData = this.questsObjMutableLivedata;
        List<FractionQuestsList> fractionQuests = questsObj.getFractionQuests();
        if (fractionQuests == null) {
            fractionQuests = CollectionsKt__CollectionsKt.emptyList();
        }
        mutableLiveData.setValue(fractionQuests);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setQuestsList(int fractionId, int rank) {
        List<FractionQuestsItem> taskList;
        Object next;
        Object next2;
        List<FractionQuestsList> value = this.questsObjMutableLivedata.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (((FractionQuestsList) next2).getFractionID() == fractionId) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            FractionQuestsList fractionQuestsList = (FractionQuestsList) next2;
            taskList = fractionQuestsList != null ? fractionQuestsList.getTaskList() : null;
        }
        if (taskList == null) {
            taskList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (FractionQuestsItem fractionQuestsItem : taskList) {
            if ((fractionQuestsItem != null ? fractionQuestsItem.getTaskAccess() : null) != null && (!fractionQuestsItem.getTaskAccess().isEmpty())) {
                if (rank >= fractionQuestsItem.getTaskAccess().get(0).intValue() && rank <= fractionQuestsItem.getTaskAccess().get(1).intValue()) {
                    arrayList.add(fractionQuestsItem);
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((FractionQuestsItem) next).getIsClicked()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (next == null) {
                        ((FractionQuestsItem) arrayList.get(0)).setClicked(true);
                    }
                }
            }
        }
        this.mutableQuestsLiveData.setValue(arrayList);
    }

    public final void sendStartQuest(int taskId) throws JSONException {
        this.actionsWithJSON.sendStartQuest(taskId);
    }
}

