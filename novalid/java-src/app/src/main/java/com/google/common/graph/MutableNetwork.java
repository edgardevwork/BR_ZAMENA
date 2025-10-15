package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface MutableNetwork<N, E> extends Network<N, E> {
    @CanIgnoreReturnValue
    boolean addEdge(EndpointPair<N> endpoints, E edge);

    @CanIgnoreReturnValue
    boolean addEdge(N nodeU, N nodeV, E edge);

    @CanIgnoreReturnValue
    boolean addNode(N node);

    @CanIgnoreReturnValue
    boolean removeEdge(E edge);

    @CanIgnoreReturnValue
    boolean removeNode(N node);
}
