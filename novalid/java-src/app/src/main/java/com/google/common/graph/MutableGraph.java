package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface MutableGraph<N> extends Graph<N> {
    @CanIgnoreReturnValue
    boolean addNode(N node);

    @CanIgnoreReturnValue
    boolean putEdge(EndpointPair<N> endpoints);

    @CanIgnoreReturnValue
    boolean putEdge(N nodeU, N nodeV);

    @CanIgnoreReturnValue
    boolean removeEdge(EndpointPair<N> endpoints);

    @CanIgnoreReturnValue
    boolean removeEdge(N nodeU, N nodeV);

    @CanIgnoreReturnValue
    boolean removeNode(N node);
}
