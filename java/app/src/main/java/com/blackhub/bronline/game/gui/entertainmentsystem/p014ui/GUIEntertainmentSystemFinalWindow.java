package com.blackhub.bronline.game.gui.entertainmentsystem.p014ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.EntertainmentSystemFinalWindowBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.FinalWindowViewModel;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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

/* compiled from: GUIEntertainmentSystemFinalWindow.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGUIEntertainmentSystemFinalWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIEntertainmentSystemFinalWindow.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/GUIEntertainmentSystemFinalWindow\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,87:1\n106#2,15:88\n*S KotlinDebug\n*F\n+ 1 GUIEntertainmentSystemFinalWindow.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/GUIEntertainmentSystemFinalWindow\n*L\n27#1:88,15\n*E\n"})
/* loaded from: classes2.dex */
public final class GUIEntertainmentSystemFinalWindow extends BaseISAMPGUIFragment<EntertainmentSystemFinalWindowBinding> {
    public static final int $stable = 8;

    @Inject
    public MainViewModelFactory<FinalWindowViewModel> finalWindowFactory;

    /* renamed from: finalWindowViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy finalWindowViewModel;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 43;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    @NotNull
    public final MainViewModelFactory<FinalWindowViewModel> getFinalWindowFactory() {
        MainViewModelFactory<FinalWindowViewModel> mainViewModelFactory = this.finalWindowFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("finalWindowFactory");
        return null;
    }

    public final void setFinalWindowFactory(@NotNull MainViewModelFactory<FinalWindowViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.finalWindowFactory = mainViewModelFactory;
    }

    public final FinalWindowViewModel getFinalWindowViewModel() {
        return (FinalWindowViewModel) this.finalWindowViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() {
        getFinalWindowViewModel().updateResult(getJsonObj());
        setObservers();
        initClickListener();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public EntertainmentSystemFinalWindowBinding getViewBinding() {
        EntertainmentSystemFinalWindowBinding entertainmentSystemFinalWindowBindingInflate = EntertainmentSystemFinalWindowBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(entertainmentSystemFinalWindowBindingInflate, "inflate(...)");
        return entertainmentSystemFinalWindowBindingInflate;
    }

    /* compiled from: GUIEntertainmentSystemFinalWindow.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$setObservers$1", m7120f = "GUIEntertainmentSystemFinalWindow.kt", m7121i = {}, m7122l = {44}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$setObservers$1 */
    /* loaded from: classes3.dex */
    public static final class C40011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40011(Continuation<? super C40011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIEntertainmentSystemFinalWindow.this.new C40011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsWinner = GUIEntertainmentSystemFinalWindow.this.getFinalWindowViewModel().isWinner();
                final GUIEntertainmentSystemFinalWindow gUIEntertainmentSystemFinalWindow = GUIEntertainmentSystemFinalWindow.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            GUIEntertainmentSystemFinalWindow gUIEntertainmentSystemFinalWindow2 = gUIEntertainmentSystemFinalWindow;
                            String string = gUIEntertainmentSystemFinalWindow2.requireActivity().getString(R.string.final_window_if_winner);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            gUIEntertainmentSystemFinalWindow2.setTextStyle(string);
                        } else if (!z) {
                            GUIEntertainmentSystemFinalWindow gUIEntertainmentSystemFinalWindow3 = gUIEntertainmentSystemFinalWindow;
                            String string2 = gUIEntertainmentSystemFinalWindow3.requireActivity().getString(R.string.final_window_if_lose);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            gUIEntertainmentSystemFinalWindow3.setTextStyle(string2);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowIsWinner.collect(flowCollector, this) == coroutine_suspended) {
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
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C40011(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextStyle(String thisText) {
        String string = requireContext().getString(R.string.common_you);
        SpannableString spannableString = new SpannableString(thisText);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireActivity(), R.color.red)), 0, thisText.length(), 33);
        Unit unit = Unit.INSTANCE;
        ((EntertainmentSystemFinalWindowBinding) getBinding()).gamesStatus.setText(TextUtils.concat(string, spannableString));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initClickListener() {
        AppCompatImageButton closeFinalWindow = ((EntertainmentSystemFinalWindowBinding) getBinding()).closeFinalWindow;
        Intrinsics.checkNotNullExpressionValue(closeFinalWindow, "closeFinalWindow");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, closeFinalWindow, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow.initClickListener.1
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
                GUIEntertainmentSystemFinalWindow.this.closeFragment();
            }
        }, 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        getFinalWindowViewModel().sendPressButton(3);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        App.INSTANCE.appComponent().inject(this);
    }

    public GUIEntertainmentSystemFinalWindow() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$finalWindowViewModel$2
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
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$finalWindowViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getFinalWindowFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$special$$inlined$viewModels$default$1
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
        this.finalWindowViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FinalWindowViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow$special$$inlined$viewModels$default$3
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

