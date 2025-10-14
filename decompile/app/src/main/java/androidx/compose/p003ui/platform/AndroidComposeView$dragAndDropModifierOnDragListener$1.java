package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends FunctionReferenceImpl implements Function3<DragAndDropTransferData, Size, Function1<? super DrawScope, ? extends Unit>, Boolean> {
    public AndroidComposeView$dragAndDropModifierOnDragListener$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Boolean invoke(DragAndDropTransferData dragAndDropTransferData, Size size, Function1<? super DrawScope, ? extends Unit> function1) {
        return m12902invoke12SF9DM(dragAndDropTransferData, size.getPackedValue(), function1);
    }

    @NotNull
    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m12902invoke12SF9DM(@NotNull DragAndDropTransferData dragAndDropTransferData, long j, @NotNull Function1<? super DrawScope, Unit> function1) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m12900startDrag12SF9DM(dragAndDropTransferData, j, function1));
    }
}
