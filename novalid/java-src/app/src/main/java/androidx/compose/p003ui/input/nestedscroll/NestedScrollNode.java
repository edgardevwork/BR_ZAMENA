package androidx.compose.p003ui.input.nestedscroll;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p003ui.node.DelegatableNode;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NestedScrollNode.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J#\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J*\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\"\u0010-\u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u001cH\u0002J\u0012\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u00103\u001a\u00020\u001cH\u0002J\u001f\u00104\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b5R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, m7105d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", Http2ExchangeCodec.CONNECTION, "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "nestedCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "parentConnection", "getParentConnection", "parentModifierLocal", "getParentModifierLocal", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "resolvedDispatcher", "onAttach", "", "onDetach", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "resetDispatcherFields", "updateDispatcher", "newDispatcher", "updateDispatcherFields", "updateNode", "updateNode$ui_release", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class NestedScrollNode extends Modifier.Node implements ModifierLocalModifierNode, NestedScrollConnection, DelegatableNode {
    public static final int $stable = 8;

    @NotNull
    private NestedScrollConnection connection;

    @NotNull
    private final ModifierLocalMap providedValues;

    @NotNull
    private NestedScrollDispatcher resolvedDispatcher;

    @NotNull
    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final void setConnection(@NotNull NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public NestedScrollNode(@NotNull NestedScrollConnection nestedScrollConnection, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m7112to(NestedScrollNodeKt.getModifierLocalNestedScroll(), this));
    }

    private final NestedScrollNode getParentModifierLocal() {
        if (getIsAttached()) {
            return (NestedScrollNode) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    private final NestedScrollConnection getParentConnection() {
        if (getIsAttached()) {
            return (NestedScrollConnection) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope scope;
        NestedScrollNode parentModifierLocal = getParentModifierLocal();
        if ((parentModifierLocal == null || (scope = parentModifierLocal.getNestedCoroutineScope()) == null) && (scope = this.resolvedDispatcher.getScope()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope;
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo7962onPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection parentConnection = getParentConnection();
        long jMo7962onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo7962onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m11115getZeroF1C5BW0();
        return Offset.m11104plusMKHz9U(jMo7962onPreScrollOzD1aCk, this.connection.mo7962onPreScrollOzD1aCk(Offset.m11103minusMKHz9U(available, jMo7962onPreScrollOzD1aCk), source));
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo7961onPostScrollDzOQY0M(long consumed, long available, int source) {
        long jM11115getZeroF1C5BW0;
        long jMo7961onPostScrollDzOQY0M = this.connection.mo7961onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            jM11115getZeroF1C5BW0 = parentConnection.mo7961onPostScrollDzOQY0M(Offset.m11104plusMKHz9U(consumed, jMo7961onPostScrollDzOQY0M), Offset.m11103minusMKHz9U(available, jMo7961onPostScrollDzOQY0M), source);
        } else {
            jM11115getZeroF1C5BW0 = Offset.INSTANCE.m11115getZeroF1C5BW0();
        }
        return Offset.m11104plusMKHz9U(jMo7961onPostScrollDzOQY0M, jM11115getZeroF1C5BW0);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c A[RETURN] */
    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8201onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) throws Throwable {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        long jM13912getZero9UxMQ8M;
        NestedScrollNode nestedScrollNode;
        long j2;
        if (continuation instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) continuation;
            int i = nestedScrollNode$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, continuation);
            }
        }
        Object objMo8201onPreFlingQWom1Mo = nestedScrollNode$onPreFling$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollNode$onPreFling$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo8201onPreFlingQWom1Mo);
            NestedScrollConnection parentConnection = getParentConnection();
            if (parentConnection == null) {
                jM13912getZero9UxMQ8M = Velocity.INSTANCE.m13912getZero9UxMQ8M();
                nestedScrollNode = this;
                long j3 = j;
                j2 = jM13912getZero9UxMQ8M;
                NestedScrollConnection nestedScrollConnection = nestedScrollNode.connection;
                long jM13904minusAH228Gc = Velocity.m13904minusAH228Gc(j3, j2);
                nestedScrollNode$onPreFling$1.L$0 = null;
                nestedScrollNode$onPreFling$1.J$0 = j2;
                nestedScrollNode$onPreFling$1.label = 2;
                objMo8201onPreFlingQWom1Mo = nestedScrollConnection.mo8201onPreFlingQWom1Mo(jM13904minusAH228Gc, nestedScrollNode$onPreFling$1);
                if (objMo8201onPreFlingQWom1Mo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j2, ((Velocity) objMo8201onPreFlingQWom1Mo).getPackedValue()));
            }
            nestedScrollNode$onPreFling$1.L$0 = this;
            nestedScrollNode$onPreFling$1.J$0 = j;
            nestedScrollNode$onPreFling$1.label = 1;
            objMo8201onPreFlingQWom1Mo = parentConnection.mo8201onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
            if (objMo8201onPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            nestedScrollNode = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = nestedScrollNode$onPreFling$1.J$0;
                ResultKt.throwOnFailure(objMo8201onPreFlingQWom1Mo);
                return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j2, ((Velocity) objMo8201onPreFlingQWom1Mo).getPackedValue()));
            }
            j = nestedScrollNode$onPreFling$1.J$0;
            nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPreFling$1.L$0;
            ResultKt.throwOnFailure(objMo8201onPreFlingQWom1Mo);
        }
        jM13912getZero9UxMQ8M = ((Velocity) objMo8201onPreFlingQWom1Mo).getPackedValue();
        long j32 = j;
        j2 = jM13912getZero9UxMQ8M;
        NestedScrollConnection nestedScrollConnection2 = nestedScrollNode.connection;
        long jM13904minusAH228Gc2 = Velocity.m13904minusAH228Gc(j32, j2);
        nestedScrollNode$onPreFling$1.L$0 = null;
        nestedScrollNode$onPreFling$1.J$0 = j2;
        nestedScrollNode$onPreFling$1.label = 2;
        objMo8201onPreFlingQWom1Mo = nestedScrollConnection2.mo8201onPreFlingQWom1Mo(jM13904minusAH228Gc2, nestedScrollNode$onPreFling$1);
        if (objMo8201onPreFlingQWom1Mo == coroutine_suspended) {
        }
        return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j2, ((Velocity) objMo8201onPreFlingQWom1Mo).getPackedValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0016  */
    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7960onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) throws Throwable {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        long j3;
        long j4;
        NestedScrollNode nestedScrollNode;
        long j5;
        long jM13912getZero9UxMQ8M;
        long j6;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            int i = nestedScrollNode$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, continuation);
            }
        }
        Object objMo7960onPostFlingRZ2iAVY = nestedScrollNode$onPostFling$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollNode$onPostFling$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo7960onPostFlingRZ2iAVY);
            NestedScrollConnection nestedScrollConnection = this.connection;
            nestedScrollNode$onPostFling$1.L$0 = this;
            j3 = j;
            nestedScrollNode$onPostFling$1.J$0 = j3;
            j4 = j2;
            nestedScrollNode$onPostFling$1.J$1 = j4;
            nestedScrollNode$onPostFling$1.label = 1;
            objMo7960onPostFlingRZ2iAVY = nestedScrollConnection.mo7960onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$1);
            if (objMo7960onPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            nestedScrollNode = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = nestedScrollNode$onPostFling$1.J$0;
                ResultKt.throwOnFailure(objMo7960onPostFlingRZ2iAVY);
                jM13912getZero9UxMQ8M = ((Velocity) objMo7960onPostFlingRZ2iAVY).getPackedValue();
                j5 = j6;
                return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j5, jM13912getZero9UxMQ8M));
            }
            long j7 = nestedScrollNode$onPostFling$1.J$1;
            long j8 = nestedScrollNode$onPostFling$1.J$0;
            nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPostFling$1.L$0;
            ResultKt.throwOnFailure(objMo7960onPostFlingRZ2iAVY);
            j4 = j7;
            j3 = j8;
        }
        long packedValue = ((Velocity) objMo7960onPostFlingRZ2iAVY).getPackedValue();
        NestedScrollConnection parentConnection = nestedScrollNode.getParentConnection();
        if (parentConnection != null) {
            long jM13905plusAH228Gc = Velocity.m13905plusAH228Gc(j3, packedValue);
            long jM13904minusAH228Gc = Velocity.m13904minusAH228Gc(j4, packedValue);
            nestedScrollNode$onPostFling$1.L$0 = null;
            nestedScrollNode$onPostFling$1.J$0 = packedValue;
            nestedScrollNode$onPostFling$1.label = 2;
            objMo7960onPostFlingRZ2iAVY = parentConnection.mo7960onPostFlingRZ2iAVY(jM13905plusAH228Gc, jM13904minusAH228Gc, nestedScrollNode$onPostFling$1);
            if (objMo7960onPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            j6 = packedValue;
            jM13912getZero9UxMQ8M = ((Velocity) objMo7960onPostFlingRZ2iAVY).getPackedValue();
            j5 = j6;
            return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j5, jM13912getZero9UxMQ8M));
        }
        j5 = packedValue;
        jM13912getZero9UxMQ8M = Velocity.INSTANCE.m13912getZero9UxMQ8M();
        return Velocity.m13892boximpl(Velocity.m13905plusAH228Gc(j5, jM13912getZero9UxMQ8M));
    }

    private final void updateDispatcher(NestedScrollDispatcher newDispatcher) {
        resetDispatcherFields();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!Intrinsics.areEqual(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            updateDispatcherFields();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetDispatcherFields();
    }

    /* compiled from: NestedScrollNode.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1 */
    public static final class C18671 extends Lambda implements Function0<CoroutineScope> {
        public C18671() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineScope invoke() {
            return NestedScrollNode.this.getNestedCoroutineScope();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setModifierLocalNode$ui_release(this);
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode.updateDispatcherFields.1
            public C18671() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CoroutineScope invoke() {
                return NestedScrollNode.this.getNestedCoroutineScope();
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getModifierLocalNode() == this) {
            this.resolvedDispatcher.setModifierLocalNode$ui_release(null);
        }
    }

    public final void updateNode$ui_release(@NotNull NestedScrollConnection nestedScrollConnection, @Nullable NestedScrollDispatcher dispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(dispatcher);
    }
}
