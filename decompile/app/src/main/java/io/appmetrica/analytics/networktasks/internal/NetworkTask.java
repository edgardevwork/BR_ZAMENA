package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.p046io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.AbstractC10087e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public class NetworkTask {

    /* renamed from: a */
    private int f9596a = 1;

    /* renamed from: b */
    private final Executor f9597b;

    /* renamed from: c */
    private final IExecutionPolicy f9598c;

    /* renamed from: d */
    private final ExponentialBackoffPolicy f9599d;

    /* renamed from: e */
    private final UnderlyingNetworkTask f9600e;

    /* renamed from: f */
    private final List f9601f;

    /* renamed from: g */
    private final String f9602g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i);
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f9597b = executor;
        this.f9598c = iExecutionPolicy;
        this.f9599d = exponentialBackoffPolicy;
        this.f9600e = underlyingNetworkTask;
        this.f9601f = list;
        this.f9602g = str;
    }

    /* renamed from: a */
    private synchronized boolean m7058a(int i) {
        if (!m7059a(i)) {
            return false;
        }
        this.f9596a = i;
        return true;
    }

    @NonNull
    public String description() {
        return this.f9600e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f9598c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f9597b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f9599d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f9600e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f9600e.getResponseDataHolder();
    }

    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f9600e.getRetryPolicyConfig();
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f9600e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f9600e;
    }

    @Nullable
    public String getUrl() {
        return this.f9600e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f9602g;
    }

    public boolean onCreateNetworkTask() {
        if (m7058a(3)) {
            return this.f9600e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zM7058a = m7058a(4);
        if (zM7058a) {
            this.f9600e.getFullUrlFormer().incrementAttemptNumber();
            this.f9600e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f9600e.onPerformRequest();
        }
        return zM7058a;
    }

    public boolean onRequestComplete() {
        boolean zOnRequestComplete;
        boolean z;
        synchronized (this) {
            try {
                if (m7059a(5, 6)) {
                    zOnRequestComplete = this.f9600e.onRequestComplete();
                    if (zOnRequestComplete) {
                        this.f9596a = 5;
                    } else {
                        this.f9596a = 6;
                    }
                    z = true;
                } else {
                    zOnRequestComplete = false;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f9600e.onPostRequestComplete(zOnRequestComplete);
        }
        return zOnRequestComplete;
    }

    public void onRequestError(@Nullable Throwable th) {
        if (m7058a(6)) {
            this.f9600e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (m7058a(7)) {
            this.f9600e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zM7058a = m7058a(2);
        if (zM7058a) {
            this.f9600e.onTaskAdded();
        }
        return zM7058a;
    }

    public void onTaskFinished() {
        int i;
        boolean zM7058a;
        synchronized (this) {
            i = this.f9596a;
            zM7058a = m7058a(8);
        }
        if (zM7058a) {
            this.f9600e.onTaskFinished();
            if (i == 5) {
                this.f9600e.onSuccessfulTaskFinished();
            } else if (i == 6 || i == 7) {
                this.f9600e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (m7058a(9)) {
            this.f9600e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean zHasMoreHosts;
        boolean z;
        int i;
        try {
            zHasMoreHosts = this.f9600e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f9600e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f9601f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z = false;
                    break;
                }
            }
            i = this.f9596a;
        } catch (Throwable th) {
            throw th;
        }
        return i != 9 && i != 8 && zHasMoreHosts && z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean m7059a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean boolValueOf;
        try {
            bool = Boolean.TRUE;
            int i = this.f9596a;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    boolean z = true;
                    switch (AbstractC10087e.m7056a(iArr[i2])) {
                        case 0:
                            boolValueOf = null;
                            break;
                        case 1:
                            if (i != 1) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                            break;
                        case 2:
                        case 6:
                            if (i == 2) {
                                boolValueOf = Boolean.TRUE;
                                break;
                            } else if (i == 9) {
                                boolValueOf = Boolean.FALSE;
                                break;
                            }
                            break;
                        case 3:
                            if (i == 3 || i == 5 || i == 6) {
                                boolValueOf = Boolean.TRUE;
                                break;
                            } else if (i == 9) {
                                boolValueOf = Boolean.FALSE;
                                break;
                            }
                            break;
                        case 4:
                        case 5:
                            if (i == 4) {
                                boolValueOf = Boolean.TRUE;
                                break;
                            } else if (i == 9) {
                                boolValueOf = Boolean.FALSE;
                                break;
                            }
                            break;
                        case 7:
                            if (i == 5 || i == 6 || i == 7 || i == 2 || i == 3 || i == 4) {
                                boolValueOf = Boolean.TRUE;
                                break;
                            } else if (i == 9) {
                                boolValueOf = Boolean.FALSE;
                                break;
                            }
                            break;
                        case 8:
                            if (i != 1) {
                                if (i == 9) {
                                    z = false;
                                }
                                boolValueOf = Boolean.valueOf(z);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        default:
                            boolValueOf = Boolean.FALSE;
                            break;
                    }
                    if (Boolean.TRUE.equals(boolValueOf)) {
                        i2++;
                    } else {
                        bool = boolValueOf;
                    }
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th) {
            throw th;
        }
        return bool2.equals(bool);
    }
}
