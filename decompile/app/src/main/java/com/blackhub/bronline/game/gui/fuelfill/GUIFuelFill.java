package com.blackhub.bronline.game.gui.fuelfill;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.SeekBar;
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
import com.blackhub.bronline.databinding.FuelFillLayoutBinding;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.common.CountAnimationTextView;
import com.blackhub.bronline.game.common.TimeChecker;
import com.blackhub.bronline.game.gui.fuelfill.adapter.FuelFillAdapter;
import com.blackhub.bronline.game.gui.fuelfill.data.TypeAndPriceOfFuel;
import com.blackhub.bronline.game.gui.fuelfill.viewmodel.FuelFillViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* compiled from: GUIFuelFill.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020\u001dH\u0002J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0013H\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fuelfill/GUIFuelFill;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/FuelFillLayoutBinding;", "()V", "fuelFillAdapter", "Lcom/blackhub/bronline/game/gui/fuelfill/adapter/FuelFillAdapter;", "fuelFillFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "Lcom/blackhub/bronline/game/gui/fuelfill/viewmodel/FuelFillViewModel;", "getFuelFillFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setFuelFillFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "fuelFillViewModel", "getFuelFillViewModel", "()Lcom/blackhub/bronline/game/gui/fuelfill/viewmodel/FuelFillViewModel;", "fuelFillViewModel$delegate", "Lkotlin/Lazy;", "fuelPrice", "", "ifClickedExit", "", "initCounter", "oldPrice", "timeChecker", "Lcom/blackhub/bronline/game/common/TimeChecker;", "getGuiId", "getViewBinding", "initClickListeners", "", "initFuelClickListener", "initFuelList", "initStartParams", "json", "Lorg/json/JSONObject;", "initViewsISAMPGUI", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onPacketIncoming", "setObservers", "setValueOfFuel", "currentValue", "updateInterfaceAfterSelectedFuel", "updatePrice", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGUIFuelFill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GUIFuelFill.kt\ncom/blackhub/bronline/game/gui/fuelfill/GUIFuelFill\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,184:1\n106#2,15:185\n*S KotlinDebug\n*F\n+ 1 GUIFuelFill.kt\ncom/blackhub/bronline/game/gui/fuelfill/GUIFuelFill\n*L\n36#1:185,15\n*E\n"})
/* loaded from: classes2.dex */
public final class GUIFuelFill extends BaseISAMPGUIFragment<FuelFillLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public FuelFillAdapter fuelFillAdapter;

    @Inject
    public MainViewModelFactory<FuelFillViewModel> fuelFillFactory;

    /* renamed from: fuelFillViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy fuelFillViewModel;
    public int fuelPrice;
    public boolean ifClickedExit;
    public int initCounter;
    public int oldPrice;

    @NotNull
    public TimeChecker timeChecker = new TimeChecker();

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 2;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FuelFillLayoutBinding access$getBinding(GUIFuelFill gUIFuelFill) {
        return (FuelFillLayoutBinding) gUIFuelFill.getBinding();
    }

    @NotNull
    public final MainViewModelFactory<FuelFillViewModel> getFuelFillFactory() {
        MainViewModelFactory<FuelFillViewModel> mainViewModelFactory = this.fuelFillFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fuelFillFactory");
        return null;
    }

    public final void setFuelFillFactory(@NotNull MainViewModelFactory<FuelFillViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.fuelFillFactory = mainViewModelFactory;
    }

    public final FuelFillViewModel getFuelFillViewModel() {
        return (FuelFillViewModel) this.fuelFillViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() throws Resources.NotFoundException {
        initStartParams(getJsonObj());
        initFuelList();
        setObservers();
        initClickListeners();
    }

    public final void initStartParams(JSONObject json) throws Resources.NotFoundException {
        FuelFillViewModel fuelFillViewModel = getFuelFillViewModel();
        String[] stringArray = requireActivity().getResources().getStringArray(R.array.fuel_fill_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        fuelFillViewModel.initParams(json, stringArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initFuelList() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.fuelFillAdapter = new FuelFillAdapter(fragmentActivityRequireActivity);
        initFuelClickListener();
        ((FuelFillLayoutBinding) getBinding()).fflFuelList.setAdapter(this.fuelFillAdapter);
    }

    public final void initFuelClickListener() {
        FuelFillAdapter fuelFillAdapter = this.fuelFillAdapter;
        if (fuelFillAdapter == null) {
            return;
        }
        fuelFillAdapter.setFuelClickListener(new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill.initFuelClickListener.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i, int i2) {
                if (GUIFuelFill.this.ifClickedExit) {
                    return;
                }
                GUIFuelFill.this.getFuelFillViewModel().selectFuel(i);
                GUIFuelFill.this.fuelPrice = i2;
                GUIFuelFill.this.updateInterfaceAfterSelectedFuel();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateInterfaceAfterSelectedFuel() {
        final FuelFillLayoutBinding fuelFillLayoutBinding = (FuelFillLayoutBinding) getBinding();
        final int progress = this.fuelPrice * fuelFillLayoutBinding.fflFuelSeekbar.getProgress();
        if (this.oldPrice != progress) {
            fuelFillLayoutBinding.fflCurrentValueOfPrice.setAnimationDuration(500L).setCountAnimationListener(new CountAnimationTextView.CountAnimationListener() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$updateInterfaceAfterSelectedFuel$1$1
                @Override // com.blackhub.bronline.game.common.CountAnimationTextView.CountAnimationListener
                public void onAnimationStart(@Nullable Object var1) {
                }

                @Override // com.blackhub.bronline.game.common.CountAnimationTextView.CountAnimationListener
                public void onAnimationEnd(@Nullable Object var1) {
                    fuelFillLayoutBinding.fflCurrentValueOfPrice.setText(String.valueOf(progress));
                }
            }).countAnimation(this.oldPrice, progress);
            this.oldPrice = progress;
        }
    }

    /* compiled from: GUIFuelFill.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$1", m7120f = "GUIFuelFill.kt", m7121i = {}, m7122l = {99}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$1 */
    public static final class C40941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40941(Continuation<? super C40941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIFuelFill.this.new C40941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> maxValueOfFuel = GUIFuelFill.this.getFuelFillViewModel().getMaxValueOfFuel();
                final GUIFuelFill gUIFuelFill = GUIFuelFill.this;
                FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        SeekBar seekBar = GUIFuelFill.access$getBinding(gUIFuelFill).fflFuelSeekbar;
                        seekBar.setMax(i2);
                        seekBar.setProgress(i2);
                        gUIFuelFill.updatePrice();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (maxValueOfFuel.collect(flowCollector, this) == coroutine_suspended) {
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
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C40941(null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C40952(null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new C40963(null));
    }

    /* compiled from: GUIFuelFill.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$2", m7120f = "GUIFuelFill.kt", m7121i = {}, m7122l = {110}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$2 */
    public static final class C40952 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40952(Continuation<? super C40952> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIFuelFill.this.new C40952(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<String> currentTypeOfFuel = GUIFuelFill.this.getFuelFillViewModel().getCurrentTypeOfFuel();
                final GUIFuelFill gUIFuelFill = GUIFuelFill.this;
                FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                        GUIFuelFill.access$getBinding(gUIFuelFill).fflRecommendFuel.setText(str);
                        gUIFuelFill.updatePrice();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentTypeOfFuel.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: GUIFuelFill.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$3", m7120f = "GUIFuelFill.kt", m7121i = {}, m7122l = {118}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$setObservers$3 */
    public static final class C40963 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40963(Continuation<? super C40963> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GUIFuelFill.this.new C40963(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40963) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<TypeAndPriceOfFuel>> allFuelList = GUIFuelFill.this.getFuelFillViewModel().getAllFuelList();
                final GUIFuelFill gUIFuelFill = GUIFuelFill.this;
                FlowCollector<? super List<TypeAndPriceOfFuel>> flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill.setObservers.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<TypeAndPriceOfFuel>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<TypeAndPriceOfFuel> list, @NotNull Continuation<? super Unit> continuation) {
                        FuelFillAdapter fuelFillAdapter = gUIFuelFill.fuelFillAdapter;
                        if (fuelFillAdapter != null) {
                            fuelFillAdapter.initFuelList(list);
                        }
                        gUIFuelFill.fuelPrice = ((TypeAndPriceOfFuel) CollectionsKt___CollectionsKt.first((List) list)).getPrice();
                        gUIFuelFill.updatePrice();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (allFuelList.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void updatePrice() {
        int i = this.initCounter + 1;
        this.initCounter = i;
        if (i == 3) {
            updateInterfaceAfterSelectedFuel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickListeners() {
        final FuelFillLayoutBinding fuelFillLayoutBinding = (FuelFillLayoutBinding) getBinding();
        fuelFillLayoutBinding.fflButtonClose.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GUIFuelFill.initClickListeners$lambda$4$lambda$2(this.f$0, fuelFillLayoutBinding, view);
            }
        });
        fuelFillLayoutBinding.fflButtonConfirmation.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                GUIFuelFill.initClickListeners$lambda$4$lambda$3(this.f$0, view);
            }
        });
        fuelFillLayoutBinding.fflFuelSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$initClickListeners$1$3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
                this.this$0.setValueOfFuel(progress);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                this.this$0.updateInterfaceAfterSelectedFuel();
            }
        });
    }

    public static final void initClickListeners$lambda$4$lambda$2(final GUIFuelFill this$0, FuelFillLayoutBinding this_with, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        view.startAnimation(this$0.getAnim());
        view.setEnabled(false);
        this_with.fflButtonConfirmation.setEnabled(false);
        this$0.ifClickedExit = true;
        view.postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                GUIFuelFill.initClickListeners$lambda$4$lambda$2$lambda$1(this.f$0);
            }
        }, 200L);
    }

    public static final void initClickListeners$lambda$4$lambda$2$lambda$1(GUIFuelFill this$0) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getFuelFillViewModel().closeInterface();
        this$0.closeFragment();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickListeners$lambda$4$lambda$3(GUIFuelFill this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.timeChecker.ifAccess(500L)) {
            view.startAnimation(this$0.getAnim());
            this$0.getFuelFillViewModel().purchaseOfFuel(((FuelFillLayoutBinding) this$0.getBinding()).fflFuelSeekbar.getProgress());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueOfFuel(int currentValue) {
        ((FuelFillLayoutBinding) getBinding()).fflCurrentValueOfFuel.setText(requireActivity().getString(R.string.fuel_fill_value_of_fuel, Integer.valueOf(currentValue)));
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FuelFillLayoutBinding getViewBinding() {
        FuelFillLayoutBinding fuelFillLayoutBindingInflate = FuelFillLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fuelFillLayoutBindingInflate, "inflate(...)");
        return fuelFillLayoutBindingInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    public GUIFuelFill() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$fuelFillViewModel$2
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
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$fuelFillViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getFuelFillFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$special$$inlined$viewModels$default$1
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
        this.fuelFillViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuelFillViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill$special$$inlined$viewModels$default$3
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
