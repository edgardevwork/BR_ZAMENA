package ru.rustore.sdk.remoteconfig.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.rustore.sdk.remoteconfig.internal.controller.PersistableConfigSyncJobService;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.l0 */
/* loaded from: classes5.dex */
public final class C11748l0 {

    /* renamed from: b */
    public static final long f10954b;

    /* renamed from: a */
    public final Context f10955a;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f10954b = DurationKt.toDuration(15, DurationUnit.MINUTES);
    }

    public C11748l0(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f10955a = applicationContext;
    }

    /* renamed from: a */
    public final void m7544a() {
        Object systemService = this.f10955a.getSystemService((Class<Object>) JobScheduler.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "applicationContext.getSy…JobScheduler::class.java)");
        ((JobScheduler) systemService).cancel(12857125);
    }

    /* renamed from: b */
    public final void m7545b() {
        Object systemService = this.f10955a.getSystemService((Class<Object>) JobScheduler.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "applicationContext.getSy…JobScheduler::class.java)");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        Intrinsics.checkNotNullExpressionValue(allPendingJobs, "jobScheduler.allPendingJobs");
        if (!(allPendingJobs instanceof Collection) || !allPendingJobs.isEmpty()) {
            Iterator<T> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == 12857125) {
                    return;
                }
            }
        }
        jobScheduler.schedule(new JobInfo.Builder(12857125, new ComponentName(this.f10955a, (Class<?>) PersistableConfigSyncJobService.class)).setPeriodic(Duration.m17043getInWholeMillisecondsimpl(f10954b)).setPersisted(true).build());
    }
}
