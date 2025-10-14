package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    public StandardMutableNetwork(NetworkBuilder<? super N, ? super E> builder) {
        super(builder);
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addNode(N node) {
        Preconditions.checkNotNull(node, "node");
        if (containsNode(node)) {
            return false;
        }
        addNodeInternal(node);
        return true;
    }

    @CanIgnoreReturnValue
    public final NetworkConnections<N, E> addNodeInternal(N node) {
        NetworkConnections<N, E> networkConnectionsNewConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(node, networkConnectionsNewConnections) == null);
        return networkConnectionsNewConnections;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(N nodeU, N nodeV, E edge) {
        Preconditions.checkNotNull(nodeU, "nodeU");
        Preconditions.checkNotNull(nodeV, "nodeV");
        Preconditions.checkNotNull(edge, "edge");
        if (containsEdge(edge)) {
            EndpointPair<N> endpointPairIncidentNodes = incidentNodes(edge);
            EndpointPair endpointPairM1285of = EndpointPair.m1285of(this, nodeU, nodeV);
            Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairM1285of), GraphConstants.REUSING_EDGE, edge, endpointPairIncidentNodes, endpointPairM1285of);
            return false;
        }
        NetworkConnections<N, E> networkConnectionsAddNodeInternal = this.nodeConnections.get(nodeU);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnectionsAddNodeInternal == null || !networkConnectionsAddNodeInternal.successors().contains(nodeV), GraphConstants.PARALLEL_EDGES_NOT_ALLOWED, nodeU, nodeV);
        }
        boolean zEquals = nodeU.equals(nodeV);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!zEquals, GraphConstants.SELF_LOOPS_NOT_ALLOWED, nodeU);
        }
        if (networkConnectionsAddNodeInternal == null) {
            networkConnectionsAddNodeInternal = addNodeInternal(nodeU);
        }
        networkConnectionsAddNodeInternal.addOutEdge(edge, nodeV);
        NetworkConnections<N, E> networkConnectionsAddNodeInternal2 = this.nodeConnections.get(nodeV);
        if (networkConnectionsAddNodeInternal2 == null) {
            networkConnectionsAddNodeInternal2 = addNodeInternal(nodeV);
        }
        networkConnectionsAddNodeInternal2.addInEdge(edge, nodeU, zEquals);
        this.edgeToReferenceNode.put(edge, nodeU);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean addEdge(EndpointPair<N> endpoints, E edge) {
        validateEndpoints(endpoints);
        return addEdge(endpoints.nodeU(), endpoints.nodeV(), edge);
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeNode(N node) {
        Preconditions.checkNotNull(node, "node");
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(node);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it.hasNext()) {
            removeEdge(it.next());
        }
        this.nodeConnections.remove(node);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    @CanIgnoreReturnValue
    public boolean removeEdge(E edge) {
        Preconditions.checkNotNull(edge, "edge");
        N n = this.edgeToReferenceNode.get(edge);
        boolean z = false;
        if (n == null) {
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n);
        Objects.requireNonNull(networkConnections);
        NetworkConnections<N, E> networkConnections2 = networkConnections;
        N nAdjacentNode = networkConnections2.adjacentNode(edge);
        NetworkConnections<N, E> networkConnections3 = this.nodeConnections.get(nAdjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections<N, E> networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(edge);
        if (allowsSelfLoops() && n.equals(nAdjacentNode)) {
            z = true;
        }
        networkConnections4.removeInEdge(edge, z);
        this.edgeToReferenceNode.remove(edge);
        return true;
    }

    public final NetworkConnections<N, E> newConnections() {
        if (isDirected()) {
            if (allowsParallelEdges()) {
                return DirectedMultiNetworkConnections.m1282of();
            }
            return DirectedNetworkConnections.m1283of();
        }
        if (allowsParallelEdges()) {
            return UndirectedMultiNetworkConnections.m1288of();
        }
        return UndirectedNetworkConnections.m1289of();
    }
}
