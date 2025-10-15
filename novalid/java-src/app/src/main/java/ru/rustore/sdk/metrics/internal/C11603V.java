package ru.rustore.sdk.metrics.internal;

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
import ru.rustore.sdk.metrics.BuildConfig;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* renamed from: ru.rustore.sdk.metrics.internal.V */
/* loaded from: classes8.dex */
public final class C11603V {

    /* renamed from: a */
    public final Context f10653a;

    /* renamed from: b */
    public final C11614d f10654b;

    public C11603V(Context context, C11614d getJobRepeatIntervalUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getJobRepeatIntervalUseCase, "getJobRepeatIntervalUseCase");
        this.f10653a = context;
        this.f10654b = getJobRepeatIntervalUseCase;
    }

    /* renamed from: a */
    public final void m7491a() {
        Object systemService = this.f10653a.getSystemService((Class<Object>) JobScheduler.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService(JobScheduler::class.java)");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        Intrinsics.checkNotNullExpressionValue(allPendingJobs, "jobScheduler.allPendingJobs");
        if (!(allPendingJobs instanceof Collection) || !allPendingJobs.isEmpty()) {
            Iterator<T> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (((JobInfo) it.next()).getId() == 88123556) {
                    return;
                }
            }
        }
        JobInfo.Builder builder = new JobInfo.Builder(88123556, new ComponentName(this.f10653a, (Class<?>) SendMetricsEventJobService.class));
        this.f10654b.f10670a.f10675a.getClass();
        Duration.Companion companion = Duration.INSTANCE;
        Integer JOB_REPEAT_INTERVAL_MINUTES = BuildConfig.JOB_REPEAT_INTERVAL_MINUTES;
        Intrinsics.checkNotNullExpressionValue(JOB_REPEAT_INTERVAL_MINUTES, "JOB_REPEAT_INTERVAL_MINUTES");
        jobScheduler.schedule(builder.setPeriodic(Duration.m17043getInWholeMillisecondsimpl(DurationKt.toDuration(JOB_REPEAT_INTERVAL_MINUTES.intValue(), DurationUnit.MINUTES))).setPersisted(true).build());
    }
}
