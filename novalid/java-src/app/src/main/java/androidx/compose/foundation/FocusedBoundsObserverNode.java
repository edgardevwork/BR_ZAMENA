package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusedBounds.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m7105d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "onPositioned", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusBoundsObserver", "getOnPositioned", "()Lkotlin/jvm/functions/Function1;", "setOnPositioned", "parent", "getParent", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements ModifierLocalModifierNode {
    public static final int $stable = 8;

    @NotNull
    private final Function1<LayoutCoordinates, Unit> focusBoundsObserver;

    @NotNull
    private Function1<? super LayoutCoordinates, Unit> onPositioned;

    @NotNull
    private final ModifierLocalMap providedValues;

    @NotNull
    public final Function1<LayoutCoordinates, Unit> getOnPositioned() {
        return this.onPositioned;
    }

    public final void setOnPositioned(@NotNull Function1<? super LayoutCoordinates, Unit> function1) {
        this.onPositioned = function1;
    }

    public FocusedBoundsObserverNode(@NotNull Function1<? super LayoutCoordinates, Unit> function1) {
        this.onPositioned = function1;
        Function1<LayoutCoordinates, Unit> function12 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.FocusedBoundsObserverNode$focusBoundsObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable LayoutCoordinates layoutCoordinates) {
                if (this.this$0.getIsAttached()) {
                    this.this$0.getOnPositioned().invoke(layoutCoordinates);
                    Function1 parent = this.this$0.getParent();
                    if (parent != null) {
                        parent.invoke(layoutCoordinates);
                    }
                }
            }
        };
        this.focusBoundsObserver = function12;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.m7112to(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), function12));
    }

    public final Function1<LayoutCoordinates, Unit> getParent() {
        if (getIsAttached()) {
            return (Function1) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }
}
