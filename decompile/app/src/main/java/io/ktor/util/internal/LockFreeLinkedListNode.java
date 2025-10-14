package io.ktor.util.internal;

import androidx.concurrent.futures.C2081xc40028dd;
import androidx.exifinterface.media.ExifInterface;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import io.ktor.http.LinkHeader;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.lang3.ObjectUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(m7104d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020G:\u0004NOPQB\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00032\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\f\b\u0000\u0010\u001d*\u00060\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00030$¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b)\u0010\u0007J\u001b\u0010*\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010+\u001a\u00020\u0005H\u0001¢\u0006\u0004\b+\u0010\u0002J\r\u0010,\u001a\u00020\u0005¢\u0006\u0004\b,\u0010\u0002J/\u0010.\u001a\u00020-2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0081\bø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b0\u0010(J\u000f\u00101\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J\u001a\u00103\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001d\u0018\u0001H\u0086\b¢\u0006\u0004\b3\u00104J1\u00105\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001d\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b7\u0010(J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J/\u0010@\u001a\u00020?2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00032\u0006\u0010>\u001a\u00020-H\u0001¢\u0006\u0004\b@\u0010AJ'\u0010E\u001a\u00020\u00052\n\u0010B\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\bC\u0010DR\u0011\u0010F\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bF\u00102R\u0011\u0010\u0013\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u00104R\u0015\u0010J\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bI\u0010(R\u0011\u0010B\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bK\u00104R\u0015\u0010M\u001a\u00060\u0000j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, m7105d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode;", SegmentConstantPool.INITSTRING, "()V", "Lio/ktor/util/internal/Node;", "node", "", "addLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", LinkHeader.Rel.Next, "addNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "_prev", "Lio/ktor/util/internal/OpDescriptor;", BlackPassKeys.OP_PRICE_TITLE, "correctPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "Lio/ktor/util/internal/AtomicDesc;", "describeRemove", "()Lio/ktor/util/internal/AtomicDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "findHead", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "finishAdd", "finishRemove", "helpDelete", "helpRemove", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "markPrev", "remove", "()Z", "removeFirstIfIsInstanceOf", "()Ljava/lang/Object;", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "Lio/ktor/util/internal/Removed;", "removed", "()Lio/ktor/util/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$ktor_utils", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "", "getNext", "getNextNode", "nextNode", "getPrev", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "RemoveFirstDesc", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,809:1\n172#1,3:815\n172#1,3:818\n1#2:810\n155#3,2:811\n155#3,2:813\n155#3,2:821\n155#3,2:823\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode\n*L\n238#1:815,3\n261#1:818,3\n181#1:811,2\n193#1:813,2\n618#1:821,2\n636#1:823,2\n*E\n"})
/* loaded from: classes7.dex */
public class LockFreeLinkedListNode {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater _removedRef$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");

    @NotNull
    volatile /* synthetic */ Object _next = this;

    @NotNull
    volatile /* synthetic */ Object _prev = this;

    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    public final Removed removed() {
        Removed removed = (Removed) this._removedRef;
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        _removedRef$FU.lazySet(this, removed2);
        return removed2;
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "newNode", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @PublishedApi
    /* loaded from: classes5.dex */
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {

        @JvmField
        @NotNull
        public final LockFreeLinkedListNode newNode;

        @JvmField
        @Nullable
        public LockFreeLinkedListNode oldNext;

        public CondAddOp(@NotNull LockFreeLinkedListNode newNode) {
            Intrinsics.checkNotNullParameter(newNode, "newNode");
            this.newNode = newNode;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public void complete(@NotNull LockFreeLinkedListNode affected, @Nullable Object failure) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            boolean z = failure == null;
            LockFreeLinkedListNode lockFreeLinkedListNode = z ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null && C2081xc40028dd.m347m(LockFreeLinkedListNode._next$FU, affected, this, lockFreeLinkedListNode) && z) {
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                Intrinsics.checkNotNull(lockFreeLinkedListNode3);
                lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m7104d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, m7105d2 = {"io/ktor/util/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode$makeCondAddOp$1\n*L\n1#1,809:1\n*E\n"})
    /* renamed from: io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1 */
    /* loaded from: classes5.dex */
    public static final class C103761 extends CondAddOp {
        public final /* synthetic */ Function0<Boolean> $condition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103761(LockFreeLinkedListNode lockFreeLinkedListNode, Function0<Boolean> function0) {
            super(lockFreeLinkedListNode);
            this.$condition = function0;
        }

        @Override // io.ktor.util.internal.AtomicOp
        @Nullable
        public Object prepare(@NotNull LockFreeLinkedListNode affected) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            if (this.$condition.invoke().booleanValue()) {
                return null;
            }
            return LockFreeLinkedListKt.getCONDITION_FALSE();
        }
    }

    @PublishedApi
    @NotNull
    public final CondAddOp makeCondAddOp(@NotNull LockFreeLinkedListNode node, @NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return new C103761(node, condition);
    }

    public final boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    @NotNull
    public final LockFreeLinkedListNode getNextNode() {
        return LockFreeLinkedListKt.unwrap(getNext());
    }

    @NotNull
    public final LockFreeLinkedListNode getPrevNode() {
        return LockFreeLinkedListKt.unwrap(getPrev());
    }

    public final boolean addOneIfEmpty(@NotNull LockFreeLinkedListNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            if (C2081xc40028dd.m347m(_next$FU, this, this, node)) {
                node.finishAdd(this);
                return true;
            }
        }
        return false;
    }

    public final void addLast(@NotNull LockFreeLinkedListNode node) {
        Object prev;
        Intrinsics.checkNotNullParameter(node, "node");
        do {
            prev = getPrev();
            Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
        } while (!((LockFreeLinkedListNode) prev).addNext(node, this));
    }

    @NotNull
    public final <T extends LockFreeLinkedListNode> AddLastDesc<T> describeAddLast(@NotNull T node) {
        Intrinsics.checkNotNullParameter(node, "node");
        return new AddLastDesc<>(this, node);
    }

    public final boolean addLastIfPrev(@NotNull LockFreeLinkedListNode node, @NotNull Function1<? super LockFreeLinkedListNode, Boolean> predicate) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        do {
            Object prev = getPrev();
            Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNode.addNext(node, this));
        return true;
    }

    @PublishedApi
    public final boolean addNext(@NotNull LockFreeLinkedListNode node, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, lockFreeLinkedListNode);
        if (!C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode, node)) {
            return false;
        }
        node.finishAdd(lockFreeLinkedListNode);
        return true;
    }

    @PublishedApi
    public final int tryCondAddNext(@NotNull LockFreeLinkedListNode node, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull CondAddOp condAdd) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
        Intrinsics.checkNotNullParameter(condAdd, "condAdd");
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, lockFreeLinkedListNode);
        condAdd.oldNext = lockFreeLinkedListNode;
        if (C2081xc40028dd.m347m(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode, condAdd)) {
            return condAdd.perform(this) == null ? 1 : 2;
        }
        return 0;
    }

    public boolean remove() {
        Object next;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            next = getNext();
            if ((next instanceof Removed) || next == this) {
                return false;
            }
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
        } while (!C2081xc40028dd.m347m(_next$FU, this, next, lockFreeLinkedListNode.removed()));
        finishRemove(lockFreeLinkedListNode);
        return true;
    }

    public final void helpRemove() {
        Object next = getNext();
        Removed removed = next instanceof Removed ? (Removed) next : null;
        if (removed == null) {
            throw new IllegalStateException("Must be invoked on a removed node".toString());
        }
        finishRemove(removed.ref);
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m7104d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0016J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m7105d2 = {"io/ktor/util/internal/LockFreeLinkedListNode$describeRemove$1", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "affected", "", LinkHeader.Rel.Next, "failure", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "Lio/ktor/util/internal/Removed;", "updatedNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Lio/ktor/util/internal/Removed;", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "ktor-utils", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.util.internal.LockFreeLinkedListNode$describeRemove$1 */
    /* loaded from: classes6.dex */
    public static final class C103751 extends AbstractAtomicDesc {
        public static final /* synthetic */ AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(C103751.class, Object.class, "_originalNext");

        @NotNull
        private volatile /* synthetic */ Object _originalNext = null;

        public C103751() {
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getAffectedNode, reason: from getter */
        public LockFreeLinkedListNode getThis$0() {
            return LockFreeLinkedListNode.this;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getOriginalNext */
        public LockFreeLinkedListNode getQueue() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public Object failure(@NotNull LockFreeLinkedListNode affected, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(obj, "next");
            if (obj instanceof Removed) {
                return LockFreeLinkedListKt.getALREADY_REMOVED();
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            C2081xc40028dd.m347m(_originalNext$FU, this, null, lockFreeLinkedListNode);
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public Removed updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            return lockFreeLinkedListNode.removed();
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            LockFreeLinkedListNode.this.finishRemove(lockFreeLinkedListNode);
        }
    }

    @Nullable
    public AtomicDesc describeRemove() {
        if (isRemoved()) {
            return null;
        }
        return new AbstractAtomicDesc() { // from class: io.ktor.util.internal.LockFreeLinkedListNode.describeRemove.1
            public static final /* synthetic */ AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(C103751.class, Object.class, "_originalNext");

            @NotNull
            private volatile /* synthetic */ Object _originalNext = null;

            public C103751() {
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            /* renamed from: getAffectedNode, reason: from getter */
            public LockFreeLinkedListNode getThis$0() {
                return LockFreeLinkedListNode.this;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            /* renamed from: getOriginalNext */
            public LockFreeLinkedListNode getQueue() {
                return (LockFreeLinkedListNode) this._originalNext;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            public Object failure(@NotNull LockFreeLinkedListNode affected, @NotNull Object obj) {
                Intrinsics.checkNotNullParameter(affected, "affected");
                Intrinsics.checkNotNullParameter(obj, "next");
                if (obj instanceof Removed) {
                    return LockFreeLinkedListKt.getALREADY_REMOVED();
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            public Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
                Intrinsics.checkNotNullParameter(affected, "affected");
                Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
                C2081xc40028dd.m347m(_originalNext$FU, this, null, lockFreeLinkedListNode);
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @NotNull
            public Removed updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
                Intrinsics.checkNotNullParameter(affected, "affected");
                Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
                return lockFreeLinkedListNode.removed();
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
                Intrinsics.checkNotNullParameter(affected, "affected");
                Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
                LockFreeLinkedListNode.this.finishRemove(lockFreeLinkedListNode);
            }
        };
    }

    @Nullable
    public final LockFreeLinkedListNode removeFirstOrNull() {
        while (true) {
            Object next = getNext();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    @NotNull
    public final RemoveFirstDesc<LockFreeLinkedListNode> describeRemoveFirst() {
        return new RemoveFirstDesc<>(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.util.internal.LockFreeLinkedListNode] */
    public final /* synthetic */ <T> T removeFirstIfIsInstanceOf() {
        while (true) {
            Object next = getNext();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            ?? r0 = (T) ((LockFreeLinkedListNode) next);
            if (r0 == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!(r0 instanceof Object)) {
                return null;
            }
            if (r0.remove()) {
                return r0;
            }
            r0.helpDelete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, io.ktor.util.internal.LockFreeLinkedListNode, java.lang.Object] */
    public final /* synthetic */ <T> T removeFirstIfIsInstanceOfOrPeekIf(Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        while (true) {
            Object next = getNext();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!(lockFreeLinkedListNode instanceof Object)) {
                return null;
            }
            if (predicate.invoke(lockFreeLinkedListNode).booleanValue() || lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u001eB\u001b\u0012\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\t\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\n\u0010\t\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0019\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\u001c\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u0004\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a¨\u0006\u001d"}, m7105d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", ExifInterface.GPS_DIRECTION_TRUE, "queue", "node", SegmentConstantPool.INITSTRING, "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "affected", LinkHeader.Rel.Next, "", "finishOnSuccess", "", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lio/ktor/util/internal/OpDescriptor;", BlackPassKeys.OP_PRICE_TITLE, "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "updatedNext", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getOriginalNext", "originalNext", "ktor-utils", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static class AddLastDesc<T extends LockFreeLinkedListNode> extends AbstractAtomicDesc {
        public static final /* synthetic */ AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(AddLastDesc.class, Object.class, "_affectedNode");

        @NotNull
        private volatile /* synthetic */ Object _affectedNode;

        @JvmField
        @NotNull
        public final T node;

        @JvmField
        @NotNull
        public final LockFreeLinkedListNode queue;

        public AddLastDesc(@NotNull LockFreeLinkedListNode queue, @NotNull T node) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(node, "node");
            this.queue = queue;
            this.node = node;
            if (node._next != node || node._prev != node) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this._affectedNode = null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public final LockFreeLinkedListNode takeAffectedNode(@NotNull OpDescriptor opDescriptor) {
            Intrinsics.checkNotNullParameter(opDescriptor, "op");
            while (true) {
                Object obj = this.queue._prev;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                Object obj2 = lockFreeLinkedListNode._next;
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.queue;
                if (obj2 == lockFreeLinkedListNode2 || obj2 == opDescriptor) {
                    return lockFreeLinkedListNode;
                }
                if (!(obj2 instanceof OpDescriptor)) {
                    LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = lockFreeLinkedListNode2.correctPrev(lockFreeLinkedListNode, opDescriptor);
                    if (lockFreeLinkedListNodeCorrectPrev != null) {
                        return lockFreeLinkedListNodeCorrectPrev;
                    }
                } else {
                    ((OpDescriptor) obj2).perform(lockFreeLinkedListNode);
                }
            }
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getAffectedNode */
        public final LockFreeLinkedListNode getThis$0() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        /* renamed from: getOriginalNext, reason: from getter */
        public final LockFreeLinkedListNode getQueue() {
            return this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public boolean retry(@NotNull LockFreeLinkedListNode affected, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(obj, "next");
            return obj != this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            C2081xc40028dd.m347m(_affectedNode$FU, this, null, affected);
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public Object updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            T t = this.node;
            C2081xc40028dd.m347m(LockFreeLinkedListNode._prev$FU, t, t, affected);
            T t2 = this.node;
            C2081xc40028dd.m347m(LockFreeLinkedListNode._next$FU, t2, t2, this.queue);
            return this.node;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            this.node.finishAdd(this.queue);
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020(B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00112\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\n\u0010\t\u001a\u00060\u0002j\u0002`\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0017\u0010&\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006'"}, m7105d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "queue", SegmentConstantPool.INITSTRING, "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "affected", "", LinkHeader.Rel.Next, "failure", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "Lio/ktor/util/internal/OpDescriptor;", BlackPassKeys.OP_PRICE_TITLE, "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "updatedNext", "node", "validatePrepared", "(Ljava/lang/Object;)Z", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "ktor-utils", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes5.dex */
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {
        public static final /* synthetic */ AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_affectedNode");
        public static final /* synthetic */ AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_originalNext");

        @NotNull
        private volatile /* synthetic */ Object _affectedNode;

        @NotNull
        private volatile /* synthetic */ Object _originalNext;

        @JvmField
        @NotNull
        public final LockFreeLinkedListNode queue;

        public static /* synthetic */ void getResult$annotations() {
        }

        public boolean validatePrepared(T node) {
            return true;
        }

        public RemoveFirstDesc(@NotNull LockFreeLinkedListNode queue) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            this.queue = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        public final T getResult() {
            T t = (T) getThis$0();
            Intrinsics.checkNotNull(t);
            return t;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public final LockFreeLinkedListNode takeAffectedNode(@NotNull OpDescriptor opDescriptor) {
            Intrinsics.checkNotNullParameter(opDescriptor, "op");
            Object next = this.queue.getNext();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            return (LockFreeLinkedListNode) next;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getAffectedNode */
        public final LockFreeLinkedListNode getThis$0() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getOriginalNext */
        public final LockFreeLinkedListNode getQueue() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public Object failure(@NotNull LockFreeLinkedListNode affected, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(obj, "next");
            if (affected == this.queue) {
                return LockFreeLinkedListKt.getLIST_EMPTY();
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final boolean retry(@NotNull LockFreeLinkedListNode affected, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(obj, "next");
            if (!(obj instanceof Removed)) {
                return false;
            }
            affected.helpDelete();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public final Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            if (affected instanceof LockFreeLinkedListHead) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!validatePrepared(affected)) {
                return LockFreeLinkedListKt.REMOVE_PREPARED;
            }
            C2081xc40028dd.m347m(_affectedNode$FU, this, null, affected);
            C2081xc40028dd.m347m(_originalNext$FU, this, null, lockFreeLinkedListNode);
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public final Object updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            return lockFreeLinkedListNode.removed();
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
            affected.finishRemove(lockFreeLinkedListNode);
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J \u0010\u0012\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$J\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J\u0014\u0010\u0017\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u0018H\u0014J \u0010\u0019\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$R\u001a\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u001b"}, m7105d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/AtomicDesc;", "()V", "affectedNode", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "complete", "", BlackPassKeys.OP_PRICE_TITLE, "Lio/ktor/util/internal/AtomicOp;", "failure", "", "affected", LinkHeader.Rel.Next, "finishOnSuccess", "onPrepare", "prepare", "retry", "", "takeAffectedNode", "Lio/ktor/util/internal/OpDescriptor;", "updatedNext", "PrepareOp", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,809:1\n1#2:810\n*E\n"})
    public static abstract class AbstractAtomicDesc extends AtomicDesc {
        @Nullable
        public Object failure(@NotNull LockFreeLinkedListNode affected, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(obj, "next");
            return null;
        }

        public abstract void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode);

        @Nullable
        /* renamed from: getAffectedNode */
        public abstract LockFreeLinkedListNode getThis$0();

        @Nullable
        /* renamed from: getOriginalNext */
        public abstract LockFreeLinkedListNode getQueue();

        @Nullable
        public abstract Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode);

        public boolean retry(@NotNull LockFreeLinkedListNode affected, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(affected, "affected");
            Intrinsics.checkNotNullParameter(obj, "next");
            return false;
        }

        @NotNull
        public abstract Object updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode);

        @NotNull
        public LockFreeLinkedListNode takeAffectedNode(@NotNull OpDescriptor opDescriptor) {
            Intrinsics.checkNotNullParameter(opDescriptor, "op");
            LockFreeLinkedListNode this$0 = getThis$0();
            Intrinsics.checkNotNull(this$0);
            return this$0;
        }

        /* compiled from: LockFreeLinkedList.kt */
        @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lio/ktor/util/internal/OpDescriptor;", LinkHeader.Rel.Next, "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", BlackPassKeys.OP_PRICE_TITLE, "Lio/ktor/util/internal/AtomicOp;", "desc", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/AtomicOp;Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "perform", "", "affected", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
        public static final class PrepareOp extends OpDescriptor {

            @JvmField
            @NotNull
            public final AbstractAtomicDesc desc;

            @JvmField
            @NotNull
            public final LockFreeLinkedListNode next;

            @JvmField
            @NotNull
            public final AtomicOp<LockFreeLinkedListNode> op;

            /* JADX WARN: Multi-variable type inference failed */
            public PrepareOp(@NotNull LockFreeLinkedListNode next, @NotNull AtomicOp<? super LockFreeLinkedListNode> op, @NotNull AbstractAtomicDesc desc) {
                Intrinsics.checkNotNullParameter(next, "next");
                Intrinsics.checkNotNullParameter(op, "op");
                Intrinsics.checkNotNullParameter(desc, "desc");
                this.next = next;
                this.op = op;
                this.desc = desc;
            }

            @Override // io.ktor.util.internal.OpDescriptor
            @Nullable
            public Object perform(@Nullable Object affected) {
                Intrinsics.checkNotNull(affected, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) affected;
                Object objOnPrepare = this.desc.onPrepare(lockFreeLinkedListNode, this.next);
                if (objOnPrepare != null) {
                    if (objOnPrepare == LockFreeLinkedListKt.REMOVE_PREPARED) {
                        if (C2081xc40028dd.m347m(LockFreeLinkedListNode._next$FU, lockFreeLinkedListNode, this, this.next.removed())) {
                            lockFreeLinkedListNode.helpDelete();
                        }
                    } else {
                        this.op.tryDecide(objOnPrepare);
                        C2081xc40028dd.m347m(LockFreeLinkedListNode._next$FU, lockFreeLinkedListNode, this, this.next);
                    }
                    return objOnPrepare;
                }
                C2081xc40028dd.m347m(LockFreeLinkedListNode._next$FU, lockFreeLinkedListNode, this, this.op.isDecided() ? this.next : this.op);
                return null;
            }
        }

        @Override // io.ktor.util.internal.AtomicDesc
        @Nullable
        public final Object prepare(@NotNull AtomicOp<?> atomicOp) {
            Object objPerform;
            Intrinsics.checkNotNullParameter(atomicOp, "op");
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNodeTakeAffectedNode = takeAffectedNode(atomicOp);
                Object obj = lockFreeLinkedListNodeTakeAffectedNode._next;
                if (obj == atomicOp || atomicOp.isDecided()) {
                    return null;
                }
                if (obj instanceof OpDescriptor) {
                    ((OpDescriptor) obj).perform(lockFreeLinkedListNodeTakeAffectedNode);
                } else {
                    Object objFailure = failure(lockFreeLinkedListNodeTakeAffectedNode, obj);
                    if (objFailure != null) {
                        return objFailure;
                    }
                    if (retry(lockFreeLinkedListNodeTakeAffectedNode, obj)) {
                        continue;
                    } else {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        PrepareOp prepareOp = new PrepareOp((LockFreeLinkedListNode) obj, atomicOp, this);
                        if (C2081xc40028dd.m347m(LockFreeLinkedListNode._next$FU, lockFreeLinkedListNodeTakeAffectedNode, obj, prepareOp) && (objPerform = prepareOp.perform(lockFreeLinkedListNodeTakeAffectedNode)) != LockFreeLinkedListKt.REMOVE_PREPARED) {
                            return objPerform;
                        }
                    }
                }
            }
        }

        @Override // io.ktor.util.internal.AtomicDesc
        public final void complete(@NotNull AtomicOp<?> atomicOp, @Nullable Object failure) {
            Intrinsics.checkNotNullParameter(atomicOp, "op");
            boolean z = failure == null;
            LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                if (!(!z)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return;
            }
            LockFreeLinkedListNode queue = getQueue();
            if (queue == null) {
                if (!(!z)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                if (C2081xc40028dd.m347m(LockFreeLinkedListNode._next$FU, this$0, atomicOp, z ? updatedNext(this$0, queue) : queue) && z) {
                    finishOnSuccess(this$0, queue);
                }
            }
        }
    }

    public final void finishRemove(LockFreeLinkedListNode lockFreeLinkedListNode) {
        helpDelete();
        lockFreeLinkedListNode.correctPrev(LockFreeLinkedListKt.unwrap(this._prev), null);
    }

    public final LockFreeLinkedListNode findHead() {
        LockFreeLinkedListNode nextNode = this;
        while (!(nextNode instanceof LockFreeLinkedListHead)) {
            nextNode = nextNode.getNextNode();
            if (nextNode == this) {
                throw new IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return nextNode;
    }

    @PublishedApi
    public final void helpDelete() {
        Object next;
        LockFreeLinkedListNode lockFreeLinkedListNodeMarkPrev = markPrev();
        Object obj = this._next;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        LockFreeLinkedListNode lockFreeLinkedListNode = ((Removed) obj).ref;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = null;
            while (true) {
                Object next2 = lockFreeLinkedListNode.getNext();
                if (next2 instanceof Removed) {
                    lockFreeLinkedListNode.markPrev();
                    lockFreeLinkedListNode = ((Removed) next2).ref;
                } else {
                    next = lockFreeLinkedListNodeMarkPrev.getNext();
                    if (next instanceof Removed) {
                        if (lockFreeLinkedListNode2 != null) {
                            break;
                        } else {
                            lockFreeLinkedListNodeMarkPrev = LockFreeLinkedListKt.unwrap(lockFreeLinkedListNodeMarkPrev._prev);
                        }
                    } else if (next != this) {
                        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        LockFreeLinkedListNode lockFreeLinkedListNode3 = (LockFreeLinkedListNode) next;
                        if (lockFreeLinkedListNode3 == lockFreeLinkedListNode) {
                            return;
                        }
                        lockFreeLinkedListNode2 = lockFreeLinkedListNodeMarkPrev;
                        lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode3;
                    } else if (C2081xc40028dd.m347m(_next$FU, lockFreeLinkedListNodeMarkPrev, this, lockFreeLinkedListNode)) {
                        return;
                    }
                }
            }
            lockFreeLinkedListNodeMarkPrev.markPrev();
            C2081xc40028dd.m347m(_next$FU, lockFreeLinkedListNode2, lockFreeLinkedListNodeMarkPrev, ((Removed) next).ref);
            lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode2;
        }
    }

    public final LockFreeLinkedListNode correctPrev(LockFreeLinkedListNode _prev, OpDescriptor opDescriptor) {
        Object obj;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = null;
            while (true) {
                obj = _prev._next;
                if (obj == opDescriptor) {
                    return _prev;
                }
                if (obj instanceof OpDescriptor) {
                    ((OpDescriptor) obj).perform(_prev);
                } else if (!(obj instanceof Removed)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof Removed) {
                        return null;
                    }
                    if (obj != this) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                        lockFreeLinkedListNode = _prev;
                        _prev = (LockFreeLinkedListNode) obj;
                    } else {
                        if (obj2 == _prev) {
                            return null;
                        }
                        if (C2081xc40028dd.m347m(_prev$FU, this, obj2, _prev) && !(_prev._prev instanceof Removed)) {
                            return null;
                        }
                    }
                } else {
                    if (lockFreeLinkedListNode != null) {
                        break;
                    }
                    _prev = LockFreeLinkedListKt.unwrap(_prev._prev);
                }
            }
            _prev.markPrev();
            C2081xc40028dd.m347m(_next$FU, lockFreeLinkedListNode, _prev, ((Removed) obj).ref);
            _prev = lockFreeLinkedListNode;
        }
    }

    public final void validateNode$ktor_utils(@NotNull LockFreeLinkedListNode prev, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(lockFreeLinkedListNode, "next");
        if (prev != this._prev) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (lockFreeLinkedListNode != this._next) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @NotNull
    public String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + ObjectUtils.AT_SIGN + hashCode();
    }

    @NotNull
    public final Object getNext() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    @NotNull
    public final Object getPrev() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return obj;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            if (lockFreeLinkedListNode.getNext() == this) {
                return obj;
            }
            correctPrev(lockFreeLinkedListNode, null);
        }
    }

    public final boolean addLastIf(@NotNull LockFreeLinkedListNode node, @NotNull Function0<Boolean> condition) {
        int iTryCondAddNext;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(condition, "condition");
        C103761 c103761 = new C103761(node, condition);
        do {
            Object prev = getPrev();
            Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            iTryCondAddNext = ((LockFreeLinkedListNode) prev).tryCondAddNext(node, this, c103761);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addLastIfPrevAndIf(@NotNull LockFreeLinkedListNode node, @NotNull Function1<? super LockFreeLinkedListNode, Boolean> predicate, @NotNull Function0<Boolean> condition) {
        int iTryCondAddNext;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(condition, "condition");
        C103761 c103761 = new C103761(node, condition);
        do {
            Object prev = getPrev();
            Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
            iTryCondAddNext = lockFreeLinkedListNode.tryCondAddNext(node, this, c103761);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final void finishAdd(LockFreeLinkedListNode lockFreeLinkedListNode) {
        Object obj;
        do {
            obj = lockFreeLinkedListNode._prev;
            if ((obj instanceof Removed) || getNext() != lockFreeLinkedListNode) {
                return;
            }
        } while (!C2081xc40028dd.m347m(_prev$FU, lockFreeLinkedListNode, obj, this));
        if (getNext() instanceof Removed) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode.correctPrev((LockFreeLinkedListNode) obj, null);
        }
    }

    public final LockFreeLinkedListNode markPrev() {
        Object obj;
        LockFreeLinkedListNode lockFreeLinkedListNodeFindHead;
        do {
            obj = this._prev;
            if (obj instanceof Removed) {
                return ((Removed) obj).ref;
            }
            if (obj == this) {
                lockFreeLinkedListNodeFindHead = findHead();
            } else {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
                lockFreeLinkedListNodeFindHead = (LockFreeLinkedListNode) obj;
            }
        } while (!C2081xc40028dd.m347m(_prev$FU, this, obj, lockFreeLinkedListNodeFindHead.removed()));
        return (LockFreeLinkedListNode) obj;
    }
}
