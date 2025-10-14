package com.google.common.graph;

import com.google.common.base.Optional;

@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class AbstractGraphBuilder<N> {
    public final boolean directed;
    public boolean allowsSelfLoops = false;
    public ElementOrder<N> nodeOrder = ElementOrder.insertion();
    public ElementOrder<N> incidentEdgeOrder = ElementOrder.unordered();
    public Optional<Integer> expectedNodeCount = Optional.absent();

    public AbstractGraphBuilder(boolean directed) {
        this.directed = directed;
    }
}
