package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface NetworkConnections<N, E> {
    void addInEdge(E edge, N node, boolean isSelfLoop);

    void addOutEdge(E edge, N node);

    N adjacentNode(E edge);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N node);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CanIgnoreReturnValue
    @CheckForNull
    N removeInEdge(E edge, boolean isSelfLoop);

    @CanIgnoreReturnValue
    N removeOutEdge(E edge);

    Set<N> successors();
}
