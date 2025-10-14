package com.blackhub.bronline.game.gui.socialaction;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.SocialInteractionBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction;
import com.blackhub.bronline.game.gui.socialaction.network.ActionWithJSON;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUISocialInteraction.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUISocialInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUISocialInteraction.kt\ncom/blackhub/bronline/game/gui/socialaction/GUISocialInteraction\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,429:1\n172#2,9:430\n*S KotlinDebug\n*F\n+ 1 GUISocialInteraction.kt\ncom/blackhub/bronline/game/gui/socialaction/GUISocialInteraction\n*L\n50#1:430,9\n*E\n"})

public final class GUISocialInteraction extends BaseISAMPGUIFragment<SocialInteractionBinding> {
    public static final int $stable = 8;

    @Nullable
    public ActionWithJSON actionWithJson;

    @Nullable
    public SetViewByValueOfActions logicSetView;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;
    public int playerInOrganization;
    public int playersId;
    public int thisPage;
    public int thisType = 4;

    @NotNull
    public List<SocialInteraction> thisListWithOrganizationMain = new ArrayList();

    @NotNull
    public List<SocialInteraction> thisListWithSocialMain = new ArrayList();

    @NotNull
    public List<SocialInteraction> thisListWithCommunicationMain = new ArrayList();

    @NotNull
    public List<SocialInteraction> actualListWithActions = new ArrayList();

    @NotNull
    public List<Integer> actualIdsArray = new ArrayList();

    @NotNull
    public List<SocialInteraction> allListWithActions = CollectionsKt__CollectionsKt.emptyList();

    @NotNull
    public String playersNick = "";
    public final long minTimerForBlock = 1500;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 36;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        Integer numValueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            getAllParameters(json);
            setStartParameters();
        }
    }

    @NotNull
    public final String getPlayersNick() {
        return this.playersNick;
    }

    public final int getPlayersId() {
        return this.playersId;
    }

    /* renamed from: getStatusInOrganization, reason: from getter */
    public final int getPlayerInOrganization() {
        return this.playerInOrganization;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        this.actionWithJson = new ActionWithJSON();
        final SocialInteractionBinding socialInteractionBinding = (SocialInteractionBinding) getBinding();
        getAllParameters(getJsonObj());
        initSocialInteractionsFromJson();
        JNILib.toggleDrawing2dStuff(true);
        ImageView closeInteraction = socialInteractionBinding.closeInteraction;
        Intrinsics.checkNotNullExpressionValue(closeInteraction, "closeInteraction");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, closeInteraction, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.closeFragment();
            }
        }, 1, null);
        socialInteractionBinding.bgSocialInteraction.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUISocialInteraction.initViewsISAMPGUI$lambda$1$lambda$0(this.f$0, view);
            }
        });
        TextView buttonWithNickname = socialInteractionBinding.buttonWithNickname;
        Intrinsics.checkNotNullExpressionValue(buttonWithNickname, "buttonWithNickname");
        setOnClickListenerWithAnimAndDelay(buttonWithNickname, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON = this.this$0.actionWithJson;
                if (actionWithJSON != null) {
                    actionWithJSON.sendIfCloseOrChangePlayer(2);
                }
                Log.v(SocialConstants.LOG_TAG, "кнопка для смены никнейма и ид, чтобы переоткрыть интерфейс");
            }
        });
        TextView button1 = socialInteractionBinding.button1;
        Intrinsics.checkNotNullExpressionValue(button1, "button1");
        setOnClickListenerWithAnimAndDelay(button1, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON;
                Log.v(SocialConstants.LOG_TAG, "кнопка_1");
                SetViewByValueOfActions setViewByValueOfActions = this.this$0.logicSetView;
                SocialInteraction actionFromButton1 = setViewByValueOfActions != null ? setViewByValueOfActions.getActionFromButton1() : null;
                SocialUtilsKt.logThisAction(actionFromButton1);
                if (actionFromButton1 == null || (actionWithJSON = this.this$0.actionWithJson) == null) {
                    return;
                }
                actionWithJSON.sendPressButton(actionFromButton1.getId());
            }
        });
        TextView button2 = socialInteractionBinding.button2;
        Intrinsics.checkNotNullExpressionValue(button2, "button2");
        setOnClickListenerWithAnimAndDelay(button2, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON;
                Log.v(SocialConstants.LOG_TAG, "кнопка_2");
                if (this.this$0.thisType != 4 || this.this$0.playerInOrganization != 1) {
                    SetViewByValueOfActions setViewByValueOfActions = this.this$0.logicSetView;
                    SocialInteraction actionFromButton2 = setViewByValueOfActions != null ? setViewByValueOfActions.getActionFromButton2() : null;
                    SocialUtilsKt.logThisAction(actionFromButton2);
                    if (actionFromButton2 == null || (actionWithJSON = this.this$0.actionWithJson) == null) {
                        return;
                    }
                    actionWithJSON.sendPressButton(actionFromButton2.getId());
                    return;
                }
                if (this.this$0.thisListWithCommunicationMain.size() == 0) {
                    ActionWithJSON actionWithJSON2 = this.this$0.actionWithJson;
                    if (actionWithJSON2 != null) {
                        actionWithJSON2.sendMessageError("В текущем типе взаимодействия отсутствуют доступные команды");
                        return;
                    }
                    return;
                }
                this.this$0.thisType = 3;
                this.this$0.thisPage = 0;
                GUISocialInteraction gUISocialInteraction = this.this$0;
                gUISocialInteraction.setLogicForClick(gUISocialInteraction.thisType, this.this$0.thisPage);
            }
        });
        TextView button3 = socialInteractionBinding.button3;
        Intrinsics.checkNotNullExpressionValue(button3, "button3");
        setOnClickListenerWithAnimAndDelay(button3, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON;
                Log.v(SocialConstants.LOG_TAG, "кнопка_3");
                if (this.this$0.thisType == 4 && this.this$0.playerInOrganization == 0) {
                    if (this.this$0.thisListWithCommunicationMain.size() == 0) {
                        ActionWithJSON actionWithJSON2 = this.this$0.actionWithJson;
                        if (actionWithJSON2 != null) {
                            actionWithJSON2.sendMessageError("В текущем типе взаимодействия отсутствуют доступные команды");
                            return;
                        }
                        return;
                    }
                    this.this$0.thisType = 3;
                    this.this$0.thisPage = 0;
                    GUISocialInteraction gUISocialInteraction = this.this$0;
                    gUISocialInteraction.setLogicForClick(gUISocialInteraction.thisType, this.this$0.thisPage);
                    return;
                }
                CharSequence text = socialInteractionBinding.button3.getText();
                Context context = this.this$0.getContext();
                if (!Intrinsics.areEqual(text, context != null ? context.getText(R.string.social_interaction_if_with_additionally) : null)) {
                    SetViewByValueOfActions setViewByValueOfActions = this.this$0.logicSetView;
                    SocialInteraction actionFromButton3 = setViewByValueOfActions != null ? setViewByValueOfActions.getActionFromButton3() : null;
                    SocialUtilsKt.logThisAction(actionFromButton3);
                    if (actionFromButton3 == null || (actionWithJSON = this.this$0.actionWithJson) == null) {
                        return;
                    }
                    actionWithJSON.sendPressButton(actionFromButton3.getId());
                    return;
                }
                GUISocialInteraction gUISocialInteraction2 = this.this$0;
                gUISocialInteraction2.thisPage++;
                int unused = gUISocialInteraction2.thisPage;
                GUISocialInteraction gUISocialInteraction3 = this.this$0;
                gUISocialInteraction3.setLogicForClick(gUISocialInteraction3.thisType, this.this$0.thisPage);
                Log.v(SocialConstants.LOG_TAG, "thisPage = " + this.this$0.thisPage);
            }
        });
        TextView button4 = socialInteractionBinding.button4;
        Intrinsics.checkNotNullExpressionValue(button4, "button4");
        setOnClickListenerWithAnimAndDelay(button4, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON;
                Log.v(SocialConstants.LOG_TAG, "кнопка_4");
                if (this.this$0.thisType == 4 && this.this$0.playerInOrganization == 1) {
                    if (this.this$0.thisListWithSocialMain.size() == 0) {
                        ActionWithJSON actionWithJSON2 = this.this$0.actionWithJson;
                        if (actionWithJSON2 != null) {
                            actionWithJSON2.sendMessageError("В текущем типе взаимодействия отсутствуют доступные команды");
                            return;
                        }
                        return;
                    }
                    this.this$0.thisType = 2;
                    this.this$0.thisPage = 0;
                    GUISocialInteraction gUISocialInteraction = this.this$0;
                    gUISocialInteraction.setLogicForClick(gUISocialInteraction.thisType, this.this$0.thisPage);
                    return;
                }
                GUISocialInteraction gUISocialInteraction2 = this.this$0;
                TextView button42 = socialInteractionBinding.button4;
                Intrinsics.checkNotNullExpressionValue(button42, "button4");
                gUISocialInteraction2.updatePageOrBackToMain(button42);
                SetViewByValueOfActions setViewByValueOfActions = this.this$0.logicSetView;
                SocialInteraction actionFromButton4 = setViewByValueOfActions != null ? setViewByValueOfActions.getActionFromButton4() : null;
                SocialUtilsKt.logThisAction(actionFromButton4);
                if (actionFromButton4 == null || (actionWithJSON = this.this$0.actionWithJson) == null) {
                    return;
                }
                actionWithJSON.sendPressButton(actionFromButton4.getId());
            }
        });
        TextView button5 = socialInteractionBinding.button5;
        Intrinsics.checkNotNullExpressionValue(button5, "button5");
        setOnClickListenerWithAnimAndDelay(button5, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON;
                Log.v(SocialConstants.LOG_TAG, "кнопка_5");
                if (this.this$0.thisType == 4 && this.this$0.playerInOrganization == 0) {
                    if (this.this$0.thisListWithSocialMain.size() == 0) {
                        ActionWithJSON actionWithJSON2 = this.this$0.actionWithJson;
                        if (actionWithJSON2 != null) {
                            actionWithJSON2.sendMessageError("В текущем типе взаимодействия отсутствуют доступные команды");
                            return;
                        }
                        return;
                    }
                    this.this$0.thisType = 2;
                    this.this$0.thisPage = 0;
                    GUISocialInteraction gUISocialInteraction = this.this$0;
                    gUISocialInteraction.setLogicForClick(gUISocialInteraction.thisType, this.this$0.thisPage);
                    return;
                }
                GUISocialInteraction gUISocialInteraction2 = this.this$0;
                TextView button52 = socialInteractionBinding.button5;
                Intrinsics.checkNotNullExpressionValue(button52, "button5");
                gUISocialInteraction2.updatePageOrBackToMain(button52);
                SetViewByValueOfActions setViewByValueOfActions = this.this$0.logicSetView;
                SocialInteraction actionFromButton5 = setViewByValueOfActions != null ? setViewByValueOfActions.getActionFromButton5() : null;
                SocialUtilsKt.logThisAction(actionFromButton5);
                if (actionFromButton5 == null || (actionWithJSON = this.this$0.actionWithJson) == null) {
                    return;
                }
                actionWithJSON.sendPressButton(actionFromButton5.getId());
            }
        });
        TextView button6 = socialInteractionBinding.button6;
        Intrinsics.checkNotNullExpressionValue(button6, "button6");
        setOnClickListenerWithAnimAndDelay(button6, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON;
                Log.v(SocialConstants.LOG_TAG, "кнопка_6");
                if (this.this$0.thisType != 4 || this.this$0.playerInOrganization != 1) {
                    SetViewByValueOfActions setViewByValueOfActions = this.this$0.logicSetView;
                    SocialInteraction actionFromButton6 = setViewByValueOfActions != null ? setViewByValueOfActions.getActionFromButton6() : null;
                    SocialUtilsKt.logThisAction(actionFromButton6);
                    if (actionFromButton6 == null || (actionWithJSON = this.this$0.actionWithJson) == null) {
                        return;
                    }
                    actionWithJSON.sendPressButton(actionFromButton6.getId());
                    return;
                }
                if (this.this$0.thisListWithOrganizationMain.size() == 0) {
                    ActionWithJSON actionWithJSON2 = this.this$0.actionWithJson;
                    if (actionWithJSON2 != null) {
                        actionWithJSON2.sendMessageError("В текущем типе взаимодействия отсутствуют доступные команды");
                        return;
                    }
                    return;
                }
                this.this$0.thisType = 1;
                this.this$0.thisPage = 0;
                GUISocialInteraction gUISocialInteraction = this.this$0;
                gUISocialInteraction.setLogicForClick(gUISocialInteraction.thisType, this.this$0.thisPage);
            }
        });
        TextView button7 = socialInteractionBinding.button7;
        Intrinsics.checkNotNullExpressionValue(button7, "button7");
        setOnClickListenerWithAnimAndDelay(button7, this.minTimerForBlock, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initViewsISAMPGUI$1$10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                ActionWithJSON actionWithJSON;
                Log.v(SocialConstants.LOG_TAG, "кнопка_7");
                SetViewByValueOfActions setViewByValueOfActions = this.this$0.logicSetView;
                SocialInteraction actionFromButton7 = setViewByValueOfActions != null ? setViewByValueOfActions.getActionFromButton7() : null;
                SocialUtilsKt.logThisAction(actionFromButton7);
                if (actionFromButton7 == null || (actionWithJSON = this.this$0.actionWithJson) == null) {
                    return;
                }
                actionWithJSON.sendPressButton(actionFromButton7.getId());
            }
        });
    }

    public static final void initViewsISAMPGUI$lambda$1$lambda$0(GUISocialInteraction this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeFragment();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public SocialInteractionBinding getViewBinding() {
        SocialInteractionBinding socialInteractionBindingInflate = SocialInteractionBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(socialInteractionBindingInflate, "inflate(...)");
        return socialInteractionBindingInflate;
    }

    /* compiled from: GUISocialInteraction.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initSocialInteractionsFromJson$1", m7120f = "GUISocialInteraction.kt", m7121i = {}, m7122l = {284}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$initSocialInteractionsFromJson$1 */
    /* loaded from: classes3.dex */
    public static final class C45051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45051(Continuation<? super C45051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUISocialInteraction.this.new C45051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfigurationJsonModel> configurationJsons = GUISocialInteraction.this.getMainViewModel().getConfigurationJsons();
                Lifecycle lifecycle = GUISocialInteraction.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
                final GUISocialInteraction gUISocialInteraction = GUISocialInteraction.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction.initSocialInteractionsFromJson.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) throws JSONException {
                        List<SocialInteraction> socialInteractionsFromJson = configurationJsonModel.getSocialInteractionsFromJson();
                        if (!socialInteractionsFromJson.isEmpty()) {
                            gUISocialInteraction.allListWithActions = socialInteractionsFromJson;
                            gUISocialInteraction.setStartParameters();
                        } else {
                            LocalNotification localNotification = new LocalNotification(GUIManager.INSTANCE.getInstance());
                            String string = gUISocialInteraction.getString(R.string.common_error_with_json_parsing);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            localNotification.showErrorNotification(string);
                            gUISocialInteraction.closeFragment();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initSocialInteractionsFromJson() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C45051(null), 3, null);
    }

    public final void setMultipleLists(List<SocialInteraction> allListWithActions) {
        this.thisListWithOrganizationMain.clear();
        this.thisListWithSocialMain.clear();
        this.thisListWithCommunicationMain.clear();
        for (SocialInteraction socialInteraction : allListWithActions) {
            int type = socialInteraction.getType();
            if (type == 1) {
                this.thisListWithOrganizationMain.add(socialInteraction);
            } else if (type == 2) {
                this.thisListWithSocialMain.add(socialInteraction);
            } else if (type == 3) {
                this.thisListWithCommunicationMain.add(socialInteraction);
            }
        }
    }

    public final void splitList(List<SocialInteraction> actionsList) {
        if (actionsList.size() > 6) {
            int size = actionsList.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 5; i3 < size; i3++) {
                actionsList.get(i3).setPage(1);
                i2++;
            }
            if (i2 > 6) {
                int size2 = actionsList.size();
                for (int i4 = 10; i4 < size2; i4++) {
                    actionsList.get(i4).setPage(2);
                    i++;
                }
                if (i > 6) {
                    int size3 = actionsList.size();
                    for (int i5 = 15; i5 < size3; i5++) {
                        actionsList.get(i5).setPage(3);
                    }
                }
            }
        }
    }

    @NotNull
    public final List<SocialInteraction> getThisListWithOrganizationMain() {
        return this.thisListWithOrganizationMain;
    }

    @NotNull
    public final List<SocialInteraction> getThisListWithSocialMain() {
        return this.thisListWithSocialMain;
    }

    @NotNull
    public final List<SocialInteraction> getThisListWithCommunicationMain() {
        return this.thisListWithCommunicationMain;
    }

    public final void setLogicForClick(int type, int page) {
        SetViewByValueOfActions setViewByValueOfActions = this.logicSetView;
        if (setViewByValueOfActions != null) {
            setViewByValueOfActions.updateButtonsText(type, page);
        }
    }

    public final void updatePageOrBackToMain(TextView thisButton) {
        CharSequence text = thisButton.getText();
        Context context = getContext();
        if (Intrinsics.areEqual(text, context != null ? context.getText(R.string.common_back) : null)) {
            int i = this.thisPage;
            if (i > 0) {
                int i2 = i - 1;
                this.thisPage = i2;
                setLogicForClick(this.thisType, i2);
                Log.v(SocialConstants.LOG_TAG, "thisPage = " + this.thisPage);
                return;
            }
            this.thisType = 4;
            SetViewByValueOfActions setViewByValueOfActions = this.logicSetView;
            if (setViewByValueOfActions != null) {
                setViewByValueOfActions.setStartButtons(this.playersNick, this.playersId, this.playerInOrganization);
            }
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        JNILib.toggleDrawing2dStuff(false);
        ActionWithJSON actionWithJSON = this.actionWithJson;
        if (actionWithJSON != null) {
            actionWithJSON.sendIfCloseOrChangePlayer(1);
        }
        setNullableParameters();
        super.onDestroyView();
    }

    public final void getAllParameters(JSONObject json) {
        if (json != null) {
            String strOptString = json.optString("n");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            this.playersNick = strOptString;
            this.playersId = json.optInt("id");
            this.playerInOrganization = json.optInt("w");
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("ai");
            if (jSONArrayOptJSONArray != null) {
                this.actualIdsArray.clear();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.actualIdsArray.add(Integer.valueOf(Integer.parseInt(jSONArrayOptJSONArray.get(i).toString())));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setStartParameters() {
        getActualListWithAction();
        setMultipleLists(this.actualListWithActions);
        splitList(this.thisListWithOrganizationMain);
        splitList(this.thisListWithSocialMain);
        splitList(this.thisListWithCommunicationMain);
        SetViewByValueOfActions setViewByValueOfActions = new SetViewByValueOfActions(this, (SocialInteractionBinding) getBinding());
        this.logicSetView = setViewByValueOfActions;
        this.thisType = 4;
        setViewByValueOfActions.setStartButtons(this.playersNick, this.playersId, this.playerInOrganization);
    }

    public final void getActualListWithAction() {
        Iterator<Integer> it = this.actualIdsArray.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Iterator<SocialInteraction> it2 = this.allListWithActions.iterator();
            while (true) {
                if (it2.hasNext()) {
                    SocialInteraction next = it2.next();
                    if (iIntValue == next.getId()) {
                        this.actualListWithActions.add(next);
                        break;
                    }
                }
            }
        }
    }

    private final void setNullableParameters() {
        this.logicSetView = null;
        this.actionWithJson = null;
        this.thisListWithOrganizationMain.clear();
        this.thisListWithSocialMain.clear();
        this.thisListWithCommunicationMain.clear();
        this.actualListWithActions.clear();
    }

    public GUISocialInteraction() {
        final Function0 function0 = null;
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.socialaction.GUISocialInteraction$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(fragmentActivityRequireActivity).get(JNIActivityViewModel.class);
            }
        });
    }
}

