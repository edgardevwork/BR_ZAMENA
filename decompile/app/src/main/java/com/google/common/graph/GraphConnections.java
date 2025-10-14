package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface GraphConnections<N, V> {
    void addPredecessor(N node, V value);

    @CanIgnoreReturnValue
    @CheckForNull
    V addSuccessor(N node, V value);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N thisNode);

    Set<N> predecessors();

    void removePredecessor(N node);

    @CanIgnoreReturnValue
    @CheckForNull
    V removeSuccessor(N node);

    Set<N> successors();

    @CheckForNull
    V value(N node);
}
