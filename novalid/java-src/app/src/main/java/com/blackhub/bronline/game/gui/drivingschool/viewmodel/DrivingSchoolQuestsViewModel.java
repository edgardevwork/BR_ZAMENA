package com.blackhub.bronline.game.gui.drivingschool.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.drivingschool.data.CurrentAndAllQuestions;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingAnswer;
import com.blackhub.bronline.game.gui.drivingschool.network.DrivingSchoolActionsWithJSON;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: DrivingSchoolQuestsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010J\u0019\u0010 \u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0010J\u000e\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000e¨\u0006+"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/drivingschool/viewmodel/DrivingSchoolQuestsViewModel;", "Landroidx/lifecycle/ViewModel;", "actionsWithJson", "Lcom/blackhub/bronline/game/gui/drivingschool/network/DrivingSchoolActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/drivingschool/network/DrivingSchoolActionsWithJSON;)V", "allQuests", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "currentQuest", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingAnswer;", "getCurrentQuest", "()Lkotlinx/coroutines/flow/StateFlow;", "currentQuestID", "", "getCurrentQuestID", "currentValueOfQuestions", "maxValueOfQuestions", "mutableCurrentQuest", "mutableCurrentQuestID", "mutableQuestionNumber", "mutableValueOfQuestions", "Lcom/blackhub/bronline/game/gui/drivingschool/data/CurrentAndAllQuestions;", "questionNumber", "getQuestionNumber", "valueOfQuestions", "getValueOfQuestions", "checkAnswer", "", "answer", "initAllQuests", "quests", "([Ljava/lang/String;)V", "setCurrentValueOfQuestions", "currentValue", "setMaxValueOfQuestions", "maxValue", "setQuestionNumber", "number", "showNewQuest", "questID", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class DrivingSchoolQuestsViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final DrivingSchoolActionsWithJSON actionsWithJson;

    @NotNull
    public final MutableStateFlow<String[]> allQuests;

    @NotNull
    public final StateFlow<List<DrivingAnswer>> currentQuest;

    @NotNull
    public final StateFlow<Integer> currentQuestID;

    @NotNull
    public final MutableStateFlow<Integer> currentValueOfQuestions;

    @NotNull
    public final MutableStateFlow<Integer> maxValueOfQuestions;

    @NotNull
    public final MutableStateFlow<List<DrivingAnswer>> mutableCurrentQuest;

    @NotNull
    public final MutableStateFlow<Integer> mutableCurrentQuestID;

    @NotNull
    public final MutableStateFlow<Integer> mutableQuestionNumber;

    @NotNull
    public final MutableStateFlow<CurrentAndAllQuestions> mutableValueOfQuestions;

    @NotNull
    public final StateFlow<Integer> questionNumber;

    @NotNull
    public final StateFlow<CurrentAndAllQuestions> valueOfQuestions;

    @Inject
    public DrivingSchoolQuestsViewModel(@NotNull DrivingSchoolActionsWithJSON actionsWithJson) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.actionsWithJson = actionsWithJson;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableQuestionNumber = MutableStateFlow;
        this.questionNumber = MutableStateFlow;
        this.maxValueOfQuestions = StateFlowKt.MutableStateFlow(0);
        this.currentValueOfQuestions = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<CurrentAndAllQuestions> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new CurrentAndAllQuestions(0, 0));
        this.mutableValueOfQuestions = MutableStateFlow2;
        this.valueOfQuestions = MutableStateFlow2;
        this.allQuests = StateFlowKt.MutableStateFlow(new String[0]);
        MutableStateFlow<List<DrivingAnswer>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableCurrentQuest = MutableStateFlow3;
        this.currentQuest = MutableStateFlow3;
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.mutableCurrentQuestID = MutableStateFlow4;
        this.currentQuestID = MutableStateFlow4;
    }

    @NotNull
    public final StateFlow<Integer> getQuestionNumber() {
        return this.questionNumber;
    }

    @NotNull
    public final StateFlow<CurrentAndAllQuestions> getValueOfQuestions() {
        return this.valueOfQuestions;
    }

    @NotNull
    public final StateFlow<List<DrivingAnswer>> getCurrentQuest() {
        return this.currentQuest;
    }

    @NotNull
    public final StateFlow<Integer> getCurrentQuestID() {
        return this.currentQuestID;
    }

    public final void setQuestionNumber(int number) {
        this.mutableQuestionNumber.setValue(Integer.valueOf(number));
    }

    public final void setMaxValueOfQuestions(int maxValue) {
        this.maxValueOfQuestions.setValue(Integer.valueOf(maxValue));
        this.mutableValueOfQuestions.setValue(new CurrentAndAllQuestions(this.currentValueOfQuestions.getValue().intValue(), maxValue));
    }

    public final void setCurrentValueOfQuestions(int currentValue) {
        this.currentValueOfQuestions.setValue(Integer.valueOf(currentValue));
        this.mutableValueOfQuestions.setValue(new CurrentAndAllQuestions(currentValue, this.maxValueOfQuestions.getValue().intValue()));
    }

    public final void initAllQuests(@NotNull String[] quests) {
        Intrinsics.checkNotNullParameter(quests, "quests");
        this.allQuests.setValue(quests);
    }

    public final void showNewQuest(int questID) {
        this.mutableCurrentQuestID.setValue(Integer.valueOf(questID));
        String[] value = this.allQuests.getValue();
        int i = (questID - 1) * 5;
        if (value.length > i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 5; i2++) {
                arrayList.add(new DrivingAnswer(value[i], false, 2, null));
                i++;
            }
            this.mutableCurrentQuest.setValue(arrayList);
        }
    }

    public final void checkAnswer(int answer) throws JSONException {
        this.actionsWithJson.sendCheckAnswer(answer);
    }
}
