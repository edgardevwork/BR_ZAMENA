package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    @CanIgnoreReturnValue
    boolean addNode(N node);

    @CanIgnoreReturnValue
    @CheckForNull
    V putEdgeValue(EndpointPair<N> endpoints, V value);

    @CanIgnoreReturnValue
    @CheckForNull
    V putEdgeValue(N nodeU, N nodeV, V value);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeEdge(EndpointPair<N> endpoints);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeEdge(N nodeU, N nodeV);

    @CanIgnoreReturnValue
    boolean removeNode(N node);
}
