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

