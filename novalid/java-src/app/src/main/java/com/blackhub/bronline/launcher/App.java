package com.blackhub.bronline.launcher;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.multidex.MultiDexApplication;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.common.MarketAnalytic;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserver;
import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserverImpl;
import com.blackhub.bronline.launcher.p021di.ApplicationComponent;
import com.blackhub.bronline.launcher.p021di.DaggerApplicationComponent;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.remoteconfig.AppId;
import ru.rustore.sdk.remoteconfig.AppVersion;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientBuilder;
import ru.rustore.sdk.remoteconfig.UpdateBehaviour;

/* compiled from: App.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/App;", "Landroidx/multidex/MultiDexApplication;", "()V", "appLifecycleObserver", "Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl;", "getAppLifecycleObserver", "()Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl;", "setAppLifecycleObserver", "(Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl;)V", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "addAppLifecycleObserver", "", "observer", "Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserver;", "deleteAppLifecycleObserver", "onCreate", "onTerminate", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\ncom/blackhub/bronline/launcher/App\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,123:1\n48#2,4:124\n*S KotlinDebug\n*F\n+ 1 App.kt\ncom/blackhub/bronline/launcher/App\n*L\n31#1:124,4\n*E\n"})
/* loaded from: classes4.dex */
public final class App extends MultiDexApplication {
    public static ApplicationComponent applicationComponent;

    @Nullable
    public static App instance;
    public static boolean isAppOpen;

    @Inject
    public AppLifecycleObserverImpl appLifecycleObserver;

    @NotNull
    public final CoroutineScope appScope;

    @NotNull
    public final CoroutineExceptionHandler exceptionHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    @NotNull
    public static final ApplicationComponent appComponent() {
        return INSTANCE.appComponent();
    }

    @JvmStatic
    @NotNull
    public static final String getInput(@NotNull Context context) {
        return INSTANCE.getInput(context);
    }

    @Nullable
    public static final App getInstance() {
        return INSTANCE.getInstance();
    }

    public App() {
        App$special$$inlined$CoroutineExceptionHandler$1 app$special$$inlined$CoroutineExceptionHandler$1 = new App$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE);
        this.exceptionHandler = app$special$$inlined$CoroutineExceptionHandler$1;
        this.appScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()).plus(app$special$$inlined$CoroutineExceptionHandler$1));
    }

    @NotNull
    public final AppLifecycleObserverImpl getAppLifecycleObserver() {
        AppLifecycleObserverImpl appLifecycleObserverImpl = this.appLifecycleObserver;
        if (appLifecycleObserverImpl != null) {
            return appLifecycleObserverImpl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appLifecycleObserver");
        return null;
    }

    public final void setAppLifecycleObserver(@NotNull AppLifecycleObserverImpl appLifecycleObserverImpl) {
        Intrinsics.checkNotNullParameter(appLifecycleObserverImpl, "<set-?>");
        this.appLifecycleObserver = appLifecycleObserverImpl;
    }

    @Override // android.app.Application
    public void onCreate() {
        ApplicationComponent applicationComponentBuild = DaggerApplicationComponent.builder().app(this).build();
        applicationComponent = applicationComponentBuild;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (applicationComponentBuild == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationComponent");
            applicationComponentBuild = null;
        }
        applicationComponentBuild.inject(this);
        super.onCreate();
        registerActivityLifecycleCallbacks(getAppLifecycleObserver());
        instance = this;
        String strM17614constructorimpl = AppId.m17614constructorimpl(BuildConfig.RUSTORE_APP_ID);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        new RemoteConfigClientBuilder(strM17614constructorimpl, applicationContext, defaultConstructorMarker).m17658setAppVersionnqGfzuc(AppVersion.m17621constructorimpl(BuildConfig.VERSION_NAME)).setUpdateBehaviour(UpdateBehaviour.Actual.INSTANCE).build().init();
        BuildersKt__Builders_commonKt.launch$default(this.appScope, null, null, new C65101(null), 3, null);
    }

    /* compiled from: App.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.App$onCreate$1", m7120f = "App.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.App$onCreate$1 */
    /* loaded from: classes8.dex */
    public static final class C65101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C65101(Continuation<? super C65101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return App.this.new C65101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                FirebaseApp.initializeApp(App.this);
                MarketAnalytic.INSTANCE.initialise(App.this);
                Settings.CLIENT_PACKAGE = App.this.getApplicationContext().getPackageName();
                Settings.LAUNCHER_PACKAGE = App.this.getApplicationContext().getPackageName();
                Settings.COUNTRY_MARKET_BY_SYSTEM_LANGUAGE = Locale.getDefault().getCountry();
                Context applicationContext = App.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                Settings.COUNTRY_MARKET_BY_TELEPHONE_MANAGER = UtilsKt.getNetworkCountry(applicationContext);
            } catch (Exception e) {
                UtilsKt.crashlyticsRecordNewException("App onCreate " + e);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        CoroutineScopeKt.cancel$default(this.appScope, null, 1, null);
    }

    public final void addAppLifecycleObserver(@NotNull AppLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        getAppLifecycleObserver().addObserver(observer);
    }

    public final void deleteAppLifecycleObserver(@NotNull AppLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        getAppLifecycleObserver().deleteObserver(observer);
    }

    /* compiled from: App.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/App$Companion;", "", "()V", "applicationComponent", "Lcom/blackhub/bronline/launcher/di/ApplicationComponent;", "<set-?>", "Lcom/blackhub/bronline/launcher/App;", "instance", "getInstance$annotations", "getInstance", "()Lcom/blackhub/bronline/launcher/App;", "isAppOpen", "", "()Z", "setAppOpen", "(Z)V", "appComponent", "getFileLength", "", "context", "Landroid/content/Context;", "getInput", "", "isClassPresent", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        public Companion() {
        }

        public final boolean isAppOpen() {
            return App.isAppOpen;
        }

        public final void setAppOpen(boolean z) {
            App.isAppOpen = z;
        }

        @Nullable
        public final App getInstance() {
            return App.instance;
        }

        @JvmStatic
        @NotNull
        public final ApplicationComponent appComponent() {
            ApplicationComponent applicationComponent = App.applicationComponent;
            if (applicationComponent != null) {
                return applicationComponent;
            }
            Intrinsics.throwUninitializedPropertyAccessException("applicationComponent");
            return null;
        }

        @NotNull
        public final String isClassPresent(@Nullable Context context) throws ClassNotFoundException {
            try {
                Class.forName("com.save");
                return "present";
            } catch (ClassNotFoundException unused) {
                return "clear";
            }
        }

        public final long getFileLength(@NotNull Context context) throws IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd("Text/japanese.gxt");
                Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
                return assetFileDescriptorOpenFd.getLength();
            } catch (Exception unused) {
                return 0L;
            }
        }

        @JvmStatic
        @NotNull
        public final String getInput(@NotNull Context context) throws IOException, ClassNotFoundException {
            Intrinsics.checkNotNullParameter(context, "context");
            return "ERROR|3.89|" + getFileLength(context) + "|" + isClassPresent(context);
        }
    }
}
