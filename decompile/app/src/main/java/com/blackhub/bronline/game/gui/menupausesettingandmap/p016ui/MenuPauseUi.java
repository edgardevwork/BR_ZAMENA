package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.content.Context;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FragmentMenuPauseBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.JNIHelper;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuPauseButtonAdapter;
import com.blackhub.bronline.game.gui.menupausesettingandmap.data.MenuPauseButtonObj;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.network.Server;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuPauseUi.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuPauseUi;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuPauseBinding;", "()V", "buttonsList", "", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/data/MenuPauseButtonObj;", "mainViewModel", "Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "getMainViewModel", "()Lcom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "menuPauseButtonAdapter", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuPauseButtonAdapter;", "menuPauseViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "getMenuPauseViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "menuPauseViewModel$delegate", "getViewBinding", "initViews", "", "initialButtons", "initialRecyclerView", "onDestroyView", "setNullableParameters", "setObservers", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuPauseUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPauseUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuPauseUi\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,126:1\n106#2,15:127\n172#2,9:142\n*S KotlinDebug\n*F\n+ 1 MenuPauseUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuPauseUi\n*L\n28#1:127,15\n29#1:142,9\n*E\n"})
/* loaded from: classes.dex */
public final class MenuPauseUi extends BaseFragment<FragmentMenuPauseBinding> {
    public static final int $stable = 8;

    @NotNull
    public final List<MenuPauseButtonObj> buttonsList;

    /* renamed from: mainViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainViewModel;

    @Nullable
    public MenuPauseButtonAdapter menuPauseButtonAdapter;

    /* renamed from: menuPauseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuPauseViewModel;

    public MenuPauseUi() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$menuPauseViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$1
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
        this.menuPauseViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuPauseViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$viewModels$default$4
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
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.buttonsList = new ArrayList();
    }

    public static final /* synthetic */ FragmentMenuPauseBinding access$getBinding(MenuPauseUi menuPauseUi) {
        return menuPauseUi.getBinding();
    }

    public final MenuPauseViewModel getMenuPauseViewModel() {
        return (MenuPauseViewModel) this.menuPauseViewModel.getValue();
    }

    private final JNIActivityViewModel getMainViewModel() {
        return (JNIActivityViewModel) this.mainViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuPauseBinding getViewBinding() {
        FragmentMenuPauseBinding fragmentMenuPauseBindingInflate = FragmentMenuPauseBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentMenuPauseBindingInflate, "inflate(...)");
        return fragmentMenuPauseBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        initialButtons();
        initialRecyclerView(this.buttonsList);
        setObservers();
    }

    public final void initialButtons() {
        final FragmentMenuPauseBinding binding = getBinding();
        AppCompatButton newMenuPauseButtonBackToGame = binding.newMenuPauseButtonBackToGame;
        Intrinsics.checkNotNullExpressionValue(newMenuPauseButtonBackToGame, "newMenuPauseButtonBackToGame");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuPauseButtonBackToGame, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$initialButtons$1$1
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
                this.this$0.getMenuPauseViewModel().buttonClicked(3);
            }
        }, 1, null);
        if (UtilsKt.isNotPublicBuildType()) {
            AppCompatButton appCompatButton = binding.btnNativeTools;
            Context contextRequireContext = requireContext();
            Boolean IS_DEBUG_ENABLED = Settings.IS_DEBUG_ENABLED;
            Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
            appCompatButton.setBackground(AppCompatResources.getDrawable(contextRequireContext, IS_DEBUG_ENABLED.booleanValue() ? R.drawable.bg_button_green : R.drawable.bg_button_red));
            binding.btnNativeTools.setVisibility(0);
            binding.btnNativeTools.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuPauseUi.initialButtons$lambda$1$lambda$0(binding, this, view);
                }
            });
        }
        List<MenuPauseButtonObj> list = this.buttonsList;
        String string = getString(R.string.new_menu_pause_map);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(new MenuPauseButtonObj(1, string, R.drawable.ic_map));
        String string2 = getString(R.string.common_settings);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list.add(new MenuPauseButtonObj(2, string2, R.drawable.ic_setting));
    }

    public static final void initialButtons$lambda$1$lambda$0(FragmentMenuPauseBinding this_with, MenuPauseUi this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Boolean IS_DEBUG_ENABLED = Boolean.valueOf(!Settings.IS_DEBUG_ENABLED.booleanValue());
        Settings.IS_DEBUG_ENABLED = IS_DEBUG_ENABLED;
        Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED, "IS_DEBUG_ENABLED");
        JNILib.setDebugMenuVisible(IS_DEBUG_ENABLED.booleanValue());
        AppCompatButton appCompatButton = this_with.btnNativeTools;
        Context contextRequireContext = this$0.requireContext();
        Boolean IS_DEBUG_ENABLED2 = Settings.IS_DEBUG_ENABLED;
        Intrinsics.checkNotNullExpressionValue(IS_DEBUG_ENABLED2, "IS_DEBUG_ENABLED");
        appCompatButton.setBackground(AppCompatResources.getDrawable(contextRequireContext, IS_DEBUG_ENABLED2.booleanValue() ? R.drawable.bg_button_green : R.drawable.bg_button_red));
    }

    public final void initialRecyclerView(List<MenuPauseButtonObj> buttonsList) {
        MenuPauseButtonAdapter menuPauseButtonAdapter = new MenuPauseButtonAdapter(buttonsList);
        menuPauseButtonAdapter.setButtonClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$initialRecyclerView$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.getMenuPauseViewModel().buttonClicked(i);
            }
        });
        this.menuPauseButtonAdapter = menuPauseButtonAdapter;
        RecyclerView recyclerView = getBinding().newMenuPauseButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.menuPauseButtonAdapter);
    }

    /* compiled from: MenuPauseUi.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "playersNick", "", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$setObservers$1 */
    /* loaded from: classes2.dex */
    public static final class C43161 extends Lambda implements Function1<String, Unit> {
        public C43161() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(String str) {
            MenuPauseUi.access$getBinding(MenuPauseUi.this).newMenuPausePlayersNick.setText(MenuPauseUi.this.getString(R.string.common_single_string_value, str));
        }
    }

    private final void setObservers() {
        getMenuPauseViewModel().getNewPlayersNick().observe(getViewLifecycleOwner(), new MenuPauseUi$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi.setObservers.1
            public C43161() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(String str) {
                MenuPauseUi.access$getBinding(MenuPauseUi.this).newMenuPausePlayersNick.setText(MenuPauseUi.this.getString(R.string.common_single_string_value, str));
            }
        }));
        getMainViewModel().getUpdatedServers().observe(getViewLifecycleOwner(), new MenuPauseUi$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Server>, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi.setObservers.2
            public C43172() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list) {
                invoke2((List<Server>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(List<Server> list) {
                Server server;
                String firstName;
                int currServer = JNIHelper.getCurrServer();
                int size = list != null ? list.size() : 0;
                String str = NewMenuConstants.DEFAULT_VALUE_FOR_SERVER;
                if (currServer < size && list != null && (server = list.get(currServer)) != null && (firstName = server.getFirstName()) != null) {
                    str = firstName;
                }
                MenuPauseUi.access$getBinding(MenuPauseUi.this).newMenuPauseServer.setText(MenuPauseUi.this.getString(R.string.new_menu_pause_server, str));
            }
        }));
    }

    /* compiled from: MenuPauseUi.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "servers", "", "Lcom/blackhub/bronline/launcher/network/Server;", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuPauseUi$setObservers$2 */
    /* loaded from: classes2.dex */
    public static final class C43172 extends Lambda implements Function1<List<? extends Server>, Unit> {
        public C43172() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list) {
            invoke2((List<Server>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(List<Server> list) {
            Server server;
            String firstName;
            int currServer = JNIHelper.getCurrServer();
            int size = list != null ? list.size() : 0;
            String str = NewMenuConstants.DEFAULT_VALUE_FOR_SERVER;
            if (currServer < size && list != null && (server = list.get(currServer)) != null && (firstName = server.getFirstName()) != null) {
                str = firstName;
            }
            MenuPauseUi.access$getBinding(MenuPauseUi.this).newMenuPauseServer.setText(MenuPauseUi.this.getString(R.string.new_menu_pause_server, str));
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setNullableParameters();
        super.onDestroyView();
    }

    public final void setNullableParameters() {
        this.menuPauseButtonAdapter = null;
        this.buttonsList.clear();
    }
}
