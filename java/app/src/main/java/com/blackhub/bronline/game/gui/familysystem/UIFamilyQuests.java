package com.blackhub.bronline.game.gui.familysystem;

import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FamiliesQuestsLayoutBinding;
import com.blackhub.bronline.game.common.UILayout;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.familysystem.adapters.FamilyQuestsAdapter;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemTasksObj;
import com.blackhub.bronline.game.gui.familysystem.network.ActionsWithJSON;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIFamilyQuests.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UIFamilyQuests extends UILayout {
    public static final int $stable = 8;

    @Nullable
    public final ActionsWithJSON actionsWithJSON;

    @Nullable
    public Animation anim;
    public FamiliesQuestsLayoutBinding binding;

    @Nullable
    public final JNIActivity mainActivity;

    @NotNull
    public final GUIFamilySystem mainRoot;

    @Nullable
    public Function2<? super FamilySystemTasksObj, ? super Integer, Unit> onClickQuestInFamilyQuestsList;

    @Nullable
    public FamilyQuestsAdapter questsAdapter;

    @NotNull
    public final List<FamilySystemTasksObj> questsList;
    public int thisQuestsId;
    public long timesOldClickOnButtonStart;
    public long timesOldClickOnQuest;

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutClose() {
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    public void onLayoutShown() {
    }

    public UIFamilyQuests(@NotNull GUIFamilySystem mainRoot, @Nullable JNIActivity jNIActivity, @Nullable ActionsWithJSON actionsWithJSON) {
        Intrinsics.checkNotNullParameter(mainRoot, "mainRoot");
        this.mainRoot = mainRoot;
        this.mainActivity = jNIActivity;
        this.actionsWithJSON = actionsWithJSON;
        this.questsList = new ArrayList();
        this.thisQuestsId = -1;
    }

    public final void setStartParameters() {
        if (this.questsList.size() > 0) {
            clearQuestsCheckStatus();
            FamilySystemTasksObj familySystemTasksObj = this.questsList.get(0);
            setInfoAboutQuest(familySystemTasksObj);
            this.thisQuestsId = familySystemTasksObj.getId();
        }
        setDataInView();
    }

    public final void clearQuestsCheckStatus() {
        int size = this.questsList.size();
        int i = 0;
        while (i < size) {
            this.questsList.get(i).setClicked(i == 0);
            i++;
        }
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    /* renamed from: getView */
    public View getMViewRoot() {
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding = this.binding;
        if (familiesQuestsLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesQuestsLayoutBinding = null;
        }
        ConstraintLayout root = familiesQuestsLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.blackhub.bronline.game.common.UILayout
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBindingInflate = FamiliesQuestsLayoutBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(familiesQuestsLayoutBindingInflate, "inflate(...)");
        this.binding = familiesQuestsLayoutBindingInflate;
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding = null;
        if (familiesQuestsLayoutBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesQuestsLayoutBindingInflate = null;
        }
        this.anim = AnimationUtils.loadAnimation(familiesQuestsLayoutBindingInflate.getRoot().getContext(), R.anim.button_click);
        List<FamilySystemTasksObj> list = this.questsList;
        list.clear();
        FamilySystemList familySystemListFromJson = this.mainRoot.getFamilySystemListFromJson();
        if (familySystemListFromJson != null) {
            list.addAll(familySystemListFromJson.getTasksList());
        }
        setLogicForQuestsClick();
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding2 = this.binding;
        if (familiesQuestsLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesQuestsLayoutBinding2 = null;
        }
        familiesQuestsLayoutBinding2.buttonStartQuest.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.familysystem.UIFamilyQuests$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                UIFamilyQuests.onCreateView$lambda$3(this.f$0, view);
            }
        });
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding3 = this.binding;
        if (familiesQuestsLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesQuestsLayoutBinding3 = null;
        }
        familiesQuestsLayoutBinding3.valueQuestsDescription.setMovementMethod(new ScrollingMovementMethod());
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding4 = this.binding;
        if (familiesQuestsLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesQuestsLayoutBinding = familiesQuestsLayoutBinding4;
        }
        ConstraintLayout root = familiesQuestsLayoutBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void onCreateView$lambda$3(UIFamilyQuests this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (System.currentTimeMillis() - this$0.timesOldClickOnButtonStart > 500) {
            this$0.timesOldClickOnButtonStart = System.currentTimeMillis();
            ActionsWithJSON actionsWithJSON = this$0.actionsWithJSON;
            if (actionsWithJSON != null) {
                actionsWithJSON.startQuest(this$0.thisQuestsId);
            }
        }
    }

    private final void setDataInView() {
        this.questsAdapter = new FamilyQuestsAdapter(this.questsList, this.onClickQuestInFamilyQuestsList, this.mainActivity);
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding = this.binding;
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding2 = null;
        if (familiesQuestsLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesQuestsLayoutBinding = null;
        }
        RecyclerView recyclerView = familiesQuestsLayoutBinding.questionsList;
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding3 = this.binding;
        if (familiesQuestsLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            familiesQuestsLayoutBinding2 = familiesQuestsLayoutBinding3;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(familiesQuestsLayoutBinding2.getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.questsAdapter);
    }

    /* compiled from: UIFamilyQuests.kt */
    @Metadata(m7104d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\u000b"}, m7105d2 = {"com/blackhub/bronline/game/gui/familysystem/UIFamilyQuests$setLogicForQuestsClick$1", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemTasksObj;", "Lkotlin/ParameterName;", "name", "thisItem", "", "position", "", "Lcom/blackhub/bronline/game/gui/familysystem/OnClickQuestInFamilyQuestsList;", "invoke", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.familysystem.UIFamilyQuests$setLogicForQuestsClick$1 */
    public static final class C40191 implements Function2<FamilySystemTasksObj, Integer, Unit> {
        public C40191() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FamilySystemTasksObj familySystemTasksObj, Integer num) {
            invoke(familySystemTasksObj, num.intValue());
            return Unit.INSTANCE;
        }

        public void invoke(@NotNull FamilySystemTasksObj thisItem, int position) {
            Intrinsics.checkNotNullParameter(thisItem, "thisItem");
            if (System.currentTimeMillis() - UIFamilyQuests.this.timesOldClickOnQuest > 300) {
                UIFamilyQuests.this.timesOldClickOnQuest = System.currentTimeMillis();
                thisItem.setClicked(true);
                FamilyQuestsAdapter familyQuestsAdapter = UIFamilyQuests.this.questsAdapter;
                if (familyQuestsAdapter != null) {
                    familyQuestsAdapter.notifyItemChanged(position);
                    familyQuestsAdapter.setCheckOnlyElement(position);
                }
                UIFamilyQuests.this.thisQuestsId = thisItem.getId();
                UIFamilyQuests.this.setInfoAboutQuest(thisItem);
            }
        }
    }

    public final void setLogicForQuestsClick() {
        this.onClickQuestInFamilyQuestsList = new Function2<FamilySystemTasksObj, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.familysystem.UIFamilyQuests.setLogicForQuestsClick.1
            public C40191() {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(FamilySystemTasksObj familySystemTasksObj, Integer num) {
                invoke(familySystemTasksObj, num.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(@NotNull FamilySystemTasksObj thisItem, int position) {
                Intrinsics.checkNotNullParameter(thisItem, "thisItem");
                if (System.currentTimeMillis() - UIFamilyQuests.this.timesOldClickOnQuest > 300) {
                    UIFamilyQuests.this.timesOldClickOnQuest = System.currentTimeMillis();
                    thisItem.setClicked(true);
                    FamilyQuestsAdapter familyQuestsAdapter = UIFamilyQuests.this.questsAdapter;
                    if (familyQuestsAdapter != null) {
                        familyQuestsAdapter.notifyItemChanged(position);
                        familyQuestsAdapter.setCheckOnlyElement(position);
                    }
                    UIFamilyQuests.this.thisQuestsId = thisItem.getId();
                    UIFamilyQuests.this.setInfoAboutQuest(thisItem);
                }
            }
        };
    }

    public final void setInfoAboutQuest(FamilySystemTasksObj thisItem) {
        int scoreReward;
        FamiliesQuestsLayoutBinding familiesQuestsLayoutBinding = this.binding;
        if (familiesQuestsLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            familiesQuestsLayoutBinding = null;
        }
        SpannableString spannableString = new SpannableString(thisItem.getTitle());
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.yellow)), 0, spannableString.length(), 33);
        TextView textView = familiesQuestsLayoutBinding.questsTitle;
        JNIActivity jNIActivity = this.mainActivity;
        textView.setText(jNIActivity != null ? jNIActivity.getString(R.string.families_questions_title, spannableString) : null);
        familiesQuestsLayoutBinding.valueQuestsDescription.setText(thisItem.getDescription());
        TextView textView2 = familiesQuestsLayoutBinding.present1Value;
        JNIActivity jNIActivity2 = this.mainActivity;
        textView2.setText(jNIActivity2 != null ? jNIActivity2.getString(R.string.common_string_with_ruble, String.valueOf(thisItem.getMoneyReward())) : null);
        if (thisItem.getScoreReward() < 0) {
            scoreReward = thisItem.getScoreReward() * (-1);
            familiesQuestsLayoutBinding.present2Item.setImageResource(R.drawable.ic_gold_down);
        } else {
            scoreReward = thisItem.getScoreReward();
            familiesQuestsLayoutBinding.present2Item.setImageResource(R.drawable.ic_gold_up);
        }
        TextView textView3 = familiesQuestsLayoutBinding.present2Value;
        JNIActivity jNIActivity3 = this.mainActivity;
        textView3.setText(jNIActivity3 != null ? jNIActivity3.getString(R.string.families_quests_present_2, String.valueOf(scoreReward)) : null);
        TextView textView4 = familiesQuestsLayoutBinding.present3Value;
        JNIActivity jNIActivity4 = this.mainActivity;
        textView4.setText(jNIActivity4 != null ? jNIActivity4.getString(R.string.families_quests_present_3, String.valueOf(thisItem.getTokenReward())) : null);
    }

    public final void setNullableParameters() {
        this.anim = null;
        this.questsAdapter = null;
        this.onClickQuestInFamilyQuestsList = null;
        this.questsList.clear();
    }
}

