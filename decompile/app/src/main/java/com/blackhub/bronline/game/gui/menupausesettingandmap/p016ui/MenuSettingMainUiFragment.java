package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.databinding.FragmentMenuSettingMainBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.BaseISAMPGUIFragment;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.adapters.MenuSettingTitleAdapter;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MenuSettingMainUiFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0002H\u0016J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020?H\u0002J\b\u0010A\u001a\u00020?H\u0002J\b\u0010B\u001a\u00020?H\u0016J\b\u0010C\u001a\u00020?H\u0016J\u0010\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020FH\u0016J\u0012\u0010G\u001a\u00020?2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020?H\u0016J$\u0010K\u001a\u00020?2\u000e\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00020N0M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010PH\u0002J\u0010\u0010Q\u001a\u00020?2\u0006\u0010R\u001a\u00020\u0005H\u0002J\u0006\u0010S\u001a\u00020?J\b\u0010T\u001a\u00020?H\u0002J\b\u0010U\u001a\u00020?H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001b\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u001b\u0010&\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b'\u0010(R$\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\u001b\u0010.\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b4\u00105R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingMainUiFragment;", "Lcom/blackhub/bronline/game/common/BaseISAMPGUIFragment;", "Lcom/blackhub/bronline/databinding/FragmentMenuSettingMainBinding;", "()V", "currentFragment", "", "menuPauseViewModel", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "getMenuPauseViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuPauseViewModel;", "menuPauseViewModel$delegate", "Lkotlin/Lazy;", "menuPauseViewModelVMFactory", "Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "getMenuPauseViewModelVMFactory", "()Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;", "setMenuPauseViewModelVMFactory", "(Lcom/blackhub/bronline/launcher/viewmodel/MainViewModelFactory;)V", "menuSettingControlVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "getMenuSettingControlVMFactory", "setMenuSettingControlVMFactory", "menuSettingControlViewModel", "getMenuSettingControlViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingControlViewModel;", "menuSettingControlViewModel$delegate", "menuSettingGraphicVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingGraphicViewModel;", "getMenuSettingGraphicVMFactory", "setMenuSettingGraphicVMFactory", "menuSettingGraphicViewModel", "getMenuSettingGraphicViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingGraphicViewModel;", "menuSettingGraphicViewModel$delegate", "menuSettingSoundVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "getMenuSettingSoundVMFactory", "setMenuSettingSoundVMFactory", "menuSettingSoundViewModel", "getMenuSettingSoundViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "menuSettingSoundViewModel$delegate", "menuSettingWinterVMFactory", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel;", "getMenuSettingWinterVMFactory", "setMenuSettingWinterVMFactory", "menuSettingWinterViewModel", "getMenuSettingWinterViewModel", "()Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel;", "menuSettingWinterViewModel$delegate", "screenArgs", "", "getScreenArgs", "()Z", "screenArgs$delegate", "settingsList", "", "", "titleAdapter", "Lcom/blackhub/bronline/game/gui/menupausesettingandmap/adapters/MenuSettingTitleAdapter;", "getGuiId", "getViewBinding", "initAdapterAndRecyclerView", "", "initFPS", "initParameters", "initViews", "newBackPress", "onAttach", "context", "Landroid/content/Context;", "onPacketIncoming", "json", "Lorg/json/JSONObject;", "onStop", "replaceFragment", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "args", "Landroid/os/Bundle;", "setCurrentSetting", "currentSetting", "setNullableParameters", "setOnButtonCloseClickListener", "setOnResetSettingsClickListener", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuSettingMainUiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingMainUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingMainUiFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,220:1\n106#2,15:221\n106#2,15:236\n106#2,15:251\n106#2,15:266\n106#2,15:281\n13309#3,2:296\n*S KotlinDebug\n*F\n+ 1 MenuSettingMainUiFragment.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuSettingMainUiFragment\n*L\n40#1:221,15\n45#1:236,15\n50#1:251,15\n55#1:266,15\n60#1:281,15\n148#1:296,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuSettingMainUiFragment extends BaseISAMPGUIFragment<FragmentMenuSettingMainBinding> {
    public static final int $stable = 8;
    public int currentFragment;

    /* renamed from: menuPauseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuPauseViewModel;

    @Inject
    public MainViewModelFactory<MenuPauseViewModel> menuPauseViewModelVMFactory;

    @Inject
    public MainViewModelFactory<MenuSettingControlViewModel> menuSettingControlVMFactory;

    /* renamed from: menuSettingControlViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingControlViewModel;

    @Inject
    public MainViewModelFactory<MenuSettingGraphicViewModel> menuSettingGraphicVMFactory;

    /* renamed from: menuSettingGraphicViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingGraphicViewModel;

    @Inject
    public MainViewModelFactory<MenuSettingSoundViewModel> menuSettingSoundVMFactory;

    /* renamed from: menuSettingSoundViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingSoundViewModel;

    @Inject
    public MainViewModelFactory<MenuSettingWinterViewModel> menuSettingWinterVMFactory;

    /* renamed from: menuSettingWinterViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy menuSettingWinterViewModel;

    /* renamed from: screenArgs$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy screenArgs;

    @NotNull
    public final List<String> settingsList;

    @Nullable
    public MenuSettingTitleAdapter titleAdapter;

    @Override // com.blackhub.bronline.game.ISAMPGUI
    /* renamed from: getGuiId */
    public int getScreenId() {
        return 47;
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void newBackPress() {
    }

    @Override // com.blackhub.bronline.game.ISAMPGUI
    public void onPacketIncoming(@Nullable JSONObject json) {
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingGraphicViewModel> getMenuSettingGraphicVMFactory() {
        MainViewModelFactory<MenuSettingGraphicViewModel> mainViewModelFactory = this.menuSettingGraphicVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingGraphicVMFactory");
        return null;
    }

    public final void setMenuSettingGraphicVMFactory(@NotNull MainViewModelFactory<MenuSettingGraphicViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingGraphicVMFactory = mainViewModelFactory;
    }

    public final MenuSettingGraphicViewModel getMenuSettingGraphicViewModel() {
        return (MenuSettingGraphicViewModel) this.menuSettingGraphicViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingSoundViewModel> getMenuSettingSoundVMFactory() {
        MainViewModelFactory<MenuSettingSoundViewModel> mainViewModelFactory = this.menuSettingSoundVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingSoundVMFactory");
        return null;
    }

    public final void setMenuSettingSoundVMFactory(@NotNull MainViewModelFactory<MenuSettingSoundViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingSoundVMFactory = mainViewModelFactory;
    }

    public final MenuSettingSoundViewModel getMenuSettingSoundViewModel() {
        return (MenuSettingSoundViewModel) this.menuSettingSoundViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingControlViewModel> getMenuSettingControlVMFactory() {
        MainViewModelFactory<MenuSettingControlViewModel> mainViewModelFactory = this.menuSettingControlVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingControlVMFactory");
        return null;
    }

    public final void setMenuSettingControlVMFactory(@NotNull MainViewModelFactory<MenuSettingControlViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingControlVMFactory = mainViewModelFactory;
    }

    public final MenuSettingControlViewModel getMenuSettingControlViewModel() {
        return (MenuSettingControlViewModel) this.menuSettingControlViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuSettingWinterViewModel> getMenuSettingWinterVMFactory() {
        MainViewModelFactory<MenuSettingWinterViewModel> mainViewModelFactory = this.menuSettingWinterVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuSettingWinterVMFactory");
        return null;
    }

    public final void setMenuSettingWinterVMFactory(@NotNull MainViewModelFactory<MenuSettingWinterViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuSettingWinterVMFactory = mainViewModelFactory;
    }

    public final MenuSettingWinterViewModel getMenuSettingWinterViewModel() {
        return (MenuSettingWinterViewModel) this.menuSettingWinterViewModel.getValue();
    }

    @NotNull
    public final MainViewModelFactory<MenuPauseViewModel> getMenuPauseViewModelVMFactory() {
        MainViewModelFactory<MenuPauseViewModel> mainViewModelFactory = this.menuPauseViewModelVMFactory;
        if (mainViewModelFactory != null) {
            return mainViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuPauseViewModelVMFactory");
        return null;
    }

    public final void setMenuPauseViewModelVMFactory(@NotNull MainViewModelFactory<MenuPauseViewModel> mainViewModelFactory) {
        Intrinsics.checkNotNullParameter(mainViewModelFactory, "<set-?>");
        this.menuPauseViewModelVMFactory = mainViewModelFactory;
    }

    public final MenuPauseViewModel getMenuPauseViewModel() {
        return (MenuPauseViewModel) this.menuPauseViewModel.getValue();
    }

    public final boolean getScreenArgs() {
        return ((Boolean) this.screenArgs.getValue()).booleanValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        List<String> list = this.settingsList;
        String string = requireContext().getString(R.string.new_menu_setting_title_controls);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(string);
        String string2 = requireContext().getString(R.string.new_menu_setting_title_sound);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list.add(string2);
        String string3 = requireContext().getString(R.string.new_menu_setting_title_graphics);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        list.add(string3);
        initFPS();
        initParameters();
        initAdapterAndRecyclerView();
        setOnResetSettingsClickListener();
        setOnButtonCloseClickListener();
        if (getScreenArgs()) {
            setCurrentSetting(10);
        } else {
            setCurrentSetting(0);
        }
    }

    /* compiled from: MenuSettingMainUiFragment.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$setOnResetSettingsClickListener$1 */
    public static final class C43501 extends Lambda implements Function0<Unit> {
        public C43501() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            int i = MenuSettingMainUiFragment.this.currentFragment;
            if (i == 0) {
                MenuSettingMainUiFragment.this.getMenuSettingControlViewModel().setDefaultParameters();
            } else if (i == 1) {
                MenuSettingMainUiFragment.this.getMenuSettingSoundViewModel().setDefaultParameters();
            } else {
                if (i != 2) {
                    return;
                }
                MenuSettingMainUiFragment.this.getMenuSettingGraphicViewModel().setDefaultParameters();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnResetSettingsClickListener() {
        TextView newMenuSettingButtonRefresh = ((FragmentMenuSettingMainBinding) getBinding()).newMenuSettingButtonRefresh;
        Intrinsics.checkNotNullExpressionValue(newMenuSettingButtonRefresh, "newMenuSettingButtonRefresh");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuSettingButtonRefresh, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.setOnResetSettingsClickListener.1
            public C43501() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                int i = MenuSettingMainUiFragment.this.currentFragment;
                if (i == 0) {
                    MenuSettingMainUiFragment.this.getMenuSettingControlViewModel().setDefaultParameters();
                } else if (i == 1) {
                    MenuSettingMainUiFragment.this.getMenuSettingSoundViewModel().setDefaultParameters();
                } else {
                    if (i != 2) {
                        return;
                    }
                    MenuSettingMainUiFragment.this.getMenuSettingGraphicViewModel().setDefaultParameters();
                }
            }
        }, 1, null);
    }

    /* compiled from: MenuSettingMainUiFragment.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$setOnButtonCloseClickListener$1 */
    public static final class C43491 extends Lambda implements Function0<Unit> {
        public C43491() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            if (Intrinsics.areEqual(MenuSettingMainUiFragment.this.requireActivity().getClass(), JNIActivity.class)) {
                MenuSettingMainUiFragment.this.getMenuPauseViewModel().closeSettings();
            } else {
                MenuSettingMainUiFragment.this.getParentFragmentManager().popBackStack();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnButtonCloseClickListener() {
        AppCompatButton newMenuSettingButtonBackMenu = ((FragmentMenuSettingMainBinding) getBinding()).newMenuSettingButtonBackMenu;
        Intrinsics.checkNotNullExpressionValue(newMenuSettingButtonBackMenu, "newMenuSettingButtonBackMenu");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuSettingButtonBackMenu, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.setOnButtonCloseClickListener.1
            public C43491() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                if (Intrinsics.areEqual(MenuSettingMainUiFragment.this.requireActivity().getClass(), JNIActivity.class)) {
                    MenuSettingMainUiFragment.this.getMenuPauseViewModel().closeSettings();
                } else {
                    MenuSettingMainUiFragment.this.getParentFragmentManager().popBackStack();
                }
            }
        }, 1, null);
    }

    public final void initParameters() {
        getMenuSettingGraphicViewModel().initialParameters();
        getMenuSettingSoundViewModel().initialParameters();
        getMenuSettingControlViewModel().initialParameters();
    }

    public final void initFPS() {
        float refreshRate;
        Float fValueOf;
        Display.Mode[] supportedModes;
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = requireActivity().getDisplay();
            fValueOf = display != null ? Float.valueOf(display.getRefreshRate()) : null;
            Display display2 = requireActivity().getDisplay();
            refreshRate = 60.0f;
            if (display2 != null && (supportedModes = display2.getSupportedModes()) != null) {
                for (Display.Mode mode : supportedModes) {
                    if (refreshRate < mode.getRefreshRate()) {
                        refreshRate = mode.getRefreshRate();
                    }
                }
            }
        } else {
            refreshRate = requireActivity().getWindowManager().getDefaultDisplay().getRefreshRate();
            fValueOf = Float.valueOf(refreshRate);
        }
        getMenuSettingGraphicViewModel().initFPS(fValueOf, (int) refreshRate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initAdapterAndRecyclerView() {
        MenuSettingTitleAdapter menuSettingTitleAdapter = new MenuSettingTitleAdapter(this.settingsList);
        menuSettingTitleAdapter.setOnItemClickListener(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$initAdapterAndRecyclerView$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                this.this$0.currentFragment = i;
                this.this$0.setCurrentSetting(i);
            }
        });
        this.titleAdapter = menuSettingTitleAdapter;
        RecyclerView recyclerView = ((FragmentMenuSettingMainBinding) getBinding()).newMenuSettingTitleButtons;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.titleAdapter);
    }

    public static /* synthetic */ void replaceFragment$default(MenuSettingMainUiFragment menuSettingMainUiFragment, Class cls, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        menuSettingMainUiFragment.replaceFragment(cls, bundle);
    }

    public final void replaceFragment(Class<? extends Fragment> cls, Bundle args) {
        getChildFragmentManager().beginTransaction().replace(R.id.new_menu_setting_container, cls, args).commit();
    }

    public final void setCurrentSetting(int currentSetting) {
        if (currentSetting == 0) {
            replaceFragment$default(this, MenuSettingControlUiFragment.class, null, 2, null);
            return;
        }
        if (currentSetting == 1) {
            replaceFragment$default(this, MenuSettingSoundUiFragment.class, null, 2, null);
        } else if (currentSetting == 2) {
            replaceFragment$default(this, MenuSettingGraphicUiFragment.class, null, 2, null);
        } else {
            if (currentSetting != 10) {
                return;
            }
            replaceFragment(MenuSettingControlUiFragment.class, BundleKt.bundleOf(TuplesKt.m7112to(NewMenuConstants.NEW_MENU_SETTING_LAYOUT_SCROLL_TO_SWITCH_ARGS, Boolean.TRUE)));
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() throws JSONException {
        super.onStop();
        if (Intrinsics.areEqual(requireActivity().getClass(), JNIActivity.class)) {
            getMenuPauseViewModel().applyGameSettings();
        }
    }

    public final void setNullableParameters() {
        this.titleAdapter = null;
        this.settingsList.clear();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuSettingMainBinding getViewBinding() {
        FragmentMenuSettingMainBinding fragmentMenuSettingMainBindingInflate = FragmentMenuSettingMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentMenuSettingMainBindingInflate, "inflate(...)");
        return fragmentMenuSettingMainBindingInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        App.INSTANCE.appComponent().inject(this);
        super.onAttach(context);
    }

    public MenuSettingMainUiFragment() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingGraphicViewModel$2
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
        Function0<ViewModelProvider.Factory> function02 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingGraphicViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getMenuSettingGraphicVMFactory();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$1
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
        this.menuSettingGraphicViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingGraphicViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$3
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
        final Function0<ViewModelStoreOwner> function04 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingSoundViewModel$2
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
        Function0<ViewModelProvider.Factory> function05 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingSoundViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getMenuSettingSoundVMFactory();
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.menuSettingSoundViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingSoundViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function03;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function05);
        final Function0<ViewModelStoreOwner> function06 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingControlViewModel$2
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
        Function0<ViewModelProvider.Factory> function07 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingControlViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getMenuSettingControlVMFactory();
            }
        };
        final Lazy lazy3 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$9
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function06.invoke();
            }
        });
        this.menuSettingControlViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function08 = function03;
                if (function08 != null && (creationExtras = (CreationExtras) function08.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function07);
        final Function0<ViewModelStoreOwner> function08 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingWinterViewModel$2
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
        Function0<ViewModelProvider.Factory> function09 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuSettingWinterViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getMenuSettingWinterVMFactory();
            }
        };
        final Lazy lazy4 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$13
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function08.invoke();
            }
        });
        this.menuSettingWinterViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuSettingWinterViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$14
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function010 = function03;
                if (function010 != null && (creationExtras = (CreationExtras) function010.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function09);
        final Function0<ViewModelStoreOwner> function010 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuPauseViewModel$2
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
        Function0<ViewModelProvider.Factory> function011 = new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$menuPauseViewModel$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getMenuPauseViewModelVMFactory();
            }
        };
        final Lazy lazy5 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function010.invoke();
            }
        });
        this.menuPauseViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuPauseViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$18
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy5).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$special$$inlined$viewModels$default$19
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function012 = function03;
                if (function012 != null && (creationExtras = (CreationExtras) function012.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM14065viewModels$lambda1 = FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14065viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14065viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, function011);
        this.screenArgs = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment$screenArgs$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                Bundle arguments = this.this$0.getArguments();
                return Boolean.valueOf(BooleanExtensionKt.getOrFalse(arguments != null ? Boolean.valueOf(arguments.getBoolean(NewMenuConstants.NEW_MENU_SETTING_LAYOUT_WITH_CONTROL_ARGS)) : null));
            }
        });
        this.settingsList = new ArrayList();
    }
}
