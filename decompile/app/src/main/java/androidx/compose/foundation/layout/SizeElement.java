package androidx.compose.foundation.layout;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C2046Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Size.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BN\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\f\u0010\u0019\u001a\u00020\r*\u00020\fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m7105d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SizeNode;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends ModifierNodeElement<SizeNode> {
    public final boolean enforceIncoming;

    @NotNull
    public final Function1<InspectorInfo, Unit> inspectorInfo;
    public final float maxHeight;
    public final float maxWidth;
    public final float minHeight;
    public final float minWidth;

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f4, z, function1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SizeElement(float f, float f2, float f3, float f4, boolean z, Function1<? super InspectorInfo, Unit> function1) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
        this.inspectorInfo = function1;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull SizeNode node) {
        node.m8188setMinWidth0680j_4(this.minWidth);
        node.m8187setMinHeight0680j_4(this.minHeight);
        node.m8186setMaxWidth0680j_4(this.maxWidth);
        node.m8185setMaxHeight0680j_4(this.maxHeight);
        node.setEnforceIncoming(this.enforceIncoming);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) other;
        return C2046Dp.m13671equalsimpl0(this.minWidth, sizeElement.minWidth) && C2046Dp.m13671equalsimpl0(this.minHeight, sizeElement.minHeight) && C2046Dp.m13671equalsimpl0(this.maxWidth, sizeElement.maxWidth) && C2046Dp.m13671equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C2046Dp.m13672hashCodeimpl(this.minWidth) * 31) + C2046Dp.m13672hashCodeimpl(this.minHeight)) * 31) + C2046Dp.m13672hashCodeimpl(this.maxWidth)) * 31) + C2046Dp.m13672hashCodeimpl(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }
}
