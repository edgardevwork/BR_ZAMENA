package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.p003ui.focus.FocusDirection;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.text.input.ImeAction;
import kotlin.Metadata;

/* compiled from: TextFieldDecoratorModifier.kt */
@Metadata(m7104d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m7105d2 = {"androidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text/KeyboardActionScope;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "defaultKeyboardAction", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "defaultKeyboardAction-KlQnJC8", "(I)V", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements KeyboardActionScope {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    public TextFieldDecoratorModifierNode$keyboardActionScope$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.this$0 = textFieldDecoratorModifierNode;
    }

    private final FocusManager getFocusManager() {
        return (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalFocusManager());
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8 */
    public void mo8421defaultKeyboardActionKlQnJC8(int imeAction) {
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m13329equalsimpl0(imeAction, companion.m13344getNexteUduSuo())) {
            getFocusManager().mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11029getNextdhqQ8s());
            return;
        }
        if (ImeAction.m13329equalsimpl0(imeAction, companion.m13346getPreviouseUduSuo())) {
            getFocusManager().mo11033moveFocus3ESFkO8(FocusDirection.INSTANCE.m11030getPreviousdhqQ8s());
        } else {
            if (ImeAction.m13329equalsimpl0(imeAction, companion.m13342getDoneeUduSuo())) {
                this.this$0.requireKeyboardController().hide();
                return;
            }
            if (ImeAction.m13329equalsimpl0(imeAction, companion.m13343getGoeUduSuo()) ? true : ImeAction.m13329equalsimpl0(imeAction, companion.m13347getSearcheUduSuo()) ? true : ImeAction.m13329equalsimpl0(imeAction, companion.m13348getSendeUduSuo()) ? true : ImeAction.m13329equalsimpl0(imeAction, companion.m13341getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m13329equalsimpl0(imeAction, companion.m13345getNoneeUduSuo());
        }
    }
}
