package com.blackhub.bronline.game.gui.menu.viewModel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.menu.MenuUiState;
import com.blackhub.bronline.game.gui.menu.model.ButtonsConfigResponse;
import com.blackhub.bronline.game.gui.menu.model.MenuListModel;
import com.blackhub.bronline.game.gui.menu.network.MenuActionsWithJson;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsProperties;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.launcher.Settings;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MenuViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,266:1\n230#2,5:267\n230#2,5:272\n230#2,5:277\n230#2,5:282\n230#2,5:287\n230#2,5:292\n*S KotlinDebug\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel\n*L\n105#1:267,5\n111#1:272,5\n117#1:277,5\n126#1:282,5\n132#1:287,5\n169#1:292,5\n*E\n"})
/* loaded from: classes.dex */
public final class MenuViewModel extends BaseViewModel<MenuUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MenuUiState> _uiState;

    @NotNull
    public final MenuActionsWithJson menuActionsWithJson;

    @Inject
    public MenuViewModel(@NotNull MenuActionsWithJson menuActionsWithJson) {
        Intrinsics.checkNotNullParameter(menuActionsWithJson, "menuActionsWithJson");
        this.menuActionsWithJson = menuActionsWithJson;
        this._uiState = StateFlowKt.MutableStateFlow(new MenuUiState(false, false, false, false, null, null, false, 127, null));
        JNILib.toggleDrawing2dStuff(true);
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43071(null), 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<MenuUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MenuUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    /* compiled from: MenuViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$1", m7120f = "MenuViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$1 */
    public static final class C43071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43071(Continuation<? super C43071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuViewModel.this.new C43071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MenuViewModel.this.menuActionsWithJson.dialogOpened();
                MenuViewModel.this.get_uiState().getValue().setListOfMainItems(MenuViewModel.this.initMainSetItems());
                MenuViewModel.this.get_uiState().getValue().setSetOfCommunicationItems(MenuViewModel.this.initCommunicationSetItems());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MenuViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$initJson$1", m7120f = "MenuViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,266:1\n230#2,5:267\n*S KotlinDebug\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$initJson$1\n*L\n95#1:267,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$initJson$1 */
    public static final class C43091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ButtonsConfigResponse $buttonsConfig;
        public final /* synthetic */ HolidayEventsResponse $holidayEventsJson;
        public final /* synthetic */ JSONObject $json;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43091(JSONObject jSONObject, ButtonsConfigResponse buttonsConfigResponse, HolidayEventsResponse holidayEventsResponse, Continuation<? super C43091> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$buttonsConfig = buttonsConfigResponse;
            this.$holidayEventsJson = holidayEventsResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuViewModel.this.new C43091(this.$json, this.$buttonsConfig, this.$holidayEventsJson, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MenuUiState value;
            Boolean IS_DEBUG_ENABLED;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final List<MenuListModel> listOfMainItems = MenuViewModel.this.get_uiState().getValue().getListOfMainItems();
            if (this.$json.optBoolean("f")) {
                listOfMainItems.add(new MenuListModel(10, R.drawable.ic_menu_family, R.string.menu_action_family));
            }
            if (BooleanExtensionKt.getOrFalse(this.$buttonsConfig.isShowSimButton())) {
                listOfMainItems.add(new MenuListModel(11, R.drawable.ic_menu_sim, R.string.menu_action_sim));
            }
            if (BooleanExtensionKt.getOrFalse(this.$buttonsConfig.isShowTanpinButton())) {
                listOfMainItems.add(new MenuListModel(15, R.drawable.ic_token, R.string.menu_action_tokens));
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            HolidayEventsProperties holidayEventsProperties = (HolidayEventsProperties) CollectionsKt___CollectionsKt.firstOrNull((List) this.$holidayEventsJson.getProperties());
            List<Integer> dates = holidayEventsProperties != null ? holidayEventsProperties.getDates() : null;
            if (dates == null) {
                dates = CollectionsKt__CollectionsKt.emptyList();
            }
            int orZero = IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.firstOrNull((List) dates));
            boolean z = false;
            if (iCurrentTimeMillis <= IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.lastOrNull((List) dates)) && orZero <= iCurrentTimeMillis) {
                z = true;
            }
            BooleanExtensionKt.ifTrue(Boxing.boxBoolean(z), new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel.initJson.1.1
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
                    listOfMainItems.add(new MenuListModel(17, R.drawable.ic_event_menu, R.string.menu_action_holiday_event));
                }
            });
            MutableStateFlow<MenuUiState> mutableStateFlow = MenuViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                IS_DEBUG_ENABLED = Settings.IS_DEBUG_ENABLED;
                Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
            } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, false, false, listOfMainItems, null, IS_DEBUG_ENABLED.booleanValue(), 47, null)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json, @NotNull ButtonsConfigResponse buttonsConfig, @NotNull HolidayEventsResponse holidayEventsJson) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(buttonsConfig, "buttonsConfig");
        Intrinsics.checkNotNullParameter(holidayEventsJson, "holidayEventsJson");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43091(json, buttonsConfig, holidayEventsJson, null), 1, null);
    }

    public final void buttonCloseClicked() {
        MenuUiState value;
        MutableStateFlow<MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, true, false, false, false, null, null, false, 126, null)));
    }

    public final void onHeightCalculated() {
        MenuUiState value;
        MutableStateFlow<MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, true, false, null, null, false, 123, null)));
    }

    public final void blockButtons() {
        MenuUiState value;
        MutableStateFlow<MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, false, false, null, null, false, 119, null)));
    }

    /* compiled from: MenuViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$itemClicked$3", m7120f = "MenuViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$itemClicked$3\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,266:1\n230#2,5:267\n*S KotlinDebug\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$itemClicked$3\n*L\n141#1:267,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$itemClicked$3 */
    public static final class C43103 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43103(Continuation<? super C43103> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuViewModel.this.new C43103(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43103) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MenuUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MenuViewModel.this.menuActionsWithJson.openSettings();
                MutableStateFlow<MenuUiState> mutableStateFlow = MenuViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, true, false, false, false, null, null, false, 126, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MenuViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$itemClicked$4", m7120f = "MenuViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$itemClicked$4\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,266:1\n230#2,5:267\n*S KotlinDebug\n*F\n+ 1 MenuViewModel.kt\ncom/blackhub/bronline/game/gui/menu/viewModel/MenuViewModel$itemClicked$4\n*L\n151#1:267,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$itemClicked$4 */
    public static final class C43114 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $index;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43114(int i, Continuation<? super C43114> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuViewModel.this.new C43114(this.$index, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43114) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MenuUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MenuViewModel.this.menuActionsWithJson.putJSONObject(this.$index);
                MutableStateFlow<MenuUiState> mutableStateFlow = MenuViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, true, false, false, false, null, null, false, 126, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void itemClicked(int index) {
        MenuUiState value;
        MenuUiState value2;
        if (index == 3) {
            MutableStateFlow<MenuUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, true, false, true, null, null, false, 117, null)));
        } else if (index == 20) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C43103(null), 1, null);
        } else {
            if (index == 35) {
                MutableStateFlow<MenuUiState> mutableStateFlow2 = get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, MenuUiState.copy$default(value2, false, false, false, true, null, null, false, 117, null)));
                return;
            }
            ViewModelExtensionKt.launchOnIO$default(this, null, new C43114(index, null), 1, null);
        }
    }

    /* compiled from: MenuViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$dialogClosed$1", m7120f = "MenuViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel$dialogClosed$1 */
    public static final class C43081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43081(Continuation<? super C43081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuViewModel.this.new C43081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MenuViewModel.this.menuActionsWithJson.dialogClosed();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void dialogClosed() {
        JNILib.toggleDrawing2dStuff(false);
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43081(null), 1, null);
    }

    public final void onNativeButtonClick() {
        MenuUiState value;
        Boolean IS_DEBUG_ENABLED;
        Boolean IS_DEBUG_ENABLED2 = Boolean.valueOf(!Settings.IS_DEBUG_ENABLED.booleanValue());
        Settings.IS_DEBUG_ENABLED = IS_DEBUG_ENABLED2;
        Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED2, "IS_DEBUG_ENABLED");
        JNILib.setDebugMenuVisible(IS_DEBUG_ENABLED2.booleanValue());
        MutableStateFlow<MenuUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            IS_DEBUG_ENABLED = Settings.IS_DEBUG_ENABLED;
            Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
        } while (!mutableStateFlow.compareAndSet(value, MenuUiState.copy$default(value, false, false, false, false, null, null, IS_DEBUG_ENABLED.booleanValue(), 63, null)));
    }

    public final List<MenuListModel> initMainSetItems() {
        return CollectionsKt__CollectionsKt.mutableListOf(new MenuListModel(0, R.drawable.ic_menu_compass, R.string.menu_action_navigator), new MenuListModel(1, R.drawable.ic_menu_taxi, R.string.menu_action_taxi_call), new MenuListModel(2, R.drawable.ic_menu_menu_red, R.string.menu_action_menu), new MenuListModel(3, R.drawable.ic_menu_chat, R.string.menu_action_communication), new MenuListModel(4, R.drawable.ic_menu_bag, R.string.common_inventory), new MenuListModel(5, R.drawable.ic_menu_anim, R.string.menu_action_animations), new MenuListModel(6, R.drawable.ic_menu_ruble, R.string.common_donate), new MenuListModel(7, R.drawable.ic_menu_car, R.string.menu_action_cars), new MenuListModel(8, R.drawable.ic_menu_gift_box, R.string.menu_action_promo), new MenuListModel(9, R.drawable.ic_menu_help_desk, R.string.menu_action_complaint), new MenuListModel(12, R.drawable.ic_menu_calendar, R.string.menu_action_calendar), new MenuListModel(14, R.drawable.ic_menu_bp_rewards, R.string.menu_action_bp_rewards), new MenuListModel(16, R.drawable.ic_marketplace, R.string.marketplace_title), new MenuListModel(20, R.drawable.ic_settings, R.string.common_settings));
    }

    public final Set<MenuListModel> initCommunicationSetItems() {
        return SetsKt__SetsKt.setOf((Object[]) new MenuListModel[]{new MenuListModel(30, R.drawable.ic_menu_passport, R.string.menu_action_give_passport), new MenuListModel(31, R.drawable.ic_menu_med, R.string.menu_action_give_med_card), new MenuListModel(32, R.drawable.ic_menu_paper, R.string.menu_action_give_licenses), new MenuListModel(33, R.drawable.ic_menu_lic, R.string.menu_action_give_pts), new MenuListModel(34, R.drawable.ic_menu_exchange, R.string.menu_action_make_exchange), new MenuListModel(35, R.drawable.ic_menu_back, R.string.common_back)});
    }
}

