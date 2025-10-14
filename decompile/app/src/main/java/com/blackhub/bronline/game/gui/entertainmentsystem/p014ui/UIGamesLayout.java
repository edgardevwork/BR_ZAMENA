package com.blackhub.bronline.game.gui.entertainmentsystem.p014ui;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.EntertainmentSystemGamesLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.gui.entertainmentsystem.adapters.EntertainmentSystemActionsAdapter;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGameData;
import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import com.caverock.androidsvg.SVG;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: UIGamesLayout.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIGamesLayout;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/EntertainmentSystemGamesLayoutBinding;", "()V", "gamesAdapter", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/adapters/EntertainmentSystemActionsAdapter;", "gamesViewModel", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "getGamesViewModel", "()Lcom/blackhub/bronline/game/gui/entertainmentsystem/viewmodel/EntertainmentGamesViewModel;", "gamesViewModel$delegate", "Lkotlin/Lazy;", "ifBlockButtons", "", "oldPosForCheckedGame", "", "getViewBinding", "initAdapterClickListeners", "", "initViews", "onDestroyView", "setGlobalDescription", "action", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "setItemsInGameList", "setNullableParameters", "setObservers", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUIGamesLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIGamesLayout.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIGamesLayout\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,122:1\n106#2,15:123\n*S KotlinDebug\n*F\n+ 1 UIGamesLayout.kt\ncom/blackhub/bronline/game/gui/entertainmentsystem/ui/UIGamesLayout\n*L\n17#1:123,15\n*E\n"})
/* loaded from: classes3.dex */
public final class UIGamesLayout extends BaseFragment<EntertainmentSystemGamesLayoutBinding> {
    public static final int $stable = 8;

    @Nullable
    public EntertainmentSystemActionsAdapter gamesAdapter;

    /* renamed from: gamesViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy gamesViewModel;
    public boolean ifBlockButtons;
    public int oldPosForCheckedGame;

    public UIGamesLayout() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$gamesViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$1
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
        this.gamesViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EntertainmentGamesViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$special$$inlined$viewModels$default$4
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
        this.oldPosForCheckedGame = -1;
    }

    public final EntertainmentGamesViewModel getGamesViewModel() {
        return (EntertainmentGamesViewModel) this.gamesViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        setItemsInGameList();
        setObservers();
    }

    public final void setItemsInGameList() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.gamesAdapter = new EntertainmentSystemActionsAdapter(fragmentActivityRequireActivity);
        initAdapterClickListeners();
        RecyclerView recyclerView = getBinding().listWithGames;
        recyclerView.setLayoutManager(new GridLayoutManager(getBinding().getRoot().getContext(), 3));
        recyclerView.setAdapter(this.gamesAdapter);
    }

    /* compiled from: UIGamesLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "action", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "position", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$1 */
    /* loaded from: classes2.dex */
    public static final class C40021 extends Lambda implements Function2<EntertainmentGameData, Integer, Unit> {
        public C40021() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(EntertainmentGameData entertainmentGameData, Integer num) {
            invoke(entertainmentGameData, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull EntertainmentGameData action, int i) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (!action.isClicked()) {
                action.setClicked(true);
                EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = UIGamesLayout.this.gamesAdapter;
                if (entertainmentSystemActionsAdapter != null) {
                    entertainmentSystemActionsAdapter.notifyItemChanged(i);
                    entertainmentSystemActionsAdapter.setCheckOnlyElement(i);
                }
            }
            UIGamesLayout.this.setGlobalDescription(action);
        }
    }

    public final void initAdapterClickListeners() {
        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = this.gamesAdapter;
        if (entertainmentSystemActionsAdapter != null) {
            entertainmentSystemActionsAdapter.setActionsClickListener(new Function2<EntertainmentGameData, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.initAdapterClickListeners.1
                public C40021() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(EntertainmentGameData entertainmentGameData, Integer num) {
                    invoke(entertainmentGameData, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull EntertainmentGameData action, int i) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    if (!action.isClicked()) {
                        action.setClicked(true);
                        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter2 = UIGamesLayout.this.gamesAdapter;
                        if (entertainmentSystemActionsAdapter2 != null) {
                            entertainmentSystemActionsAdapter2.notifyItemChanged(i);
                            entertainmentSystemActionsAdapter2.setCheckOnlyElement(i);
                        }
                    }
                    UIGamesLayout.this.setGlobalDescription(action);
                }
            });
        }
        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter2 = this.gamesAdapter;
        if (entertainmentSystemActionsAdapter2 == null) {
            return;
        }
        entertainmentSystemActionsAdapter2.setButtonClickListener(new Function3<EntertainmentGameData, Integer, View, Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.initAdapterClickListeners.2
            public C40032() {
                super(3);
            }

            /* compiled from: UIGamesLayout.kt */
            @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$2$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ int $position;
                public final /* synthetic */ UIGamesLayout this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UIGamesLayout uIGamesLayout, int i) {
                    super(0);
                    uIGamesLayout = uIGamesLayout;
                    i = i;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() throws JSONException {
                    entertainmentGameData.setClicked(true);
                    if (uIGamesLayout.ifBlockButtons) {
                        if (uIGamesLayout.oldPosForCheckedGame == i) {
                            uIGamesLayout.getGamesViewModel().sendPressButton(2);
                        }
                    } else {
                        EntertainmentGameData entertainmentGameData = entertainmentGameData;
                        EntertainmentGamesViewModel gamesViewModel = uIGamesLayout.getGamesViewModel();
                        gamesViewModel.sendGetLobby(entertainmentGameData.getId());
                        gamesViewModel.saveGameIdForTop(Integer.valueOf(entertainmentGameData.getId()));
                        uIGamesLayout.oldPosForCheckedGame = i;
                    }
                    uIGamesLayout.setGlobalDescription(entertainmentGameData);
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(EntertainmentGameData entertainmentGameData, Integer num, View view) {
                invoke(entertainmentGameData, num.intValue(), view);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull EntertainmentGameData action, int i, @NotNull View view) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(view, "view");
                UIGamesLayout uIGamesLayout = UIGamesLayout.this;
                uIGamesLayout.startAnimAndDelay(view, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.initAdapterClickListeners.2.1
                    public final /* synthetic */ int $position;
                    public final /* synthetic */ UIGamesLayout this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(UIGamesLayout uIGamesLayout2, int i2) {
                        super(0);
                        uIGamesLayout = uIGamesLayout2;
                        i = i2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() throws JSONException {
                        entertainmentGameData.setClicked(true);
                        if (uIGamesLayout.ifBlockButtons) {
                            if (uIGamesLayout.oldPosForCheckedGame == i) {
                                uIGamesLayout.getGamesViewModel().sendPressButton(2);
                            }
                        } else {
                            EntertainmentGameData entertainmentGameData = entertainmentGameData;
                            EntertainmentGamesViewModel gamesViewModel = uIGamesLayout.getGamesViewModel();
                            gamesViewModel.sendGetLobby(entertainmentGameData.getId());
                            gamesViewModel.saveGameIdForTop(Integer.valueOf(entertainmentGameData.getId()));
                            uIGamesLayout.oldPosForCheckedGame = i;
                        }
                        uIGamesLayout.setGlobalDescription(entertainmentGameData);
                    }
                });
            }
        });
    }

    /* compiled from: UIGamesLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m7105d2 = {"<anonymous>", "", "action", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "position", "", SVG.View.NODE_NAME, "Landroid/view/View;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$2 */
    /* loaded from: classes2.dex */
    public static final class C40032 extends Lambda implements Function3<EntertainmentGameData, Integer, View, Unit> {
        public C40032() {
            super(3);
        }

        /* compiled from: UIGamesLayout.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$initAdapterClickListeners$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public final /* synthetic */ int $position;
            public final /* synthetic */ UIGamesLayout this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UIGamesLayout uIGamesLayout2, int i2) {
                super(0);
                uIGamesLayout = uIGamesLayout2;
                i = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                entertainmentGameData.setClicked(true);
                if (uIGamesLayout.ifBlockButtons) {
                    if (uIGamesLayout.oldPosForCheckedGame == i) {
                        uIGamesLayout.getGamesViewModel().sendPressButton(2);
                    }
                } else {
                    EntertainmentGameData entertainmentGameData = entertainmentGameData;
                    EntertainmentGamesViewModel gamesViewModel = uIGamesLayout.getGamesViewModel();
                    gamesViewModel.sendGetLobby(entertainmentGameData.getId());
                    gamesViewModel.saveGameIdForTop(Integer.valueOf(entertainmentGameData.getId()));
                    uIGamesLayout.oldPosForCheckedGame = i;
                }
                uIGamesLayout.setGlobalDescription(entertainmentGameData);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(EntertainmentGameData entertainmentGameData, Integer num, View view) {
            invoke(entertainmentGameData, num.intValue(), view);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull EntertainmentGameData action, int i2, @NotNull View view) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(view, "view");
            UIGamesLayout uIGamesLayout2 = UIGamesLayout.this;
            uIGamesLayout2.startAnimAndDelay(view, 1000L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.initAdapterClickListeners.2.1
                public final /* synthetic */ int $position;
                public final /* synthetic */ UIGamesLayout this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UIGamesLayout uIGamesLayout22, int i22) {
                    super(0);
                    uIGamesLayout = uIGamesLayout22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() throws JSONException {
                    entertainmentGameData.setClicked(true);
                    if (uIGamesLayout.ifBlockButtons) {
                        if (uIGamesLayout.oldPosForCheckedGame == i) {
                            uIGamesLayout.getGamesViewModel().sendPressButton(2);
                        }
                    } else {
                        EntertainmentGameData entertainmentGameData = entertainmentGameData;
                        EntertainmentGamesViewModel gamesViewModel = uIGamesLayout.getGamesViewModel();
                        gamesViewModel.sendGetLobby(entertainmentGameData.getId());
                        gamesViewModel.saveGameIdForTop(Integer.valueOf(entertainmentGameData.getId()));
                        uIGamesLayout.oldPosForCheckedGame = i;
                    }
                    uIGamesLayout.setGlobalDescription(entertainmentGameData);
                }
            });
        }
    }

    /* compiled from: UIGamesLayout.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$1", m7120f = "UIGamesLayout.kt", m7121i = {}, m7122l = {88}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$1 */
    public static final class C40041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40041(Continuation<? super C40041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIGamesLayout.this.new C40041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIGamesLayout.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "Lcom/blackhub/bronline/game/gui/entertainmentsystem/data/EntertainmentGameData;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$1$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<EntertainmentGameData>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<EntertainmentGameData> list, @NotNull Continuation<? super Unit> continuation) {
                EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = uIGamesLayout.gamesAdapter;
                if (entertainmentSystemActionsAdapter != null) {
                    entertainmentSystemActionsAdapter.initGames(list);
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
                SharedFlow<List<EntertainmentGameData>> allGames = UIGamesLayout.this.getGamesViewModel().getAllGames();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.setObservers.1.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<EntertainmentGameData>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<EntertainmentGameData> list, @NotNull Continuation<? super Unit> continuation) {
                        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = uIGamesLayout.gamesAdapter;
                        if (entertainmentSystemActionsAdapter != null) {
                            entertainmentSystemActionsAdapter.initGames(list);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (allGames.collect(anonymousClass1, this) == coroutine_suspended) {
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
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C40041(null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C40052(null));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3).launchWhenStarted(new C40063(null));
    }

    /* compiled from: UIGamesLayout.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$2", m7120f = "UIGamesLayout.kt", m7121i = {}, m7122l = {93}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$2 */
    public static final class C40052 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40052(Continuation<? super C40052> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIGamesLayout.this.new C40052(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIGamesLayout.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "it", "", "", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$2$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<Integer>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = uIGamesLayout.gamesAdapter;
                if (entertainmentSystemActionsAdapter != null) {
                    entertainmentSystemActionsAdapter.updateQueue(list);
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
                StateFlow<List<Integer>> allQueue = UIGamesLayout.this.getGamesViewModel().getAllQueue();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.setObservers.2.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) {
                        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = uIGamesLayout.gamesAdapter;
                        if (entertainmentSystemActionsAdapter != null) {
                            entertainmentSystemActionsAdapter.updateQueue(list);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (allQueue.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: UIGamesLayout.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$3", m7120f = "UIGamesLayout.kt", m7121i = {}, m7122l = {98}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$3 */
    public static final class C40063 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40063(Continuation<? super C40063> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UIGamesLayout.this.new C40063(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40063) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UIGamesLayout.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout$setObservers$3$1 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Number) obj).intValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = uIGamesLayout.gamesAdapter;
                if (entertainmentSystemActionsAdapter != null) {
                    entertainmentSystemActionsAdapter.updateGameStatus(i);
                }
                uIGamesLayout.ifBlockButtons = true;
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
                SharedFlow<Integer> updateGameStatusForID = UIGamesLayout.this.getGamesViewModel().getUpdateGameStatusForID();
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.entertainmentsystem.ui.UIGamesLayout.setObservers.3.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(int i2, @NotNull Continuation<? super Unit> continuation) {
                        EntertainmentSystemActionsAdapter entertainmentSystemActionsAdapter = uIGamesLayout.gamesAdapter;
                        if (entertainmentSystemActionsAdapter != null) {
                            entertainmentSystemActionsAdapter.updateGameStatus(i2);
                        }
                        uIGamesLayout.ifBlockButtons = true;
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (updateGameStatusForID.collect(anonymousClass1, this) == coroutine_suspended) {
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

    public final void setGlobalDescription(EntertainmentGameData action) {
        EntertainmentGamesViewModel gamesViewModel = getGamesViewModel();
        gamesViewModel.checkCurrentGame(action);
        gamesViewModel.setVisibleButtonInfo(true);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    private final void setNullableParameters() {
        this.gamesAdapter = null;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public EntertainmentSystemGamesLayoutBinding getViewBinding() {
        EntertainmentSystemGamesLayoutBinding entertainmentSystemGamesLayoutBindingInflate = EntertainmentSystemGamesLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(entertainmentSystemGamesLayoutBindingInflate, "inflate(...)");
        return entertainmentSystemGamesLayoutBindingInflate;
    }
}
