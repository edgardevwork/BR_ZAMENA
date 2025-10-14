package com.blackhub.bronline.game.gui.donate.p011ui;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.p003ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.ProductDetails;
import com.blackhub.bronline.databinding.DonateCoinsDepositLayoutBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.core.JNIHelper;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapperKt;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.donate.adapters.DonateDepositCoinsAdapter;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.p011ui.UILayoutDonateDepositCoins;
import com.blackhub.bronline.game.gui.donate.utils.DonateDictionaryKt;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.p019ui.donate.DonateDepositCoinsRustoreUiKt;
import com.blackhub.bronline.game.p019ui.donate.DonateDepositCoinsUiKt;
import com.blackhub.bronline.game.p019ui.donate.ProductDetailsItem;
import com.blackhub.bronline.game.p019ui.donate.RustoreProductDetailsItem;
import com.blackhub.bronline.launcher.App;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.model.product.Product;

/* compiled from: UILayoutDonateDepositCoins.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUILayoutDonateDepositCoins.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UILayoutDonateDepositCoins.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateDepositCoins\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,352:1\n106#2,15:353\n106#2,15:368\n58#3,23:383\n93#3,3:406\n58#3,23:409\n93#3,3:432\n*S KotlinDebug\n*F\n+ 1 UILayoutDonateDepositCoins.kt\ncom/blackhub/bronline/game/gui/donate/ui/UILayoutDonateDepositCoins\n*L\n53#1:353,15\n54#1:368,15\n274#1:383,23\n274#1:406,3\n313#1:409,23\n313#1:432,3\n*E\n"})
/* loaded from: classes8.dex */
public final class UILayoutDonateDepositCoins extends BaseFragment<DonateCoinsDepositLayoutBinding> {
    public static final int $stable = 8;

    /* renamed from: depositCoinsViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy depositCoinsViewModel;

    @Nullable
    public Handler handlerConnect;

    /* renamed from: jniActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy jniActivityViewModel;

    public UILayoutDonateDepositCoins() {
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$depositCoinsViewModel$2
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
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$1
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
        this.depositCoinsViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DonateDepositCoinsViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$4
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
        final Function0<ViewModelStoreOwner> function03 = new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$jniActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return fragmentActivityRequireActivity;
            }
        };
        final Lazy lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$5
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
        this.jniActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(JNIActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m14065viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$special$$inlined$viewModels$default$8
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
    }

    public static final /* synthetic */ DonateCoinsDepositLayoutBinding access$getBinding(UILayoutDonateDepositCoins uILayoutDonateDepositCoins) {
        return uILayoutDonateDepositCoins.getBinding();
    }

    public final DonateDepositCoinsViewModel getDepositCoinsViewModel() {
        return (DonateDepositCoinsViewModel) this.depositCoinsViewModel.getValue();
    }

    public final JNIActivityViewModel getJniActivityViewModel() {
        return (JNIActivityViewModel) this.jniActivityViewModel.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public DonateCoinsDepositLayoutBinding getViewBinding() {
        DonateCoinsDepositLayoutBinding donateCoinsDepositLayoutBindingInflate = DonateCoinsDepositLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(donateCoinsDepositLayoutBindingInflate, "inflate(...)");
        return donateCoinsDepositLayoutBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        if (this.handlerConnect == null) {
            this.handlerConnect = new Handler(Looper.getMainLooper());
        }
        setupObservers();
        if (UtilsKt.isRustoreBuildVariant()) {
            getJniActivityViewModel().getRustoreBillingPurchasesWithoutRequirementAuthorization();
        }
        getBinding().sales.setVisibility(8);
        JNIHelper.fixEditTextForAndroid10Xiaomi(getBinding().value);
        JNIHelper.fixEditTextForAndroid10Xiaomi(getBinding().email);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Handler handler = this.handlerConnect;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.handlerConnect = null;
        super.onDestroyView();
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "value", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$1 */

    public static final class C38851 extends Lambda implements Function1<Boolean, Unit> {
        public C38851() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Boolean bool) {
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).hot.setVisibility(8);
            } else {
                UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).groupX2.setVisibility(8);
            }
        }
    }

    public final void setupObservers() {
        getDepositCoinsViewModel().getDoubleDonateLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.1
            public C38851() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Boolean bool) {
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).hot.setVisibility(8);
                } else {
                    UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).groupX2.setVisibility(8);
                }
            }
        }));
        getDepositCoinsViewModel().getEmailLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.2
            public C38862() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(String str) {
                UILayoutDonateDepositCoins uILayoutDonateDepositCoins = UILayoutDonateDepositCoins.this;
                Intrinsics.checkNotNull(str);
                uILayoutDonateDepositCoins.setEmailInEditText(str);
            }
        }));
        getDepositCoinsViewModel().getCoinsLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.3
            public C38873() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Integer num) {
                Intrinsics.checkNotNull(num);
                if (num.intValue() > 0) {
                    UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).sales.setText(UILayoutDonateDepositCoins.this.getString(R.string.donate_with_shares, UsefulKt.getPriceWithSpaces(num)));
                    UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).sales.setVisibility(0);
                } else {
                    UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).sales.setVisibility(8);
                }
            }
        }));
        getDepositCoinsViewModel().getInputCoinsLiveData().observe(getViewLifecycleOwner(), new UILayoutDonateDepositCoinsKt$sam$androidx_lifecycle_Observer$0(new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.4
            public C38884() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Integer num) {
                Intrinsics.checkNotNull(num);
                if (num.intValue() > 0) {
                    UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).value.setText(UILayoutDonateDepositCoins.this.getString(R.string.common_number_value, num));
                }
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38895(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38906(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38927(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C38948(null), 3, null);
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "emailString", "", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$2 */

    public static final class C38862 extends Lambda implements Function1<String, Unit> {
        public C38862() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(String str) {
            UILayoutDonateDepositCoins uILayoutDonateDepositCoins = UILayoutDonateDepositCoins.this;
            Intrinsics.checkNotNull(str);
            uILayoutDonateDepositCoins.setEmailInEditText(str);
        }
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "coins", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$3 */

    public static final class C38873 extends Lambda implements Function1<Integer, Unit> {
        public C38873() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Integer num) {
            Intrinsics.checkNotNull(num);
            if (num.intValue() > 0) {
                UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).sales.setText(UILayoutDonateDepositCoins.this.getString(R.string.donate_with_shares, UsefulKt.getPriceWithSpaces(num)));
                UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).sales.setVisibility(0);
            } else {
                UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).sales.setVisibility(8);
            }
        }
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "inputCoins", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$4 */

    public static final class C38884 extends Lambda implements Function1<Integer, Unit> {
        public C38884() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Integer num) {
            Intrinsics.checkNotNull(num);
            if (num.intValue() > 0) {
                UILayoutDonateDepositCoins.access$getBinding(UILayoutDonateDepositCoins.this).value.setText(UILayoutDonateDepositCoins.this.getString(R.string.common_number_value, num));
            }
        }
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$5", m7120f = "UILayoutDonateDepositCoins.kt", m7121i = {}, m7122l = {112}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$5 */
    /* loaded from: classes3.dex */
    public static final class C38895 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38895(Continuation<? super C38895> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonateDepositCoins.this.new C38895(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38895) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfigurationJsonModel> configurationJsons = UILayoutDonateDepositCoins.this.getJniActivityViewModel().getConfigurationJsons();
                Lifecycle lifecycle = UILayoutDonateDepositCoins.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(configurationJsons, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.5.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                        List<DonateItem> donateItemsFromJson = configurationJsonModel.getDonateItemsFromJson();
                        ArrayList arrayList = new ArrayList();
                        int size = donateItemsFromJson.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Integer type = donateItemsFromJson.get(i2).getType();
                            if (type != null && type.intValue() == 10) {
                                arrayList.add(UtilsKt.buildTypeMerge(donateItemsFromJson.get(i2).getHeader(), donateItemsFromJson.get(i2).getHeaderStore()));
                            }
                        }
                        UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).recyclerViewProposals.setAdapter(new DonateDepositCoinsAdapter(arrayList));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UILayoutDonateDepositCoins.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "configurationJsons", "Lcom/blackhub/bronline/game/core/model/ConfigurationJsonModel;", "emit", "(Lcom/blackhub/bronline/game/core/model/ConfigurationJsonModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$5$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((ConfigurationJsonModel) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull ConfigurationJsonModel configurationJsonModel, @NotNull Continuation<? super Unit> continuation) {
                List<DonateItem> donateItemsFromJson = configurationJsonModel.getDonateItemsFromJson();
                ArrayList arrayList = new ArrayList();
                int size = donateItemsFromJson.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Integer type = donateItemsFromJson.get(i2).getType();
                    if (type != null && type.intValue() == 10) {
                        arrayList.add(UtilsKt.buildTypeMerge(donateItemsFromJson.get(i2).getHeader(), donateItemsFromJson.get(i2).getHeaderStore()));
                    }
                }
                UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).recyclerViewProposals.setAdapter(new DonateDepositCoinsAdapter(arrayList));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6", m7120f = "UILayoutDonateDepositCoins.kt", m7121i = {}, m7122l = {132}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6 */
    /* loaded from: classes3.dex */
    public static final class C38906 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38906(Continuation<? super C38906> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonateDepositCoins.this.new C38906(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38906) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UILayoutDonateDepositCoins.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/ui/donate/RustoreProductDetailsItem;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<RustoreProductDetailsItem>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<RustoreProductDetailsItem> list, @NotNull Continuation<? super Unit> continuation) {
                UtilsKt.crashlyticsLog("funName=UILayoutDonateDepositCoins.setupObservers, isShowFragment=" + uILayoutDonateDepositCoins.getDepositCoinsViewModel().isShowFragment().getValue() + ",isRustoreBuildVariant()=" + UtilsKt.isRustoreBuildVariant() + ", isRuRegion()=" + UtilsKt.isRuRegion() + ", list.size=" + list.size() + ", isNeedShowDonatePackage=" + uILayoutDonateDepositCoins.getDepositCoinsViewModel().isNeedShowDonatePackage().getValue(), LogTagConstants.RUSTORE_BILLING_TAG);
                if (!uILayoutDonateDepositCoins.getDepositCoinsViewModel().isShowFragment().getValue().booleanValue() && UtilsKt.isRustoreBuildVariant() && (!list.isEmpty()) && uILayoutDonateDepositCoins.getDepositCoinsViewModel().isNeedShowDonatePackage().getValue().booleanValue()) {
                    Handler handler = uILayoutDonateDepositCoins.handlerConnect;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).cvDonateDepositCoins.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                    UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).mlDonateCoinsDeposit.setVisibility(8);
                    UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).progressBar.setVisibility(8);
                    UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).getRoot().setBackgroundColor(uILayoutDonateDepositCoins.requireContext().getColor(R.color.transparent));
                    ComposeView composeView = UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).cvDonateDepositCoins;
                    final UILayoutDonateDepositCoins uILayoutDonateDepositCoins = uILayoutDonateDepositCoins;
                    uILayoutDonateDepositCoins.getDepositCoinsViewModel().changeShowStateOfFragment(true);
                    composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1901173439, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6$1$1$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer, int i) {
                            if ((i & 11) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1901173439, i, -1, "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UILayoutDonateDepositCoins.kt:152)");
                                }
                                JNIActivityViewModel jniActivityViewModel = uILayoutDonateDepositCoins.getJniActivityViewModel();
                                final UILayoutDonateDepositCoins uILayoutDonateDepositCoins2 = uILayoutDonateDepositCoins;
                                DonateDepositCoinsRustoreUiKt.DonateDepositCoinsRustoreUi(jniActivityViewModel, new Function1<Product, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6$1$1$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Product product) {
                                        invoke2(product);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull Product productDetails) {
                                        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                                        RustoreBillingClientWrapper rustoreBillingClientWrapper = uILayoutDonateDepositCoins2.getJniActivityViewModel().getRustoreBillingClientWrapper();
                                        FragmentActivity fragmentActivityRequireActivity = uILayoutDonateDepositCoins2.requireActivity();
                                        String productId = productDetails.getProductId();
                                        Integer price = productDetails.getPrice();
                                        int orZero = IntExtensionKt.getOrZero(price != null ? Integer.valueOf(price.intValue() / 100) : null);
                                        Intrinsics.checkNotNull(fragmentActivityRequireActivity);
                                        rustoreBillingClientWrapper.purchaseProduct(productId, fragmentActivityRequireActivity, Integer.valueOf(orZero));
                                    }
                                }, composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }));
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
                StateFlow<List<RustoreProductDetailsItem>> rustoreProductDetailsState = UILayoutDonateDepositCoins.this.getJniActivityViewModel().getRustoreProductDetailsState();
                Lifecycle lifecycle = UILayoutDonateDepositCoins.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(rustoreProductDetailsState, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.6.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<RustoreProductDetailsItem>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull List<RustoreProductDetailsItem> list, @NotNull Continuation<? super Unit> continuation) {
                        UtilsKt.crashlyticsLog("funName=UILayoutDonateDepositCoins.setupObservers, isShowFragment=" + uILayoutDonateDepositCoins.getDepositCoinsViewModel().isShowFragment().getValue() + ",isRustoreBuildVariant()=" + UtilsKt.isRustoreBuildVariant() + ", isRuRegion()=" + UtilsKt.isRuRegion() + ", list.size=" + list.size() + ", isNeedShowDonatePackage=" + uILayoutDonateDepositCoins.getDepositCoinsViewModel().isNeedShowDonatePackage().getValue(), LogTagConstants.RUSTORE_BILLING_TAG);
                        if (!uILayoutDonateDepositCoins.getDepositCoinsViewModel().isShowFragment().getValue().booleanValue() && UtilsKt.isRustoreBuildVariant() && (!list.isEmpty()) && uILayoutDonateDepositCoins.getDepositCoinsViewModel().isNeedShowDonatePackage().getValue().booleanValue()) {
                            Handler handler = uILayoutDonateDepositCoins.handlerConnect;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                            }
                            UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).cvDonateDepositCoins.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                            UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).mlDonateCoinsDeposit.setVisibility(8);
                            UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).progressBar.setVisibility(8);
                            UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).getRoot().setBackgroundColor(uILayoutDonateDepositCoins.requireContext().getColor(R.color.transparent));
                            ComposeView composeView = UILayoutDonateDepositCoins.access$getBinding(uILayoutDonateDepositCoins).cvDonateDepositCoins;
                            final UILayoutDonateDepositCoins uILayoutDonateDepositCoins = uILayoutDonateDepositCoins;
                            uILayoutDonateDepositCoins.getDepositCoinsViewModel().changeShowStateOfFragment(true);
                            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1901173439, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6$1$1$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer, int i2) {
                                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1901173439, i2, -1, "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UILayoutDonateDepositCoins.kt:152)");
                                        }
                                        JNIActivityViewModel jniActivityViewModel = uILayoutDonateDepositCoins.getJniActivityViewModel();
                                        final UILayoutDonateDepositCoins uILayoutDonateDepositCoins2 = uILayoutDonateDepositCoins;
                                        DonateDepositCoinsRustoreUiKt.DonateDepositCoinsRustoreUi(jniActivityViewModel, new Function1<Product, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$6$1$1$1.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Product product) {
                                                invoke2(product);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull Product productDetails) {
                                                Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                                                RustoreBillingClientWrapper rustoreBillingClientWrapper = uILayoutDonateDepositCoins2.getJniActivityViewModel().getRustoreBillingClientWrapper();
                                                FragmentActivity fragmentActivityRequireActivity = uILayoutDonateDepositCoins2.requireActivity();
                                                String productId = productDetails.getProductId();
                                                Integer price = productDetails.getPrice();
                                                int orZero = IntExtensionKt.getOrZero(price != null ? Integer.valueOf(price.intValue() / 100) : null);
                                                Intrinsics.checkNotNull(fragmentActivityRequireActivity);
                                                rustoreBillingClientWrapper.purchaseProduct(productId, fragmentActivityRequireActivity, Integer.valueOf(orZero));
                                            }
                                        }, composer, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer.skipToGroupEnd();
                                }
                            }));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7", m7120f = "UILayoutDonateDepositCoins.kt", m7121i = {}, m7122l = {173}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7 */
    /* loaded from: classes3.dex */
    public static final class C38927 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38927(Continuation<? super C38927> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonateDepositCoins.this.new C38927(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38927) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<List<ProductDetailsItem>> productDetailsState = UILayoutDonateDepositCoins.this.getJniActivityViewModel().getProductDetailsState();
                Lifecycle lifecycle = UILayoutDonateDepositCoins.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(productDetailsState, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UILayoutDonateDepositCoins.this);
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UILayoutDonateDepositCoins.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/ui/donate/ProductDetailsItem;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ UILayoutDonateDepositCoins this$0;

            public AnonymousClass1(UILayoutDonateDepositCoins uILayoutDonateDepositCoins) {
                this.this$0 = uILayoutDonateDepositCoins;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<ProductDetailsItem>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<ProductDetailsItem> list, @NotNull Continuation<? super Unit> continuation) {
                UtilsKt.crashlyticsLog("funName=UILayoutDonateDepositCoins.setupObservers, isShowFragment=" + this.this$0.getDepositCoinsViewModel().isShowFragment().getValue() + ",isMarketBuildVariant()=" + UtilsKt.isMarketBuildVariant() + ", isRuRegion()=" + UtilsKt.isRuRegion() + ", list.size=" + list.size() + ", isNeedShowDonatePackage=" + this.this$0.getDepositCoinsViewModel().isNeedShowDonatePackage().getValue(), LogTagConstants.MARKET_BILLING_TAG);
                if (!this.this$0.getDepositCoinsViewModel().isShowFragment().getValue().booleanValue()) {
                    if (UtilsKt.isMarketBuildVariant() && !UtilsKt.isRuRegion() && (!list.isEmpty()) && this.this$0.getDepositCoinsViewModel().isNeedShowDonatePackage().getValue().booleanValue()) {
                        Handler handler = this.this$0.handlerConnect;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                        UILayoutDonateDepositCoins.access$getBinding(this.this$0).cvDonateDepositCoins.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                        UILayoutDonateDepositCoins.access$getBinding(this.this$0).mlDonateCoinsDeposit.setVisibility(8);
                        UILayoutDonateDepositCoins.access$getBinding(this.this$0).progressBar.setVisibility(8);
                        UILayoutDonateDepositCoins.access$getBinding(this.this$0).getRoot().setBackgroundColor(this.this$0.requireContext().getColor(R.color.transparent));
                        ComposeView composeView = UILayoutDonateDepositCoins.access$getBinding(this.this$0).cvDonateDepositCoins;
                        final UILayoutDonateDepositCoins uILayoutDonateDepositCoins = this.this$0;
                        uILayoutDonateDepositCoins.getDepositCoinsViewModel().changeShowStateOfFragment(true);
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1499858946, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1$1$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1499858946, i, -1, "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UILayoutDonateDepositCoins.kt:190)");
                                    }
                                    JNIActivityViewModel jniActivityViewModel = uILayoutDonateDepositCoins.getJniActivityViewModel();
                                    final UILayoutDonateDepositCoins uILayoutDonateDepositCoins2 = uILayoutDonateDepositCoins;
                                    DonateDepositCoinsUiKt.DonateDepositCoinsUi(jniActivityViewModel, new Function1<ProductDetails, Unit>() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1$1$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ProductDetails productDetails) {
                                            invoke2(productDetails);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ProductDetails productDetails) {
                                            Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                                            BillingClientWrapper billingClientWrapper = uILayoutDonateDepositCoins2.getJniActivityViewModel().getBillingClientWrapper();
                                            FragmentActivity fragmentActivityRequireActivity = uILayoutDonateDepositCoins2.requireActivity();
                                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                            billingClientWrapper.purchase(fragmentActivityRequireActivity, productDetails);
                                        }
                                    }, composer, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }));
                    } else if (!UtilsKt.isMarketBuildVariant() || UtilsKt.isRuRegion() || !list.isEmpty() || !this.this$0.getDepositCoinsViewModel().isNeedShowDonatePackage().getValue().booleanValue()) {
                        this.this$0.showOldUIWithEmail();
                    } else {
                        Handler handler2 = this.this$0.handlerConnect;
                        if (handler2 != null) {
                            final UILayoutDonateDepositCoins uILayoutDonateDepositCoins2 = this.this$0;
                            Boxing.boxBoolean(handler2.postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$7$1$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    UILayoutDonateDepositCoins.C38927.AnonymousClass1.emit$lambda$1(uILayoutDonateDepositCoins2);
                                }
                            }, BillingClientWrapperKt.MAX_TIMER_FOR_REQUESTS));
                        }
                    }
                }
                return Unit.INSTANCE;
            }

            public static final void emit$lambda$1(UILayoutDonateDepositCoins this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UtilsKt.crashlyticsRecordNewException("funName=UILayoutDonateDepositCoins.setupObservers, productDetailsState empty, isWithMarketBilling. Show old UI", LogTagConstants.MARKET_BILLING_TAG);
                this$0.showOldUIWithEmail();
            }
        }
    }

    /* compiled from: UILayoutDonateDepositCoins.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$8", m7120f = "UILayoutDonateDepositCoins.kt", m7121i = {}, m7122l = {224}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$8 */
    /* loaded from: classes3.dex */
    public static final class C38948 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38948(Continuation<? super C38948> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UILayoutDonateDepositCoins.this.new C38948(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38948) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsNeedCloseFragment = UILayoutDonateDepositCoins.this.getDepositCoinsViewModel().isNeedCloseFragment();
                Lifecycle lifecycle = UILayoutDonateDepositCoins.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(stateFlowIsNeedCloseFragment, lifecycle, Lifecycle.State.STARTED);
                AnonymousClass1 anonymousClass1 = new FlowCollector() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins.setupObservers.8.1
                    public AnonymousClass1() {
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            uILayoutDonateDepositCoins.getDepositCoinsViewModel().changeShowStateOfFragment(false);
                            uILayoutDonateDepositCoins.getDepositCoinsViewModel().closeDepositCoinsFragment(false);
                            Fragment fragmentFindFragmentByTag = uILayoutDonateDepositCoins.getParentFragmentManager().findFragmentByTag(DonateDictionaryKt.getFragmentId(9));
                            if (fragmentFindFragmentByTag != null) {
                                FragmentTransaction fragmentTransactionBeginTransaction = uILayoutDonateDepositCoins.getParentFragmentManager().beginTransaction();
                                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
                                fragmentTransactionBeginTransaction.commit();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UILayoutDonateDepositCoins.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "isNeedClose", "", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setupObservers$8$1 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                if (z) {
                    uILayoutDonateDepositCoins.getDepositCoinsViewModel().changeShowStateOfFragment(false);
                    uILayoutDonateDepositCoins.getDepositCoinsViewModel().closeDepositCoinsFragment(false);
                    Fragment fragmentFindFragmentByTag = uILayoutDonateDepositCoins.getParentFragmentManager().findFragmentByTag(DonateDictionaryKt.getFragmentId(9));
                    if (fragmentFindFragmentByTag != null) {
                        FragmentTransaction fragmentTransactionBeginTransaction = uILayoutDonateDepositCoins.getParentFragmentManager().beginTransaction();
                        fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
                        fragmentTransactionBeginTransaction.commit();
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void showOldUIWithEmail() {
        getBinding().mlDonateCoinsDeposit.setVisibility(0);
        getBinding().progressBar.setVisibility(8);
        setOnPriceEnteredListener();
        setOnEmailEnteredListener();
        initOnButtonClickListener();
    }

    public final void initOnButtonClickListener() {
        getBinding().button.setOnClickListener(new View.OnClickListener() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UILayoutDonateDepositCoins.initOnButtonClickListener$lambda$0(this.f$0, view);
            }
        });
    }

    public static final void initOnButtonClickListener$lambda$0(UILayoutDonateDepositCoins this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Integer value = this$0.getDepositCoinsViewModel().getServerNumberLiveData().getValue();
            String value2 = this$0.getDepositCoinsViewModel().getNicknameLiveData().getValue();
            String str = "https://blessrussia.online/donate_v2/pay_choice.php?is_mobile=true&server=server" + value + "&account=" + ((Object) value2) + "&mail=" + StringsKt__StringsJVMKt.replace$default(this$0.getBinding().email.getText().toString(), "@", "%40", false, 4, (Object) null) + "&summa=" + ((Object) this$0.getBinding().value.getText());
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
            customTabsIntentBuild.launchUrl(this$0.requireActivity(), Uri.parse(str));
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            Toast.makeText(App.INSTANCE.getInstance(), this$0.requireActivity().getString(R.string.error_message_about_browser), 1).show();
        }
    }

    public final void setOnPriceEnteredListener() {
        EditText value = getBinding().value;
        Intrinsics.checkNotNullExpressionValue(value, "value");
        value.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setOnPriceEnteredListener$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) throws NumberFormatException {
                if (s == null || s.length() <= 0) {
                    this.this$0.setButtonEnabled(false);
                    UILayoutDonateDepositCoins.access$getBinding(this.this$0).button.setText(this.this$0.getString(R.string.common_string_with_ruble, "0"));
                    return;
                }
                int i = Integer.parseInt(s.toString());
                int iDigitToInt = 0;
                for (int i2 = 0; i2 < s.length(); i2++) {
                    iDigitToInt += CharsKt__CharKt.digitToInt(s.charAt(i2));
                }
                Editable text = UILayoutDonateDepositCoins.access$getBinding(this.this$0).email.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() <= 0 || iDigitToInt <= 0) {
                    this.this$0.setButtonEnabled(false);
                    UILayoutDonateDepositCoins.access$getBinding(this.this$0).button.setText(this.this$0.getString(R.string.common_string_with_ruble, "0"));
                } else {
                    this.this$0.setButtonEnabled(true);
                    if (!this.this$0.getDepositCoinsViewModel().sendBuyTokens(i)) {
                        this.this$0.setButtonEnabled(false);
                    }
                }
                UILayoutDonateDepositCoins.access$getBinding(this.this$0).button.setText(this.this$0.getString(R.string.common_string_with_ruble, UsefulKt.getPriceWithSpaces(Integer.valueOf(i))));
            }
        });
    }

    public final void setOnEmailEnteredListener() {
        EditText email = getBinding().email;
        Intrinsics.checkNotNullExpressionValue(email, "email");
        email.addTextChangedListener(new TextWatcher() { // from class: com.blackhub.bronline.game.gui.donate.ui.UILayoutDonateDepositCoins$setOnEmailEnteredListener$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void afterTextChanged(@Nullable Editable s) {
                if (s == null || s.length() <= 0) {
                    this.this$0.setButtonEnabled(false);
                } else {
                    Editable text = UILayoutDonateDepositCoins.access$getBinding(this.this$0).value.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    if (text.length() > 0) {
                        this.this$0.setButtonEnabled(true);
                    }
                }
                Preferences.putString(App.INSTANCE.getInstance(), Preferences.EMAIL, String.valueOf(s));
            }
        });
    }

    public final void setButtonEnabled(boolean enable) {
        AppCompatButton appCompatButton = getBinding().button;
        if (enable) {
            appCompatButton.setBackground(ResourcesCompat.getDrawable(requireContext().getResources(), R.drawable.bg_button_red_cr5_t1_white, null));
            appCompatButton.setEnabled(true);
        } else {
            appCompatButton.setBackground(ResourcesCompat.getDrawable(requireContext().getResources(), R.drawable.bg_button_gray_cr5_t1_white, null));
            appCompatButton.setEnabled(false);
        }
    }

    public final void setEmailInEditText(String emailString) {
        if (!Intrinsics.areEqual(emailString, "0")) {
            getBinding().email.setText(emailString);
            return;
        }
        String string = Preferences.getString(App.INSTANCE.getInstance(), Preferences.EMAIL);
        if (string != null) {
            getBinding().email.setText(string);
        }
    }
}

