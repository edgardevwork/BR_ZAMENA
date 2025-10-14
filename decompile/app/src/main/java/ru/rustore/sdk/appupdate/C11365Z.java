package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.appupdate.C11375e0;
import ru.rustore.sdk.appupdate.listener.InstallStateUpdateListener;
import ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.observable.ObservableObserveOnKt;
import ru.rustore.sdk.reactive.observable.ObservableSubscribeKt;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleFlatMapKt;
import ru.rustore.sdk.reactive.single.SingleMapKt;
import ru.rustore.sdk.reactive.single.SingleOnErrorReturnKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.reactive.subject.Subject;

/* renamed from: ru.rustore.sdk.appupdate.Z */
/* loaded from: classes8.dex */
public final class C11365Z implements RuStoreAppUpdateManager {

    /* renamed from: a */
    @NotNull
    public final Lazy f10067a;

    /* renamed from: b */
    @NotNull
    public final LinkedHashSet f10068b;

    /* renamed from: c */
    @NotNull
    public final C11374e f10069c;

    /* renamed from: d */
    @Nullable
    public AppUpdateOptions f10070d;

    public C11365Z(Context applicationContext) {
        C11375e0 c11375e0;
        Intrinsics.checkNotNullParameter(applicationContext, "context");
        this.f10067a = LazyKt__LazyJVMKt.lazy(new C11360U(applicationContext));
        this.f10068b = new LinkedHashSet();
        C11356Q c11356q = new C11356Q();
        new C11375e0.a();
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        synchronized (C11375e0.a.class) {
            c11375e0 = C11375e0.f10091i;
            if (c11375e0 == null) {
                c11375e0 = new C11375e0(applicationContext, null);
                C11375e0.f10091i = c11375e0;
            }
        }
        C11374e c11374e = (C11374e) c11375e0.f10094c.getValue();
        this.f10069c = c11374e;
        c11374e.getClass();
        C11382i event = new C11382i("sdkInfo", (Map) c11374e.f10086f.getValue());
        C11390n c11390n = c11374e.f10081a;
        c11390n.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        Single singleFlatMap = SingleFlatMapKt.flatMap(Single.INSTANCE.from(new C11385k(c11390n, event)), new C11386l(c11390n));
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        SingleSubscribeKt.subscribe$default(SingleOnErrorReturnKt.onErrorReturn(SingleSubscribeOnKt.subscribeOn(singleFlatMap, dispatchers.getIo()), C11387m.f10130a), null, C11380h.f10115a, 1, null);
        ObservableSubscribeKt.subscribe$default(ObservableObserveOnKt.observeOn$default(Subject.DefaultImpls.observe$default(c11356q.f10060b, null, 1, null), dispatchers.getMain(), null, 2, null), null, null, new C11361V(this), 3, null);
        ContextCompat.registerReceiver(applicationContext, new C11358S(c11356q), new IntentFilter("rustore_app_downloading_state_" + applicationContext.getPackageName()), 2);
    }

    @Override // ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager
    @NotNull
    public final Task<Unit> completeUpdate(@NotNull AppUpdateOptions appUpdateOptions) {
        Intrinsics.checkNotNullParameter(appUpdateOptions, "appUpdateOptions");
        int appUpdateType = appUpdateOptions.getAppUpdateType();
        C11374e c11374e = this.f10069c;
        c11374e.getClass();
        Single singleFrom = Single.INSTANCE.from(new C11366a(c11374e, new C11382i("updateStart.update", c11374e.m7430a(appUpdateType))));
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        SingleSubscribeKt.subscribe$default(SingleSubscribeOnKt.subscribeOn(singleFrom, dispatchers.getIo()), null, C11368b.f10076a, 1, null);
        C11394r c11394r = (C11394r) this.f10067a.getValue();
        c11394r.getClass();
        return C11359T.m7428a(SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(c11394r.m7438a(new C11397u(c11394r)), new C11401y(c11394r, appUpdateType)), dispatchers.getIo()));
    }

    @Override // ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager
    @NotNull
    public final Task<AppUpdateInfo> getAppUpdateInfo() {
        C11394r c11394r = (C11394r) this.f10067a.getValue();
        c11394r.getClass();
        return C11359T.m7428a(SingleSubscribeOnKt.subscribeOn(c11394r.m7438a(new C11341B(c11394r)), Dispatchers.INSTANCE.getIo()));
    }

    @Override // ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager
    public final void registerListener(@NotNull InstallStateUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f10068b.add(listener);
    }

    @Override // ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager
    @NotNull
    public final Task<Integer> startUpdateFlow(@NotNull AppUpdateInfo appUpdateInfo, @NotNull AppUpdateOptions appUpdateOptions) {
        Single singleSubscribeOn;
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        Intrinsics.checkNotNullParameter(appUpdateOptions, "appUpdateOptions");
        this.f10070d = appUpdateOptions;
        if (appUpdateInfo.getUpdateAvailability() != 2) {
            this.f10069c.m7431a(appUpdateOptions.getAppUpdateType(), "update not available");
            singleSubscribeOn = Single.INSTANCE.create(new C11362W());
        } else if (appUpdateInfo.getIsUsed()) {
            this.f10069c.m7431a(appUpdateOptions.getAppUpdateType(), "AppUpdateInfo object is already used. Call the method getAppUpdateInfo() again");
            singleSubscribeOn = Single.INSTANCE.create(new C11363X());
        } else {
            C11374e c11374e = this.f10069c;
            int appUpdateType = appUpdateOptions.getAppUpdateType();
            c11374e.getClass();
            C11382i c11382i = new C11382i("updateStart.request", c11374e.m7430a(appUpdateType));
            Single.Companion companion = Single.INSTANCE;
            Single singleFrom = companion.from(new C11376f(c11374e, c11382i));
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            SingleSubscribeKt.subscribe$default(SingleSubscribeOnKt.subscribeOn(singleFrom, dispatchers.getIo()), null, C11378g.f10114a, 1, null);
            int appUpdateType2 = appUpdateOptions.getAppUpdateType();
            if (appUpdateType2 == 1) {
                C11394r c11394r = (C11394r) this.f10067a.getValue();
                c11394r.getClass();
                Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
                singleSubscribeOn = SingleSubscribeOnKt.subscribeOn(companion.create(new C11344E(c11394r, appUpdateInfo)), dispatchers.getIo());
            } else if (appUpdateType2 != 2) {
                C11394r c11394r2 = (C11394r) this.f10067a.getValue();
                c11394r2.getClass();
                Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
                singleSubscribeOn = SingleSubscribeOnKt.subscribeOn(SingleFlatMapKt.flatMap(c11394r2.m7438a(new C11400x(c11394r2)), new C11348I(c11394r2, appUpdateInfo)), dispatchers.getIo());
            } else {
                C11394r c11394r3 = (C11394r) this.f10067a.getValue();
                c11394r3.getClass();
                Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
                singleSubscribeOn = SingleMapKt.map(SingleSubscribeOnKt.subscribeOn(c11394r3.m7438a(new C11347H(c11394r3, appUpdateInfo)), dispatchers.getIo()), C11364Y.f10066a);
            }
        }
        return C11359T.m7428a(singleSubscribeOn);
    }

    @Override // ru.rustore.sdk.appupdate.manager.RuStoreAppUpdateManager
    public final void unregisterListener(@NotNull InstallStateUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f10068b.remove(listener);
    }
}
