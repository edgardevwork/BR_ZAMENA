package io.appmetrica.analytics.coreapi.internal.data;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/Converter;", "S", "P", "", "fromModel", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "toModel", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface Converter<S, P> {
    P fromModel(S value);

    S toModel(P value);
}
