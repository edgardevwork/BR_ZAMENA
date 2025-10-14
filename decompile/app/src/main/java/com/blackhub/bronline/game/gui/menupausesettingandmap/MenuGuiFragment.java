package com.blackhub.bronline.game.gui.menupausesettingandmap;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentMenuMainBinding;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.core.constants.Other;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.MenuMapUi;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.MenuPauseUi;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.MenuSettingMainUiFragment;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MenuGuiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0005J\b\u0010\"\u001a\u00020\u0015H\u0002J&\u0010#\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006)"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/MenuGuiFragment;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuMainBinding;", "()V", "currentLayout", "", "menuPauseViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "getMenuPauseViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "menuPauseViewModel$delegate", "Lkotlin/Lazy;", "newMenuPauseVMFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getNewMenuPauseVMFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setNewMenuPauseVMFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "getGuiId", "getViewBinding", "initViewsISAMPGUI", "", "isShowingGui", "", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "setCurrentLayout", "layoutId", "setObservers", "show", "manager", "Lcom/blackhub/bronline/game/GUIManager;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lcom/blackhub/bronline/game/core/JNIActivity;", "startTimer", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@Deprecated(message = "больше не используется")
@SourceDebugExtension({"SMAP\nMenuGuiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuGuiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/MenuGuiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,184:1\n106#2,15:185\n28#3,12:200\n28#3,12:212\n28#3,12:224\n28#3,12:236\n*S KotlinDebug\n*F\n+ 1 MenuGuiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/MenuGuiFragment\n*L\n46#1:185,15\n130#1:200,12\n138#1:212,12\n148#1:224,12\n161#1:236,12\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuGuiFragment extends BaseISAMPGUIFragment<FragmentMenuMainBinding> {
    public static final int $stable = 8;
    public int currentLayout;

    /* renamed from: menuPauseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuPauseViewModel;

    @Inject
    public MainViewModelFactory<MenuPauseViewModel> newMenuPauseVMFactory;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 0;
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public boolean isShowingGui() {
        return true;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment, com.blackhub.bronline.game.ISAMPGUI
    public void show(@Nullable JSONObject json, @Nullable GUIManager manager, @Nullable JNIActivity activity) {
    }

    @NotNull
    public final MainViewModelFactory<MenuPauseViewModel> getNewMenuPauseVMFactory() {
        MainViewModelFactory<MenuPauseViewModel> mainViewModelFactory = this.newMenuPauseVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newMenuPauseVMFactory");
        return null;
    }

    public final void setNewMenuPauseVMFactory(@NotNull MainViewModelFactory<MenuPauseViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.newMenuPauseVMFactory = mainViewModelFactory;
    }

    public final MenuPauseViewModel getMenuPauseViewModel() {
        return (MenuPauseViewModel) this.menuPauseViewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    @Override // com.blackhub.bronline.game.common.BaseISAMPGUIFragment
    public void initViewsISAMPGUI() throws JSONException {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(Other.JSON_OBJECT_TAG) : null;
        if (string != null) {
            int iOptInt = new JSONObject(string).optInt(NewMenuConstants.SELECT_SCREEN);
            if (iOptInt == 1) {
                setCurrentLayout(2);
            } else if (iOptInt == 2) {
                setCurrentLayout(4);
            } else {
                setCurrentLayout(0);
            }
        } else {
            setCurrentLayout(0);
        }
        setObservers();
        startTimer();
        JNILib.toggleDrawing2dStuff(true);
        getMenuPauseViewModel().actionsWithJSONClickButton(0);
    }

    private final void setObservers() {
        getMenuPauseViewModel().getButtonClickedLiveData().observe(getViewLifecycleOwner(), new MenuGuiFragment$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment.setObservers.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) throws JSONException {
                MenuGuiFragment menuGuiFragment = MenuGuiFragment.this;
                Intrinsics.checkNotNull(num);
                menuGuiFragment.currentLayout = num.intValue();
                if (num.intValue() == 3) {
                    MenuGuiFragment.this.closeFragment();
                } else {
                    MenuGuiFragment.this.setCurrentLayout(num.intValue());
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startTimer() {
        ((FragmentMenuMainBinding) getBinding()).newMenuPauseChronometer.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() throws JSONException {
        ((FragmentMenuMainBinding) getBinding()).newMenuPauseChronometer.stop();
        super.onDestroyView();
        JNILib.toggleDrawing2dStuff(false);
        getMenuPauseViewModel().actionsWithJSONClickButton(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
        if (this.currentLayout == 0) {
            closeFragment();
            return;
        }
        if (!isAdded()) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log("Fragment has not been attached yet");
            firebaseCrashlytics.recordException(new Throwable());
            closeFragment();
            return;
        }
        getChildFragmentManager().popBackStack();
        ((FragmentMenuMainBinding) getBinding()).timerGroup.setVisibility(0);
        this.currentLayout = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCurrentLayout(int layoutId) throws JSONException {
        if (layoutId == 0) {
            ((FragmentMenuMainBinding) getBinding()).timerGroup.setVisibility(0);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction.replace(R.id.new_menu_main_container, MenuPauseUi.class, (Bundle) null);
            fragmentTransactionBeginTransaction.commit();
        } else if (layoutId == 1) {
            ((FragmentMenuMainBinding) getBinding()).timerGroup.setVisibility(8);
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction2 = childFragmentManager2.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "beginTransaction()");
            fragmentTransactionBeginTransaction2.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction2.replace(R.id.new_menu_main_container, MenuMapUi.class, (Bundle) null);
            fragmentTransactionBeginTransaction2.addToBackStack(AnyExtensionKt.empty(fragmentTransactionBeginTransaction2));
            fragmentTransactionBeginTransaction2.commit();
            getMenuPauseViewModel().actionsWithJSONClickButton(1);
        } else if (layoutId == 2) {
            ((FragmentMenuMainBinding) getBinding()).timerGroup.setVisibility(8);
            FragmentManager childFragmentManager3 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction3 = childFragmentManager3.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction3, "beginTransaction()");
            fragmentTransactionBeginTransaction3.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction3.replace(R.id.new_menu_main_container, MenuSettingMainUiFragment.class, (Bundle) null);
            fragmentTransactionBeginTransaction3.addToBackStack(AnyExtensionKt.empty(fragmentTransactionBeginTransaction3));
            fragmentTransactionBeginTransaction3.commit();
        } else if (layoutId == 4) {
            ((FragmentMenuMainBinding) getBinding()).timerGroup.setVisibility(8);
            FragmentManager childFragmentManager4 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction4 = childFragmentManager4.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction4, "beginTransaction()");
            fragmentTransactionBeginTransaction4.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction4.replace(R.id.new_menu_main_container, MenuSettingMainUiFragment.class, BundleKt.bundleOf(TuplesKt.m7112to(NewMenuConstants.NEW_MENU_SETTING_LAYOUT_WITH_CONTROL_ARGS, Boolean.TRUE)));
            fragmentTransactionBeginTransaction4.addToBackStack(AnyExtensionKt.empty(fragmentTransactionBeginTransaction4));
            fragmentTransactionBeginTransaction4.commit();
        }
        if (layoutId == 1) {
            getMenuPauseViewModel().actionsWithJSONClickButton(1);
            JNILib.toggleDrawing2dStuff(false);
        } else {
            JNILib.toggleDrawing2dStuff(true);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuMainBinding getViewBinding() {
        FragmentMenuMainBinding fragmentMenuMainBindingInflate = FragmentMenuMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentMenuMainBindingInflate, "inflate(...)");
        return fragmentMenuMainBindingInflate;
    }

    public MenuGuiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment$menuPauseViewModel$2
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
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment$menuPauseViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getNewMenuPauseVMFactory();
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment$special$$inlined$viewModels$default$1
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
        this.menuPauseViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuPauseViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment$special$$inlined$viewModels$default$3
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
