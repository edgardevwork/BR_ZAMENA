package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {
    public final BaseGraph<N> graph;

    @CheckForNull
    public N node;
    public final Iterator<N> nodeIterator;
    public Iterator<N> successorIterator;

    /* renamed from: of */
    public static <N> EndpointPairIterator<N> m1286of(BaseGraph<N> graph) {
        return graph.isDirected() ? new Directed(graph) : new Undirected(graph);
    }

    public EndpointPairIterator(BaseGraph<N> graph) {
        this.node = null;
        this.successorIterator = ImmutableSet.m1218of().iterator();
        this.graph = graph;
        this.nodeIterator = graph.nodes().iterator();
    }

    public final boolean advance() {
        Preconditions.checkState(!this.successorIterator.hasNext());
        if (!this.nodeIterator.hasNext()) {
            return false;
        }
        N next = this.nodeIterator.next();
        this.node = next;
        this.successorIterator = this.graph.successors((BaseGraph<N>) next).iterator();
        return true;
    }

    /* loaded from: classes7.dex */
    public static final class Directed<N> extends EndpointPairIterator<N> {
        public Directed(BaseGraph<N> graph) {
            super(graph);
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public EndpointPair<N> computeNext() {
            while (!this.successorIterator.hasNext()) {
                if (!advance()) {
                    return endOfData();
                }
            }
            N n = this.node;
            Objects.requireNonNull(n);
            return EndpointPair.ordered(n, this.successorIterator.next());
        }
    }

    /* loaded from: classes7.dex */
    public static final class Undirected<N> extends EndpointPairIterator<N> {

        @CheckForNull
        public Set<N> visitedNodes;

        public Undirected(BaseGraph<N> graph) {
            super(graph);
            this.visitedNodes = Sets.newHashSetWithExpectedSize(graph.nodes().size() + 1);
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public EndpointPair<N> computeNext() {
            do {
                Objects.requireNonNull(this.visitedNodes);
                while (this.successorIterator.hasNext()) {
                    N next = this.successorIterator.next();
                    if (!this.visitedNodes.contains(next)) {
                        N n = this.node;
                        Objects.requireNonNull(n);
                        return EndpointPair.unordered(n, next);
                    }
                }
                this.visitedNodes.add(this.node);
            } while (advance());
            this.visitedNodes = null;
            return endOfData();
        }
    }
}
