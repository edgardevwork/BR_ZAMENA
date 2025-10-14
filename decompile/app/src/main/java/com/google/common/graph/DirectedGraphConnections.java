package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    public static final Object PRED = new Object();
    public final Map<N, Object> adjacentNodeValues;

    @CheckForNull
    public final List<NodeConnection<N>> orderedNodeConnections;
    public int predecessorCount;
    public int successorCount;

    /* loaded from: classes7.dex */
    public static final class PredAndSucc {
        public final Object successorValue;

        public PredAndSucc(Object successorValue) {
            this.successorValue = successorValue;
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class NodeConnection<N> {
        public final N node;

        public NodeConnection(N n) {
            this.node = (N) Preconditions.checkNotNull(n);
        }

        /* loaded from: classes8.dex */
        public static final class Pred<N> extends NodeConnection<N> {
            public Pred(N node) {
                super(node);
            }

            public boolean equals(@CheckForNull Object that) {
                if (that instanceof Pred) {
                    return this.node.equals(((Pred) that).node);
                }
                return false;
            }

            public int hashCode() {
                return Pred.class.hashCode() + this.node.hashCode();
            }
        }

        /* loaded from: classes8.dex */
        public static final class Succ<N> extends NodeConnection<N> {
            public Succ(N node) {
                super(node);
            }

            public boolean equals(@CheckForNull Object that) {
                if (that instanceof Succ) {
                    return this.node.equals(((Succ) that).node);
                }
                return false;
            }

            public int hashCode() {
                return Succ.class.hashCode() + this.node.hashCode();
            }
        }
    }

    public DirectedGraphConnections(Map<N, Object> adjacentNodeValues, @CheckForNull List<NodeConnection<N>> orderedNodeConnections, int predecessorCount, int successorCount) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(adjacentNodeValues);
        this.orderedNodeConnections = orderedNodeConnections;
        this.predecessorCount = Graphs.checkNonNegative(predecessorCount);
        this.successorCount = Graphs.checkNonNegative(successorCount);
        Preconditions.checkState(predecessorCount <= adjacentNodeValues.size() && successorCount <= adjacentNodeValues.size());
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$5 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C74265 {
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
    public static <N, V> DirectedGraphConnections<N, V> m1281of(ElementOrder<N> incidentEdgeOrder) {
        ArrayList arrayList;
        int i = C74265.$SwitchMap$com$google$common$graph$ElementOrder$Type[incidentEdgeOrder.type().ordinal()];
        if (i == 1) {
            arrayList = null;
        } else if (i == 2) {
            arrayList = new ArrayList();
        } else {
            throw new AssertionError(incidentEdgeOrder.type());
        }
        return new DirectedGraphConnections<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> DirectedGraphConnections<N, V> ofImmutable(N thisNode, Iterable<EndpointPair<N>> incidentEdges, Function<N, V> successorNodeToValueFn) {
        Preconditions.checkNotNull(thisNode);
        Preconditions.checkNotNull(successorNodeToValueFn);
        HashMap map = new HashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        int i2 = 0;
        for (EndpointPair<N> endpointPair : incidentEdges) {
            if (endpointPair.nodeU().equals(thisNode) && endpointPair.nodeV().equals(thisNode)) {
                map.put(thisNode, new PredAndSucc(successorNodeToValueFn.apply(thisNode)));
                builder.add((ImmutableList.Builder) new NodeConnection.Pred(thisNode));
                builder.add((ImmutableList.Builder) new NodeConnection.Succ(thisNode));
                i++;
            } else if (endpointPair.nodeV().equals(thisNode)) {
                N nNodeU = endpointPair.nodeU();
                Object objPut = map.put(nNodeU, PRED);
                if (objPut != null) {
                    map.put(nNodeU, new PredAndSucc(objPut));
                }
                builder.add((ImmutableList.Builder) new NodeConnection.Pred(nNodeU));
                i++;
            } else {
                Preconditions.checkArgument(endpointPair.nodeU().equals(thisNode));
                N nNodeV = endpointPair.nodeV();
                V vApply = successorNodeToValueFn.apply(nNodeV);
                Object objPut2 = map.put(nNodeV, vApply);
                if (objPut2 != null) {
                    Preconditions.checkArgument(objPut2 == PRED);
                    map.put(nNodeV, new PredAndSucc(vApply));
                }
                builder.add((ImmutableList.Builder) new NodeConnection.Succ(nNodeV));
            }
            i2++;
        }
        return new DirectedGraphConnections<>(map, builder.build(), i, i2);
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        if (this.orderedNodeConnections == null) {
            return Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
        }
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1
            public C74221() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                    public final /* synthetic */ Iterator val$nodeConnections;
                    public final /* synthetic */ Set val$seenNodes;

                    public AnonymousClass1(C74221 this, final Iterator val$nodeConnections, final Set val$seenNodes) {
                        val$nodeConnections = val$nodeConnections;
                        val$seenNodes = val$seenNodes;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (val$nodeConnections.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                            if (val$seenNodes.add(nodeConnection.node)) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1 */
            /* loaded from: classes5.dex */
            public class AnonymousClass1 extends AbstractIterator<N> {
                public final /* synthetic */ Iterator val$nodeConnections;
                public final /* synthetic */ Set val$seenNodes;

                public AnonymousClass1(C74221 this, final Iterator val$nodeConnections, final Set val$seenNodes) {
                    val$nodeConnections = val$nodeConnections;
                    val$seenNodes = val$seenNodes;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (val$seenNodes.add(nodeConnection.node)) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.adjacentNodeValues.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
            }
        };
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$1 */
    /* loaded from: classes7.dex */
    public class C74221 extends AbstractSet<N> {
        public C74221() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                public final /* synthetic */ Iterator val$nodeConnections;
                public final /* synthetic */ Set val$seenNodes;

                public AnonymousClass1(C74221 this, final Iterator val$nodeConnections, final Set val$seenNodes) {
                    val$nodeConnections = val$nodeConnections;
                    val$seenNodes = val$seenNodes;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (val$seenNodes.add(nodeConnection.node)) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$1$1 */
        /* loaded from: classes5.dex */
        public class AnonymousClass1 extends AbstractIterator<N> {
            public final /* synthetic */ Iterator val$nodeConnections;
            public final /* synthetic */ Set val$seenNodes;

            public AnonymousClass1(C74221 this, final Iterator val$nodeConnections, final Set val$seenNodes) {
                val$nodeConnections = val$nodeConnections;
                val$seenNodes = val$seenNodes;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                    if (val$seenNodes.add(nodeConnection.node)) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.adjacentNodeValues.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj);
        }
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$2 */
    /* loaded from: classes7.dex */
    public class C74232 extends AbstractSet<N> {
        public C74232() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                    public final /* synthetic */ Iterator val$entries;

                    public AnonymousClass1(C74232 this, final Iterator val$entries) {
                        val$entries = val$entries;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (val$entries.hasNext()) {
                            Map.Entry entry = (Map.Entry) val$entries.next();
                            if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                return (N) entry.getKey();
                            }
                        }
                        return endOfData();
                    }
                };
            }
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                public final /* synthetic */ Iterator val$nodeConnections;

                public AnonymousClass2(C74232 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Pred) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1 */
        /* loaded from: classes5.dex */
        public class AnonymousClass1 extends AbstractIterator<N> {
            public final /* synthetic */ Iterator val$entries;

            public AnonymousClass1(C74232 this, final Iterator val$entries) {
                val$entries = val$entries;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (val$entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) val$entries.next();
                    if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$2$2 */
        /* loaded from: classes5.dex */
        public class AnonymousClass2 extends AbstractIterator<N> {
            public final /* synthetic */ Iterator val$nodeConnections;

            public AnonymousClass2(C74232 this, final Iterator val$nodeConnections) {
                val$nodeConnections = val$nodeConnections;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                    if (nodeConnection instanceof NodeConnection.Pred) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.predecessorCount;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.isPredecessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2
            public C74232() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                        public final /* synthetic */ Iterator val$entries;

                        public AnonymousClass1(C74232 this, final Iterator val$entries) {
                            val$entries = val$entries;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        @CheckForNull
                        public N computeNext() {
                            while (val$entries.hasNext()) {
                                Map.Entry entry = (Map.Entry) val$entries.next();
                                if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                    public final /* synthetic */ Iterator val$nodeConnections;

                    public AnonymousClass2(C74232 this, final Iterator val$nodeConnections) {
                        val$nodeConnections = val$nodeConnections;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (val$nodeConnections.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                            if (nodeConnection instanceof NodeConnection.Pred) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$2$1 */
            /* loaded from: classes5.dex */
            public class AnonymousClass1 extends AbstractIterator<N> {
                public final /* synthetic */ Iterator val$entries;

                public AnonymousClass1(C74232 this, final Iterator val$entries) {
                    val$entries = val$entries;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) val$entries.next();
                        if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$2$2 */
            /* loaded from: classes5.dex */
            public class AnonymousClass2 extends AbstractIterator<N> {
                public final /* synthetic */ Iterator val$nodeConnections;

                public AnonymousClass2(C74232 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Pred) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.predecessorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.isPredecessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }
        };
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$3 */
    /* loaded from: classes7.dex */
    public class C74243 extends AbstractSet<N> {
        public C74243() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                    public final /* synthetic */ Iterator val$entries;

                    public AnonymousClass1(C74243 this, final Iterator val$entries) {
                        val$entries = val$entries;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (val$entries.hasNext()) {
                            Map.Entry entry = (Map.Entry) val$entries.next();
                            if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                return (N) entry.getKey();
                            }
                        }
                        return endOfData();
                    }
                };
            }
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                public final /* synthetic */ Iterator val$nodeConnections;

                public AnonymousClass2(C74243 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Succ) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            };
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$1 */
        /* loaded from: classes5.dex */
        public class AnonymousClass1 extends AbstractIterator<N> {
            public final /* synthetic */ Iterator val$entries;

            public AnonymousClass1(C74243 this, final Iterator val$entries) {
                val$entries = val$entries;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (val$entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) val$entries.next();
                    if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.DirectedGraphConnections$3$2 */
        /* loaded from: classes5.dex */
        public class AnonymousClass2 extends AbstractIterator<N> {
            public final /* synthetic */ Iterator val$nodeConnections;

            public AnonymousClass2(C74243 this, final Iterator val$nodeConnections) {
                val$nodeConnections = val$nodeConnections;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                    if (nodeConnection instanceof NodeConnection.Succ) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.this.successorCount;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.isSuccessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.3
            public C74243() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                        public final /* synthetic */ Iterator val$entries;

                        public AnonymousClass1(C74243 this, final Iterator val$entries) {
                            val$entries = val$entries;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        @CheckForNull
                        public N computeNext() {
                            while (val$entries.hasNext()) {
                                Map.Entry entry = (Map.Entry) val$entries.next();
                                if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                    public final /* synthetic */ Iterator val$nodeConnections;

                    public AnonymousClass2(C74243 this, final Iterator val$nodeConnections) {
                        val$nodeConnections = val$nodeConnections;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    public N computeNext() {
                        while (val$nodeConnections.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                            if (nodeConnection instanceof NodeConnection.Succ) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$3$1 */
            /* loaded from: classes5.dex */
            public class AnonymousClass1 extends AbstractIterator<N> {
                public final /* synthetic */ Iterator val$entries;

                public AnonymousClass1(C74243 this, final Iterator val$entries) {
                    val$entries = val$entries;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) val$entries.next();
                        if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                            return (N) entry.getKey();
                        }
                    }
                    return endOfData();
                }
            }

            /* renamed from: com.google.common.graph.DirectedGraphConnections$3$2 */
            /* loaded from: classes5.dex */
            public class AnonymousClass2 extends AbstractIterator<N> {
                public final /* synthetic */ Iterator val$nodeConnections;

                public AnonymousClass2(C74243 this, final Iterator val$nodeConnections) {
                    val$nodeConnections = val$nodeConnections;
                }

                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                public N computeNext() {
                    while (val$nodeConnections.hasNext()) {
                        NodeConnection nodeConnection = (NodeConnection) val$nodeConnections.next();
                        if (nodeConnection instanceof NodeConnection.Succ) {
                            return nodeConnection.node;
                        }
                    }
                    return endOfData();
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.successorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return DirectedGraphConnections.isSuccessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj));
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(final N thisNode) {
        Iterator itTransform;
        Preconditions.checkNotNull(thisNode);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list == null) {
            itTransform = Iterators.concat(Iterators.transform(predecessors().iterator(), new Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return DirectedGraphConnections.lambda$incidentEdgeIterator$0(thisNode, obj);
                }
            }), Iterators.transform(successors().iterator(), new Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return EndpointPair.ordered(thisNode, obj);
                }
            }));
        } else {
            itTransform = Iterators.transform(list.iterator(), new Function() { // from class: com.google.common.graph.DirectedGraphConnections$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return DirectedGraphConnections.lambda$incidentEdgeIterator$2(thisNode, (DirectedGraphConnections.NodeConnection) obj);
                }
            });
        }
        return new AbstractIterator<EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4
            public final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
            public final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

            public C74254(DirectedGraphConnections this, Iterator itTransform2, final AtomicBoolean val$alreadySeenSelfLoop) {
                val$resultWithDoubleSelfLoop = itTransform2;
                val$alreadySeenSelfLoop = val$alreadySeenSelfLoop;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public EndpointPair<N> computeNext() {
                while (val$resultWithDoubleSelfLoop.hasNext()) {
                    EndpointPair<N> endpointPair = (EndpointPair) val$resultWithDoubleSelfLoop.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !val$alreadySeenSelfLoop.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return endOfData();
            }
        };
    }

    public static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$0(Object obj, Object obj2) {
        return EndpointPair.ordered(obj2, obj);
    }

    public static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$2(Object obj, NodeConnection nodeConnection) {
        if (nodeConnection instanceof NodeConnection.Succ) {
            return EndpointPair.ordered(obj, nodeConnection.node);
        }
        return EndpointPair.ordered(nodeConnection.node, obj);
    }

    /* renamed from: com.google.common.graph.DirectedGraphConnections$4 */
    /* loaded from: classes5.dex */
    public class C74254 extends AbstractIterator<EndpointPair<N>> {
        public final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
        public final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

        public C74254(DirectedGraphConnections this, Iterator itTransform2, final AtomicBoolean val$alreadySeenSelfLoop) {
            val$resultWithDoubleSelfLoop = itTransform2;
            val$alreadySeenSelfLoop = val$alreadySeenSelfLoop;
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public EndpointPair<N> computeNext() {
            while (val$resultWithDoubleSelfLoop.hasNext()) {
                EndpointPair<N> endpointPair = (EndpointPair) val$resultWithDoubleSelfLoop.next();
                if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !val$alreadySeenSelfLoop.getAndSet(true)) {
                    return endpointPair;
                }
            }
            return endOfData();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V value(N n) {
        Preconditions.checkNotNull(n);
        V v = (V) this.adjacentNodeValues.get(n);
        if (v == PRED) {
            return null;
        }
        return v instanceof PredAndSucc ? (V) ((PredAndSucc) v).successorValue : v;
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N node) {
        Preconditions.checkNotNull(node);
        Object obj = this.adjacentNodeValues.get(node);
        if (obj == PRED) {
            this.adjacentNodeValues.remove(node);
        } else if (!(obj instanceof PredAndSucc)) {
            return;
        } else {
            this.adjacentNodeValues.put(node, ((PredAndSucc) obj).successorValue);
        }
        int i = this.predecessorCount - 1;
        this.predecessorCount = i;
        Graphs.checkNonNegative(i);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.remove(new NodeConnection.Pred(node));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V removeSuccessor(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = this.adjacentNodeValues.get(obj);
        if (obj3 == null || obj3 == (obj2 = PRED)) {
            obj3 = null;
        } else if (obj3 instanceof PredAndSucc) {
            this.adjacentNodeValues.put(obj, obj2);
            obj3 = ((PredAndSucc) obj3).successorValue;
        } else {
            this.adjacentNodeValues.remove(obj);
        }
        if (obj3 != null) {
            int i = this.successorCount - 1;
            this.successorCount = i;
            Graphs.checkNonNegative(i);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new NodeConnection.Succ(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N node, V unused) {
        Map<N, Object> map = this.adjacentNodeValues;
        Object obj = PRED;
        Object objPut = map.put(node, obj);
        if (objPut != null) {
            if (objPut instanceof PredAndSucc) {
                this.adjacentNodeValues.put(node, objPut);
                return;
            } else if (objPut == obj) {
                return;
            } else {
                this.adjacentNodeValues.put(node, new PredAndSucc(objPut));
            }
        }
        int i = this.predecessorCount + 1;
        this.predecessorCount = i;
        Graphs.checkPositive(i);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.add(new NodeConnection.Pred(node));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V addSuccessor(N n, V v) {
        Object objPut = this.adjacentNodeValues.put(n, v);
        if (objPut == null) {
            objPut = null;
        } else if (objPut instanceof PredAndSucc) {
            this.adjacentNodeValues.put(n, new PredAndSucc(v));
            objPut = ((PredAndSucc) objPut).successorValue;
        } else if (objPut == PRED) {
            this.adjacentNodeValues.put(n, new PredAndSucc(v));
            objPut = null;
        }
        if (objPut == null) {
            int i = this.successorCount + 1;
            this.successorCount = i;
            Graphs.checkPositive(i);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.add(new NodeConnection.Succ(n));
            }
        }
        if (objPut == null) {
            return null;
        }
        return (V) objPut;
    }

    public static boolean isPredecessor(@CheckForNull Object value) {
        return value == PRED || (value instanceof PredAndSucc);
    }

    public static boolean isSuccessor(@CheckForNull Object value) {
        return (value == PRED || value == null) ? false : true;
    }
}
