package com.blackhub.bronline.launcher.download;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.launcher.App;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.blackhub.bronline.launcher.Settings;
import com.blackhub.bronline.launcher.activities.MainActivity;
import com.blackhub.bronline.launcher.data.MyFile;
import com.blackhub.bronline.launcher.database.LauncherDatabase;
import com.bless.client.R;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientKt;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.android.Android;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCodeKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p051io.FilesKt__FileReadWriteKt;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DownloadWorker.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0003J\b\u0010&\u001a\u00020'H\u0003J\u000e\u0010(\u001a\u00020)H\u0096@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020%H\u0096@¢\u0006\u0002\u0010*R!\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/download/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "client", "Lio/ktor/client/HttpClient;", "getClient$annotations", "()V", "getClient", "()Lio/ktor/client/HttpClient;", "client$delegate", "Lkotlin/Lazy;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "countSizeFiles", "", "finalTotalSizeFiles", "gamePath", "", "intentForReturnAppInForeground", "Landroid/content/Intent;", "launcherDatabase", "Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "getLauncherDatabase", "()Lcom/blackhub/bronline/launcher/database/LauncherDatabase;", "setLauncherDatabase", "(Lcom/blackhub/bronline/launcher/database/LauncherDatabase;)V", "openFragmentPendingIntent", "Landroid/app/PendingIntent;", "createDirAndReturnPath", "myFilePath", "createDownloadFinishedNotification", "Landroidx/core/app/NotificationCompat$Builder;", "createForegroundInfo", "Landroidx/work/ForegroundInfo;", "createNotificationChannel", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFile", "myFile", "Lcom/blackhub/bronline/launcher/data/MyFile;", "(Lcom/blackhub/bronline/launcher/data/MyFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfo", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,378:1\n48#2,4:379\n37#3,2:383\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker\n*L\n105#1:379,4\n293#1:383,2\n*E\n"})
/* loaded from: classes6.dex */
public final class DownloadWorker extends CoroutineWorker {

    @NotNull
    public static final String FinalSize = "TOTAL_SIZE_FILES";

    @NotNull
    public static final String GamePath = "GAME_PATH";

    @NotNull
    public static final String Progress = "Progress";

    /* renamed from: client$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy client;

    @NotNull
    public final Context context;

    @NotNull
    public final CoroutineExceptionHandler coroutineExceptionHandler;
    public long countSizeFiles;
    public long finalTotalSizeFiles;

    @NotNull
    public String gamePath;

    @NotNull
    public final Intent intentForReturnAppInForeground;

    @Inject
    public LauncherDatabase launcherDatabase;

    @NotNull
    public final PendingIntent openFragmentPendingIntent;
    public static final int $stable = 8;

    /* compiled from: DownloadWorker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.download.DownloadWorker", m7120f = "DownloadWorker.kt", m7121i = {}, m7122l = {221}, m7123m = "doWork", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$doWork$1 */
    /* loaded from: classes7.dex */
    public static final class C65271 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C65271(Continuation<? super C65271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadWorker.this.doWork(this);
        }
    }

    public static /* synthetic */ void getClient$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
        this.gamePath = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        this.finalTotalSizeFiles = -1L;
        this.client = LazyKt__LazyJVMKt.lazy(new Function0<HttpClient>() { // from class: com.blackhub.bronline.launcher.download.DownloadWorker$client$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HttpClient invoke() {
                HttpClient httpClientHttpClient$default = HttpClientKt.HttpClient$default(Android.INSTANCE, null, 2, null);
                if (UtilsKt.isAddBasicAuth()) {
                    ((HttpSend) HttpClientPluginKt.plugin(httpClientHttpClient$default, HttpSend.INSTANCE)).intercept(new DownloadWorker$client$2$1$1(null));
                }
                return httpClientHttpClient$default;
            }
        });
        this.coroutineExceptionHandler = new DownloadWorker$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this);
        App.INSTANCE.appComponent().inject(this);
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        this.intentForReturnAppInForeground = intent;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        this.openFragmentPendingIntent = activity;
    }

    public final HttpClient getClient() {
        return (HttpClient) this.client.getValue();
    }

    @NotNull
    public final LauncherDatabase getLauncherDatabase() {
        LauncherDatabase launcherDatabase = this.launcherDatabase;
        if (launcherDatabase != null) {
            return launcherDatabase;
        }
        Intrinsics.throwUninitializedPropertyAccessException("launcherDatabase");
        return null;
    }

    public final void setLauncherDatabase(@NotNull LauncherDatabase launcherDatabase) {
        Intrinsics.checkNotNullParameter(launcherDatabase, "<set-?>");
        this.launcherDatabase = launcherDatabase;
    }

    @RequiresApi(26)
    public final void createNotificationChannel() {
        String string = this.context.getString(R.string.notification_download_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = this.context.getString(R.string.notification_download_name);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        NotificationUtil$$ExternalSyntheticApiModelOutline1.m646m();
        NotificationChannel notificationChannelM28m = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m28m(string, string2, 4);
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannelM28m);
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object getForegroundInfo(@NotNull Continuation<? super ForegroundInfo> continuation) {
        return createForegroundInfo(0L, this.finalTotalSizeFiles);
    }

    @SuppressLint({"InlinedApi"})
    public final ForegroundInfo createForegroundInfo(long countSizeFiles, long finalTotalSizeFiles) {
        String string = getApplicationContext().getString(R.string.notification_download_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getApplicationContext().getString(R.string.loading_percent);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        float f = 1048576;
        float f2 = countSizeFiles / f;
        float f3 = finalTotalSizeFiles / f;
        int i = (int) ((f2 / f3) * 100);
        if (i > 100) {
            i = 100;
        }
        String string3 = getApplicationContext().getString(R.string.common_cancel);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        PendingIntent pendingIntentCreateCancelPendingIntent = WorkManager.getInstance(getApplicationContext()).createCancelPendingIntent(getId());
        Intrinsics.checkNotNullExpressionValue(pendingIntentCreateCancelPendingIntent, "createCancelPendingIntent(...)");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            createNotificationChannel();
        }
        Notification notificationBuild = new NotificationCompat.Builder(getApplicationContext(), string).setContentTitle(string2).setTicker(string2).setContentText(getApplicationContext().getString(R.string.common_loaded, Float.valueOf(f2), Float.valueOf(f3))).setSmallIcon(R.drawable.img_logo_br_small).setProgress(100, i, false).setOngoing(true).setSilent(true).setContentIntent(this.openFragmentPendingIntent).setVisibility(1).setCategory("progress").setAutoCancel(false).addAction(android.R.drawable.ic_delete, string3, pendingIntentCreateCancelPendingIntent).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        if (i2 >= 29) {
            return new ForegroundInfo(LauncherConstants.NOTIFICATION_ID, notificationBuild, 1);
        }
        return new ForegroundInfo(LauncherConstants.NOTIFICATION_ID, notificationBuild);
    }

    public final NotificationCompat.Builder createDownloadFinishedNotification() {
        if (Build.VERSION.SDK_INT >= 26) {
            createNotificationChannel();
        }
        String string = getApplicationContext().getString(R.string.notification_download_channel_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getApplicationContext().getString(R.string.loading_finished);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(getApplicationContext(), string).setContentTitle(string2).setSmallIcon(R.drawable.img_logo_br_small).setContentIntent(this.openFragmentPendingIntent).setVisibility(1).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "setAutoCancel(...)");
        return autoCancel;
    }

    /* compiled from: DownloadWorker.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2", m7120f = "DownloadWorker.kt", m7121i = {0, 0}, m7122l = {250, 253}, m7123m = "invokeSuspend", m7124n = {"myFiles", "i"}, m7125s = {"L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$doWork$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1#2:379\n350#3,7:380\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$doWork$2\n*L\n242#1:380,7\n*E\n"})
    /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2 */
    /* loaded from: classes8.dex */
    public static final class C65282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        public int I$0;
        public int I$1;
        public Object L$0;
        public int label;

        public C65282(Continuation<? super C65282> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DownloadWorker.this.new C65282(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ListenableWorker.Result> continuation) {
            return ((C65282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0104 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:50:0x0139, B:13:0x002c, B:41:0x0104, B:39:0x00f8, B:6:0x0014, B:48:0x0134, B:45:0x011d), top: B:54:0x000e, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x011d A[Catch: Exception -> 0x0019, TRY_ENTER, TryCatch #0 {Exception -> 0x0019, blocks: (B:6:0x0014, B:48:0x0134, B:45:0x011d), top: B:54:0x000e, outer: #1 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0118 -> B:44:0x011b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List<MyFile> list;
            int size;
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        long size2 = 0;
                        long j = DownloadWorker.this.getInputData().getLong(DownloadWorker.FinalSize, 0L);
                        DownloadWorker downloadWorker = DownloadWorker.this;
                        String string = downloadWorker.getInputData().getString(DownloadWorker.GamePath);
                        if (string == null) {
                            string = "";
                        }
                        downloadWorker.gamePath = string;
                        DownloadWorker downloadWorker2 = DownloadWorker.this;
                        downloadWorker2.gamePath = StringsKt__StringsJVMKt.replace$default(downloadWorker2.gamePath, "com.br.top/files", AnyExtensionKt.empty(StringCompanionObject.INSTANCE), false, 4, (Object) null) + Settings.CLIENT_PACKAGE + LauncherConstants.SLASH_FILES_SLASH;
                        List<MyFile> notDownloadedFiles = DownloadWorker.this.getLauncherDatabase().myFileDao().getNotDownloadedFiles();
                        Iterator<T> it = notDownloadedFiles.iterator();
                        while (it.hasNext()) {
                            size2 += ((MyFile) it.next()).getSize();
                        }
                        DownloadWorker.this.finalTotalSizeFiles = size2;
                        if (DownloadWorker.this.finalTotalSizeFiles == -1) {
                            DownloadWorker.this.finalTotalSizeFiles = j;
                        }
                        if (UtilsKt.isFlavorWithLogo()) {
                            Iterator<MyFile> it2 = notDownloadedFiles.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i3 = -1;
                                    break;
                                }
                                if (Intrinsics.areEqual(it2.next().getName(), "launcher.apk")) {
                                    break;
                                }
                                i3++;
                            }
                            if (i3 != -1) {
                                Collections.swap(notDownloadedFiles, i3, CollectionsKt__CollectionsKt.getLastIndex(notDownloadedFiles));
                            }
                        }
                        list = notDownloadedFiles;
                        size = notDownloadedFiles.size();
                        i = 0;
                        if (i < size) {
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return ListenableWorker.Result.success();
                        }
                        size = this.I$1;
                        i = this.I$0;
                        list = (List) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        i++;
                        if (i < size) {
                            DownloadWorker downloadWorker3 = DownloadWorker.this;
                            MyFile myFile = list.get(i);
                            this.L$0 = list;
                            this.I$0 = i;
                            this.I$1 = size;
                            this.label = 1;
                            if (downloadWorker3.downloadFile(myFile, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i++;
                            if (i < size) {
                                MainCoroutineDispatcher main = Dispatchers.getMain();
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DownloadWorker.this, null);
                                this.L$0 = null;
                                this.label = 2;
                                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return ListenableWorker.Result.success();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Data.Builder builder = new Data.Builder();
                    e.printStackTrace();
                    Data dataBuild = builder.putString(LauncherConstants.ERROR_KEY, String.valueOf(Unit.INSTANCE)).build();
                    Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                    return ListenableWorker.Result.failure(dataBuild);
                }
            } catch (Exception e2) {
                Data.Builder builder2 = new Data.Builder();
                e2.printStackTrace();
                Data dataBuild2 = builder2.putString(LauncherConstants.ERROR_KEY, String.valueOf(Unit.INSTANCE)).build();
                Intrinsics.checkNotNullExpressionValue(dataBuild2, "build(...)");
                return ListenableWorker.Result.failure(dataBuild2);
            }
        }

        /* compiled from: DownloadWorker.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2$1", m7120f = "DownloadWorker.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$doWork$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ DownloadWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DownloadWorker downloadWorker, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = downloadWorker;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (ContextCompat.checkSelfPermission(this.this$0.context, "android.permission.POST_NOTIFICATIONS") == 0) {
                    NotificationManagerCompat.from(this.this$0.context).notify(LauncherConstants.NOTIFICATION_ID_FOR_DOWNLOAD_FINISHED_NOTIFICATION, this.this$0.createDownloadFinishedNotification().build());
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) throws Throwable {
        C65271 c65271;
        if (continuation instanceof C65271) {
            c65271 = (C65271) continuation;
            int i = c65271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c65271.label = i - Integer.MIN_VALUE;
            } else {
                c65271 = new C65271(continuation);
            }
        }
        Object objWithContext = c65271.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c65271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextPlus = Dispatchers.getIO().plus(this.coroutineExceptionHandler);
            C65282 c65282 = new C65282(null);
            c65271.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextPlus, c65282, c65271);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }

    public final String createDirAndReturnPath(String myFilePath) {
        String str;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strEmpty = AnyExtensionKt.empty(stringCompanionObject);
        String str2 = this.gamePath;
        String strSubstring = str2.substring(0, StringsKt__StringsKt.lastIndexOf$default((CharSequence) str2, "/", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (StringsKt__StringsJVMKt.startsWith$default(myFilePath, LauncherConstants.FILES_SLASH, false, 2, null)) {
            strEmpty = myFilePath.substring(StringsKt__StringsKt.indexOf$default((CharSequence) strEmpty, LauncherConstants.FILES_SLASH, 0, false, 6, (Object) null) + 6);
            Intrinsics.checkNotNullExpressionValue(strEmpty, "substring(...)");
        }
        String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) strEmpty, new String[]{"/"}, false, 0, 6, (Object) null).toArray(new String[0]);
        String strEmpty2 = AnyExtensionKt.empty(stringCompanionObject);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                str = "/" + strArr[i];
            } else {
                str = strArr[i];
            }
            strEmpty2 = strEmpty2 + str;
            File file = new File(strSubstring + "/" + strEmpty2);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return strEmpty;
    }

    /* compiled from: DownloadWorker.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2", m7120f = "DownloadWorker.kt", m7121i = {}, m7122l = {322}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt$prepareGet$4\n*L\n1#1,378:1\n404#2,4:379\n279#2:383\n167#2,2:385\n29#2:387\n406#3:384\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2\n*L\n321#1:379,4\n321#1:383\n321#1:385,2\n321#1:387\n321#1:384\n*E\n"})
    /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2 */
    /* loaded from: classes8.dex */
    public static final class C65292 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MyFile $myFile;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65292(MyFile myFile, Continuation<? super C65292> continuation) {
            super(2, continuation);
            this.$myFile = myFile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DownloadWorker.this.new C65292(this.$myFile, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C65292) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String strCreateDirAndReturnPath = DownloadWorker.this.createDirAndReturnPath(this.$myFile.getPath());
                    File file = new File(DownloadWorker.this.gamePath + strCreateDirAndReturnPath + this.$myFile.getName());
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        Boxing.boxBoolean(parentFile.mkdirs());
                    }
                    file.delete();
                    file.createNewFile();
                    UtilsKt.crashlyticsLog("start download: " + this.$myFile);
                    HttpClient client = DownloadWorker.this.getClient();
                    String str = Settings.CURRENT_CDN_URL + this.$myFile.getPath() + this.$myFile.getName();
                    HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                    HttpRequestKt.url(httpRequestBuilder, str);
                    httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                    HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, client);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(file, DownloadWorker.this, this.$myFile, null);
                    this.label = 1;
                    if (httpStatement.execute(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
                DownloadWorker.this.getLauncherDatabase().myFileDao().setMyFileDownloadedByPathAndName(false, this.$myFile.getPath(), this.$myFile.getName());
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DownloadWorker.kt */
        @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "httpResponse", "Lio/ktor/client/statement/HttpResponse;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1", m7120f = "DownloadWorker.kt", m7121i = {1, 2, 2, 3, 3}, m7122l = {379, 327, 334, 346, 359}, m7123m = "invokeSuspend", m7124n = {"channel", "channel", "packet", "channel", "packet"}, m7125s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nDownloadWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2$1\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n+ 4 Packet.kt\nio/ktor/utils/io/core/PacketKt\n*L\n1#1,378:1\n156#2:379\n17#3,3:380\n43#4:383\n*S KotlinDebug\n*F\n+ 1 DownloadWorker.kt\ncom/blackhub/bronline/launcher/download/DownloadWorker$downloadFile$2$1\n*L\n324#1:379\n324#1:380,3\n328#1:383\n*E\n"})
        /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Unit>, Object> {
            public final /* synthetic */ File $file;
            public final /* synthetic */ MyFile $myFile;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ DownloadWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(File file, DownloadWorker downloadWorker, MyFile myFile, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$file = file;
                this.this$0 = downloadWorker;
                this.$myFile = myFile;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$file, this.this$0, this.$myFile, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull HttpResponse httpResponse, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Path cross not found for [B:4:0x000f, B:17:0x004d], limit reached: 51 */
            /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0109 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0107 -> B:13:0x0031). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                ByteReadChannel byteReadChannel;
                ByteReadChannel byteReadChannel2;
                ByteReadPacket byteReadPacket;
                Data dataBuild;
                DownloadWorker downloadWorker;
                ByteReadPacket byteReadPacket2;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpResponse httpResponse = (HttpResponse) this.L$0;
                    if (!HttpStatusCodeKt.isSuccess(httpResponse.getStatus())) {
                        UtilsKt.crashlyticsLog("failure download: " + this.$myFile.getName() + " - " + httpResponse.getStatus());
                        if (UtilsKt.isNotPublicBuildType()) {
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            C118951 c118951 = new C118951(this.this$0, this.$myFile, httpResponse, null);
                            this.label = 5;
                            if (BuildersKt.withContext(main, c118951, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        this.this$0.getLauncherDatabase().myFileDao().setMyFileDownloadedByPathAndName(false, this.$myFile.getPath(), this.$myFile.getName());
                        return Unit.INSTANCE;
                    }
                    HttpClientCall call = httpResponse.getCall();
                    KType kTypeTypeOf = Reflection.typeOf(ByteReadChannel.class);
                    TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), Reflection.getOrCreateKotlinClass(ByteReadChannel.class), kTypeTypeOf);
                    this.label = 1;
                    obj = call.bodyNullable(typeInfoTypeInfoImpl, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj == null) {
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    if (obj == null) {
                        byteReadChannel = (ByteReadChannel) obj;
                        if (!byteReadChannel.isClosedForRead()) {
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
                    }
                } else if (i == 2) {
                    byteReadChannel = (ByteReadChannel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteReadPacket2 = (ByteReadPacket) obj;
                    if (!byteReadPacket2.getEndOfInput()) {
                    }
                    if (!byteReadChannel.isClosedForRead()) {
                    }
                } else if (i == 3) {
                    byteReadPacket = (ByteReadPacket) this.L$1;
                    byteReadChannel2 = (ByteReadChannel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    dataBuild = new Data.Builder().putLongArray(DownloadWorker.Progress, new long[]{this.this$0.countSizeFiles, this.this$0.finalTotalSizeFiles}).build();
                    Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                    downloadWorker = this.this$0;
                    this.L$0 = byteReadChannel2;
                    this.L$1 = byteReadPacket;
                    this.label = 4;
                    if (downloadWorker.setProgress(dataBuild, this) == coroutine_suspended) {
                    }
                    byteReadPacket2 = byteReadPacket;
                    byteReadChannel = byteReadChannel2;
                    if (!byteReadPacket2.getEndOfInput()) {
                    }
                    if (!byteReadChannel.isClosedForRead()) {
                    }
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.getLauncherDatabase().myFileDao().setMyFileDownloadedByPathAndName(false, this.$myFile.getPath(), this.$myFile.getName());
                        return Unit.INSTANCE;
                    }
                    byteReadPacket = (ByteReadPacket) this.L$1;
                    byteReadChannel2 = (ByteReadChannel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteReadPacket2 = byteReadPacket;
                    byteReadChannel = byteReadChannel2;
                    if (!byteReadPacket2.getEndOfInput()) {
                        FilesKt__FileReadWriteKt.appendBytes(this.$file, StringsKt.readBytes$default(byteReadPacket2, 0, 1, null));
                        this.this$0.countSizeFiles += r5.length;
                        DownloadWorker downloadWorker2 = this.this$0;
                        ForegroundInfo foregroundInfoCreateForegroundInfo = downloadWorker2.createForegroundInfo(downloadWorker2.countSizeFiles, this.this$0.finalTotalSizeFiles);
                        this.L$0 = byteReadChannel;
                        this.L$1 = byteReadPacket2;
                        this.label = 3;
                        if (downloadWorker2.setForeground(foregroundInfoCreateForegroundInfo, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel;
                        byteReadPacket = byteReadPacket2;
                        dataBuild = new Data.Builder().putLongArray(DownloadWorker.Progress, new long[]{this.this$0.countSizeFiles, this.this$0.finalTotalSizeFiles}).build();
                        Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                        downloadWorker = this.this$0;
                        this.L$0 = byteReadChannel2;
                        this.L$1 = byteReadPacket;
                        this.label = 4;
                        if (downloadWorker.setProgress(dataBuild, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadPacket2 = byteReadPacket;
                        byteReadChannel = byteReadChannel2;
                        if (!byteReadPacket2.getEndOfInput()) {
                        }
                    }
                    if (!byteReadChannel.isClosedForRead()) {
                        this.L$0 = byteReadChannel;
                        this.L$1 = null;
                        this.label = 2;
                        Object remaining = byteReadChannel.readRemaining(LauncherConstants.BYTES_BUFFER, this);
                        if (remaining == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadPacket2 = (ByteReadPacket) remaining;
                        if (!byteReadPacket2.getEndOfInput()) {
                        }
                        if (!byteReadChannel.isClosedForRead()) {
                            UtilsKt.crashlyticsLog("success download: " + this.$myFile.getName());
                            this.this$0.getLauncherDatabase().myFileDao().setMyFileDownloadedByPathAndName(true, this.$myFile.getPath(), this.$myFile.getName());
                            return Unit.INSTANCE;
                        }
                    }
                }
            }

            /* compiled from: DownloadWorker.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1$1", m7120f = "DownloadWorker.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: com.blackhub.bronline.launcher.download.DownloadWorker$downloadFile$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C118951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ HttpResponse $httpResponse;
                public final /* synthetic */ MyFile $myFile;
                public int label;
                public final /* synthetic */ DownloadWorker this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118951(DownloadWorker downloadWorker, MyFile myFile, HttpResponse httpResponse, Continuation<? super C118951> continuation) {
                    super(2, continuation);
                    this.this$0 = downloadWorker;
                    this.$myFile = myFile;
                    this.$httpResponse = httpResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C118951(this.this$0, this.$myFile, this.$httpResponse, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C118951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Toast.makeText(this.this$0.context, "failure download: " + this.$myFile.getName() + " - " + this.$httpResponse.getStatus(), 0).show();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final Object downloadFile(MyFile myFile, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO().plus(this.coroutineExceptionHandler), new C65292(myFile, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
