package ru.rustore.sdk.appupdate;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateParams;
import ru.rustore.sdk.core.exception.RuStoreConnectionTimeout;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.reactive.single.SingleMapErrorKt;
import ru.rustore.sdk.reactive.single.SingleTimeoutKt;

/* renamed from: ru.rustore.sdk.appupdate.r */
/* loaded from: classes6.dex */
public final class C11394r {

    /* renamed from: a */
    @NotNull
    public final Context f10141a;

    /* renamed from: b */
    @NotNull
    public final C11391o f10142b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ru.rustore.sdk.appupdate.r$a */
    /* loaded from: classes8.dex */
    public static final class a<T> extends Lambda implements Function1<SingleEmitter<T>, Unit> {

        /* renamed from: b */
        public final /* synthetic */ Function1<SingleEmitter<T>, ServiceConnection> f10144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super SingleEmitter<T>, ? extends ServiceConnection> function1) {
            super(1);
            this.f10144b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            Object objM15699constructorimpl;
            SingleEmitter<T> emitter = (SingleEmitter) obj;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C11394r c11394r = C11394r.this;
            Function1<SingleEmitter<T>, ServiceConnection> function1 = this.f10144b;
            try {
                Result.Companion companion = Result.INSTANCE;
                ServiceConnection serviceConnectionInvoke = function1.invoke(emitter);
                emitter.onFinish(new C11392p(c11394r, serviceConnectionInvoke));
                C11394r.m7437a(c11394r, c11394r.f10141a, new C11393q(emitter), serviceConnectionInvoke);
                objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
            if (thM15702exceptionOrNullimpl != null) {
                emitter.error(thM15702exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.appupdate.r$b */
    /* loaded from: classes8.dex */
    public static final class b extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: a */
        public static final b f10145a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(Throwable th) {
            Throwable error = th;
            Intrinsics.checkNotNullParameter(error, "error");
            return error instanceof TimeoutException ? new RuStoreConnectionTimeout() : error;
        }
    }

    public C11394r(@NotNull Context context, @NotNull C11391o appUpdateInfoMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appUpdateInfoMapper, "appUpdateInfoMapper");
        this.f10141a = context;
        this.f10142b = appUpdateInfoMapper;
    }

    /* renamed from: a */
    public static final void m7437a(C11394r c11394r, Context context, C11393q c11393q, ServiceConnection serviceConnection) {
        List<ResolveInfo> listQueryIntentServices;
        String str;
        if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
            c11393q.invoke(new RuStoreNotInstalledException());
            return;
        }
        Intent intent = new Intent("ru.vk.store.provider.appupdate.RemoteAppUpdateFlowProvider");
        if (Build.VERSION.SDK_INT >= 33) {
            listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, PackageManager.ResolveInfoFlags.of(0L));
            str = "packageManager\n         ….ResolveInfoFlags.of(0L))";
        } else {
            listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            str = "packageManager\n         …IntentServices(intent, 0)";
        }
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, str);
        ComponentName componentNameFindRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(listQueryIntentServices);
        if (componentNameFindRuStoreServiceComponentName == null) {
            c11393q.invoke(new RuStoreOutdatedException());
        } else {
            intent.setComponent(componentNameFindRuStoreServiceComponentName);
            context.bindService(intent, serviceConnection, 1);
        }
    }

    /* renamed from: a */
    public static final AppUpdateParams m7436a(C11394r c11394r, Context context) {
        c11394r.getClass();
        int i = Build.VERSION.SDK_INT;
        return new AppUpdateParams(i >= 28 ? (i >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(1L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 1)).getLongVersionCode() : r4.versionCode);
    }

    /* renamed from: a */
    public final <T> Single<T> m7438a(Function1<? super SingleEmitter<T>, ? extends ServiceConnection> function1) {
        return SingleMapErrorKt.mapError(SingleTimeoutKt.timeout$default(Single.INSTANCE.create(new a(function1)), 20000L, TimeUnit.MILLISECONDS, null, 4, null), b.f10145a);
    }
}
