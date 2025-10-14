package com.blackhub.bronline.launcher.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blackhub.bronline.databinding.FragmentLoaderBinding;
import com.blackhub.bronline.game.common.BaseFragment;
import com.blackhub.bronline.game.common.TwoButtonsAndTextWithDescriptionDialog;
import com.blackhub.bronline.game.common.composemanager.ComposableProvider;
import com.blackhub.bronline.game.common.composemanager.ComposeViewManager;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.craft.CraftKeys;
import com.blackhub.bronline.game.p019ui.launcher.FilesInfoForDownloadKt;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.blackhub.bronline.launcher.data.MyFile;
import com.blackhub.bronline.launcher.dialogs.LauncherUpdateAvailableDialog;
import com.blackhub.bronline.launcher.dialogs.NotEnoughSpaceDialog;
import com.blackhub.bronline.launcher.download.DownloadWorker;
import com.blackhub.bronline.launcher.model.FileInfoForDownloadItem;
import com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel;
import com.bless.client.R;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoaderFragment.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0003J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0002J\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0017H\u0002J\u0010\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\b\u00101\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020'H\u0016J\b\u00103\u001a\u00020'H\u0002J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020\u000bH\u0002J\b\u00108\u001a\u00020'H\u0002J\b\u00109\u001a\u00020'H\u0002J\b\u0010:\u001a\u00020'H\u0002J\b\u0010;\u001a\u00020'H\u0016J\b\u0010<\u001a\u00020'H\u0016J\b\u0010=\u001a\u00020'H\u0016J\b\u0010>\u001a\u00020'H\u0016J\b\u0010?\u001a\u00020'H\u0016J\b\u0010@\u001a\u00020'H\u0016J\b\u0010A\u001a\u00020'H\u0002J\u0010\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020'2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0002J\u0010\u0010F\u001a\u00020'2\u0006\u0010G\u001a\u00020\rH\u0002J\u0010\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010L\u001a\u00020'H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00170\u00170\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/fragments/LoaderFragment;", "Lcom/blackhub/bronline/game/common/BaseFragment;", "Lcom/blackhub/bronline/databinding/FragmentLoaderBinding;", "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "installAppResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "isInternetAvailable", "", "loaded", "", "mainActivityViewModel", "Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "getMainActivityViewModel", "()Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "requestNotificationPermissionLauncher", "", "thisActivity", "Landroidx/fragment/app/FragmentActivity;", "getThisActivity", "()Landroidx/fragment/app/FragmentActivity;", "thisActivity$delegate", "thisContext", "Landroid/content/Context;", "getThisContext", "()Landroid/content/Context;", "thisContext$delegate", "total", "unknownAppPermissionResult", "workId", "Ljava/util/UUID;", "askNotificationPermission", "", "askPermissionToInstallFromUnknownSource", "createIntentAndLaunchUpdate", "deleteFilesNotFromListAndStartMainFragment", "getInfoAboutApp", "Landroid/content/pm/PackageInfo;", CraftKeys.PERCENT_OF_SKILL_KEY, "Landroid/content/pm/PackageManager;", "fullPath", "getPackageInfo", "getViewBinding", "initViews", "installApk", "isExternalStorageAvailable", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "isLauncherVersionActual", "observeWorkProgress", "onClickCancelButton", "onClickDownloadButton", "onDestroy", "onDestroyView", "onPause", "onResume", "onStart", "onStop", "registerNetworkCallback", "setButtonsYesNoVisibility", "visibility", "", "setLoaded", "setProgressFiles", "percent", "setSizeOfUpdate", "size", "", "setTextViewAndProgressBarVisibility", "setViewModelObservers", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLoaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 FragmentTransaction.kt\nandroidx/fragment/app/FragmentTransactionKt\n*L\n1#1,608:1\n172#2,9:609\n1#3:618\n28#4,6:619\n34#4,6:630\n80#5,5:625\n*S KotlinDebug\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment\n*L\n83#1:609,9\n397#1:619,6\n397#1:630,6\n399#1:625,5\n*E\n"})
/* loaded from: classes8.dex */
public final class LoaderFragment extends BaseFragment<FragmentLoaderBinding> {
    public static final int $stable = 8;

    @Nullable
    public ConnectivityManager connectivityManager;

    @NotNull
    public final ActivityResultLauncher<Intent> installAppResultLauncher;

    /* renamed from: mainActivityViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy mainActivityViewModel;

    @Nullable
    public ConnectivityManager.NetworkCallback networkCallback;

    @NotNull
    public final ActivityResultLauncher<String> requestNotificationPermissionLauncher;

    /* renamed from: thisActivity$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy thisActivity;

    /* renamed from: thisContext$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy thisContext;

    @NotNull
    public final ActivityResultLauncher<Intent> unknownAppPermissionResult;

    @Nullable
    public UUID workId;
    public boolean isInternetAvailable = true;
    public float loaded = -1.0f;
    public float total = -1.0f;

    public static final /* synthetic */ FragmentLoaderBinding access$getBinding(LoaderFragment loaderFragment) {
        return loaderFragment.getBinding();
    }

    public final MainActivityViewModel getMainActivityViewModel() {
        return (MainActivityViewModel) this.mainActivityViewModel.getValue();
    }

    public static final void unknownAppPermissionResult$lambda$0(LoaderFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            this$0.createIntentAndLaunchUpdate();
        }
        if (activityResult.getResultCode() == 0) {
            UtilsKt.crashlyticsLog("result.resultCode == Activity.RESULT_CANCELED, startActivity(JNIActivity)");
            this$0.deleteFilesNotFromListAndStartMainFragment();
        }
    }

    public static final void installAppResultLauncher$lambda$1(LoaderFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMainActivityViewModel().getSizeOfUpdateFromDB();
    }

    public final Context getThisContext() {
        return (Context) this.thisContext.getValue();
    }

    public final FragmentActivity getThisActivity() {
        return (FragmentActivity) this.thisActivity.getValue();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    public void initViews() {
        askNotificationPermission();
        setViewModelObservers();
        onClickDownloadButton();
        onClickCancelButton();
        registerNetworkCallback();
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ConnectivityManager connectivityManager;
        super.onDestroyView();
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback != null && (connectivityManager = this.connectivityManager) != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
        this.networkCallback = null;
        this.connectivityManager = null;
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment
    @NotNull
    public FragmentLoaderBinding getViewBinding() {
        FragmentLoaderBinding fragmentLoaderBindingInflate = FragmentLoaderBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fragmentLoaderBindingInflate, "inflate(...)");
        return fragmentLoaderBindingInflate;
    }

    public static final void requestNotificationPermissionLauncher$lambda$3(LoaderFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            return;
        }
        Toast.makeText(this$0.getBinding().getRoot().getContext(), this$0.getString(R.string.launcher_request_notification_disabled), 1).show();
    }

    public final void registerNetworkCallback() {
        Context context = getContext();
        this.connectivityManager = (ConnectivityManager) (context != null ? context.getSystemService("connectivity") : null);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
        C65441 c65441 = new ConnectivityManager.NetworkCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment.registerNetworkCallback.1
            public C65441() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onLost(network);
                Context context2 = LoaderFragment.this.getContext();
                if (context2 != null) {
                    Toast.makeText(context2, context2.getString(R.string.fragment_main_no_internet_short), 0).show();
                    String string = context2.getString(R.string.fragment_main_no_internet_short);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    UtilsKt.crashlyticsLog(string);
                    WorkManager.getInstance(context2).cancelUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME);
                }
                LoaderFragment.this.isInternetAvailable = false;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "network");
                super.onAvailable(network);
                Boolean boolValueOf = Boolean.valueOf(LoaderFragment.this.isInternetAvailable);
                final LoaderFragment loaderFragment = LoaderFragment.this;
                BooleanExtensionKt.ifFalse(boolValueOf, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$registerNetworkCallback$1$onAvailable$1
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
                        Context context2 = loaderFragment.getContext();
                        if (context2 != null) {
                            String string = context2.getString(R.string.fragment_main_connection_restored);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            UtilsKt.crashlyticsLog(string);
                            Toast.makeText(context2, context2.getString(R.string.fragment_main_connection_restored), 0).show();
                        }
                    }
                });
                LoaderFragment.this.isInternetAvailable = true;
            }
        };
        this.networkCallback = c65441;
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(networkRequestBuild, c65441);
        }
    }

    /* compiled from: LoaderFragment.kt */
    @Metadata(m7104d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m7105d2 = {"com/blackhub/bronline/launcher/fragments/LoaderFragment$registerNetworkCallback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.launcher.fragments.LoaderFragment$registerNetworkCallback$1 */
    /* loaded from: classes3.dex */
    public static final class C65441 extends ConnectivityManager.NetworkCallback {
        public C65441() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onLost(network);
            Context context2 = LoaderFragment.this.getContext();
            if (context2 != null) {
                Toast.makeText(context2, context2.getString(R.string.fragment_main_no_internet_short), 0).show();
                String string = context2.getString(R.string.fragment_main_no_internet_short);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                UtilsKt.crashlyticsLog(string);
                WorkManager.getInstance(context2).cancelUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME);
            }
            LoaderFragment.this.isInternetAvailable = false;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            super.onAvailable(network);
            Boolean boolValueOf = Boolean.valueOf(LoaderFragment.this.isInternetAvailable);
            final LoaderFragment loaderFragment = LoaderFragment.this;
            BooleanExtensionKt.ifFalse(boolValueOf, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$registerNetworkCallback$1$onAvailable$1
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
                    Context context2 = loaderFragment.getContext();
                    if (context2 != null) {
                        String string = context2.getString(R.string.fragment_main_connection_restored);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        UtilsKt.crashlyticsLog(string);
                        Toast.makeText(context2, context2.getString(R.string.fragment_main_connection_restored), 0).show();
                    }
                }
            });
            LoaderFragment.this.isInternetAvailable = true;
        }
    }

    public final void askNotificationPermission() {
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(getThisContext(), "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        if (!shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
            this.requestNotificationPermissionLauncher.launch("android.permission.POST_NOTIFICATIONS");
            return;
        }
        Context thisContext = getThisContext();
        Intrinsics.checkNotNullExpressionValue(thisContext, "<get-thisContext>(...)");
        TwoButtonsAndTextWithDescriptionDialog twoButtonsAndTextWithDescriptionDialog = new TwoButtonsAndTextWithDescriptionDialog(thisContext);
        twoButtonsAndTextWithDescriptionDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$askNotificationPermission$askForNotificationPermissionDialog$1$1
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
                this.this$0.requestNotificationPermissionLauncher.launch("android.permission.POST_NOTIFICATIONS");
            }
        });
        twoButtonsAndTextWithDescriptionDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$askNotificationPermission$askForNotificationPermissionDialog$1$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        twoButtonsAndTextWithDescriptionDialog.show();
        String string = getString(R.string.launcher_request_notification_permission_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setTitle(string);
        String string2 = getString(R.string.launcher_request_notification_permission_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        twoButtonsAndTextWithDescriptionDialog.setDescription(string2);
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UtilsKt.crashlyticsLog("LoaderFragment onResume");
        MainActivity.Companion companion = MainActivity.INSTANCE;
        FragmentActivity activity = getActivity();
        Window window = activity != null ? activity.getWindow() : null;
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.hideSystemUI(window, root);
    }

    public final boolean isLauncherVersionActual() throws PackageManager.NameNotFoundException {
        PackageManager packageManager = getThisContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        PackageInfo packageInfo = getPackageInfo(packageManager);
        File externalFilesDir = getThisContext().getExternalFilesDir(null);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        PackageInfo infoAboutApp = getInfoAboutApp(packageManager, absolutePath + Settings.LAUNCHER_NAME);
        return infoAboutApp == null || packageInfo.versionCode >= infoAboutApp.versionCode;
    }

    /* compiled from: LoaderFragment.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "sizeOfUpdate", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1 */
    /* loaded from: classes7.dex */
    public static final class C65451 extends Lambda implements Function1<Long, Unit> {
        public C65451() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke2(l);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Long l) {
            if (l != null && l.longValue() == 0) {
                if (!LoaderFragment.this.isLauncherVersionActual()) {
                    Context thisContext = LoaderFragment.this.getThisContext();
                    Intrinsics.checkNotNullExpressionValue(thisContext, "access$getThisContext(...)");
                    LauncherUpdateAvailableDialog launcherUpdateAvailableDialog = new LauncherUpdateAvailableDialog(thisContext);
                    final LoaderFragment loaderFragment = LoaderFragment.this;
                    launcherUpdateAvailableDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1$1$1
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
                            loaderFragment.installApk();
                        }
                    });
                    launcherUpdateAvailableDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1$1$2
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
                            FragmentActivity activity = loaderFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                        }
                    });
                    launcherUpdateAvailableDialog.show();
                    return;
                }
                UtilsKt.crashlyticsLog("isLauncherVersionActual(), startActivity(JNIActivity)");
                LoaderFragment.this.deleteFilesNotFromListAndStartMainFragment();
                return;
            }
            Intrinsics.checkNotNull(l);
            double dLongValue = (l.longValue() * 1.0d) / 1048576;
            LoaderFragment.this.setSizeOfUpdate(dLongValue);
            LoaderFragment.this.setTextViewAndProgressBarVisibility(4);
            TextView textView = LoaderFragment.access$getBinding(LoaderFragment.this).loadingPercent;
            FragmentActivity activity = LoaderFragment.this.getActivity();
            textView.setText(activity != null ? activity.getString(R.string.common_loaded, Float.valueOf(0.0f), Float.valueOf((l.longValue() * 1.0f) / 1048576)) : null);
            if (LoaderFragment.this.getMainActivityViewModel().getFreeSpaceLiveData().getValue() == null || dLongValue <= r10.longValue()) {
                return;
            }
            Context thisContext2 = LoaderFragment.this.getThisContext();
            Intrinsics.checkNotNullExpressionValue(thisContext2, "access$getThisContext(...)");
            new NotEnoughSpaceDialog(thisContext2, (dLongValue + LauncherConstants.ADDITIONAL_FREE_SPACE) - r10.longValue()).show();
        }
    }

    public final void setViewModelObservers() {
        getMainActivityViewModel().getSizeOfUpdateLiveData().observe(getViewLifecycleOwner(), new LoaderFragment$sam$androidx_lifecycle_Observer$0(new Function1<Long, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.1
            public C65451() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke2(l);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(Long l) {
                if (l != null && l.longValue() == 0) {
                    if (!LoaderFragment.this.isLauncherVersionActual()) {
                        Context thisContext = LoaderFragment.this.getThisContext();
                        Intrinsics.checkNotNullExpressionValue(thisContext, "access$getThisContext(...)");
                        LauncherUpdateAvailableDialog launcherUpdateAvailableDialog = new LauncherUpdateAvailableDialog(thisContext);
                        final LoaderFragment loaderFragment = LoaderFragment.this;
                        launcherUpdateAvailableDialog.setOnOkButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1$1$1
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
                                loaderFragment.installApk();
                            }
                        });
                        launcherUpdateAvailableDialog.setOnCancelButtonClickListener(new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$1$1$2
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
                                FragmentActivity activity = loaderFragment.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                        });
                        launcherUpdateAvailableDialog.show();
                        return;
                    }
                    UtilsKt.crashlyticsLog("isLauncherVersionActual(), startActivity(JNIActivity)");
                    LoaderFragment.this.deleteFilesNotFromListAndStartMainFragment();
                    return;
                }
                Intrinsics.checkNotNull(l);
                double dLongValue = (l.longValue() * 1.0d) / 1048576;
                LoaderFragment.this.setSizeOfUpdate(dLongValue);
                LoaderFragment.this.setTextViewAndProgressBarVisibility(4);
                TextView textView = LoaderFragment.access$getBinding(LoaderFragment.this).loadingPercent;
                FragmentActivity activity = LoaderFragment.this.getActivity();
                textView.setText(activity != null ? activity.getString(R.string.common_loaded, Float.valueOf(0.0f), Float.valueOf((l.longValue() * 1.0f) / 1048576)) : null);
                if (LoaderFragment.this.getMainActivityViewModel().getFreeSpaceLiveData().getValue() == null || dLongValue <= r10.longValue()) {
                    return;
                }
                Context thisContext2 = LoaderFragment.this.getThisContext();
                Intrinsics.checkNotNullExpressionValue(thisContext2, "access$getThisContext(...)");
                new NotEnoughSpaceDialog(thisContext2, (dLongValue + LauncherConstants.ADDITIONAL_FREE_SPACE) - r10.longValue()).show();
            }
        }));
        if (UtilsKt.isNotPublicBuildType()) {
            ViewGroup.LayoutParams layoutParams = getBinding().tvSizeOfUpdate.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.horizontalBias = 0.0f;
            getBinding().tvSizeOfUpdate.setLayoutParams(layoutParams2);
            getMainActivityViewModel().getFilesLiveData().observe(getViewLifecycleOwner(), new LoaderFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<MyFile>, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.2
                public C65462() {
                    super(1);
                }

                /* compiled from: LoaderFragment.kt */
                @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;", "invoke", "(Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                @SourceDebugExtension({"SMAP\nLoaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment$setViewModelObservers$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,608:1\n1549#2:609\n1620#2,3:610\n*S KotlinDebug\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment$setViewModelObservers$2$1\n*L\n288#1:609\n288#1:610,3\n*E\n"})
                /* renamed from: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$2$1 */
                public static final class AnonymousClass1 extends Lambda implements Function3<ComposableProvider, Composer, Integer, Unit> {
                    public final /* synthetic */ List<MyFile> $myFileList;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(List<MyFile> list) {
                        super(3);
                        list = list;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
                        invoke(composableProvider, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
                    public final void invoke(@NotNull ComposableProvider setComposableContentForKotlin, @Nullable Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(setComposableContentForKotlin, "$this$setComposableContentForKotlin");
                        if ((i & 81) != 16 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(838472097, i, -1, "com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.<anonymous>.<anonymous> (LoaderFragment.kt:287)");
                            }
                            List<MyFile> myFileList = list;
                            Intrinsics.checkNotNullExpressionValue(myFileList, "$myFileList");
                            List<MyFile> list = myFileList;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (MyFile myFile : list) {
                                arrayList.add(new FileInfoForDownloadItem(myFile.getPath() + myFile.getName(), myFile.getSize() / 1048576));
                            }
                            FilesInfoForDownloadKt.FilesInfoForDownload(arrayList, composer, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<MyFile> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(List<MyFile> list) {
                    ComposeViewManager composeViewManager = ComposeViewManager.INSTANCE;
                    ComposeView cvFilesInfoList = LoaderFragment.access$getBinding(LoaderFragment.this).cvFilesInfoList;
                    Intrinsics.checkNotNullExpressionValue(cvFilesInfoList, "cvFilesInfoList");
                    composeViewManager.setComposableContentForKotlin(cvFilesInfoList, ComposableLambdaKt.composableLambdaInstance(838472097, true, new Function3<ComposableProvider, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.2.1
                        public final /* synthetic */ List<MyFile> $myFileList;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(List<MyFile> list2) {
                            super(3);
                            list = list2;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
                            invoke(composableProvider, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
                        public final void invoke(@NotNull ComposableProvider setComposableContentForKotlin, @Nullable Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(setComposableContentForKotlin, "$this$setComposableContentForKotlin");
                            if ((i & 81) != 16 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(838472097, i, -1, "com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.<anonymous>.<anonymous> (LoaderFragment.kt:287)");
                                }
                                List<MyFile> myFileList = list;
                                Intrinsics.checkNotNullExpressionValue(myFileList, "$myFileList");
                                List<MyFile> list2 = myFileList;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (MyFile myFile : list2) {
                                    arrayList.add(new FileInfoForDownloadItem(myFile.getPath() + myFile.getName(), myFile.getSize() / 1048576));
                                }
                                FilesInfoForDownloadKt.FilesInfoForDownload(arrayList, composer, 8);
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
            }));
        }
    }

    /* compiled from: LoaderFragment.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "myFileList", "", "Lcom/blackhub/bronline/launcher/data/MyFile;", "kotlin.jvm.PlatformType", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$2 */
    /* loaded from: classes7.dex */
    public static final class C65462 extends Lambda implements Function1<List<MyFile>, Unit> {
        public C65462() {
            super(1);
        }

        /* compiled from: LoaderFragment.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;", "invoke", "(Lcom/blackhub/bronline/game/common/composemanager/ComposableProvider;Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @SourceDebugExtension({"SMAP\nLoaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment$setViewModelObservers$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,608:1\n1549#2:609\n1620#2,3:610\n*S KotlinDebug\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment$setViewModelObservers$2$1\n*L\n288#1:609\n288#1:610,3\n*E\n"})
        /* renamed from: com.blackhub.bronline.launcher.fragments.LoaderFragment$setViewModelObservers$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function3<ComposableProvider, Composer, Integer, Unit> {
            public final /* synthetic */ List<MyFile> $myFileList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<MyFile> list2) {
                super(3);
                list = list2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
                invoke(composableProvider, composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
            public final void invoke(@NotNull ComposableProvider setComposableContentForKotlin, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(setComposableContentForKotlin, "$this$setComposableContentForKotlin");
                if ((i & 81) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(838472097, i, -1, "com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.<anonymous>.<anonymous> (LoaderFragment.kt:287)");
                    }
                    List<MyFile> myFileList = list;
                    Intrinsics.checkNotNullExpressionValue(myFileList, "$myFileList");
                    List<MyFile> list2 = myFileList;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (MyFile myFile : list2) {
                        arrayList.add(new FileInfoForDownloadItem(myFile.getPath() + myFile.getName(), myFile.getSize() / 1048576));
                    }
                    FilesInfoForDownloadKt.FilesInfoForDownload(arrayList, composer, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<MyFile> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(List<MyFile> list2) {
            ComposeViewManager composeViewManager = ComposeViewManager.INSTANCE;
            ComposeView cvFilesInfoList = LoaderFragment.access$getBinding(LoaderFragment.this).cvFilesInfoList;
            Intrinsics.checkNotNullExpressionValue(cvFilesInfoList, "cvFilesInfoList");
            composeViewManager.setComposableContentForKotlin(cvFilesInfoList, ComposableLambdaKt.composableLambdaInstance(838472097, true, new Function3<ComposableProvider, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.2.1
                public final /* synthetic */ List<MyFile> $myFileList;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(List<MyFile> list22) {
                    super(3);
                    list = list22;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ComposableProvider composableProvider, Composer composer, Integer num) {
                    invoke(composableProvider, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
                public final void invoke(@NotNull ComposableProvider setComposableContentForKotlin, @Nullable Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(setComposableContentForKotlin, "$this$setComposableContentForKotlin");
                    if ((i & 81) != 16 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(838472097, i, -1, "com.blackhub.bronline.launcher.fragments.LoaderFragment.setViewModelObservers.<anonymous>.<anonymous> (LoaderFragment.kt:287)");
                        }
                        List<MyFile> myFileList = list;
                        Intrinsics.checkNotNullExpressionValue(myFileList, "$myFileList");
                        List<MyFile> list22 = myFileList;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, 10));
                        for (MyFile myFile : list22) {
                            arrayList.add(new FileInfoForDownloadItem(myFile.getPath() + myFile.getName(), myFile.getSize() / 1048576));
                        }
                        FilesInfoForDownloadKt.FilesInfoForDownload(arrayList, composer, 8);
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
    }

    public final void installApk() {
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

    private final void createIntentAndLaunchUpdate() {
        File externalFilesDir = getThisContext().getExternalFilesDir(null);
        File file = new File((externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + "/launcher.apk");
        Uri.fromFile(file);
        Uri uriForFile = FileProvider.getUriForFile(getThisContext(), getThisContext().getPackageName() + ".provider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        intent.setFlags(268435456);
        intent.addFlags(1);
        this.installAppResultLauncher.launch(intent);
    }

    @RequiresApi(26)
    private final void askPermissionToInstallFromUnknownSource() {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("package:%s", Arrays.copyOf(new Object[]{getThisContext().getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Intent data = intent.setData(Uri.parse(str));
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        this.unknownAppPermissionResult.launch(data);
    }

    public final void setSizeOfUpdate(double size) {
        TextView textView = getBinding().tvSizeOfUpdate;
        FragmentActivity activity = getActivity();
        textView.setText(activity != null ? activity.getString(R.string.launcher_do_you_want_to_download, Double.valueOf(size)) : null);
        setButtonsYesNoVisibility(0);
    }

    public final void setTextViewAndProgressBarVisibility(int visibility) {
        FragmentLoaderBinding binding = getBinding();
        binding.tvBr.setVisibility(visibility);
        binding.tvBr2.setVisibility(visibility);
        binding.loadingText.setVisibility(visibility);
        binding.progressBar.setVisibility(visibility);
        binding.loadingPercent.setVisibility(visibility);
    }

    public final void setButtonsYesNoVisibility(int visibility) {
        FragmentLoaderBinding binding = getBinding();
        binding.tvSizeOfUpdate.setVisibility(visibility);
        binding.buttonCancel.setVisibility(visibility);
        binding.buttonRepeat.setVisibility(visibility);
    }

    public final void setProgressFiles(float percent) {
        getBinding().progressBar.setProgress(percent);
    }

    public final void setLoaded(float loaded, float total) {
        FragmentLoaderBinding binding = getBinding();
        binding.loadingPercent.setVisibility(0);
        TextView textView = binding.loadingPercent;
        FragmentActivity activity = getActivity();
        textView.setText(activity != null ? activity.getString(R.string.common_loaded, Float.valueOf(loaded), Float.valueOf(total)) : null);
    }

    public final void deleteFilesNotFromListAndStartMainFragment() {
        MainActivityViewModel mainActivityViewModel = getMainActivityViewModel();
        mainActivityViewModel.deleteFilesNotFromList();
        mainActivityViewModel.deleteUnusedEntriesFromDB();
        mainActivityViewModel.m15136getBgImage();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(R.id.fragment_container_view, MainFragment.class, null, null), "replace(containerViewId, F::class.java, args, tag)");
        fragmentTransactionBeginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransactionBeginTransaction.commit();
    }

    public final void observeWorkProgress() {
        Context context = getContext();
        if (context != null) {
            WorkManager.getInstance(context).getWorkInfosForUniqueWorkLiveData(LauncherConstants.DOWNLOAD_WORK_NAME).observe(getViewLifecycleOwner(), new LoaderFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<WorkInfo>, Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$observeWorkProgress$1$1

                /* compiled from: LoaderFragment.kt */
                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                /* loaded from: classes3.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[WorkInfo.State.values().length];
                        try {
                            iArr[WorkInfo.State.RUNNING.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[WorkInfo.State.FAILED.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[WorkInfo.State.CANCELLED.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<WorkInfo> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable List<WorkInfo> list) {
                    WorkInfo workInfo;
                    if (list == null || (workInfo = (WorkInfo) CollectionsKt___CollectionsKt.firstOrNull((List) list)) == null) {
                        return;
                    }
                    LoaderFragment loaderFragment = this.this$0;
                    long[] longArray = workInfo.getProgress().getLongArray(DownloadWorker.Progress);
                    Long lFirstOrNull = longArray != null ? ArraysKt___ArraysKt.firstOrNull(longArray) : null;
                    Long orNull = longArray != null ? ArraysKt___ArraysKt.getOrNull(longArray, 1) : null;
                    if (lFirstOrNull != null) {
                        loaderFragment.loaded = lFirstOrNull.longValue() / 1048576;
                    }
                    if (orNull != null) {
                        loaderFragment.total = orNull.longValue() / 1048576;
                    }
                    int i = WhenMappings.$EnumSwitchMapping$0[workInfo.getState().ordinal()];
                    if (i == 1) {
                        if (loaderFragment.getThisActivity().getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                            if (LoaderFragment.access$getBinding(loaderFragment).buttonRepeat.getVisibility() == 0) {
                                loaderFragment.setButtonsYesNoVisibility(8);
                            }
                            if (LoaderFragment.access$getBinding(loaderFragment).progressBar.getVisibility() != 0) {
                                loaderFragment.setTextViewAndProgressBarVisibility(0);
                            }
                            if (loaderFragment.total <= -1.0f || loaderFragment.loaded <= -1.0f) {
                                return;
                            }
                            loaderFragment.setProgressFiles(((loaderFragment.loaded * 1.0f) / loaderFragment.total) * 100);
                            loaderFragment.setLoaded(loaderFragment.loaded, loaderFragment.total);
                            return;
                        }
                        return;
                    }
                    if (i == 2) {
                        UtilsKt.crashlyticsLog("DOWNLOAD_WORKER WorkInfo.State SUCCEED");
                        loaderFragment.getMainActivityViewModel().getSizeOfUpdateFromDB();
                        return;
                    }
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            return;
                        }
                        UtilsKt.crashlyticsLog("DOWNLOAD_WORKER WorkInfo.State BLOCKED");
                        Toast.makeText(loaderFragment.getThisContext(), loaderFragment.getString(R.string.launcher_error_download_forbidden_by_os), 1).show();
                        return;
                    }
                    loaderFragment.getMainActivityViewModel().getSizeOfUpdateFromDB();
                    UtilsKt.crashlyticsLog("DOWNLOAD_WORKER ERROR STATE: " + workInfo.getOutputData().getString(LauncherConstants.ERROR_KEY));
                    loaderFragment.setButtonsYesNoVisibility(0);
                    loaderFragment.setTextViewAndProgressBarVisibility(4);
                }
            }));
        }
    }

    /* compiled from: LoaderFragment.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLoaderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment$onClickDownloadButton$1\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,608:1\n100#2:609\n*S KotlinDebug\n*F\n+ 1 LoaderFragment.kt\ncom/blackhub/bronline/launcher/fragments/LoaderFragment$onClickDownloadButton$1\n*L\n500#1:609\n*E\n"})
    /* renamed from: com.blackhub.bronline.launcher.fragments.LoaderFragment$onClickDownloadButton$1 */
    /* loaded from: classes7.dex */
    public static final class C65431 extends Lambda implements Function0<Unit> {
        public C65431() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() throws Throwable {
            WorkContinuation workContinuationBeginUniqueWork;
            File externalFilesDir;
            LoaderFragment.this.setButtonsYesNoVisibility(8);
            LoaderFragment.access$getBinding(LoaderFragment.this).tvSizeOfUpdate.setVisibility(8);
            LoaderFragment.this.setTextViewAndProgressBarVisibility(0);
            LoaderFragment loaderFragment = LoaderFragment.this;
            FragmentActivity thisActivity = loaderFragment.getThisActivity();
            Intrinsics.checkNotNullExpressionValue(thisActivity, "access$getThisActivity(...)");
            if (loaderFragment.isExternalStorageAvailable(thisActivity)) {
                Long value = LoaderFragment.this.getMainActivityViewModel().getSizeOfUpdateLiveData().getValue();
                if (value != null) {
                    LoaderFragment loaderFragment2 = LoaderFragment.this;
                    if (value.longValue() != 0) {
                        if (!loaderFragment2.isInternetAvailable) {
                            loaderFragment2.setButtonsYesNoVisibility(0);
                            loaderFragment2.setTextViewAndProgressBarVisibility(4);
                            Toast.makeText(loaderFragment2.getThisContext(), loaderFragment2.getString(R.string.fragment_main_no_internet_short), 1).show();
                            return;
                        }
                        FragmentActivity activity = loaderFragment2.getActivity();
                        Data dataBuild = new Data.Builder().putLong(DownloadWorker.FinalSize, value.longValue()).putString(DownloadWorker.GamePath, (activity == null || (externalFilesDir = activity.getExternalFilesDir(null)) == null) ? null : externalFilesDir.getAbsolutePath()).build();
                        Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(DownloadWorker.class).setInputData(dataBuild).setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build();
                        loaderFragment2.workId = oneTimeWorkRequestBuild.getId();
                        Context context = loaderFragment2.getContext();
                        WorkManager workManager = context != null ? WorkManager.getInstance(context) : null;
                        if (workManager != null && (workContinuationBeginUniqueWork = workManager.beginUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild)) != null) {
                            workContinuationBeginUniqueWork.enqueue();
                        }
                        loaderFragment2.observeWorkProgress();
                        return;
                    }
                    UtilsKt.crashlyticsLog("sizeOfUpdateLiveData == 0L, startActivity(JNIActivity)");
                    loaderFragment2.deleteFilesNotFromListAndStartMainFragment();
                    return;
                }
                return;
            }
            Toast.makeText(LoaderFragment.this.getThisContext(), LoaderFragment.this.getString(R.string.launcher_error_access_to_storage_is_forbidden), 1).show();
        }
    }

    public final void onClickDownloadButton() {
        AppCompatButton buttonRepeat = getBinding().buttonRepeat;
        Intrinsics.checkNotNullExpressionValue(buttonRepeat, "buttonRepeat");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonRepeat, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment.onClickDownloadButton.1
            public C65431() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() throws Throwable {
                WorkContinuation workContinuationBeginUniqueWork;
                File externalFilesDir;
                LoaderFragment.this.setButtonsYesNoVisibility(8);
                LoaderFragment.access$getBinding(LoaderFragment.this).tvSizeOfUpdate.setVisibility(8);
                LoaderFragment.this.setTextViewAndProgressBarVisibility(0);
                LoaderFragment loaderFragment = LoaderFragment.this;
                FragmentActivity thisActivity = loaderFragment.getThisActivity();
                Intrinsics.checkNotNullExpressionValue(thisActivity, "access$getThisActivity(...)");
                if (loaderFragment.isExternalStorageAvailable(thisActivity)) {
                    Long value = LoaderFragment.this.getMainActivityViewModel().getSizeOfUpdateLiveData().getValue();
                    if (value != null) {
                        LoaderFragment loaderFragment2 = LoaderFragment.this;
                        if (value.longValue() != 0) {
                            if (!loaderFragment2.isInternetAvailable) {
                                loaderFragment2.setButtonsYesNoVisibility(0);
                                loaderFragment2.setTextViewAndProgressBarVisibility(4);
                                Toast.makeText(loaderFragment2.getThisContext(), loaderFragment2.getString(R.string.fragment_main_no_internet_short), 1).show();
                                return;
                            }
                            FragmentActivity activity = loaderFragment2.getActivity();
                            Data dataBuild = new Data.Builder().putLong(DownloadWorker.FinalSize, value.longValue()).putString(DownloadWorker.GamePath, (activity == null || (externalFilesDir = activity.getExternalFilesDir(null)) == null) ? null : externalFilesDir.getAbsolutePath()).build();
                            Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                            OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(DownloadWorker.class).setInputData(dataBuild).setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build();
                            loaderFragment2.workId = oneTimeWorkRequestBuild.getId();
                            Context context = loaderFragment2.getContext();
                            WorkManager workManager = context != null ? WorkManager.getInstance(context) : null;
                            if (workManager != null && (workContinuationBeginUniqueWork = workManager.beginUniqueWork(LauncherConstants.DOWNLOAD_WORK_NAME, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild)) != null) {
                                workContinuationBeginUniqueWork.enqueue();
                            }
                            loaderFragment2.observeWorkProgress();
                            return;
                        }
                        UtilsKt.crashlyticsLog("sizeOfUpdateLiveData == 0L, startActivity(JNIActivity)");
                        loaderFragment2.deleteFilesNotFromListAndStartMainFragment();
                        return;
                    }
                    return;
                }
                Toast.makeText(LoaderFragment.this.getThisContext(), LoaderFragment.this.getString(R.string.launcher_error_access_to_storage_is_forbidden), 1).show();
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isExternalStorageAvailable(Activity activity) {
        boolean z;
        try {
            File externalFilesDir = activity.getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            if (absolutePath != null) {
                z = StringsKt__StringsJVMKt.isBlank(absolutePath);
            }
            return !z;
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            Toast.makeText(activity, activity.getResources().getString(R.string.fragment_main_no_external_storage), 1).show();
            return false;
        }
    }

    /* compiled from: LoaderFragment.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.launcher.fragments.LoaderFragment$onClickCancelButton$1 */
    /* loaded from: classes7.dex */
    public static final class C65421 extends Lambda implements Function0<Unit> {
        public C65421() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            if (UtilsKt.isNotPublicBuildType()) {
                LoaderFragment.this.deleteFilesNotFromListAndStartMainFragment();
                return;
            }
            FragmentActivity activity = LoaderFragment.this.getActivity();
            if (activity != null) {
                activity.finishAffinity();
            }
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public final void onClickCancelButton() {
        AppCompatButton buttonCancel = getBinding().buttonCancel;
        Intrinsics.checkNotNullExpressionValue(buttonCancel, "buttonCancel");
        BaseFragment.setOnClickListenerWithAnimAndDelay$default(this, buttonCancel, 0L, new Function0<Unit>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment.onClickCancelButton.1
            public C65421() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                if (UtilsKt.isNotPublicBuildType()) {
                    LoaderFragment.this.deleteFilesNotFromListAndStartMainFragment();
                    return;
                }
                FragmentActivity activity = LoaderFragment.this.getActivity();
                if (activity != null) {
                    activity.finishAffinity();
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }, 1, null);
    }

    public final PackageInfo getPackageInfo(PackageManager packageManager) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(Settings.CLIENT_PACKAGE, PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(Settings.CLIENT_PACKAGE, 0);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    public final PackageInfo getInfoAboutApp(PackageManager packageManager, String fullPath) {
        if (Build.VERSION.SDK_INT >= 33) {
            return packageManager.getPackageArchiveInfo(fullPath, PackageManager.PackageInfoFlags.of(0L));
        }
        return packageManager.getPackageArchiveInfo(fullPath, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        UtilsKt.crashlyticsLog("LoaderFragment onStart");
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        UtilsKt.crashlyticsLog("LoaderFragment onPause");
    }

    @Override // com.blackhub.bronline.game.common.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        UtilsKt.crashlyticsLog("LoaderFragment onStop");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        UtilsKt.crashlyticsLog("LoaderFragment onDestroy");
    }

    public LoaderFragment() {
        final Function0 function0 = null;
        this.mainActivityViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MainActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$mainActivityViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return (ViewModelProvider.Factory) new ViewModelProvider(fragmentActivityRequireActivity).get(MainActivityViewModel.class);
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$$ExternalSyntheticLambda3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoaderFragment.unknownAppPermissionResult$lambda$0(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.unknownAppPermissionResult = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$$ExternalSyntheticLambda4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoaderFragment.installAppResultLauncher$lambda$1(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.installAppResultLauncher = activityResultLauncherRegisterForActivityResult2;
        this.thisContext = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$thisContext$2
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
        this.thisActivity = LazyKt__LazyJVMKt.lazy(new Function0<FragmentActivity>() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$thisActivity$2
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
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.blackhub.bronline.launcher.fragments.LoaderFragment$$ExternalSyntheticLambda5
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LoaderFragment.requestNotificationPermissionLauncher$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.requestNotificationPermissionLauncher = activityResultLauncherRegisterForActivityResult3;
    }
}
