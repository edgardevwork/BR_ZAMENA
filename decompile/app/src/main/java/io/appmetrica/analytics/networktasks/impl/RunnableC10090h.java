package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.p046io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: io.appmetrica.analytics.networktasks.impl.h */
/* loaded from: classes7.dex */
public final class RunnableC10090h implements Runnable {

    /* renamed from: a */
    public final NetworkTask f9562a;

    /* renamed from: b */
    public final InterruptionSafeThread f9563b;

    /* renamed from: c */
    public final C10088f f9564c;

    public RunnableC10090h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, C10088f c10088f) {
        this.f9562a = networkTask;
        this.f9563b = interruptionSafeThread;
        this.f9564c = c10088f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOnRequestComplete;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f9562a.getExponentialBackoffPolicy();
        IExecutionPolicy connectionExecutionPolicy = this.f9562a.getConnectionExecutionPolicy();
        if (!this.f9563b.isRunning() || !connectionExecutionPolicy.canBeExecuted() || !exponentialBackoffPolicy.canBeExecuted(this.f9562a.getRetryPolicyConfig())) {
            this.f9562a.onShouldNotExecute();
            return;
        }
        boolean zOnCreateNetworkTask = this.f9562a.onCreateNetworkTask();
        Boolean boolValueOf = null;
        while (this.f9563b.isRunning() && zOnCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f9562a.getRetryPolicyConfig())) {
            C10088f c10088f = this.f9564c;
            NetworkTask networkTask = this.f9562a;
            c10088f.getClass();
            boolean z = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(StringsKt__StringsKt.trim((CharSequence) url).toString())) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                } else {
                    Request.Builder builderAddHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        builderAddHeader.addHeader((String) entry.getKey(), CollectionsKt___CollectionsKt.joinToString$default((Iterable) entry.getValue(), ",", null, null, 0, null, null, 62, null));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            builderAddHeader.post(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                builderAddHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                builderAddHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    int i = AbstractC10084b.f9558a;
                    Response responseExecute = builder.withConnectTimeout(i).withReadTimeout(i).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(builderAddHeader.build()).execute();
                    int code = responseExecute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(responseExecute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(responseExecute.getResponseData());
                    }
                    if (responseExecute.isCompleted()) {
                        zOnRequestComplete = networkTask.onRequestComplete();
                        boolValueOf = Boolean.valueOf(zOnRequestComplete);
                        if (zOnRequestComplete && this.f9562a.shouldTryNextHost()) {
                            z = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
                        zOnCreateNetworkTask = z;
                    } else {
                        networkTask.onRequestError(responseExecute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            zOnRequestComplete = false;
            boolValueOf = Boolean.valueOf(zOnRequestComplete);
            if (zOnRequestComplete) {
            }
            exponentialBackoffPolicy.onHostAttemptFinished(zOnRequestComplete);
            zOnCreateNetworkTask = z;
        }
        if (boolValueOf != null) {
            exponentialBackoffPolicy.onAllHostsAttemptsFinished(boolValueOf.booleanValue());
        }
    }
}
