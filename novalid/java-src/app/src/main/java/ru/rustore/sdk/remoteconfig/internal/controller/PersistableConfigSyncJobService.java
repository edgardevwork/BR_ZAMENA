package ru.rustore.sdk.remoteconfig.internal.controller;

import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleDoOnDisposeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;
import ru.rustore.sdk.remoteconfig.internal.C11676F0;
import ru.rustore.sdk.remoteconfig.internal.C11718a1;
import ru.rustore.sdk.remoteconfig.internal.C11752n0;
import ru.rustore.sdk.remoteconfig.internal.InterfaceC11721b1;

@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/internal/controller/PersistableConfigSyncJobService;", "Landroid/app/job/JobService;", SegmentConstantPool.INITSTRING, "()V", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes5.dex */
public final class PersistableConfigSyncJobService extends JobService {

    /* renamed from: f */
    public static final /* synthetic */ int f10901f = 0;

    /* renamed from: a */
    public final InterfaceC11721b1 f10902a;

    /* renamed from: b */
    public final RemoteConfigClientEventListener f10903b;

    /* renamed from: c */
    public final C11752n0 f10904c;

    /* renamed from: d */
    public Disposable f10905d;

    /* renamed from: e */
    public volatile boolean f10906e;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService$a */
    /* loaded from: classes6.dex */
    public static final class C11725a extends Lambda implements Function0<Unit> {
        public C11725a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PersistableConfigSyncJobService persistableConfigSyncJobService;
            int iM7531a = C11718a1.m7531a(PersistableConfigSyncJobService.this.f10902a.invoke());
            if (iM7531a != 1) {
                if (iM7531a == 2) {
                    persistableConfigSyncJobService = PersistableConfigSyncJobService.this;
                }
                return Unit.INSTANCE;
            }
            PersistableConfigSyncJobService.this.f10903b.firstLoadComplete();
            persistableConfigSyncJobService = PersistableConfigSyncJobService.this;
            persistableConfigSyncJobService.f10903b.persistentStorageUpdated();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService$b */
    /* loaded from: classes6.dex */
    public static final class C11726b extends Lambda implements Function0<Unit> {

        /* renamed from: b */
        public final /* synthetic */ JobParameters f10909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11726b(JobParameters jobParameters) {
            super(0);
            this.f10909b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RemoteConfigException.BackgroundConfigUpdateError backgroundConfigUpdateError = new RemoteConfigException.BackgroundConfigUpdateError("Background sync job was canceled", null);
            PersistableConfigSyncJobService persistableConfigSyncJobService = PersistableConfigSyncJobService.this;
            persistableConfigSyncJobService.f10903b.backgroundJobErrors(backgroundConfigUpdateError);
            persistableConfigSyncJobService.f10904c.m7548a(backgroundConfigUpdateError);
            PersistableConfigSyncJobService.m7536a(PersistableConfigSyncJobService.this, this.f10909b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService$c */
    /* loaded from: classes6.dex */
    public static final class C11727c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public final /* synthetic */ JobParameters f10911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11727c(JobParameters jobParameters) {
            super(1);
            this.f10911b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable throwable = th;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            PersistableConfigSyncJobService persistableConfigSyncJobService = PersistableConfigSyncJobService.this;
            int i = PersistableConfigSyncJobService.f10901f;
            persistableConfigSyncJobService.getClass();
            RemoteConfigException.BackgroundConfigUpdateError backgroundConfigUpdateError = throwable instanceof RemoteConfigException.RemoteConfigNetworkException ? new RemoteConfigException.BackgroundConfigUpdateError("Network exception in background sync job", throwable) : throwable instanceof InterruptedException ? new RemoteConfigException.BackgroundConfigUpdateError("Background sync job was canceled", throwable) : new RemoteConfigException.BackgroundConfigUpdateError("Unknown error in background sync job", throwable);
            PersistableConfigSyncJobService persistableConfigSyncJobService2 = PersistableConfigSyncJobService.this;
            persistableConfigSyncJobService2.f10903b.backgroundJobErrors(backgroundConfigUpdateError);
            persistableConfigSyncJobService2.f10904c.m7548a(backgroundConfigUpdateError);
            PersistableConfigSyncJobService.m7536a(PersistableConfigSyncJobService.this, this.f10911b);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService$d */
    /* loaded from: classes6.dex */
    public static final class C11728d extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: b */
        public final /* synthetic */ JobParameters f10913b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11728d(JobParameters jobParameters) {
            super(1);
            this.f10913b = jobParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            PersistableConfigSyncJobService.m7536a(PersistableConfigSyncJobService.this, this.f10913b);
            return Unit.INSTANCE;
        }
    }

    public PersistableConfigSyncJobService() throws RemoteConfigException.RemoteConfigClientNotCreated {
        C11676F0 c11676f0 = C11676F0.f10747Q;
        int i = 2;
        String str = "To get an instance of the RemoteConfigClient, you must first call\n                   RemoteConfigClientBuilder(appId, context).build()";
        Throwable th = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (c11676f0 == null) {
            throw new RemoteConfigException.RemoteConfigClientNotCreated(str, b2 == true ? 1 : 0, i, b == true ? 1 : 0);
        }
        this.f10902a = (InterfaceC11721b1) c11676f0.f10775i.getValue();
        C11676F0 c11676f02 = C11676F0.f10747Q;
        if (c11676f02 == null) {
            throw new RemoteConfigException.RemoteConfigClientNotCreated(str, b4 == true ? 1 : 0, i, b3 == true ? 1 : 0);
        }
        this.f10903b = (RemoteConfigClientEventListener) c11676f02.f10782p.getValue();
        C11676F0 c11676f03 = C11676F0.f10747Q;
        if (c11676f03 == null) {
            throw new RemoteConfigException.RemoteConfigClientNotCreated(str, th, i, b5 == true ? 1 : 0);
        }
        this.f10904c = (C11752n0) c11676f03.f10780n.getValue();
    }

    /* renamed from: a */
    public static final void m7536a(PersistableConfigSyncJobService persistableConfigSyncJobService, JobParameters jobParameters) {
        if (persistableConfigSyncJobService.f10906e) {
            return;
        }
        persistableConfigSyncJobService.jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f10905d = SingleSubscribeKt.subscribe(SingleDoOnDisposeKt.doOnDispose(SingleSubscribeOnKt.subscribeOn(Single.INSTANCE.from(new C11725a()), Dispatchers.INSTANCE.getIo()), new C11726b(params)), new C11727c(params), new C11728d(params));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.f10906e = true;
        Disposable disposable = this.f10905d;
        if (disposable != null) {
            disposable.dispose();
        }
        return true;
    }
}
