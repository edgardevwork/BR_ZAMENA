package com.blackhub.bronline.launcher.fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.databinding.FragmentInitializationBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.launcher.data.MyFile;
import com.blackhub.bronline.launcher.dialogs.LauncherUpdateAvailableDialog;
import com.blackhub.bronline.launcher.dialogs.PrivacyPolicyDialog;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InitializationFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020$H\u0003J\u0018\u0010'\u001a\u00020$2\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0)H\u0002J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\b\u0010/\u001a\u00020\u0002H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u00101\u001a\u00020$H\u0016J\b\u00102\u001a\u00020$H\u0002J\u0010\u00103\u001a\u0002042\u0006\u0010,\u001a\u00020\u001cH\u0002J\b\u00105\u001a\u00020$H\u0016J\b\u00106\u001a\u00020$H\u0016J\b\u00107\u001a\u00020$H\u0002J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u0015H\u0002J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020$H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/fragments/InitializationFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentInitializationBinding;", "()V", "alertDialog", "Landroid/app/AlertDialog;", "alertDialogBuilder", "Landroid/app/AlertDialog$Builder;", "mainActivityViewModel", "Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "privacyPolicyDialog", "Lcom/blackhub/bronline/launcher/dialogs/PrivacyPolicyDialog;", "getPrivacyPolicyDialog", "()Lcom/blackhub/bronline/launcher/dialogs/PrivacyPolicyDialog;", "privacyPolicyDialog$delegate", "requestWritePermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "thisActivity", "Landroidx/fragment/app/FragmentActivity;", "getThisActivity", "()Landroidx/fragment/app/FragmentActivity;", "thisActivity$delegate", "thisContext", "Landroid/content/Context;", "getThisContext", "()Landroid/content/Context;", "thisContext$delegate", "unknownAppPermissionResult", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "alertViewStorage", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "askPermissionToInstallFromUnknownSource", "changeFragment", FeatureParser.PluginHandler.FRAGMENT, "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "clearImageCache", "context", "createIntentAndLaunchUpdate", "freeMemory", "getViewBinding", "initRequestPermissionLauncher", "initViews", "installApk", "isExternalStorageAvailable", "", "onDestroyView", "onResume", "setObservers", "showErrorResponseDialog", "throwableMessage", "startPermissionRequestAndUpdateFiles", "updateFiles", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nInitializationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationFragment.kt\ncom/blackhub/bronline/launcher/fragments/InitializationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,421:1\n172#2,9:422\n13309#3,2:431\n*S KotlinDebug\n*F\n+ 1 InitializationFragment.kt\ncom/blackhub/bronline/launcher/fragments/InitializationFragment\n*L\n53#1:422,9\n208#1:431,2\n*E\n"})
/* loaded from: classes8.dex */
public final class InitializationFragment extends BaseFragment<FragmentInitializationBinding> {
    public static final int $stable = 8;

    @Nullable
    public AlertDialog alertDialog;

    @Nullable
    public AlertDialog.Builder alertDialogBuilder;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    @Nullable
    public ActivityResultLauncher<String> requestWritePermissionLauncher;

    @NotNull
    public final ActivityResultLauncher<Intent> unknownAppPermissionResult;

    /* renamed from: thisActivity$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy thisActivity = LazyKt__LazyJVMKt.lazy(new Function0<FragmentActivity>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$thisActivity$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FragmentActivity invoke() {
            return this.this$0.requireActivity();
        }
    });

    /* renamed from: thisContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy thisContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$thisContext$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Context invoke() {
            return this.this$0.requireContext();
        }
    });

    /* renamed from: privacyPolicyDialog$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy privacyPolicyDialog = LazyKt__LazyJVMKt.lazy(new Function0<PrivacyPolicyDialog>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$privacyPolicyDialog$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final PrivacyPolicyDialog invoke() {
            FragmentActivity thisActivity = this.this$0.getThisActivity();
            Intrinsics.checkNotNullExpressionValue(thisActivity, "access$getThisActivity(...)");
            return new PrivacyPolicyDialog(thisActivity);
        }
    });

    public static final /* synthetic */ FragmentInitializationBinding access$getBinding(InitializationFragment initializationFragment) {
        return initializationFragment.getBinding();
    }

    public final FragmentActivity getThisActivity() {
        return (FragmentActivity) this.thisActivity.getValue();
    }

    public final Context getThisContext() {
        return (Context) this.thisContext.getValue();
    }

    public final PrivacyPolicyDialog getPrivacyPolicyDialog() {
        return (PrivacyPolicyDialog) this.privacyPolicyDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainActivityViewModel getMainActivityViewModel() {
        return (MainActivityViewModel) this.mainActivityViewModel.getValue();
    }

    public static final void unknownAppPermissionResult$lambda$0(InitializationFragment this$0, ActivityResult activityResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int resultCode = activityResult.getResultCode();
        if (resultCode == -1) {
            this$0.createIntentAndLaunchUpdate();
        } else if (resultCode == 0 && (activity = this$0.getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        super.initViews();
        this.requestWritePermissionLauncher = initRequestPermissionLauncher();
        MainActivityViewModel mainActivityViewModel = getMainActivityViewModel();
        File externalFilesDir = getThisContext().getExternalFilesDir(null);
        mainActivityViewModel.setGamePath(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        setObservers();
        if (!Preferences.getBoolean(getThisContext(), Preferences.PRIVACY)) {
            UtilsKt.crashlyticsLog("privacyPolicyDialog.show()");
            getPrivacyPolicyDialog().show();
        }
        if (Preferences.getInteger(getThisContext(), Preferences.PREVIOUS_VERSION) != 1132) {
            Context thisContext = getThisContext();
            Intrinsics.checkNotNullExpressionValue(thisContext, "<get-thisContext>(...)");
            clearImageCache(thisContext);
            Preferences.putInteger(getThisContext(), Preferences.PREVIOUS_VERSION, BuildConfig.VERSION_CODE);
        }
        startPermissionRequestAndUpdateFiles();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentInitializationBinding getViewBinding() {
        FragmentInitializationBinding fragmentInitializationBindingInflate = FragmentInitializationBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentInitializationBindingInflate, "inflate(...)");
        return fragmentInitializationBindingInflate;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        freeMemory();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.alertDialogBuilder = null;
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.alertDialog = null;
    }

    public final void updateFiles() {
        getMainActivityViewModel().checkAppVersion();
    }

    /* compiled from: InitializationFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.fragments.InitializationFragment$setObservers$1", m7120f = "InitializationFragment.kt", m7121i = {}, m7122l = {109}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.fragments.InitializationFragment$setObservers$1 */
    public static final class C65331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65331(Continuation<? super C65331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InitializationFragment.this.new C65331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<String> descriptionForFragmentInitialization = InitializationFragment.this.getMainActivityViewModel().getDescriptionForFragmentInitialization();
                Lifecycle lifecycle = InitializationFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(descriptionForFragmentInitialization, lifecycle, Lifecycle.State.STARTED);
                final InitializationFragment initializationFragment = InitializationFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment.setObservers.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
                        if (str.length() > 0) {
                            InitializationFragment.access$getBinding(initializationFragment).loadingText.setText(str);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    private final void setObservers() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C65331(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C65342(null), 3, null);
        getMainActivityViewModel().getFilesLiveData().observe(this, new InitializationFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<MyFile>, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment.setObservers.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<MyFile> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<MyFile> list) {
                UtilsKt.crashlyticsLog("InitializationFragment setObservers filesLiveData");
                if (list.size() > 0) {
                    UtilsKt.crashlyticsLog("InitializationFragment (myFiles.size > ZERO_INT");
                    InitializationFragment.this.changeFragment(LoaderFragment.class);
                } else {
                    UtilsKt.crashlyticsLog("else block for (myFiles.size > 0), startActivity(JNIActivity)");
                    InitializationFragment.this.getMainActivityViewModel().deleteFilesNotFromList();
                    InitializationFragment.this.getMainActivityViewModel().m15136getBgImage();
                    InitializationFragment.this.changeFragment(MainFragment.class);
                }
            }
        }));
        getMainActivityViewModel().getOnErrorResponse().observe(this, new InitializationFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment.setObservers.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                InitializationFragment initializationFragment = InitializationFragment.this;
                Intrinsics.checkNotNull(str);
                initializationFragment.showErrorResponseDialog(str);
                UtilsKt.crashlyticsRecordNewException("InitializationFragment. NO internet. " + str);
            }
        }));
        getMainActivityViewModel().isActualVersion().observe(this, new InitializationFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment.setObservers.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Boolean bool) {
                if (bool != null) {
                    final InitializationFragment initializationFragment = InitializationFragment.this;
                    boolean zBooleanValue = bool.booleanValue();
                    UtilsKt.crashlyticsLog("InitializationFragment lifecycleScope.launch");
                    if (zBooleanValue) {
                        UtilsKt.crashlyticsLog("InitializationFragment LauncherVersion is Actual ");
                        Context thisContext = initializationFragment.getThisContext();
                        Intrinsics.checkNotNullExpressionValue(thisContext, "access$getThisContext(...)");
                        if (initializationFragment.isExternalStorageAvailable(thisContext)) {
                            UtilsKt.crashlyticsLog("InitializationFragment ExternalStorage is Available");
                            initializationFragment.getMainActivityViewModel().checkUpdate();
                            return;
                        }
                        UtilsKt.crashlyticsLog("InitializationFragment ExternalStorage is NOT Available activity?.finish");
                        FragmentActivity activity = initializationFragment.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    }
                    UtilsKt.crashlyticsLog("InitializationFragment LauncherVersion is NOT Actual ");
                    Context thisContext2 = initializationFragment.getThisContext();
                    Intrinsics.checkNotNullExpressionValue(thisContext2, "access$getThisContext(...)");
                    LauncherUpdateAvailableDialog launcherUpdateAvailableDialog = new LauncherUpdateAvailableDialog(thisContext2);
                    launcherUpdateAvailableDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$setObservers$5$1$2$1
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
                            UtilsKt.crashlyticsLog("LauncherUpdateAvailableDialog onOkButtonClickListener");
                            initializationFragment.installApk();
                        }
                    });
                    launcherUpdateAvailableDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$setObservers$5$1$2$2
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
                            UtilsKt.crashlyticsLog("LauncherUpdateAvailableDialog onCancelButtonClickListener");
                            FragmentActivity activity2 = initializationFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                        }
                    });
                    launcherUpdateAvailableDialog.show();
                }
            }
        }));
    }

    /* compiled from: InitializationFragment.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.fragments.InitializationFragment$setObservers$2", m7120f = "InitializationFragment.kt", m7121i = {}, m7122l = {120}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.fragments.InitializationFragment$setObservers$2 */
    public static final class C65342 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65342(Continuation<? super C65342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InitializationFragment.this.new C65342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsNeedToCloseApp = InitializationFragment.this.getMainActivityViewModel().isNeedToCloseApp();
                Lifecycle lifecycle = InitializationFragment.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(stateFlowIsNeedToCloseApp, lifecycle, Lifecycle.State.STARTED);
                final InitializationFragment initializationFragment = InitializationFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment.setObservers.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (z) {
                            initializationFragment.getThisActivity().finishAffinity();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFlowWithLifecycle.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void clearImageCache(Context context) {
        File[] fileArrListFiles;
        UtilsKt.crashlyticsLog("clearImageCache: CLEAR START");
        try {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && (fileArrListFiles = cacheDir.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    if (file.isFile() && file.exists()) {
                        if (file.delete()) {
                            UtilsKt.crashlyticsLog("clearImageCache: file  " + file.getName() + " deleted");
                        } else {
                            UtilsKt.crashlyticsRecordNewException("Failed to delete file: " + file.getName() + " in clearImageCache()");
                        }
                    }
                }
            }
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("Failed to clearImageCache() throw: " + e);
        }
        UtilsKt.crashlyticsLog("clearImageCache: CLEAR END");
    }

    public final void freeMemory() {
        File externalFilesDir;
        try {
            FragmentActivity activity = getActivity();
            String absolutePath = null;
            if (activity != null && (externalFilesDir = activity.getExternalFilesDir(null)) != null) {
                absolutePath = externalFilesDir.getAbsolutePath();
            }
            StatFs statFs = new StatFs(absolutePath);
            long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
            UtilsKt.crashlyticsLog("InitializationFragment freeMemory " + availableBlocksLong);
            getMainActivityViewModel().setFreeSpace(availableBlocksLong);
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("free memory exception " + e);
        }
    }

    public final ActivityResultLauncher<String> initRequestPermissionLauncher() {
        UtilsKt.crashlyticsLog("initRequestPermissionLauncher");
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                InitializationFragment.initRequestPermissionLauncher$lambda$2(this.f$0, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void initRequestPermissionLauncher$lambda$2(InitializationFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue() || Build.VERSION.SDK_INT >= 33) {
            UtilsKt.crashlyticsLog("WRITE_EXTERNAL_STORAGE permission granted");
            this$0.updateFiles();
        } else {
            if (!this$0.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                UtilsKt.crashlyticsLog("WRITE_EXTERNAL_STORAGE permission NOT granted, shouldShowRequestPermissionRationale");
                String string = this$0.getString(R.string.launcher_permission_no_permission_go_settings);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                this$0.alertViewStorage(string);
                return;
            }
            UtilsKt.crashlyticsLog("WRITE_EXTERNAL_STORAGE permission NOT granted, NOT shouldShowRequestPermissionRationale");
            String string2 = this$0.getString(R.string.launcher_permission_no_permission_retry);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this$0.alertViewStorage(string2);
        }
    }

    private final void alertViewStorage(String message) {
        AlertDialog.Builder cancelable;
        AlertDialog.Builder inverseBackgroundForced;
        AlertDialog.Builder message2;
        AlertDialog.Builder negativeButton;
        UtilsKt.crashlyticsLog("alertViewStorage message " + message);
        if (AnyExtensionKt.isNull(this.alertDialogBuilder)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getThisContext(), R.style.MyTheme);
            this.alertDialogBuilder = builder;
            AlertDialog.Builder title = builder.setTitle(getString(R.string.launcher_error_access_to_storage_is_forbidden));
            if (title != null && (cancelable = title.setCancelable(false)) != null && (inverseBackgroundForced = cancelable.setInverseBackgroundForced(true)) != null && (message2 = inverseBackgroundForced.setMessage(message)) != null && (negativeButton = message2.setNegativeButton(getString(R.string.common_yes), new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InitializationFragment.alertViewStorage$lambda$3(this.f$0, dialogInterface, i);
                }
            })) != null) {
                negativeButton.setPositiveButton(getString(R.string.common_no), new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$$ExternalSyntheticLambda4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        InitializationFragment.alertViewStorage$lambda$4(this.f$0, dialogInterface, i);
                    }
                });
            }
        }
        if (AnyExtensionKt.isNull(this.alertDialog)) {
            AlertDialog.Builder builder2 = this.alertDialogBuilder;
            this.alertDialog = builder2 != null ? builder2.create() : null;
        }
        AlertDialog alertDialog = this.alertDialog;
        if (alertDialog != null) {
            alertDialog.show();
        }
    }

    public static final void alertViewStorage$lambda$3(InitializationFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UtilsKt.crashlyticsLog("alertViewStorage NegativeButton (common_yes)");
        dialogInterface.dismiss();
        if (!this$0.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts(BundleInfo.PACKAGE_TYPE, this$0.getThisContext().getPackageName(), null));
            this$0.getThisActivity().startActivity(intent);
            return;
        }
        this$0.startPermissionRequestAndUpdateFiles();
    }

    public static final void alertViewStorage$lambda$4(InitializationFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UtilsKt.crashlyticsLog("alertViewStorage PositiveButton (common_no)");
        dialogInterface.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isExternalStorageAvailable(Context context) {
        boolean z;
        try {
            File externalFilesDir = context.getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            if (absolutePath != null) {
                z = StringsKt__StringsJVMKt.isBlank(absolutePath);
            }
            return !z;
        } catch (Exception e) {
            UtilsKt.crashlyticsRecordNewException("isExternalStorageAvailable " + e);
            Toast.makeText(context, context.getResources().getString(R.string.fragment_main_no_external_storage), 1).show();
            return false;
        }
    }

    public final void startPermissionRequestAndUpdateFiles() {
        if (this.requestWritePermissionLauncher == null) {
            UtilsKt.crashlyticsLog("requestWritePermissionLauncher is NULL");
            ActivityResultLauncher<String> activityResultLauncherInitRequestPermissionLauncher = initRequestPermissionLauncher();
            this.requestWritePermissionLauncher = activityResultLauncherInitRequestPermissionLauncher;
            if (activityResultLauncherInitRequestPermissionLauncher != null) {
                activityResultLauncherInitRequestPermissionLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
            return;
        }
        UtilsKt.crashlyticsLog("requestWritePermissionLauncher is NOT NULL");
        ActivityResultLauncher<String> activityResultLauncher = this.requestWritePermissionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    public final void installApk() {
        UtilsKt.crashlyticsLog("installApk");
        try {
            if (Build.VERSION.SDK_INT >= 26 && !getThisContext().getPackageManager().canRequestPackageInstalls()) {
                askPermissionToInstallFromUnknownSource();
            } else {
                createIntentAndLaunchUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getThisContext(), getString(R.string.launcher_error_reinstall_app), 1).show();
        }
    }

    @RequiresApi(26)
    public final void askPermissionToInstallFromUnknownSource() {
        UtilsKt.crashlyticsLog("askPermissionToInstallFromUnknownSource");
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("package:%s", Arrays.copyOf(new Object[]{getThisContext().getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Intent data = intent.setData(Uri.parse(str));
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        this.unknownAppPermissionResult.launch(data);
    }

    public final void createIntentAndLaunchUpdate() {
        File externalFilesDir = getThisContext().getExternalFilesDir(null);
        File file = new File((externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + "/launcher.apk");
        Uri uriForFile = FileProvider.getUriForFile(getThisContext(), getThisContext().getPackageName() + ".provider", file);
        UtilsKt.crashlyticsLog("createIntentAndLaunchUpdate fileUri " + uriForFile);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        intent.setFlags(268435456);
        intent.addFlags(1);
        startActivity(intent);
    }

    public final void showErrorResponseDialog(String throwableMessage) {
        Context thisContext = getThisContext();
        Intrinsics.checkNotNullExpressionValue(thisContext, "<get-thisContext>(...)");
        final TwoButtonsAndTextWithDescriptionDialog twoButtonsAndTextWithDescriptionDialog = new TwoButtonsAndTextWithDescriptionDialog(thisContext);
        twoButtonsAndTextWithDescriptionDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$showErrorResponseDialog$errorResponseDialog$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                UtilsKt.crashlyticsLog("InitializationFragment showErrorResponseDialog onOkButtonClickListener");
                Intent launchIntentForPackage = twoButtonsAndTextWithDescriptionDialog.getContext().getPackageManager().getLaunchIntentForPackage(twoButtonsAndTextWithDescriptionDialog.getContext().getPackageName());
                if (launchIntentForPackage != null) {
                    InitializationFragment initializationFragment = this;
                    launchIntentForPackage.addFlags(335544320);
                    FragmentActivity activity = initializationFragment.getActivity();
                    if (activity != null) {
                        activity.startActivity(launchIntentForPackage);
                    }
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        });
        twoButtonsAndTextWithDescriptionDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$showErrorResponseDialog$errorResponseDialog$1$2
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
                UtilsKt.crashlyticsLog("InitializationFragment showErrorResponseDialog onCancelButtonClickListener");
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        UtilsKt.crashlyticsRecordNewException("InitializationFragment showErrorResponseDialog, message=" + throwableMessage);
        twoButtonsAndTextWithDescriptionDialog.show();
        String string = getString(R.string.common_repeat);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setBtnOkText(string);
        String string2 = getString(R.string.common_close);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setBtnCancelText(string2);
        String string3 = getString(R.string.loading_error);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setTitle(string3);
        String string4 = getString(R.string.fragment_main_no_internet, throwableMessage);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setDescription(string4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeFragment(Class<? extends Fragment> fragment) {
        UtilsKt.crashlyticsLog("InitializationFragment changeFragment " + fragment);
        getParentFragmentManager().beginTransaction().replace(getBinding().fragmentContainerView.getId(), fragment, (Bundle) null).commit();
    }

    public InitializationFragment() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MainActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity thisActivity = this.this$0.getThisActivity();
                Intrinsics.checkNotNullExpressionValue(thisActivity, "access$getThisActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(thisActivity).get(MainActivityViewModel.class);
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.InitializationFragment$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                InitializationFragment.unknownAppPermissionResult$lambda$0(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.unknownAppPermissionResult = activityResultLauncherRegisterForActivityResult;
    }
}
