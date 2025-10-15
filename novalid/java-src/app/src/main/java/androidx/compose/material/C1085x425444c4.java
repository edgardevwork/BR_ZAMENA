package androidx.compose.material;

import androidx.compose.material.DrawerKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m7120f = "Drawer.kt", m7121i = {0}, m7122l = {891}, m7123m = "onPreFling-QWom1Mo", m7124n = {"available"}, m7125s = {"J$0"})
/* renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* loaded from: classes2.dex */
public final class C1085x425444c4 extends ContinuationImpl {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DrawerKt.C10831 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1085x425444c4(DrawerKt.C10831 c10831, Continuation<? super C1085x425444c4> continuation) {
        super(continuation);
        this.this$0 = c10831;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8201onPreFlingQWom1Mo(0L, this);
    }
}
