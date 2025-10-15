package com.blackhub.bronline.game.gui.tutorialhints;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.constants.NativeConstants;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TutorialViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialHintActionWithJSON;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialHintActionWithJSON;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getPreferencesRepository", "()Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getHudVersion", "", "initJson", "", "json", "Lorg/json/JSONObject;", "onClickTask", "sendCloseScreen", "setInterfaceVisible", "isVisible", "", "setNewVersionVisible", "updateJson", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,260:1\n230#2,5:261\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel\n*L\n241#1:261,5\n*E\n"})
/* loaded from: classes.dex */
public final class TutorialViewModel extends BaseViewModel<TutorialUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TutorialUiState> _uiState;

    @NotNull
    public final TutorialHintActionWithJSON actionWithJSON;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<TutorialUiState> uiState;

    @NotNull
    public final PreferencesRepository getPreferencesRepository() {
        return this.preferencesRepository;
    }

    @Inject
    public TutorialViewModel(@NotNull TutorialHintActionWithJSON actionWithJSON, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.actionWithJSON = actionWithJSON;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new TutorialUiState(0, null, null, null, null, null, false, false, false, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<TutorialUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TutorialUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: TutorialViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$initJson$1", m7120f = "TutorialViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,260:1\n230#2,5:261\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$initJson$1\n*L\n115#1:261,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$initJson$1 */
    /* loaded from: classes2.dex */
    public static final class C46871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46871(JSONObject jSONObject, Continuation<? super C46871> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C46871 c46871 = TutorialViewModel.this.new C46871(this.$json, continuation);
            c46871.L$0 = obj;
            return c46871;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TutorialEnum tutorialEnum;
            List listEmptyList;
            List listEmptyList2;
            List listEmptyList3;
            List listEmptyList4;
            TutorialUiState value;
            TutorialUiState tutorialUiState;
            List<String> mutableStringList;
            List<Integer> mutableIntList;
            List<Integer> mutableIntList2;
            List<String> mutableStringList2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            int integer$default = PreferencesRepository.getInteger$default(TutorialViewModel.this.getPreferencesRepository(), NewMenuConstants.HUD_VERSION, 0, 2, null);
            int iOptInt = this.$json.optInt("t");
            int iOptInt2 = this.$json.optInt("m");
            String strOptString = this.$json.optString("h", AnyExtensionKt.empty(coroutineScope));
            String strOptString2 = this.$json.optString("s", AnyExtensionKt.empty(coroutineScope));
            String strOptString3 = this.$json.optString(TutorialKeys.TUTORIAL_MAIN_TASK_NAME_KEY, AnyExtensionKt.empty(coroutineScope));
            int iOptInt3 = this.$json.optInt("mt");
            int iOptInt4 = this.$json.optInt("ma");
            String strOptString4 = this.$json.optString(TutorialKeys.TUTORIAL_MAIN_TASK_COLOR_KEY, Other.COLOR_DEFAULT_STRING);
            JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_TITLE_LIST_KEY);
            JSONArray jSONArrayOptJSONArray2 = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY);
            JSONArray jSONArrayOptJSONArray3 = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_MAX_LIST_KEY);
            JSONArray jSONArrayOptJSONArray4 = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_COLOR_LIST_KEY);
            if (iOptInt == 4) {
                tutorialEnum = TutorialEnum.TASKS;
            } else {
                tutorialEnum = TutorialEnum.GUIDE;
            }
            if (jSONArrayOptJSONArray == null || (mutableStringList2 = JsonArrayExtensionKt.toMutableStringList(jSONArrayOptJSONArray)) == null || (listEmptyList = Util.toImmutableList(mutableStringList2)) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            final List list = listEmptyList;
            if (jSONArrayOptJSONArray2 == null || (mutableIntList2 = JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray2)) == null || (listEmptyList2 = Util.toImmutableList(mutableIntList2)) == null) {
                listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            final List list2 = listEmptyList2;
            if (jSONArrayOptJSONArray3 == null || (mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray3)) == null || (listEmptyList3 = Util.toImmutableList(mutableIntList)) == null) {
                listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
            }
            final List list3 = listEmptyList3;
            if (jSONArrayOptJSONArray4 == null || (mutableStringList = JsonArrayExtensionKt.toMutableStringList(jSONArrayOptJSONArray4)) == null || (listEmptyList4 = Util.toImmutableList(mutableStringList)) == null) {
                listEmptyList4 = CollectionsKt__CollectionsKt.emptyList();
            }
            final List list4 = listEmptyList4;
            final ArrayList arrayList = new ArrayList();
            BooleanExtensionKt.ifTrue(Boxing.boxBoolean((list.isEmpty() ^ true) && (list2.isEmpty() ^ true) && (list3.isEmpty() ^ true)), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel.initJson.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(new HintQuestData(StringExtensionKt.htmlStringToSpanned(list.get(i)), list2.get(i).intValue(), list3.get(i).intValue(), StringExtensionKt.m14414tryToColorInt0Yiz4hI$default(list4.get(i), null, 1, null), false, null));
                    }
                }
            });
            Intrinsics.checkNotNull(strOptString4);
            long jM14414tryToColorInt0Yiz4hI$default = StringExtensionKt.m14414tryToColorInt0Yiz4hI$default(strOptString4, null, 1, null);
            boolean z = integer$default == 1;
            MutableStateFlow<TutorialUiState> mutableStateFlow = TutorialViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                tutorialUiState = value;
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                Intrinsics.checkNotNull(strOptString3);
            } while (!mutableStateFlow.compareAndSet(value, tutorialUiState.copy((896 & 1) != 0 ? tutorialUiState.avatarNumber : iOptInt2, (896 & 2) != 0 ? tutorialUiState.hintScreenType : tutorialEnum, (896 & 4) != 0 ? tutorialUiState.hintTitle : strOptString, (896 & 8) != 0 ? tutorialUiState.hintDesc : strOptString2, (896 & 16) != 0 ? tutorialUiState.mainTask : new HintQuestData(StringExtensionKt.htmlStringToSpanned(strOptString3), iOptInt3, iOptInt4, jM14414tryToColorInt0Yiz4hI$default, false, 16, null), (896 & 32) != 0 ? tutorialUiState.additionalTasksList : arrayList, (896 & 64) != 0 ? tutorialUiState.isNewVersionVisible : z, (896 & 128) != 0 ? tutorialUiState.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C46871(json, null), 1, null);
    }

    /* compiled from: TutorialViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$updateJson$1", m7120f = "TutorialViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n230#2,5:261\n230#2,5:266\n230#2,5:271\n230#2,5:279\n230#2,5:284\n230#2,5:289\n1864#3,3:276\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$updateJson$1\n*L\n147#1:261,5\n155#1:266,5\n166#1:271,5\n192#1:279,5\n205#1:284,5\n215#1:289,5\n183#1:276,3\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$updateJson$1 */
    /* loaded from: classes2.dex */
    public static final class C46911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ TutorialViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46911(JSONObject jSONObject, TutorialViewModel tutorialViewModel, Continuation<? super C46911> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = tutorialViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46911(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TutorialEnum tutorialEnum;
            TutorialUiState value;
            TutorialUiState tutorialUiState;
            List listEmptyList;
            TutorialUiState value2;
            TutorialUiState tutorialUiState2;
            List<Integer> mutableIntList;
            TutorialUiState value3;
            TutorialUiState tutorialUiState3;
            TutorialUiState value4;
            TutorialUiState tutorialUiState4;
            TutorialUiState value5;
            TutorialUiState tutorialUiState5;
            TutorialUiState value6;
            TutorialUiState tutorialUiState6;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
            int iOptInt2 = this.$json.optInt("t", -1);
            int iOptInt3 = this.$json.optInt("m");
            if (iOptInt2 == 1 || iOptInt2 == 2) {
                tutorialEnum = TutorialEnum.TASKS;
            } else if (iOptInt2 == 4) {
                tutorialEnum = TutorialEnum.NONE;
            } else {
                tutorialEnum = TutorialEnum.GUIDE;
            }
            TutorialEnum tutorialEnum2 = tutorialEnum;
            if (IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt))) {
                int iOptInt4 = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
                if (iOptInt4 == 1) {
                    MutableStateFlow<TutorialUiState> mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value5 = mutableStateFlow.getValue();
                        tutorialUiState5 = value5;
                    } while (!mutableStateFlow.compareAndSet(value5, tutorialUiState5.copy((896 & 1) != 0 ? tutorialUiState5.avatarNumber : 0, (896 & 2) != 0 ? tutorialUiState5.hintScreenType : null, (896 & 4) != 0 ? tutorialUiState5.hintTitle : null, (896 & 8) != 0 ? tutorialUiState5.hintDesc : null, (896 & 16) != 0 ? tutorialUiState5.mainTask : null, (896 & 32) != 0 ? tutorialUiState5.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState5.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState5.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState5.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState5.isBlockingLoading : false)));
                } else if (iOptInt4 == 9) {
                    MutableStateFlow<TutorialUiState> mutableStateFlow2 = this.this$0.get_uiState();
                    do {
                        value6 = mutableStateFlow2.getValue();
                        tutorialUiState6 = value6;
                    } while (!mutableStateFlow2.compareAndSet(value6, tutorialUiState6.copy((896 & 1) != 0 ? tutorialUiState6.avatarNumber : 0, (896 & 2) != 0 ? tutorialUiState6.hintScreenType : null, (896 & 4) != 0 ? tutorialUiState6.hintTitle : null, (896 & 8) != 0 ? tutorialUiState6.hintDesc : null, (896 & 16) != 0 ? tutorialUiState6.mainTask : null, (896 & 32) != 0 ? tutorialUiState6.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState6.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState6.isInterfaceVisible : true, (896 & 256) != 0 ? tutorialUiState6.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState6.isBlockingLoading : false)));
                }
            } else if (IntExtensionKt.isNotNegativeCommand(Boxing.boxInt(iOptInt2))) {
                if (iOptInt2 == 0) {
                    String strOptString = this.$json.optString("s");
                    MutableStateFlow<TutorialUiState> mutableStateFlow3 = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow3.getValue();
                        tutorialUiState = value;
                        Intrinsics.checkNotNull(strOptString);
                    } while (!mutableStateFlow3.compareAndSet(value, tutorialUiState.copy((896 & 1) != 0 ? tutorialUiState.avatarNumber : iOptInt3, (896 & 2) != 0 ? tutorialUiState.hintScreenType : tutorialEnum2, (896 & 4) != 0 ? tutorialUiState.hintTitle : null, (896 & 8) != 0 ? tutorialUiState.hintDesc : strOptString, (896 & 16) != 0 ? tutorialUiState.mainTask : null, (896 & 32) != 0 ? tutorialUiState.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState.isBlockingLoading : false)));
                } else if (iOptInt2 == 1) {
                    JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray(TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY);
                    if (jSONArrayOptJSONArray == null || (mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray)) == null || (listEmptyList = Util.toImmutableList(mutableIntList)) == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    if ((!listEmptyList.isEmpty()) && (!this.this$0.get_uiState().getValue().getAdditionalTasksList().isEmpty())) {
                        TutorialViewModel tutorialViewModel = this.this$0;
                        int i = 0;
                        for (Object obj2 : listEmptyList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            arrayList.add(HintQuestData.m14759copy42QJj7c$default(tutorialViewModel.get_uiState().getValue().getAdditionalTasksList().get(i), null, ((Number) obj2).intValue(), 0, 0L, false, 29, null));
                            i = i2;
                        }
                    }
                    MutableStateFlow<TutorialUiState> mutableStateFlow4 = this.this$0.get_uiState();
                    do {
                        value2 = mutableStateFlow4.getValue();
                        tutorialUiState2 = value2;
                    } while (!mutableStateFlow4.compareAndSet(value2, tutorialUiState2.copy((896 & 1) != 0 ? tutorialUiState2.avatarNumber : iOptInt3, (896 & 2) != 0 ? tutorialUiState2.hintScreenType : tutorialEnum2, (896 & 4) != 0 ? tutorialUiState2.hintTitle : null, (896 & 8) != 0 ? tutorialUiState2.hintDesc : null, (896 & 16) != 0 ? tutorialUiState2.mainTask : null, (896 & 32) != 0 ? tutorialUiState2.additionalTasksList : arrayList, (896 & 64) != 0 ? tutorialUiState2.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState2.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState2.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState2.isBlockingLoading : false)));
                } else if (iOptInt2 == 2) {
                    HintQuestData hintQuestDataM14759copy42QJj7c$default = HintQuestData.m14759copy42QJj7c$default(this.this$0.get_uiState().getValue().getMainTask(), null, this.$json.optInt("mt"), 0, 0L, false, 29, null);
                    MutableStateFlow<TutorialUiState> mutableStateFlow5 = this.this$0.get_uiState();
                    do {
                        value3 = mutableStateFlow5.getValue();
                        tutorialUiState3 = value3;
                    } while (!mutableStateFlow5.compareAndSet(value3, tutorialUiState3.copy((896 & 1) != 0 ? tutorialUiState3.avatarNumber : iOptInt3, (896 & 2) != 0 ? tutorialUiState3.hintScreenType : tutorialEnum2, (896 & 4) != 0 ? tutorialUiState3.hintTitle : null, (896 & 8) != 0 ? tutorialUiState3.hintDesc : null, (896 & 16) != 0 ? tutorialUiState3.mainTask : hintQuestDataM14759copy42QJj7c$default, (896 & 32) != 0 ? tutorialUiState3.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState3.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState3.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState3.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState3.isBlockingLoading : false)));
                } else if (iOptInt2 == 4) {
                    MutableStateFlow<TutorialUiState> mutableStateFlow6 = this.this$0.get_uiState();
                    do {
                        value4 = mutableStateFlow6.getValue();
                        tutorialUiState4 = value4;
                    } while (!mutableStateFlow6.compareAndSet(value4, tutorialUiState4.copy((896 & 1) != 0 ? tutorialUiState4.avatarNumber : 0, (896 & 2) != 0 ? tutorialUiState4.hintScreenType : null, (896 & 4) != 0 ? tutorialUiState4.hintTitle : null, (896 & 8) != 0 ? tutorialUiState4.hintDesc : null, (896 & 16) != 0 ? tutorialUiState4.mainTask : null, (896 & 32) != 0 ? tutorialUiState4.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState4.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState4.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState4.isNeedClose : true, (896 & 512) != 0 ? tutorialUiState4.isBlockingLoading : false)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C46911(json, this, null), 1, null);
    }

    /* compiled from: TutorialViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$onClickTask$1", m7120f = "TutorialViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$onClickTask$1 */
    /* loaded from: classes2.dex */
    public static final class C46881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46881(Continuation<? super C46881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TutorialViewModel.this.new C46881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TutorialViewModel.this.actionWithJSON.onClickTask();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickTask() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C46881(null), 1, null);
    }

    /* compiled from: TutorialViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$setNewVersionVisible$1", m7120f = "TutorialViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$setNewVersionVisible$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,260:1\n230#2,5:261\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$setNewVersionVisible$1\n*L\n234#1:261,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$setNewVersionVisible$1 */
    /* loaded from: classes2.dex */
    public static final class C46901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isVisible;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46901(boolean z, Continuation<? super C46901> continuation) {
            super(2, continuation);
            this.$isVisible = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TutorialViewModel.this.new C46901(this.$isVisible, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TutorialUiState value;
            TutorialUiState tutorialUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<TutorialUiState> mutableStateFlow = TutorialViewModel.this.get_uiState();
            boolean z = this.$isVisible;
            do {
                value = mutableStateFlow.getValue();
                tutorialUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, tutorialUiState.copy((896 & 1) != 0 ? tutorialUiState.avatarNumber : 0, (896 & 2) != 0 ? tutorialUiState.hintScreenType : null, (896 & 4) != 0 ? tutorialUiState.hintTitle : null, (896 & 8) != 0 ? tutorialUiState.hintDesc : null, (896 & 16) != 0 ? tutorialUiState.mainTask : null, (896 & 32) != 0 ? tutorialUiState.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState.isNewVersionVisible : z, (896 & 128) != 0 ? tutorialUiState.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void setNewVersionVisible(boolean isVisible) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C46901(isVisible, null), 1, null);
    }

    public final void setInterfaceVisible(boolean isVisible) {
        TutorialUiState value;
        TutorialUiState tutorialUiState;
        MutableStateFlow<TutorialUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            tutorialUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, tutorialUiState.copy((896 & 1) != 0 ? tutorialUiState.avatarNumber : 0, (896 & 2) != 0 ? tutorialUiState.hintScreenType : null, (896 & 4) != 0 ? tutorialUiState.hintTitle : null, (896 & 8) != 0 ? tutorialUiState.hintDesc : null, (896 & 16) != 0 ? tutorialUiState.mainTask : null, (896 & 32) != 0 ? tutorialUiState.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState.isInterfaceVisible : isVisible, (896 & 256) != 0 ? tutorialUiState.isNeedClose : false, (896 & 512) != 0 ? tutorialUiState.isBlockingLoading : false)));
    }

    /* compiled from: TutorialViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$sendCloseScreen$1", m7120f = "TutorialViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTutorialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,260:1\n230#2,5:261\n*S KotlinDebug\n*F\n+ 1 TutorialViewModel.kt\ncom/blackhub/bronline/game/gui/tutorialhints/TutorialViewModel$sendCloseScreen$1\n*L\n251#1:261,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel$sendCloseScreen$1 */
    /* loaded from: classes2.dex */
    public static final class C46891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46891(Continuation<? super C46891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TutorialViewModel.this.new C46891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TutorialUiState value;
            TutorialUiState tutorialUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TutorialViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<TutorialUiState> mutableStateFlow = TutorialViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    tutorialUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, tutorialUiState.copy((896 & 1) != 0 ? tutorialUiState.avatarNumber : 0, (896 & 2) != 0 ? tutorialUiState.hintScreenType : null, (896 & 4) != 0 ? tutorialUiState.hintTitle : null, (896 & 8) != 0 ? tutorialUiState.hintDesc : null, (896 & 16) != 0 ? tutorialUiState.mainTask : null, (896 & 32) != 0 ? tutorialUiState.additionalTasksList : null, (896 & 64) != 0 ? tutorialUiState.isNewVersionVisible : false, (896 & 128) != 0 ? tutorialUiState.isInterfaceVisible : false, (896 & 256) != 0 ? tutorialUiState.isNeedClose : true, (896 & 512) != 0 ? tutorialUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C46891(null), 1, null);
    }

    public final int getHudVersion() {
        return PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.HUD_VERSION, 0, 2, null);
    }
}
