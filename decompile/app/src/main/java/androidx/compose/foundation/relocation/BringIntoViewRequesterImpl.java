package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoViewRequester.kt */
@ExperimentalFoundationApi
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m7105d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "()V", "modifiers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "getModifiers", "()Landroidx/compose/runtime/collection/MutableVector;", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,197:1\n1208#2:198\n1187#2,2:199\n460#3,11:201\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n115#1:198\n115#1:199,2\n118#1:201,11\n*E\n"})
/* loaded from: classes2.dex */
public final class BringIntoViewRequesterImpl implements BringIntoViewRequester {

    @NotNull
    public final MutableVector<BringIntoViewRequesterNode> modifiers = new MutableVector<>(new BringIntoViewRequesterNode[16], 0);

    /* compiled from: BringIntoViewRequester.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m7120f = "BringIntoViewRequester.kt", m7121i = {0, 0, 0, 0}, m7122l = {119}, m7123m = "bringIntoView", m7124n = {"rect", "content$iv", "size$iv", "i$iv"}, m7125s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 */
    /* loaded from: classes3.dex */
    public static final class C07751 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C07751(Continuation<? super C07751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BringIntoViewRequesterImpl.this.bringIntoView(null, this);
        }
    }

    @NotNull
    public final MutableVector<BringIntoViewRequesterNode> getModifiers() {
        return this.modifiers;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bringIntoView(@Nullable Rect rect, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C07751 c07751;
        int size;
        Rect rect2;
        int i;
        Object[] objArr;
        if (continuation instanceof C07751) {
            c07751 = (C07751) continuation;
            int i2 = c07751.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c07751.label = i2 - Integer.MIN_VALUE;
            } else {
                c07751 = new C07751(continuation);
            }
        }
        Object obj = c07751.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c07751.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableVector<BringIntoViewRequesterNode> mutableVector = this.modifiers;
            size = mutableVector.getSize();
            if (size > 0) {
                BringIntoViewRequesterNode[] content = mutableVector.getContent();
                rect2 = rect;
                i = 0;
                objArr = content;
                BringIntoViewRequesterNode bringIntoViewRequesterNode = (BringIntoViewRequesterNode) objArr[i];
                c07751.L$0 = rect2;
                c07751.L$1 = objArr;
                c07751.I$0 = size;
                c07751.I$1 = i;
                c07751.label = 1;
                if (bringIntoViewRequesterNode.bringIntoView(rect2, c07751) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = c07751.I$1;
        size = c07751.I$0;
        objArr = (Object[]) c07751.L$1;
        Rect rect3 = (Rect) c07751.L$0;
        ResultKt.throwOnFailure(obj);
        rect2 = rect3;
        i++;
    }
}
