package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.p046io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.p046io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m7105d2 = {"Lio/appmetrica/analytics/modulesapi/internal/service/ServiceNetworkContext;", "", "executionPolicy", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "getExecutionPolicy", "()Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "networkApi", "Lio/appmetrica/analytics/modulesapi/internal/network/SimpleNetworkApi;", "getNetworkApi", "()Lio/appmetrica/analytics/modulesapi/internal/network/SimpleNetworkApi;", "sslSocketFactoryProvider", "Lio/appmetrica/analytics/coreapi/internal/io/SslSocketFactoryProvider;", "getSslSocketFactoryProvider", "()Lio/appmetrica/analytics/coreapi/internal/io/SslSocketFactoryProvider;", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "modules-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ServiceNetworkContext {
    @NotNull
    IExecutionPolicy getExecutionPolicy();

    @NotNull
    SimpleNetworkApi getNetworkApi();

    @NotNull
    SslSocketFactoryProvider getSslSocketFactoryProvider();

    @NotNull
    String getUserAgent();
}
