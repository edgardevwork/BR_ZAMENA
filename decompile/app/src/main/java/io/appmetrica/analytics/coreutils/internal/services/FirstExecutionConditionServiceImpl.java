package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* renamed from: a */
    private final ArrayList f6190a = new ArrayList();

    /* renamed from: b */
    private UtilityServiceConfiguration f6191b;

    /* renamed from: c */
    final UtilityServiceProvider f6192c;

    public static class FirstExecutionConditionChecker {

        /* renamed from: a */
        private boolean f6193a = false;

        /* renamed from: b */
        private long f6194b;

        /* renamed from: c */
        private long f6195c;

        /* renamed from: d */
        private long f6196d;

        /* renamed from: e */
        private final FirstExecutionDelayChecker f6197e;
        public final String tag;

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String str) {
            this.f6197e = firstExecutionDelayChecker;
            this.f6195c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f6194b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f6196d = Long.MAX_VALUE;
            this.tag = str;
        }

        /* renamed from: a */
        public final void m4900a(long j) {
            this.f6196d = TimeUnit.SECONDS.toMillis(j);
        }

        /* renamed from: b */
        public final boolean m4902b() {
            if (this.f6193a) {
                return true;
            }
            return this.f6197e.delaySinceFirstStartupWasPassed(this.f6195c, this.f6194b, this.f6196d);
        }

        /* renamed from: a */
        public final void m4899a() {
            this.f6193a = true;
        }

        /* renamed from: a */
        public final void m4901a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f6195c = utilityServiceConfiguration.getInitialConfigTime();
            this.f6194b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j, long j2, long j3) {
            return j2 - j >= j3;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* renamed from: a */
        private final FirstExecutionConditionChecker f6198a;

        /* renamed from: b */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f6199b;

        /* renamed from: c */
        private final ICommonExecutor f6200c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean zM4902b = this.f6198a.m4902b();
            if (zM4902b) {
                this.f6198a.m4899a();
            }
            return zM4902b;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j) {
            this.f6198a.m4900a(j);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j) {
            if (!this.f6198a.m4902b()) {
                return false;
            }
            this.f6199b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j), this.f6200c);
            this.f6198a.m4899a();
            return true;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f6198a.m4901a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f6199b = activationBarrierHelper;
            this.f6198a = firstExecutionConditionChecker;
            this.f6200c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(@NonNull UtilityServiceProvider utilityServiceProvider) {
        this.f6192c = utilityServiceProvider;
    }

    /* renamed from: a */
    public final synchronized FirstExecutionHandler m4898a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f6190a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    @NonNull
    public synchronized FirstExecutionDelayedTask createDelayedTask(@NonNull String str, @NonNull ICommonExecutor iCommonExecutor, @NonNull Runnable runnable) {
        return m4898a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f6192c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f6191b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f6191b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f6190a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
