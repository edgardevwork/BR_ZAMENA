package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.databinding.FragmentMenuMapBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.JNILib;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: MenuMapUi.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMenuMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuMapUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuMapUi\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,75:1\n106#2,15:76\n*S KotlinDebug\n*F\n+ 1 MenuMapUi.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/ui/MenuMapUi\n*L\n14#1:76,15\n*E\n"})
/* loaded from: classes.dex */
public final class MenuMapUi extends BaseFragment<FragmentMenuMapBinding> {
    public static final int $stable = 8;

    /* renamed from: pauseViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy pauseViewModel;

    public MenuMapUi() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$pauseViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$1
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
        this.pauseViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MenuPauseViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$special$$inlined$viewModels$default$4
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
    }

    public final MenuPauseViewModel getPauseViewModel() {
        return (MenuPauseViewModel) this.pauseViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentMenuMapBinding getViewBinding() {
        FragmentMenuMapBinding fragmentMenuMapBindingInflate = FragmentMenuMapBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentMenuMapBindingInflate, "inflate(...)");
        return fragmentMenuMapBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        onButtonBackSetOnClickListener();
        onMapSetOnTouchListener();
        JNILib.toggleDrawing2dStuff(false);
    }

    /* compiled from: MenuMapUi.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$onButtonBackSetOnClickListener$1 */
    public static final class C43151 extends Lambda implements Function0<Unit> {
        public C43151() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws JSONException {
            MenuMapUi.this.getPauseViewModel().actionsWithJSONClickButton(2);
            MenuMapUi.this.requireParentFragment().getChildFragmentManager().beginTransaction().remove(MenuMapUi.this).commit();
            MenuMapUi.this.getPauseViewModel().buttonClicked(0);
        }
    }

    public final void onButtonBackSetOnClickListener() {
        AppCompatButton newMenuMapButtonBackToMenu = getBinding().newMenuMapButtonBackToMenu;
        Intrinsics.checkNotNullExpressionValue(newMenuMapButtonBackToMenu, "newMenuMapButtonBackToMenu");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, newMenuMapButtonBackToMenu, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi.onButtonBackSetOnClickListener.1
            public C43151() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws JSONException {
                MenuMapUi.this.getPauseViewModel().actionsWithJSONClickButton(2);
                MenuMapUi.this.requireParentFragment().getChildFragmentManager().beginTransaction().remove(MenuMapUi.this).commit();
                MenuMapUi.this.getPauseViewModel().buttonClicked(0);
            }
        }, 1, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void onMapSetOnTouchListener() {
        getBinding().getRoot().setOnTouchListener(new View.OnTouchListener() { // from class: com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuMapUi$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MenuMapUi.onMapSetOnTouchListener$lambda$0(view, motionEvent);
            }
        });
    }

    public static final boolean onMapSetOnTouchListener$lambda$0(View view, MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 0;
        int x3 = 0;
        int y3 = 0;
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (pointerId == 0) {
                x = (int) motionEvent.getX(i);
                y = (int) motionEvent.getY(i);
            } else if (pointerId == 1) {
                x2 = (int) motionEvent.getX(i);
                y2 = (int) motionEvent.getY(i);
            } else if (pointerId == 2) {
                x3 = (int) motionEvent.getX(i);
                y3 = (int) motionEvent.getY(i);
            }
        }
        JNILib.multiTouchEvent(motionEvent.getActionMasked(), motionEvent.getPointerId(motionEvent.getActionIndex()), x, y, x2, y2, x3, y3);
        return true;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        JNILib.toggleDrawing2dStuff(true);
        super.onDestroyView();
    }
}

