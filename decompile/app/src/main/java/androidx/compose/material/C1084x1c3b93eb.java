package androidx.compose.material;

import androidx.compose.material.DrawerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", m7120f = "Drawer.kt", m7121i = {0}, m7122l = {TypedValues.Custom.TYPE_INT}, m7123m = "onPostFling-RZ2iAVY", m7124n = {"available"}, m7125s = {"J$0"})
/* renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 */
/* loaded from: classes2.dex */
public final class C1084x1c3b93eb extends ContinuationImpl {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DrawerKt.C10831 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1084x1c3b93eb(DrawerKt.C10831 c10831, Continuation<? super C1084x1c3b93eb> continuation) {
        super(continuation);
        this.this$0 = c10831;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7960onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
