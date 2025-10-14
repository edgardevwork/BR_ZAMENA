package com.blackhub.bronline.game.gui.woundsystem;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.WoundSystemMainLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.woundsystem.data.PlayerInfo;
import com.blackhub.bronline.game.gui.woundsystem.p018ui.PromptDialog;
import com.blackhub.bronline.game.gui.woundsystem.viewmodel.WoundSystemViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GUIWoundSystem.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUIWoundSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIWoundSystem.kt\ncom/blackhub/bronline/game/gui/woundsystem/GUIWoundSystem\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,212:1\n106#2,15:213\n*S KotlinDebug\n*F\n+ 1 GUIWoundSystem.kt\ncom/blackhub/bronline/game/gui/woundsystem/GUIWoundSystem\n*L\n41#1:213,15\n*E\n"})
/* loaded from: classes2.dex */
public final class GUIWoundSystem extends BaseISAMPGUIFragment<WoundSystemMainLayoutBinding> {
    public static final int $stable = 8;
    public boolean ifHideDialog;

    @Nullable
    public PromptDialog promptDialog;

    @Inject
    public MainViewModelFactory<WoundSystemViewModel> woundSystemFactory;

    /* renamed from: woundSystemViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy woundSystemViewModel;
    public boolean ifInformingServerAboutDismiss = true;
    public final float alphaIfNotActive = 0.5f;
    public final float alphaIfActive = 1.0f;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 40;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ WoundSystemMainLayoutBinding access$getBinding(GUIWoundSystem gUIWoundSystem) {
        return (WoundSystemMainLayoutBinding) gUIWoundSystem.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<WoundSystemViewModel> getWoundSystemFactory() {
        MainViewModelFactory<WoundSystemViewModel> mainViewModelFactory = this.woundSystemFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("woundSystemFactory");
        return null;
    }

    public final void setWoundSystemFactory(@NotNull MainViewModelFactory<WoundSystemViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.woundSystemFactory = mainViewModelFactory;
    }

    public final WoundSystemViewModel getWoundSystemViewModel() {
        return (WoundSystemViewModel) this.woundSystemViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
        Integer numValueOf = json != null ? Integer.valueOf(json.optInt("t")) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            this.ifInformingServerAboutDismiss = false;
            closeFragment();
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            setTimerForButton(30L, true);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        JNILib.toggleDrawing2dStuff(true);
        JSONObject jsonObj = getJsonObj();
        if (jsonObj != null) {
            getStartParameters(jsonObj);
        }
        this.ifInformingServerAboutDismiss = true;
        setStyleForText();
        initPromptDialog();
        initClickListeners();
        setObservers();
        if (this.ifHideDialog) {
            setTimerForButton(15L, false);
            return;
        }
        initPromptDialog();
        PromptDialog promptDialog = this.promptDialog;
        if (promptDialog != null) {
            promptDialog.show();
        }
        visibleBackground(4);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public WoundSystemMainLayoutBinding getViewBinding() {
        WoundSystemMainLayoutBinding woundSystemMainLayoutBindingInflate = WoundSystemMainLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(woundSystemMainLayoutBindingInflate, "inflate(...)");
        return woundSystemMainLayoutBindingInflate;
    }

    /* compiled from: GUIWoundSystem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$1", m7120f = "GUIWoundSystem.kt", m7121i = {}, m7122l = {92}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$1 */
    public static final class C47291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47291(Continuation<? super C47291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIWoundSystem.this.new C47291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PlayerInfo> player = GUIWoundSystem.this.getWoundSystemViewModel().getPlayer();
                final GUIWoundSystem gUIWoundSystem = GUIWoundSystem.this;
                FlowCollector<? super PlayerInfo> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PlayerInfo) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull PlayerInfo playerInfo, @NotNull Continuation<? super Unit> continuation) {
                        GUIWoundSystem.access$getBinding(gUIWoundSystem).playersNickAndId.setText(gUIWoundSystem.requireActivity().getString(R.string.common_string_with_number_values, playerInfo.getPlayersNick(), Boxing.boxInt(playerInfo.getPlayersId())));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (player.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    private final void setObservers() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C47291(null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C47302(null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new C47313(null));
    }

    /* compiled from: GUIWoundSystem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$2", m7120f = "GUIWoundSystem.kt", m7121i = {}, m7122l = {102}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$2 */
    public static final class C47302 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47302(Continuation<? super C47302> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIWoundSystem.this.new C47302(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Long> timerSec = GUIWoundSystem.this.getWoundSystemViewModel().getTimerSec();
                final GUIWoundSystem gUIWoundSystem = GUIWoundSystem.this;
                FlowCollector<? super Long> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).longValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(long j, @NotNull Continuation<? super Unit> continuation) {
                        GUIWoundSystem.access$getBinding(gUIWoundSystem).textInfoNeedHospital3.setText(gUIWoundSystem.requireActivity().getString(R.string.wound_system_info_hospital_3, Boxing.boxLong(j)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (timerSec.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: GUIWoundSystem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$3", m7120f = "GUIWoundSystem.kt", m7121i = {}, m7122l = {111}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$setObservers$3 */
    public static final class C47313 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47313(Continuation<? super C47313> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIWoundSystem.this.new C47313(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47313) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsButtonHospitalBlocked = GUIWoundSystem.this.getWoundSystemViewModel().isButtonHospitalBlocked();
                final GUIWoundSystem gUIWoundSystem = GUIWoundSystem.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem.setObservers.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            AppCompatButton appCompatButton = GUIWoundSystem.access$getBinding(gUIWoundSystem).buttonNeedHospital;
                            appCompatButton.setAlpha(gUIWoundSystem.alphaIfNotActive);
                            appCompatButton.setClickable(false);
                            GUIWoundSystem.access$getBinding(gUIWoundSystem).woundSystemHospitalTimerGroup.setVisibility(0);
                        } else {
                            AppCompatButton appCompatButton2 = GUIWoundSystem.access$getBinding(gUIWoundSystem).buttonNeedHospital;
                            appCompatButton2.setAlpha(gUIWoundSystem.alphaIfActive);
                            appCompatButton2.setClickable(true);
                            GUIWoundSystem.access$getBinding(gUIWoundSystem).woundSystemHospitalTimerGroup.setVisibility(4);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowIsButtonHospitalBlocked.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    private final void getStartParameters(JSONObject json) {
        getWoundSystemViewModel().initData(json);
        this.ifHideDialog = json.optInt("h") == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setStyleForText() {
        TextView textView = ((WoundSystemMainLayoutBinding) getBinding()).titleDamage;
        Useful useful = Useful.INSTANCE;
        String string = requireContext().getString(R.string.wound_system_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView.setText(useful.getTextWithHtmlStyles(string));
    }

    public final void initPromptDialog() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.promptDialog = new PromptDialog(fragmentActivityRequireActivity);
        initPromptDialogClickListeners();
    }

    public final void initPromptDialogClickListeners() {
        PromptDialog promptDialog = this.promptDialog;
        if (promptDialog == null) {
            return;
        }
        promptDialog.setDialogResultListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem.initPromptDialogClickListeners.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) throws JSONException {
                if (i != 3) {
                    if (i == 9 && GUIWoundSystem.this.ifInformingServerAboutDismiss) {
                        GUIWoundSystem.this.visibleBackground(0);
                        GUIWoundSystem.this.setTimerForButton(15L, false);
                        return;
                    }
                    return;
                }
                GUIWoundSystem.this.getWoundSystemViewModel().pressButton(3);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTimerForButton(long seconds, boolean blockBothButtons) {
        if (blockBothButtons) {
            AppCompatButton appCompatButton = ((WoundSystemMainLayoutBinding) getBinding()).buttonNeedHelp;
            appCompatButton.setAlpha(this.alphaIfNotActive);
            appCompatButton.setClickable(false);
        }
        getWoundSystemViewModel().startTimer(seconds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void visibleBackground(int visible) {
        ((WoundSystemMainLayoutBinding) getBinding()).woundSystemMainGroup.setVisibility(visible);
        ((WoundSystemMainLayoutBinding) getBinding()).woundSystemHospitalTimerGroup.setVisibility(visible);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickListeners() {
        AppCompatButton buttonNeedHelp = ((WoundSystemMainLayoutBinding) getBinding()).buttonNeedHelp;
        Intrinsics.checkNotNullExpressionValue(buttonNeedHelp, "buttonNeedHelp");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonNeedHelp, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem.initClickListeners.1
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
                GUIWoundSystem.this.getWoundSystemViewModel().pressButton(1);
                GUIWoundSystem.this.setTimerForButton(30L, true);
            }
        }, 1, null);
        AppCompatButton buttonNeedHospital = ((WoundSystemMainLayoutBinding) getBinding()).buttonNeedHospital;
        Intrinsics.checkNotNullExpressionValue(buttonNeedHospital, "buttonNeedHospital");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonNeedHospital, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem.initClickListeners.2
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
                AppCompatButton appCompatButton = GUIWoundSystem.access$getBinding(GUIWoundSystem.this).buttonNeedHospital;
                appCompatButton.setAlpha(GUIWoundSystem.this.alphaIfNotActive);
                appCompatButton.setClickable(false);
                GUIWoundSystem.this.getWoundSystemViewModel().pressButton(2);
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        if (this.ifInformingServerAboutDismiss) {
            getWoundSystemViewModel().pressButton(4);
        }
        JNILib.toggleDrawing2dStuff(false);
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        PromptDialog promptDialog = this.promptDialog;
        if (promptDialog != null) {
            promptDialog.dismiss();
        }
        this.promptDialog = null;
    }

    public GUIWoundSystem() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$woundSystemViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return this.this$0;
            }
        };
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$woundSystemViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getWoundSystemFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function03 = null;
        this.woundSystemViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WoundSystemViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function02);
    }
}

