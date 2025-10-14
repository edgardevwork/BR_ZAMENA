package com.blackhub.bronline.launcher.viewmodel;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.constants.NativeGraphicConstants;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId0;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.craft.CraftKeys;
import com.blackhub.bronline.game.model.local.AppConfigModel;
import com.blackhub.bronline.game.model.remote.response.app.AppVersionResponse;
import com.blackhub.bronline.game.repository.LauncherRepository;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.data.MyFile;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.p021di.BackupCdnAPI;
import com.blackhub.bronline.launcher.p021di.CdnAPI;
import com.bless.client.R;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.AddTrace;
import com.google.firebase.perf.metrics.Trace;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import ru.rustore.sdk.appupdate.listener.InstallStateUpdateListener;
import ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.appupdate.model.InstallState;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;

/* compiled from: MainActivityViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\u0006\u0010;\u001a\u00020<J\u001e\u0010=\u001a\u00020<2\u0006\u00104\u001a\u0002052\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u00020<H\u0007J\b\u0010D\u001a\u00020<H\u0007J\b\u0010E\u001a\u00020<H\u0007J\u0006\u0010\u001d\u001a\u00020<J\u001a\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0014H\u0002J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010N\u001a\u00020MH\u0003J\u0010\u0010O\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010P\u001a\u0004\u0018\u00010QH\u0082@¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020<H\u0007J\u0010\u0010T\u001a\u0002072\u0006\u00104\u001a\u000205H\u0002J\u000e\u0010U\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010RJ\b\u0010V\u001a\u00020<H\u0014J\u000e\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020\u0014J\u000e\u0010Y\u001a\u00020<2\u0006\u0010Z\u001a\u00020(J\u0010\u0010[\u001a\u00020<2\b\u0010+\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\\\u001a\u00020<2\u0006\u00104\u001a\u000205H\u0002J&\u0010]\u001a\u00020<2\u0006\u00104\u001a\u0002052\u0006\u0010^\u001a\u00020@2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020 0?H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0019¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\"¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020(0\u00198F¢\u0006\u0006\u001a\u0004\b9\u0010\u001eR\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020(0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "launcherDatabase", "Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "launcherRepository", "Lcom/blackhub/bronline/game/repository/LauncherRepository;", "application", "Landroid/app/Application;", "mainCdnApi", "Lcom/blackhub/bronline/launcher/network/Api;", "backupCdnApi", "(Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/launcher/database/LauncherDatabase;Lcom/blackhub/bronline/game/repository/LauncherRepository;Landroid/app/Application;Lcom/blackhub/bronline/launcher/network/Api;Lcom/blackhub/bronline/launcher/network/Api;)V", "_bgImage", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "_descriptionForFragmentInitialization", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isActualVersion", "", "_isNeedToCloseApp", "allFilesLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/blackhub/bronline/launcher/data/MyFile;", "bgImage", "getBgImage", "()Landroidx/lifecycle/LiveData;", "countOfErrors", "", "descriptionForFragmentInitialization", "Lkotlinx/coroutines/flow/StateFlow;", "getDescriptionForFragmentInitialization", "()Lkotlinx/coroutines/flow/StateFlow;", "filesLiveData", "getFilesLiveData", "freeSpaceLiveData", "", "getFreeSpaceLiveData", "freeSpaceMutableLiveData", "gamePath", "isActualVersion", "isNeedToCloseApp", "mutableAllFilesLiveData", "mutableCurrentArchitectureFolderMutableLiveData", "mutableFilesLiveData", "mutableOnErrorResponse", "onErrorResponse", "getOnErrorResponse", "ruStoreAppUpdateManager", "Lru/rustore/sdk/appupdate/manager/RuStoreAppUpdateManager;", "rustoreUpdateListener", "Lru/rustore/sdk/appupdate/listener/InstallStateUpdateListener;", "sizeOfUpdateLiveData", "getSizeOfUpdateLiveData", "sizeOfUpdateMutableLiveData", "checkAppVersion", "", "checkRustoreUpdateAvailability", "onSuccessListener", "Lru/rustore/sdk/core/tasks/OnSuccessListener;", "Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "checkRustoreUpdateAvailabilityListener", "updateManager", "checkUpdate", "deleteFilesNotFromList", "deleteUnusedEntriesFromDB", "getInfoAboutApp", "Landroid/content/pm/PackageInfo;", CraftKeys.PERCENT_OF_SKILL_KEY, "Landroid/content/pm/PackageManager;", "fullPath", "getListOfFiles", "", "Ljava/io/File;", "parentDir", "getPackageInfo", "getServerAppVersion", "Lcom/blackhub/bronline/game/model/remote/response/app/AppVersionResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSizeOfUpdateFromDB", "initInstallStateUpdateListener", "isLauncherVersionActual", "onCleared", "setCurrentArchitectureFolder", "currentFolder", "setFreeSpace", "freeSpace", "setGamePath", "startRustoreApkUpdate", "startRustoreUpdateFlow", "appUpdateInfo", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMainActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,575:1\n1#2:576\n1855#3,2:577\n48#4,4:579\n*S KotlinDebug\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel\n*L\n181#1:577,2\n217#1:579,4\n*E\n"})
/* loaded from: classes4.dex */
public final class MainActivityViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableLiveData<Bitmap> _bgImage;

    @NotNull
    public final MutableStateFlow<String> _descriptionForFragmentInitialization;

    @NotNull
    public final MutableLiveData<Boolean> _isActualVersion;

    @NotNull
    public final MutableStateFlow<Boolean> _isNeedToCloseApp;

    @NotNull
    public final LiveData<List<MyFile>> allFilesLiveData;

    @NotNull
    public final Application application;

    @NotNull
    public final Api backupCdnApi;
    public int countOfErrors;

    @NotNull
    public final StateFlow<String> descriptionForFragmentInitialization;

    @NotNull
    public final LiveData<List<MyFile>> filesLiveData;

    @NotNull
    public final LiveData<Long> freeSpaceLiveData;

    @NotNull
    public final MutableLiveData<Long> freeSpaceMutableLiveData;

    @NotNull
    public String gamePath;

    @NotNull
    public final LiveData<Boolean> isActualVersion;

    @NotNull
    public final StateFlow<Boolean> isNeedToCloseApp;

    @NotNull
    public final LauncherDatabase launcherDatabase;

    @NotNull
    public final LauncherRepository launcherRepository;

    @NotNull
    public final Api mainCdnApi;

    @NotNull
    public final MutableLiveData<List<MyFile>> mutableAllFilesLiveData;

    @NotNull
    public final MutableLiveData<String> mutableCurrentArchitectureFolderMutableLiveData;

    @NotNull
    public final MutableLiveData<List<MyFile>> mutableFilesLiveData;

    @NotNull
    public final MutableLiveData<String> mutableOnErrorResponse;

    @NotNull
    public final LiveData<String> onErrorResponse;

    @Nullable
    public RuStoreAppUpdateManager ruStoreAppUpdateManager;

    @Nullable
    public InstallStateUpdateListener rustoreUpdateListener;

    @NotNull
    public final MutableLiveData<Long> sizeOfUpdateMutableLiveData;

    @NotNull
    public final StringResource stringResource;

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {512}, m7123m = "getServerAppVersion", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getServerAppVersion$1 */
    /* loaded from: classes7.dex */
    public static final class C65561 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C65561(Continuation<? super C65561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MainActivityViewModel.this.getServerAppVersion(this);
        }
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {524, 528}, m7123m = "isLauncherVersionActual", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$isLauncherVersionActual$1 */
    /* loaded from: classes7.dex */
    public static final class C65581 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C65581(Continuation<? super C65581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MainActivityViewModel.this.isLauncherVersionActual(this);
        }
    }

    @Inject
    public MainActivityViewModel(@NotNull StringResource stringResource, @NotNull LauncherDatabase launcherDatabase, @NotNull LauncherRepository launcherRepository, @NotNull Application application, @CdnAPI @NotNull Api mainCdnApi, @BackupCdnAPI @NotNull Api backupCdnApi) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(launcherDatabase, "launcherDatabase");
        Intrinsics.checkNotNullParameter(launcherRepository, "launcherRepository");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mainCdnApi, "mainCdnApi");
        Intrinsics.checkNotNullParameter(backupCdnApi, "backupCdnApi");
        this.stringResource = stringResource;
        this.launcherDatabase = launcherDatabase;
        this.launcherRepository = launcherRepository;
        this.application = application;
        this.mainCdnApi = mainCdnApi;
        this.backupCdnApi = backupCdnApi;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.gamePath = AnyExtensionKt.empty(stringCompanionObject);
        this.mutableCurrentArchitectureFolderMutableLiveData = new MutableLiveData<>();
        MutableLiveData<List<MyFile>> mutableLiveData = new MutableLiveData<>();
        this.mutableAllFilesLiveData = mutableLiveData;
        this.allFilesLiveData = mutableLiveData;
        MutableLiveData<List<MyFile>> mutableLiveData2 = new MutableLiveData<>();
        this.mutableFilesLiveData = mutableLiveData2;
        this.filesLiveData = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.mutableOnErrorResponse = mutableLiveData3;
        this.onErrorResponse = mutableLiveData3;
        this.sizeOfUpdateMutableLiveData = new MutableLiveData<>();
        MutableLiveData<Long> mutableLiveData4 = new MutableLiveData<>();
        this.freeSpaceMutableLiveData = mutableLiveData4;
        this.freeSpaceLiveData = mutableLiveData4;
        this._bgImage = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>(null);
        this._isActualVersion = mutableLiveData5;
        this.isActualVersion = mutableLiveData5;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(AnyExtensionKt.empty(stringCompanionObject));
        this._descriptionForFragmentInitialization = MutableStateFlow;
        this.descriptionForFragmentInitialization = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._isNeedToCloseApp = MutableStateFlow2;
        this.isNeedToCloseApp = FlowKt.asStateFlow(MutableStateFlow2);
        ViewModelExtensionKt.launchOnIO$default(this, null, new C65511(null), 1, null);
    }

    @NotNull
    public final LiveData<List<MyFile>> getFilesLiveData() {
        return this.filesLiveData;
    }

    @NotNull
    public final LiveData<String> getOnErrorResponse() {
        return this.onErrorResponse;
    }

    @NotNull
    public final LiveData<Long> getSizeOfUpdateLiveData() {
        return this.sizeOfUpdateMutableLiveData;
    }

    @NotNull
    public final LiveData<Long> getFreeSpaceLiveData() {
        return this.freeSpaceLiveData;
    }

    @NotNull
    public final LiveData<Bitmap> getBgImage() {
        return this._bgImage;
    }

    @NotNull
    public final LiveData<Boolean> isActualVersion() {
        return this.isActualVersion;
    }

    @NotNull
    public final StateFlow<String> getDescriptionForFragmentInitialization() {
        return this.descriptionForFragmentInitialization;
    }

    @NotNull
    public final StateFlow<Boolean> isNeedToCloseApp() {
        return this.isNeedToCloseApp;
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$1", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {127}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$1 */
    /* loaded from: classes8.dex */
    public static final class C65511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65511(Continuation<? super C65511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainActivityViewModel.this.new C65511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LauncherRepository launcherRepository = MainActivityViewModel.this.launcherRepository;
                this.label = 1;
                if (launcherRepository.getAppConfig(this) == coroutine_suspended) {
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

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        RuStoreAppUpdateManager ruStoreAppUpdateManager;
        super.onCleared();
        InstallStateUpdateListener installStateUpdateListener = this.rustoreUpdateListener;
        if (installStateUpdateListener != null && (ruStoreAppUpdateManager = this.ruStoreAppUpdateManager) != null) {
            ruStoreAppUpdateManager.unregisterListener(installStateUpdateListener);
        }
        this.ruStoreAppUpdateManager = null;
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getBgImage$1", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getBgImage$1 */
    /* loaded from: classes8.dex */
    public static final class C65551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65551(Continuation<? super C65551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainActivityViewModel.this.new C65551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MainActivityViewModel.this._bgImage.postValue(BitmapUtilsKt.getPngBitmapFromZip(MainActivityViewModel.this.application, PngConstantsId0.BG_LAUNCHER_MAIN, ImageTypePathInCDNEnum.BACKGROUND));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: getBgImage, reason: collision with other method in class */
    public final void m15136getBgImage() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C65551(null), 1, null);
    }

    public final void setGamePath(@Nullable String gamePath) {
        this.gamePath = String.valueOf(gamePath);
    }

    public final void setCurrentArchitectureFolder(@NotNull String currentFolder) {
        Intrinsics.checkNotNullParameter(currentFolder, "currentFolder");
        this.mutableCurrentArchitectureFolderMutableLiveData.postValue(currentFolder);
    }

    public final void setFreeSpace(long freeSpace) {
        this.freeSpaceMutableLiveData.setValue(Long.valueOf(freeSpace));
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getSizeOfUpdateFromDB$1", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMainActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel$getSizeOfUpdateFromDB$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n1855#2,2:576\n*S KotlinDebug\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel$getSizeOfUpdateFromDB$1\n*L\n166#1:576,2\n*E\n"})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$getSizeOfUpdateFromDB$1 */
    /* loaded from: classes6.dex */
    public static final class C65571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65571(Continuation<? super C65571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainActivityViewModel.this.new C65571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator<T> it = MainActivityViewModel.this.launcherDatabase.myFileDao().getNotDownloadedFilesSize().iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += ((Number) it.next()).longValue();
            }
            MainActivityViewModel.this.sizeOfUpdateMutableLiveData.postValue(Boxing.boxLong(jLongValue));
            return Unit.INSTANCE;
        }
    }

    @AddTrace(name = "MainActivityViewModel getSizeOfUpdateFromDB()")
    public final void getSizeOfUpdateFromDB() {
        Trace traceStartTrace = FirebasePerformance.startTrace("MainActivityViewModel getSizeOfUpdateFromDB()");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C65571(null), 2, null);
        traceStartTrace.stop();
    }

    @AddTrace(name = "MainActivityViewModel deleteFilesNotFromList()")
    public final void deleteFilesNotFromList() {
        Trace traceStartTrace = FirebasePerformance.startTrace("MainActivityViewModel deleteFilesNotFromList()");
        String str = StringsKt__StringsJVMKt.replace$default(this.gamePath, "com.br.top/files", AnyExtensionKt.empty(StringCompanionObject.INSTANCE), false, 4, (Object) null) + Settings.CLIENT_PACKAGE;
        for (File file : getListOfFiles(new File(str + LauncherConstants.SLASH_FILES_SLASH))) {
            if (!file.getName().equals(LauncherConstants.CUSTOM_TOUCHSCREEN_NAME) && !file.getName().equals("launcher.apk") && !file.getName().equals(LauncherConstants.GAME_SETTING_JSON) && !file.getName().equals(LauncherConstants.CRASH_LOG_TXT)) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Object obj = null;
                if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) LauncherConstants.NOLOGO, false, 2, (Object) null) && UtilsKt.isFlavorWithLogo()) {
                    file.delete();
                }
                List<MyFile> value = this.allFilesLiveData.getValue();
                if (value != null) {
                    Intrinsics.checkNotNull(value);
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        MyFile myFile = (MyFile) next;
                        if (Intrinsics.areEqual(str + "/" + myFile.getPath() + myFile.getName(), file.getPath())) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (MyFile) obj;
                }
                if (obj == null) {
                    file.delete();
                }
            }
        }
        traceStartTrace.stop();
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$deleteUnusedEntriesFromDB$1", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMainActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel$deleteUnusedEntriesFromDB$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,575:1\n1855#2:576\n1856#2:578\n1#3:577\n*S KotlinDebug\n*F\n+ 1 MainActivityViewModel.kt\ncom/blackhub/bronline/launcher/viewmodel/MainActivityViewModel$deleteUnusedEntriesFromDB$1\n*L\n204#1:576\n204#1:578\n*E\n"})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$deleteUnusedEntriesFromDB$1 */
    /* loaded from: classes8.dex */
    public static final class C65541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65541(Continuation<? super C65541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainActivityViewModel.this.new C65541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (((List) MainActivityViewModel.this.mutableAllFilesLiveData.getValue()) != null && (!r7.isEmpty())) {
                    List<MyFile> all = MainActivityViewModel.this.launcherDatabase.myFileDao().getAll();
                    MainActivityViewModel mainActivityViewModel = MainActivityViewModel.this;
                    for (MyFile myFile : all) {
                        List list = (List) mainActivityViewModel.mutableAllFilesLiveData.getValue();
                        Object obj2 = null;
                        if (list != null) {
                            Intrinsics.checkNotNull(list);
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (Intrinsics.areEqual((MyFile) next, myFile)) {
                                    obj2 = next;
                                    break;
                                }
                            }
                            obj2 = (MyFile) obj2;
                        }
                        if (obj2 == null) {
                            mainActivityViewModel.launcherDatabase.myFileDao().deleteEntry(myFile);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @AddTrace(name = "MainActivityViewModel deleteUnusedEntriesFromDB()")
    public final void deleteUnusedEntriesFromDB() {
        Trace traceStartTrace = FirebasePerformance.startTrace("MainActivityViewModel deleteUnusedEntriesFromDB()");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C65541(null), 1, null);
        traceStartTrace.stop();
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkUpdate$1", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {224, 227, 360, 371}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkUpdate$1 */
    /* loaded from: classes8.dex */
    public static final class C65531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65531(Continuation<? super C65531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainActivityViewModel.this.new C65531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x02b4 A[EDGE_INSN: B:108:0x02b4->B:83:0x02b4 BREAK  A[LOOP:0: B:34:0x00d7->B:84:0x02b5], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x015c A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0024, B:96:0x0374, B:14:0x002c, B:27:0x0068, B:28:0x006a, B:30:0x0070, B:32:0x008e, B:34:0x00d7, B:37:0x00ef, B:39:0x00ff, B:41:0x0105, B:42:0x010a, B:44:0x011c, B:46:0x012e, B:47:0x0133, B:49:0x0145, B:51:0x0157, B:52:0x015c, B:54:0x016c, B:56:0x0172, B:57:0x0177, B:59:0x0198, B:60:0x01b2, B:62:0x01e3, B:64:0x01e9, B:65:0x01ee, B:67:0x0212, B:69:0x0218, B:71:0x022c, B:73:0x0232, B:75:0x0244, B:76:0x0248, B:77:0x0263, B:79:0x027c, B:81:0x028e, B:85:0x02b9, B:86:0x02bf, B:88:0x02c5, B:89:0x02d1, B:90:0x02f6, B:92:0x0308, B:93:0x0340, B:15:0x0032, B:23:0x0052, B:18:0x003b, B:20:0x0043, B:24:0x0055), top: B:107:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02b5 A[LOOP:0: B:34:0x00d7->B:84:0x02b5, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objFiles;
            Object objFiles2;
            Response response;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                MainActivityViewModel.this.countOfErrors++;
                if (MainActivityViewModel.this.countOfErrors >= 6) {
                    MainActivityViewModel.this.mutableOnErrorResponse.postValue(e.getMessage());
                } else {
                    MainActivityViewModel.this._descriptionForFragmentInitialization.setValue(MainActivityViewModel.this.stringResource.getString(R.string.launcher_error_connect_with_counter, Boxing.boxInt(MainActivityViewModel.this.countOfErrors + 1), Boxing.boxInt(6)));
                    this.label = 4;
                    if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (MainActivityViewModel.this.countOfErrors < 3) {
                    Api api = MainActivityViewModel.this.mainCdnApi;
                    this.label = 1;
                    objFiles2 = api.files(this);
                    if (objFiles2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    response = (Response) objFiles2;
                } else {
                    Settings.CURRENT_CDN_URL = BuildConfig.CDN_BACKUP_URL;
                    Api api2 = MainActivityViewModel.this.backupCdnApi;
                    this.label = 2;
                    objFiles = api2.files(this);
                    if (objFiles == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    response = (Response) objFiles;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                objFiles2 = obj;
                response = (Response) objFiles2;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        MainActivityViewModel.this.checkUpdate();
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MainActivityViewModel.this.checkUpdate();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objFiles = obj;
                response = (Response) objFiles;
            }
            if (response.isSuccessful()) {
                MainActivityViewModel.this._descriptionForFragmentInitialization.setValue(MainActivityViewModel.this.stringResource.getString(R.string.launcher_data_server_connect));
                List<MyFile> list = (List) response.body();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    MainActivityViewModel.this.mutableAllFilesLiveData.postValue(arrayList);
                    String str = StringsKt__StringsJVMKt.replace$default(MainActivityViewModel.this.gamePath, "com.br.top/files", AnyExtensionKt.empty(StringCompanionObject.INSTANCE), false, 4, (Object) null) + Settings.CLIENT_PACKAGE + LauncherConstants.SLASH_FILES_SLASH;
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = size - 1;
                            if (StringsKt__StringsKt.contains$default((CharSequence) list.get(size).getPath(), (CharSequence) LauncherConstants.TEXTURES_DB, false, 2, (Object) null)) {
                                if (!StringsKt__StringsKt.contains$default((CharSequence) list.get(size).getName(), (CharSequence) LauncherConstants.NOLOGO, false, 2, (Object) null) || !UtilsKt.isFlavorWithLogo()) {
                                    if (Intrinsics.areEqual(MainActivityViewModel.this.mutableCurrentArchitectureFolderMutableLiveData.getValue(), NativeGraphicConstants.ASTC) || !StringsKt__StringsKt.contains$default((CharSequence) list.get(size).getName(), (CharSequence) ".astc.", false, 2, (Object) null)) {
                                        if (!Intrinsics.areEqual(MainActivityViewModel.this.mutableCurrentArchitectureFolderMutableLiveData.getValue(), NativeGraphicConstants.ETC2) && StringsKt__StringsKt.contains$default((CharSequence) list.get(size).getName(), (CharSequence) ".etc2.", false, 2, (Object) null)) {
                                            list.remove(size);
                                        }
                                    } else {
                                        list.remove(size);
                                    }
                                } else {
                                    list.remove(size);
                                }
                                if (i2 >= 0) {
                                }
                            } else {
                                if (StringsKt__StringsKt.contains$default((CharSequence) list.get(size).getName(), (CharSequence) LauncherConstants.NOLOGO, false, 2, (Object) null) && UtilsKt.isFlavorWithLogo()) {
                                    list.remove(size);
                                } else {
                                    StringsKt__StringsKt.contains$default((CharSequence) list.get(size).getName(), (CharSequence) "launcher.apk", false, 2, (Object) null);
                                    String path = list.get(size).getPath();
                                    if (StringsKt__StringsJVMKt.startsWith$default(path, LauncherConstants.FILES_SLASH, false, 2, null)) {
                                        path = path.substring(StringsKt__StringsKt.indexOf$default((CharSequence) path, LauncherConstants.FILES_SLASH, 0, false, 6, (Object) null) + 6);
                                        Intrinsics.checkNotNullExpressionValue(path, "substring(...)");
                                    }
                                    File file = new File(str + path + list.get(size).getName());
                                    if (StringsKt__StringsKt.contains$default((CharSequence) list.get(size).getName(), (CharSequence) LauncherConstants.NOLOGO, false, 2, (Object) null) && UtilsKt.isFlavorWithLogo()) {
                                        list.remove(size);
                                    } else {
                                        MyFile fileByPathAndName = MainActivityViewModel.this.launcherDatabase.myFileDao().getFileByPathAndName(list.get(size).getPath(), list.get(size).getName());
                                        if (fileByPathAndName == null) {
                                            MainActivityViewModel.this.launcherDatabase.myFileDao().insert(list.get(size));
                                            if (file.exists() && file.length() == list.get(size).getSize()) {
                                                MainActivityViewModel.this.launcherDatabase.myFileDao().setMyFileDownloadedByPathAndName(true, list.get(size).getPath(), list.get(size).getName());
                                                list.remove(size);
                                            }
                                        } else if (fileByPathAndName.getDownloaded() && Intrinsics.areEqual(fileByPathAndName.getData(), list.get(size).getData()) && file.exists() && file.length() == list.get(size).getSize()) {
                                            list.remove(size);
                                        } else {
                                            MyFile myFile = list.get(size);
                                            myFile.setId(fileByPathAndName.getId());
                                            MainActivityViewModel.this.launcherDatabase.myFileDao().updateMyFile(myFile);
                                        }
                                    }
                                }
                                if (i2 >= 0) {
                                    break;
                                }
                                size = i2;
                            }
                        }
                    }
                    Iterator<MyFile> it = list.iterator();
                    long size2 = 0;
                    while (it.hasNext()) {
                        size2 += it.next().getSize();
                    }
                    MainActivityViewModel.this.launcherDatabase.myFileDao().insertAll(list);
                    MainActivityViewModel.this.mutableFilesLiveData.postValue(list);
                    MainActivityViewModel.this.sizeOfUpdateMutableLiveData.postValue(Boxing.boxLong(size2));
                }
            } else {
                MainActivityViewModel.this.countOfErrors++;
                if (MainActivityViewModel.this.countOfErrors < 6) {
                    MainActivityViewModel.this._descriptionForFragmentInitialization.setValue(MainActivityViewModel.this.stringResource.getString(R.string.launcher_error_connect_with_counter, Boxing.boxInt(MainActivityViewModel.this.countOfErrors + 1), Boxing.boxInt(6)));
                    this.label = 3;
                    if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    MainActivityViewModel.this.checkUpdate();
                } else {
                    MainActivityViewModel.this.mutableOnErrorResponse.postValue("ErrorBody: " + response.errorBody() + "  Response.Message: " + response.message() + "  Response.Code: " + response.code());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MainActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1", m7120f = "MainActivityViewModel.kt", m7121i = {}, m7122l = {390}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1 */
    /* loaded from: classes8.dex */
    public static final class C65521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65521(Continuation<? super C65521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainActivityViewModel.this.new C65521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AppConfigModel> appConfig = MainActivityViewModel.this.launcherRepository.getAppConfig();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(MainActivityViewModel.this);
                this.label = 1;
                if (appConfig.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: MainActivityViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "data", "Lcom/blackhub/bronline/game/model/local/AppConfigModel;", "emit", "(Lcom/blackhub/bronline/game/model/local/AppConfigModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$checkAppVersion$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ MainActivityViewModel this$0;

            public AnonymousClass2(MainActivityViewModel mainActivityViewModel) {
                this.this$0 = mainActivityViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(@Nullable AppConfigModel appConfigModel, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                MainActivityViewModel$checkAppVersion$1$2$emit$1 mainActivityViewModel$checkAppVersion$1$2$emit$1;
                MutableLiveData mutableLiveData;
                if (continuation instanceof MainActivityViewModel$checkAppVersion$1$2$emit$1) {
                    mainActivityViewModel$checkAppVersion$1$2$emit$1 = (MainActivityViewModel$checkAppVersion$1$2$emit$1) continuation;
                    int i = mainActivityViewModel$checkAppVersion$1$2$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mainActivityViewModel$checkAppVersion$1$2$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        mainActivityViewModel$checkAppVersion$1$2$emit$1 = new MainActivityViewModel$checkAppVersion$1$2$emit$1(this, continuation);
                    }
                }
                Object obj = mainActivityViewModel$checkAppVersion$1$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = mainActivityViewModel$checkAppVersion$1$2$emit$1.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (appConfigModel != null) {
                        MainActivityViewModel mainActivityViewModel = this.this$0;
                        MutableLiveData mutableLiveData2 = mainActivityViewModel._isActualVersion;
                        mainActivityViewModel$checkAppVersion$1$2$emit$1.L$0 = mutableLiveData2;
                        mainActivityViewModel$checkAppVersion$1$2$emit$1.label = 1;
                        Object objIsLauncherVersionActual = mainActivityViewModel.isLauncherVersionActual(mainActivityViewModel$checkAppVersion$1$2$emit$1);
                        if (objIsLauncherVersionActual == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = objIsLauncherVersionActual;
                        mutableLiveData = mutableLiveData2;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutableLiveData mutableLiveData3 = (MutableLiveData) mainActivityViewModel$checkAppVersion$1$2$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutableLiveData = mutableLiveData3;
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AppConfigModel) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    public final void checkAppVersion() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C65521(null), 1, null);
    }

    public final void checkRustoreUpdateAvailability(RuStoreAppUpdateManager ruStoreAppUpdateManager, OnSuccessListener<AppUpdateInfo> onSuccessListener) {
        ruStoreAppUpdateManager.getAppUpdateInfo().addOnSuccessListener(onSuccessListener).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda6
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                MainActivityViewModel.checkRustoreUpdateAvailability$lambda$4(th);
            }
        });
    }

    public static final void checkRustoreUpdateAvailability$lambda$4(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore getAppUpdateInfo error " + throwable.getMessage());
    }

    public final OnSuccessListener<AppUpdateInfo> checkRustoreUpdateAvailabilityListener(final RuStoreAppUpdateManager updateManager) {
        return new OnSuccessListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda5
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                MainActivityViewModel.checkRustoreUpdateAvailabilityListener$lambda$7(this.f$0, updateManager, (AppUpdateInfo) obj);
            }
        };
    }

    public static final void checkRustoreUpdateAvailabilityListener$lambda$7(final MainActivityViewModel this$0, final RuStoreAppUpdateManager updateManager, AppUpdateInfo result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(updateManager, "$updateManager");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getUpdateAvailability() == 2) {
            this$0.startRustoreUpdateFlow(updateManager, result, new OnSuccessListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda2
                @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    MainActivityViewModel.checkRustoreUpdateAvailabilityListener$lambda$7$lambda$6(this.f$0, updateManager, ((Integer) obj).intValue());
                }
            });
        } else {
            this$0._isActualVersion.postValue(Boolean.TRUE);
        }
    }

    public static final void checkRustoreUpdateAvailabilityListener$lambda$7$lambda$6(MainActivityViewModel this$0, RuStoreAppUpdateManager updateManager, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(updateManager, "$updateManager");
        if (i != -1) {
            if (i != 0) {
                return;
            }
            this$0._isNeedToCloseApp.setValue(Boolean.TRUE);
        } else {
            InstallStateUpdateListener installStateUpdateListenerInitInstallStateUpdateListener = this$0.initInstallStateUpdateListener(updateManager);
            this$0.rustoreUpdateListener = installStateUpdateListenerInitInstallStateUpdateListener;
            if (installStateUpdateListenerInitInstallStateUpdateListener != null) {
                updateManager.registerListener(installStateUpdateListenerInitInstallStateUpdateListener);
            }
        }
    }

    public final void startRustoreUpdateFlow(RuStoreAppUpdateManager ruStoreAppUpdateManager, AppUpdateInfo appUpdateInfo, OnSuccessListener<Integer> onSuccessListener) {
        ruStoreAppUpdateManager.startUpdateFlow(appUpdateInfo, new AppUpdateOptions.Builder().appUpdateType(1).build()).addOnSuccessListener(onSuccessListener).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda3
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                MainActivityViewModel.startRustoreUpdateFlow$lambda$8(th);
            }
        });
    }

    public static final void startRustoreUpdateFlow$lambda$8(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsLog("startRustoreUpdateFlow addOnFailureListener " + throwable);
    }

    public final void startRustoreApkUpdate(RuStoreAppUpdateManager ruStoreAppUpdateManager) {
        ruStoreAppUpdateManager.completeUpdate(new AppUpdateOptions.Builder().appUpdateType(0).build()).addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                MainActivityViewModel.startRustoreApkUpdate$lambda$9(th);
            }
        });
    }

    public static final void startRustoreApkUpdate$lambda$9(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore startRustoreApkUpdate error " + throwable.getMessage());
    }

    public final InstallStateUpdateListener initInstallStateUpdateListener(final RuStoreAppUpdateManager ruStoreAppUpdateManager) {
        return new InstallStateUpdateListener() { // from class: com.blackhub.bronline.launcher.viewmodel.MainActivityViewModel$$ExternalSyntheticLambda4
            @Override // ru.rustore.sdk.appupdate.listener.InstallStateUpdateListener
            public final void onStateUpdated(InstallState installState) {
                MainActivityViewModel.initInstallStateUpdateListener$lambda$10(this.f$0, ruStoreAppUpdateManager, installState);
            }
        };
    }

    public static final void initInstallStateUpdateListener$lambda$10(MainActivityViewModel this$0, RuStoreAppUpdateManager ruStoreAppUpdateManager, InstallState state) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ruStoreAppUpdateManager, "$ruStoreAppUpdateManager");
        Intrinsics.checkNotNullParameter(state, "state");
        int installStatus = state.getInstallStatus();
        if (installStatus == 1) {
            UtilsKt.crashlyticsLog("initViews:state.installStatus DOWNLOADED");
            this$0.startRustoreApkUpdate(ruStoreAppUpdateManager);
            return;
        }
        if (installStatus != 2) {
            if (installStatus != 3) {
                return;
            }
            UtilsKt.crashlyticsLog("Rustore Downloading apk error " + state.getInstallErrorCode());
            return;
        }
        long totalBytesToDownload = state.getTotalBytesToDownload();
        UtilsKt.crashlyticsLog("initViews:state.installStatus DOWNLOADING " + state.getBytesDownloaded() + " / " + totalBytesToDownload + " ");
    }

    @AddTrace(name = "MainActivityViewModel getListOfFiles()")
    public final List<File> getListOfFiles(File parentDir) {
        Trace traceStartTrace = FirebasePerformance.startTrace("MainActivityViewModel getListOfFiles()");
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = parentDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    Intrinsics.checkNotNull(file);
                    arrayList.addAll(getListOfFiles(file));
                } else {
                    arrayList.add(file);
                }
            }
        }
        traceStartTrace.stop();
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getServerAppVersion(Continuation<? super AppVersionResponse> continuation) throws Throwable {
        C65561 c65561;
        if (continuation instanceof C65561) {
            c65561 = (C65561) continuation;
            int i = c65561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c65561.label = i - Integer.MIN_VALUE;
            } else {
                c65561 = new C65561(continuation);
            }
        }
        Object remoteAppVersion = c65561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c65561.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(remoteAppVersion);
                LauncherRepository launcherRepository = this.launcherRepository;
                c65561.label = 1;
                remoteAppVersion = launcherRepository.getRemoteAppVersion(c65561);
                if (remoteAppVersion == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(remoteAppVersion);
            }
            Response response = (Response) remoteAppVersion;
            AppVersionResponse appVersionResponse = (AppVersionResponse) response.body();
            if (appVersionResponse == null) {
                return null;
            }
            if (response.isSuccessful()) {
                return appVersionResponse;
            }
            return null;
        } catch (Exception e) {
            UtilsKt.crashlyticsLog("getRemoteAppVersion exception: " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isLauncherVersionActual(Continuation<? super Boolean> continuation) throws Throwable {
        C65581 c65581;
        long longVersionCode;
        if (continuation instanceof C65581) {
            c65581 = (C65581) continuation;
            int i = c65581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c65581.label = i - Integer.MIN_VALUE;
            } else {
                c65581 = new C65581(continuation);
            }
        }
        Object obj = c65581.result;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c65581.label;
        boolean z = false;
        Long lBoxLong = null;
        lBoxLong = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PackageManager packageManager = this.application.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            PackageInfo packageInfo = getPackageInfo(packageManager);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
            } else {
                longVersionCode = packageInfo.versionCode;
            }
            File externalFilesDir = this.application.getExternalFilesDir(null);
            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
            PackageInfo infoAboutApp = getInfoAboutApp(packageManager, absolutePath + Settings.LAUNCHER_NAME);
            if (i3 >= 28) {
                if (infoAboutApp != null) {
                    lBoxLong = Boxing.boxLong(infoAboutApp.getLongVersionCode());
                }
            } else if (infoAboutApp != null) {
                lBoxLong = Boxing.boxLong(infoAboutApp.versionCode);
            }
            if (lBoxLong == null || longVersionCode >= lBoxLong.longValue()) {
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            AppVersionResponse appVersionResponse = (AppVersionResponse) obj;
            if (IntExtensionKt.getOrZero(appVersionResponse != null ? appVersionResponse.getVersionAndroidMarket() : null) <= 1132) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppVersionResponse appVersionResponse2 = (AppVersionResponse) obj;
            if (IntExtensionKt.getOrZero(appVersionResponse2 != null ? appVersionResponse2.getVersionAndroidRuStore() : null) <= 1132) {
                z = true;
            }
        }
        return Boxing.boxBoolean(z);
    }

    public final PackageInfo getPackageInfo(PackageManager pm) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = pm.getPackageInfo(Settings.CLIENT_PACKAGE, PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = pm.getPackageInfo(Settings.CLIENT_PACKAGE, 0);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    public final PackageInfo getInfoAboutApp(PackageManager pm, String fullPath) {
        if (Build.VERSION.SDK_INT >= 33) {
            return pm.getPackageArchiveInfo(fullPath, PackageManager.PackageInfoFlags.of(0L));
        }
        return pm.getPackageArchiveInfo(fullPath, 0);
    }

    @AddTrace(name = "MainActivityViewModel checkUpdate()")
    public final void checkUpdate() {
        Trace traceStartTrace = FirebasePerformance.startTrace("MainActivityViewModel checkUpdate()");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO().plus(new C6550xf3a08bde(CoroutineExceptionHandler.INSTANCE, this)), null, new C65531(null), 2, null);
        traceStartTrace.stop();
    }
}
