package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequesterModifierNode;
import androidx.compose.p003ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Focusable.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\f\u0010\f\u001a\u00020\n*\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/foundation/FocusableSemanticsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "()V", "isFocused", "", "semanticsConfigurationCache", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "setFocus", "", "focused", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class FocusableSemanticsNode extends Modifier.Node implements SemanticsModifierNode, FocusRequesterModifierNode {
    public boolean isFocused;

    @NotNull
    public SemanticsConfiguration semanticsConfigurationCache = new SemanticsConfiguration();

    public final void setFocus(boolean focused) {
        this.isFocused = focused;
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.isFocused);
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.FocusableSemanticsNode.applySemantics.1
            public C04021() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(FocusRequesterModifierNodeKt.requestFocus(FocusableSemanticsNode.this));
            }
        }, 1, null);
    }

    /* compiled from: Focusable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableSemanticsNode$applySemantics$1 */
    public static final class C04021 extends Lambda implements Function0<Boolean> {
        public C04021() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(FocusRequesterModifierNodeKt.requestFocus(FocusableSemanticsNode.this));
        }
    }
}
