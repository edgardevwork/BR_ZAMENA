package androidx.compose.p003ui.input.rotary;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RotaryInputModifier.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\f\u0010\u001a\u001a\u00020\u0018*\u00020\u001bH\u0016R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001c"}, m7105d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/rotary/RotaryInputNode;", "onRotaryScrollEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "onPreRotaryScrollEvent", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnPreRotaryScrollEvent", "()Lkotlin/jvm/functions/Function1;", "getOnRotaryScrollEvent", "component1", "component2", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
final /* data */ class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {

    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> onPreRotaryScrollEvent;

    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> onRotaryScrollEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RotaryInputElement copy$default(RotaryInputElement rotaryInputElement, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = rotaryInputElement.onRotaryScrollEvent;
        }
        if ((i & 2) != 0) {
            function12 = rotaryInputElement.onPreRotaryScrollEvent;
        }
        return rotaryInputElement.copy(function1, function12);
    }

    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> component1() {
        return this.onRotaryScrollEvent;
    }

    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> component2() {
        return this.onPreRotaryScrollEvent;
    }

    @NotNull
    public final RotaryInputElement copy(@Nullable Function1<? super RotaryScrollEvent, Boolean> onRotaryScrollEvent, @Nullable Function1<? super RotaryScrollEvent, Boolean> onPreRotaryScrollEvent) {
        return new RotaryInputElement(onRotaryScrollEvent, onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) other;
        return Intrinsics.areEqual(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && Intrinsics.areEqual(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        Function1<RotaryScrollEvent, Boolean> function1 = this.onRotaryScrollEvent;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<RotaryScrollEvent, Boolean> function12 = this.onPreRotaryScrollEvent;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Nullable
    public final Function1<RotaryScrollEvent, Boolean> getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(@Nullable Function1<? super RotaryScrollEvent, Boolean> function1, @Nullable Function1<? super RotaryScrollEvent, Boolean> function12) {
        this.onRotaryScrollEvent = function1;
        this.onPreRotaryScrollEvent = function12;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull RotaryInputNode node) {
        node.setOnEvent(this.onRotaryScrollEvent);
        node.setOnPreEvent(this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Function1<RotaryScrollEvent, Boolean> function1 = this.onRotaryScrollEvent;
        if (function1 != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", function1);
        }
        Function1<RotaryScrollEvent, Boolean> function12 = this.onPreRotaryScrollEvent;
        if (function12 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", function12);
        }
    }
}
