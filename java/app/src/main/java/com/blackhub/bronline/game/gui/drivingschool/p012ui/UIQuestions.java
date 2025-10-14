package com.blackhub.bronline.game.gui.drivingschool.p012ui;

import android.os.CountDownTimer;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.DrivingSchoolQuestionsLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.drivingschool.adapters.DrivingSchoolAnswersAdapter;
import com.blackhub.bronline.game.gui.drivingschool.data.CurrentAndAllQuestions;
import com.blackhub.bronline.game.gui.drivingschool.data.DrivingAnswer;
import com.blackhub.bronline.game.gui.drivingschool.utils.DrivingSchoolConstants;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolQuestsViewModel;
import com.blackhub.bronline.game.gui.drivingschool.viewmodel.DrivingSchoolViewModel;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIQuestions.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUIQuestions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIQuestions.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIQuestions\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,156:1\n106#2,15:157\n106#2,15:172\n*S KotlinDebug\n*F\n+ 1 UIQuestions.kt\ncom/blackhub/bronline/game/gui/drivingschool/ui/UIQuestions\n*L\n26#1:157,15\n27#1:172,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIQuestions extends BaseFragment<DrivingSchoolQuestionsLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public DrivingSchoolAnswersAdapter answersAdapter;

    @NotNull
    public final List<Integer> counterWithAnswer;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    /* renamed from: questsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy questsViewModel;

    @Nullable
    public CountDownTimer timer;

    public UIQuestions() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$mainViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment fragmentRequireParentFragment = this.this$0.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$1
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
        final Function0 function02 = null;
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$questsViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                Fragment fragmentRequireParentFragment = this.this$0.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.questsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DrivingSchoolQuestsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.counterWithAnswer = CollectionsKt__CollectionsKt.mutableListOf(-1, 0);
    }

    public static final /* synthetic */ DrivingSchoolQuestionsLayoutBinding access$getBinding(UIQuestions uIQuestions) {
        return uIQuestions.getBinding();
    }

    public final DrivingSchoolViewModel getMainViewModel() {
        return (DrivingSchoolViewModel) this.mainViewModel.getValue();
    }

    public final DrivingSchoolQuestsViewModel getQuestsViewModel() {
        return (DrivingSchoolQuestsViewModel) this.questsViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DrivingSchoolQuestionsLayoutBinding getViewBinding() {
        DrivingSchoolQuestionsLayoutBinding drivingSchoolQuestionsLayoutBindingInflate = DrivingSchoolQuestionsLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(drivingSchoolQuestionsLayoutBindingInflate, "inflate(...)");
        return drivingSchoolQuestionsLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initAnswersRV();
        startTimer();
        setObservers();
    }

    public final void initAnswersRV() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.answersAdapter = new DrivingSchoolAnswersAdapter(fragmentActivityRequireActivity);
        initAnswersClickListener();
        RecyclerView recyclerView = getBinding().answersList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBinding().getRoot().getContext(), 1, false));
        recyclerView.setAdapter(this.answersAdapter);
    }

    /* compiled from: UIQuestions.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "position", "", SVG.View.NODE_NAME, "Landroid/view/View;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$initAnswersClickListener$1 */
    /* loaded from: classes2.dex */
    public static final class C39461 extends Lambda implements Function2<Integer, View, Unit> {
        public C39461() {
            super(2);
        }

        /* compiled from: UIQuestions.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$initAnswersClickListener$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public final /* synthetic */ int $position;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(int i) {
                super(0);
                i = i;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = uIQuestions.answersAdapter;
                if (drivingSchoolAnswersAdapter != null) {
                    drivingSchoolAnswersAdapter.setCheckedOnlyItem(i);
                }
                if (((Number) uIQuestions.counterWithAnswer.get(0)).intValue() != i || ((Number) uIQuestions.counterWithAnswer.get(1)).intValue() != 1) {
                    uIQuestions.counterWithAnswer.set(0, Integer.valueOf(i));
                    uIQuestions.counterWithAnswer.set(1, 1);
                } else {
                    uIQuestions.getQuestsViewModel().checkAnswer(i);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, View view) {
            invoke(num.intValue(), view);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, @NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            UIQuestions uIQuestions = UIQuestions.this;
            BaseFragment.startAnimAndDelay$default(uIQuestions, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.initAnswersClickListener.1.1
                public final /* synthetic */ int $position;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(int i2) {
                    super(0);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() throws JSONException {
                    DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = uIQuestions.answersAdapter;
                    if (drivingSchoolAnswersAdapter != null) {
                        drivingSchoolAnswersAdapter.setCheckedOnlyItem(i);
                    }
                    if (((Number) uIQuestions.counterWithAnswer.get(0)).intValue() != i || ((Number) uIQuestions.counterWithAnswer.get(1)).intValue() != 1) {
                        uIQuestions.counterWithAnswer.set(0, Integer.valueOf(i));
                        uIQuestions.counterWithAnswer.set(1, 1);
                    } else {
                        uIQuestions.getQuestsViewModel().checkAnswer(i);
                    }
                }
            }, 1, null);
        }
    }

    public final void initAnswersClickListener() {
        DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = this.answersAdapter;
        if (drivingSchoolAnswersAdapter == null) {
            return;
        }
        drivingSchoolAnswersAdapter.setAnswerClickListener(new Function2<Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.initAnswersClickListener.1
            public C39461() {
                super(2);
            }

            /* compiled from: UIQuestions.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$initAnswersClickListener$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ int $position;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(int i2) {
                    super(0);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() throws JSONException {
                    DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = uIQuestions.answersAdapter;
                    if (drivingSchoolAnswersAdapter != null) {
                        drivingSchoolAnswersAdapter.setCheckedOnlyItem(i);
                    }
                    if (((Number) uIQuestions.counterWithAnswer.get(0)).intValue() != i || ((Number) uIQuestions.counterWithAnswer.get(1)).intValue() != 1) {
                        uIQuestions.counterWithAnswer.set(0, Integer.valueOf(i));
                        uIQuestions.counterWithAnswer.set(1, 1);
                    } else {
                        uIQuestions.getQuestsViewModel().checkAnswer(i);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, View view) {
                invoke(num.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(int i2, @NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                UIQuestions uIQuestions = UIQuestions.this;
                BaseFragment.startAnimAndDelay$default(uIQuestions, view, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.initAnswersClickListener.1.1
                    public final /* synthetic */ int $position;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(int i22) {
                        super(0);
                        i = i22;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() throws JSONException {
                        DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter2 = uIQuestions.answersAdapter;
                        if (drivingSchoolAnswersAdapter2 != null) {
                            drivingSchoolAnswersAdapter2.setCheckedOnlyItem(i);
                        }
                        if (((Number) uIQuestions.counterWithAnswer.get(0)).intValue() != i || ((Number) uIQuestions.counterWithAnswer.get(1)).intValue() != 1) {
                            uIQuestions.counterWithAnswer.set(0, Integer.valueOf(i));
                            uIQuestions.counterWithAnswer.set(1, 1);
                        } else {
                            uIQuestions.getQuestsViewModel().checkAnswer(i);
                        }
                    }
                }, 1, null);
            }
        });
    }

    /* compiled from: UIQuestions.kt */
    @Metadata(m7104d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m7105d2 = {"com/blackhub/bronline/game/gui/drivingschool/ui/UIQuestions$startTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "p0", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$startTimer$1 */
    public static final class CountDownTimerC39511 extends CountDownTimer {
        public CountDownTimerC39511(long j) {
            super(j, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long p0) {
            String strValueOf;
            String strValueOf2;
            long j = 60;
            long j2 = 1000;
            long j3 = (p0 / j) / j2;
            if (String.valueOf(j3).length() == 1) {
                strValueOf = "0" + j3;
            } else {
                strValueOf = String.valueOf(j3);
            }
            long j4 = (p0 - ((j3 * j) * j2)) / j2;
            if (String.valueOf(j4).length() == 1) {
                strValueOf2 = "0" + j4;
            } else {
                strValueOf2 = String.valueOf(j4);
            }
            UIQuestions.access$getBinding(UIQuestions.this).valueTimer.setText(UIQuestions.this.requireActivity().getString(R.string.driving_school_timer, strValueOf, strValueOf2));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() throws JSONException {
            UIQuestions.this.getMainViewModel().pressButton(4);
        }
    }

    private final void startTimer() {
        CountDownTimerC39511 countDownTimerC39511 = new CountDownTimer(1000 * 900) { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.startTimer.1
            public CountDownTimerC39511(long j) {
                super(j, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                String strValueOf;
                String strValueOf2;
                long j = 60;
                long j2 = 1000;
                long j3 = (p0 / j) / j2;
                if (String.valueOf(j3).length() == 1) {
                    strValueOf = "0" + j3;
                } else {
                    strValueOf = String.valueOf(j3);
                }
                long j4 = (p0 - ((j3 * j) * j2)) / j2;
                if (String.valueOf(j4).length() == 1) {
                    strValueOf2 = "0" + j4;
                } else {
                    strValueOf2 = String.valueOf(j4);
                }
                UIQuestions.access$getBinding(UIQuestions.this).valueTimer.setText(UIQuestions.this.requireActivity().getString(R.string.driving_school_timer, strValueOf, strValueOf2));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() throws JSONException {
                UIQuestions.this.getMainViewModel().pressButton(4);
            }
        };
        this.timer = countDownTimerC39511;
        countDownTimerC39511.start();
    }

    /* compiled from: UIQuestions.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$1", m7120f = "UIQuestions.kt", m7121i = {}, m7122l = {94}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$1 */
    public static final class C39471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39471(Continuation<? super C39471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIQuestions.this.new C39471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIQuestions.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$1$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                UIQuestions.access$getBinding(uIQuestions).thisQuestionValue.setText(uIQuestions.requireActivity().getString(R.string.driving_school_this_question, Boxing.boxInt(i)));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> questionNumber = UIQuestions.this.getQuestsViewModel().getQuestionNumber();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        UIQuestions.access$getBinding(uIQuestions).thisQuestionValue.setText(uIQuestions.requireActivity().getString(R.string.driving_school_this_question, Boxing.boxInt(i2)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (questionNumber.collect(anonymousClass1, this) == coroutine_suspended) {
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
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C39471(null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C39482(null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new C39493(null));
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4).launchWhenStarted(new C39504(null));
    }

    /* compiled from: UIQuestions.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$2", m7120f = "UIQuestions.kt", m7121i = {}, m7122l = {99}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$2 */
    public static final class C39482 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39482(Continuation<? super C39482> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIQuestions.this.new C39482(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39482) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIQuestions.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/game/gui/drivingschool/data/CurrentAndAllQuestions;", "emit", "(Lcom/blackhub/bronline/game/gui/drivingschool/data/CurrentAndAllQuestions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$2$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((CurrentAndAllQuestions) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull CurrentAndAllQuestions currentAndAllQuestions, @NotNull Continuation<? super Unit> continuation) {
                UIQuestions.access$getBinding(uIQuestions).valueCorrectAnswers.setText(uIQuestions.requireActivity().getString(R.string.common_current_and_max_values_with_spaces, Boxing.boxInt(currentAndAllQuestions.getCurrentValueOfQuestion()), Boxing.boxInt(currentAndAllQuestions.getAllValueOfQuestions())));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CurrentAndAllQuestions> valueOfQuestions = UIQuestions.this.getQuestsViewModel().getValueOfQuestions();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CurrentAndAllQuestions) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull CurrentAndAllQuestions currentAndAllQuestions, @NotNull Continuation<? super Unit> continuation) {
                        UIQuestions.access$getBinding(uIQuestions).valueCorrectAnswers.setText(uIQuestions.requireActivity().getString(R.string.common_current_and_max_values_with_spaces, Boxing.boxInt(currentAndAllQuestions.getCurrentValueOfQuestion()), Boxing.boxInt(currentAndAllQuestions.getAllValueOfQuestions())));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (valueOfQuestions.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: UIQuestions.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$3", m7120f = "UIQuestions.kt", m7121i = {}, m7122l = {109}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$3 */
    public static final class C39493 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39493(Continuation<? super C39493> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIQuestions.this.new C39493(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39493) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIQuestions.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "Lcom/blackhub/bronline/game/gui/drivingschool/data/DrivingAnswer;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$3$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<DrivingAnswer>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<DrivingAnswer> list, @NotNull Continuation<? super Unit> continuation) {
                if (!list.isEmpty()) {
                    UIQuestions.access$getBinding(uIQuestions).thisQuestionsText.setText(list.get(0).getAnswersText());
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (i > 0) {
                            arrayList.add(list.get(i));
                        }
                    }
                    DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = uIQuestions.answersAdapter;
                    if (drivingSchoolAnswersAdapter != null) {
                        drivingSchoolAnswersAdapter.initAnswers(arrayList);
                    }
                    uIQuestions.counterWithAnswer.set(0, Boxing.boxInt(-1));
                    uIQuestions.counterWithAnswer.set(1, Boxing.boxInt(0));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<DrivingAnswer>> currentQuest = UIQuestions.this.getQuestsViewModel().getCurrentQuest();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.setObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<DrivingAnswer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<DrivingAnswer> list, @NotNull Continuation<? super Unit> continuation) {
                        if (!list.isEmpty()) {
                            UIQuestions.access$getBinding(uIQuestions).thisQuestionsText.setText(list.get(0).getAnswersText());
                            ArrayList arrayList = new ArrayList();
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                if (i2 > 0) {
                                    arrayList.add(list.get(i2));
                                }
                            }
                            DrivingSchoolAnswersAdapter drivingSchoolAnswersAdapter = uIQuestions.answersAdapter;
                            if (drivingSchoolAnswersAdapter != null) {
                                drivingSchoolAnswersAdapter.initAnswers(arrayList);
                            }
                            uIQuestions.counterWithAnswer.set(0, Boxing.boxInt(-1));
                            uIQuestions.counterWithAnswer.set(1, Boxing.boxInt(0));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentQuest.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: UIQuestions.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$4", m7120f = "UIQuestions.kt", m7121i = {}, m7122l = {130}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$4 */
    public static final class C39504 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39504(Continuation<? super C39504> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIQuestions.this.new C39504(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39504) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIQuestions.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions$setObservers$4$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                String str;
                if (i == 2 || i == 3) {
                    str = "ds_icon_default";
                } else if (i == 4) {
                    str = "ds_icon_4";
                } else if (i == 6) {
                    str = "ds_icon_6";
                } else if (i == 7) {
                    str = "ds_icon_7";
                } else if (i == 8) {
                    str = "ds_icon_8";
                } else if (i != 10) {
                    switch (i) {
                        case 37:
                        case 38:
                        case 43:
                            break;
                        case 39:
                            break;
                        case 40:
                            break;
                        case 41:
                            break;
                        case 42:
                            break;
                        default:
                            str = DrivingSchoolConstants.DRIVING_SCHOOL_ICON_TAG + i;
                            break;
                    }
                }
                UIQuestions.access$getBinding(uIQuestions).questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> currentQuestID = UIQuestions.this.getQuestsViewModel().getCurrentQuestID();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.drivingschool.ui.UIQuestions.setObservers.4.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:43:0x002c  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        String str;
                        if (i2 == 2 || i2 == 3) {
                            str = "ds_icon_default";
                        } else if (i2 == 4) {
                            str = "ds_icon_4";
                        } else if (i2 == 6) {
                            str = "ds_icon_6";
                        } else if (i2 == 7) {
                            str = "ds_icon_7";
                        } else if (i2 == 8) {
                            str = "ds_icon_8";
                        } else if (i2 != 10) {
                            switch (i2) {
                                case 37:
                                case 38:
                                case 43:
                                    break;
                                case 39:
                                    break;
                                case 40:
                                    break;
                                case 41:
                                    break;
                                case 42:
                                    break;
                                default:
                                    str = DrivingSchoolConstants.DRIVING_SCHOOL_ICON_TAG + i2;
                                    break;
                            }
                        }
                        UIQuestions.access$getBinding(uIQuestions).questionsIconRes.setImageDrawable(Useful.INSTANCE.getDrawableByName(str));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (currentQuestID.collect(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
        this.answersAdapter = null;
    }
}

