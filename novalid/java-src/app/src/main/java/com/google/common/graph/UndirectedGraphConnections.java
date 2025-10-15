package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.graph.ElementOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class UndirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    public final Map<N, V> adjacentNodeValues;

    public UndirectedGraphConnections(Map<N, V> adjacentNodeValues) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(adjacentNodeValues);
    }

    /* renamed from: com.google.common.graph.UndirectedGraphConnections$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C74461 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: of */
    public static <N, V> UndirectedGraphConnections<N, V> m1287of(ElementOrder<N> incidentEdgeOrder) {
        int i = C74461.$SwitchMap$com$google$common$graph$ElementOrder$Type[incidentEdgeOrder.type().ordinal()];
        if (i == 1) {
            return new UndirectedGraphConnections<>(new HashMap(2, 1.0f));
        }
        if (i == 2) {
            return new UndirectedGraphConnections<>(new LinkedHashMap(2, 1.0f));
        }
        throw new AssertionError(incidentEdgeOrder.type());
    }

    public static <N, V> UndirectedGraphConnections<N, V> ofImmutable(Map<N, V> adjacentNodeValues) {
        return new UndirectedGraphConnections<>(ImmutableMap.copyOf((Map) adjacentNodeValues));
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(final N thisNode) {
        return Iterators.transform(this.adjacentNodeValues.keySet().iterator(), new Function() { // from class: com.google.common.graph.UndirectedGraphConnections$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return EndpointPair.unordered(thisNode, obj);
            }
        });
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V value(N node) {
        return this.adjacentNodeValues.get(node);
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N node) {
        removeSuccessor(node);
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V removeSuccessor(N node) {
        return this.adjacentNodeValues.remove(node);
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N node, V value) {
        addSuccessor(node, value);
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V addSuccessor(N node, V value) {
        return this.adjacentNodeValues.put(node, value);
    }
}
