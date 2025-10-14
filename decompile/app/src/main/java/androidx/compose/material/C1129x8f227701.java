package androidx.compose.material;

import androidx.compose.material.ModalBottomSheetKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModalBottomSheet.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m7120f = "ModalBottomSheet.kt", m7121i = {0}, m7122l = {798}, m7123m = "onPostFling-RZ2iAVY", m7124n = {"available"}, m7125s = {"J$0"})
/* renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* loaded from: classes3.dex */
public final class C1129x8f227701 extends ContinuationImpl {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ModalBottomSheetKt.C11281 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129x8f227701(ModalBottomSheetKt.C11281 c11281, Continuation<? super C1129x8f227701> continuation) {
        super(continuation);
        this.this$0 = c11281;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7960onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
