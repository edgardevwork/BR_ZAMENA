package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text2.input.internal.selection.TextToolbarState;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.focus.FocusRequesterModifierNode;
import androidx.compose.p003ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.node.SemanticsModifierNodeKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.PlatformTextInputModifierNode;
import androidx.compose.p003ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.p003ui.platform.PlatformTextInputSessionScope;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import androidx.compose.p003ui.platform.WindowInfo;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.ImeOptions;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDecoratorModifier.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000Ë\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001)\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nBO\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0002\u0010\u001bJ\b\u0010N\u001a\u000205H\u0002J\b\u0010O\u001a\u000205H\u0016J\b\u0010P\u001a\u000205H\u0016J\b\u0010Q\u001a\u000205H\u0016J\u0010\u0010R\u001a\u0002052\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u0002052\u0006\u0010V\u001a\u00020WH\u0016J\u001a\u0010X\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020ZH\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u000205H\u0016J*\u0010^\u001a\u0002052\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u0016ø\u0001\u0000¢\u0006\u0004\be\u0010fJ\u001a\u0010g\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020ZH\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010\\J\b\u0010i\u001a\u00020jH\u0002J\b\u0010k\u001a\u000205H\u0002J\b\u0010l\u001a\u000205H\u0002JP\u0010m\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014J\f\u0010n\u001a\u000205*\u00020oH\u0016R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0010\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u0014\u0010:\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001dR\u001a\u0010\u001a\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "filter", "Landroidx/compose/foundation/text2/input/InputTransformation;", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Z)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getFilter", "()Landroidx/compose/foundation/text2/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text2/input/InputTransformation;)V", "inputSessionJob", "Lkotlinx/coroutines/Job;", "isElementFocused", "isFocused", "keyboardActionScope", "androidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "<set-?>", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "onImeActionPerformed", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReadOnly", "setReadOnly", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "getSingleLine", "setSingleLine", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V", "getTextFieldState", "()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)V", "getTextLayoutState", "()Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)V", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "disposeInputSession", "onAttach", "onCancelPointerInput", "onDetach", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onKeyEvent", "event", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "requireKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "startInputSession", "startOrDisposeInputSessionOnWindowFocusChange", "updateNode", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private boolean enabled;

    @Nullable
    private InputTransformation filter;

    @Nullable
    private Job inputSessionJob;
    private boolean isElementFocused;

    @NotNull
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;

    @NotNull
    private KeyboardActions keyboardActions;

    @NotNull
    private KeyboardOptions keyboardOptions;

    @NotNull
    private final Function1<ImeAction, Unit> onImeActionPerformed;

    @NotNull
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TextFieldDecoratorModifierNode$pointerInputNode$1(this, null)));
    private boolean readOnly;
    private boolean singleLine;

    @NotNull
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;

    @NotNull
    private TextFieldSelectionState textFieldSelectionState;

    @NotNull
    private TransformedTextFieldState textFieldState;

    @NotNull
    private TextLayoutState textLayoutState;

    @Nullable
    private WindowInfo windowInfo;

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @NotNull
    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final void setTextFieldState(@NotNull TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    @NotNull
    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void setTextLayoutState(@NotNull TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    @NotNull
    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final void setTextFieldSelectionState(@NotNull TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    @Nullable
    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final void setFilter(@Nullable InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    @NotNull
    public final KeyboardActions getKeyboardActions() {
        return this.keyboardActions;
    }

    public final void setKeyboardActions(@NotNull KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public TextFieldDecoratorModifierNode(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @Nullable InputTransformation inputTransformation, boolean z, boolean z2, @NotNull KeyboardOptions keyboardOptions, @NotNull KeyboardActions keyboardActions, boolean z3) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardActions = keyboardActions;
        this.singleLine = z3;
        InputTransformation inputTransformation2 = this.filter;
        this.keyboardOptions = TextFieldDecoratorModifierKt.withDefaultsFrom(keyboardOptions, inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
                m8690invokeKlQnJC8(imeAction.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m8690invokeKlQnJC8(int i) {
                Function1<KeyboardActionScope, Unit> onSend;
                ImeAction.Companion companion = ImeAction.INSTANCE;
                Unit unit = null;
                if (ImeAction.m13329equalsimpl0(i, companion.m13342getDoneeUduSuo())) {
                    onSend = this.this$0.getKeyboardActions().getOnDone();
                } else if (ImeAction.m13329equalsimpl0(i, companion.m13343getGoeUduSuo())) {
                    onSend = this.this$0.getKeyboardActions().getOnGo();
                } else if (ImeAction.m13329equalsimpl0(i, companion.m13344getNexteUduSuo())) {
                    onSend = this.this$0.getKeyboardActions().getOnNext();
                } else if (ImeAction.m13329equalsimpl0(i, companion.m13346getPreviouseUduSuo())) {
                    onSend = this.this$0.getKeyboardActions().getOnPrevious();
                } else if (ImeAction.m13329equalsimpl0(i, companion.m13347getSearcheUduSuo())) {
                    onSend = this.this$0.getKeyboardActions().getOnSearch();
                } else if (ImeAction.m13329equalsimpl0(i, companion.m13348getSendeUduSuo())) {
                    onSend = this.this$0.getKeyboardActions().getOnSend();
                } else {
                    if (!(ImeAction.m13329equalsimpl0(i, companion.m13341getDefaulteUduSuo()) ? true : ImeAction.m13329equalsimpl0(i, companion.m13345getNoneeUduSuo()))) {
                        throw new IllegalStateException("invalid ImeAction".toString());
                    }
                    onSend = null;
                }
                if (onSend != null) {
                    onSend.invoke(this.this$0.keyboardActionScope);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    this.this$0.keyboardActionScope.mo8421defaultKeyboardActionKlQnJC8(i);
                }
            }
        };
    }

    @NotNull
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        WindowInfo windowInfo;
        return this.isElementFocused && (windowInfo = this.windowInfo) != null && windowInfo.isWindowFocused();
    }

    public final void updateNode(@NotNull TransformedTextFieldState textFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @Nullable InputTransformation filter, boolean enabled, boolean readOnly, @NotNull KeyboardOptions keyboardOptions, @NotNull KeyboardActions keyboardActions, boolean singleLine) {
        boolean z = this.enabled;
        boolean z2 = false;
        boolean z3 = z && !this.readOnly;
        if (enabled && !readOnly) {
            z2 = true;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        InputTransformation inputTransformation = this.filter;
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = TextFieldDecoratorModifierKt.withDefaultsFrom(keyboardOptions, filter != null ? filter.getKeyboardOptions() : null);
        this.keyboardActions = keyboardActions;
        this.singleLine = singleLine;
        if (z2 != z3 || !Intrinsics.areEqual(textFieldState, transformedTextFieldState) || !Intrinsics.areEqual(keyboardOptions, keyboardOptions2) || !Intrinsics.areEqual(filter, inputTransformation)) {
            if (z2 && isFocused()) {
                startInputSession();
            } else if (!z2) {
                disposeInputSession();
            }
        }
        if (z != enabled) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence untransformedText = this.textFieldState.getUntransformedText();
        long selectionInChars = untransformedText.getSelectionInChars();
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(untransformedText.toString(), null, null, 6, null));
        SemanticsPropertiesKt.m13010setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, selectionInChars);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull AnnotatedString annotatedString) {
                if (TextFieldDecoratorModifierNode.this.getReadOnly() || !TextFieldDecoratorModifierNode.this.getEnabled()) {
                    return Boolean.FALSE;
                }
                TextFieldDecoratorModifierNode.this.getTextFieldState().replaceAll(annotatedString);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.3
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            @NotNull
            public final Boolean invoke(int i, int i2, boolean z) {
                TextFieldCharSequence text;
                if (z) {
                    text = TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText();
                } else {
                    text = TextFieldDecoratorModifierNode.this.getTextFieldState().getText();
                }
                long selectionInChars2 = text.getSelectionInChars();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i, i2) < 0 || Math.max(i, i2) > text.length()) {
                    return Boolean.FALSE;
                }
                if (i == TextRange.m13165getStartimpl(selectionInChars2) && i2 == TextRange.m13160getEndimpl(selectionInChars2)) {
                    return Boolean.TRUE;
                }
                long jTextRange = TextRangeKt.TextRange(i, i2);
                if (z || i == i2) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m8718selectUntransformedCharsIn5zctL8(jTextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m8717selectCharsIn5zctL8(jTextRange);
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull AnnotatedString annotatedString) {
                if (TextFieldDecoratorModifierNode.this.getReadOnly() || !TextFieldDecoratorModifierNode.this.getEnabled()) {
                    return Boolean.FALSE;
                }
                TransformedTextFieldState.replaceSelectedText$default(TextFieldDecoratorModifierNode.this.getTextFieldState(), annotatedString, true, null, 4, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.m13006onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.keyboardOptions.getImeAction(), null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.onImeActionPerformed.invoke(ImeAction.m13326boximpl(TextFieldDecoratorModifierNode.this.getKeyboardOptions().getImeAction()));
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    TextFieldDecoratorModifierNode.this.requireKeyboardController().show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m13159getCollapsedimpl(selectionInChars)) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.8
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    TextFieldSelectionState.copy$default(TextFieldDecoratorModifierNode.this.getTextFieldSelectionState(), false, 1, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.9
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().cut();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.applySemantics.10
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().paste();
                return Boolean.TRUE;
            }
        }, 1, null);
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        this.textFieldSelectionState.setFocused(isFocused());
        if (focusState.isFocused()) {
            if (!this.enabled || this.readOnly) {
                return;
            }
            startInputSession();
            return;
        }
        disposeInputSession();
        this.textFieldState.collapseSelectionToMax();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
    }

    @Override // androidx.compose.p003ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(coordinates);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo7740onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo7740onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo7741onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        return this.textFieldKeyEventHandler.mo8662onPreKeyEventMyFupTE(event, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo7739onKeyEventZmokQxo(@NotNull KeyEvent event) {
        return this.textFieldKeyEventHandler.m8691onKeyEvent6ptp14s(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.enabled && !this.readOnly, this.singleLine, new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.onImeActionPerformed.invoke(ImeAction.m13326boximpl(this.this$0.getKeyboardOptions().getImeAction()));
            }
        });
    }

    @Override // androidx.compose.p003ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode.onObservedReadsChanged.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.startOrDisposeInputSessionOnWindowFocusChange();
            }
        });
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", m7120f = "TextFieldDecoratorModifier.kt", m7121i = {}, m7122l = {479}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1 */
    /* loaded from: classes2.dex */
    public static final class C09691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C09691(Continuation<? super C09691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TextFieldDecoratorModifierNode.this.new C09691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C09691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, null);
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* compiled from: TextFieldDecoratorModifier.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", m7120f = "TextFieldDecoratorModifier.kt", m7121i = {}, m7122l = {485}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = textFieldDecoratorModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull PlatformTextInputSessionScope platformTextInputSessionScope, @Nullable Continuation<?> continuation) {
                return ((AnonymousClass1) create(platformTextInputSessionScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                    BuildersKt__Builders_commonKt.launch$default(platformTextInputSessionScope, null, CoroutineStart.UNDISPATCHED, new C118491(this.this$0, null), 1, null);
                    TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                    ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                    Function1 function1 = this.this$0.onImeActionPerformed;
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, imeOptions$foundation_release, function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1", m7120f = "TextFieldDecoratorModifier.kt", m7121i = {}, m7122l = {482}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: androidx.compose.foundation.text2.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C118491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int label;
                public final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C118491(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation<? super C118491> continuation) {
                    super(2, continuation);
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C118491(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C118491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                        this.label = 1;
                        if (textFieldSelectionState.observeChanges(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    private final void startInputSession() {
        this.inputSessionJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C09691(null), 3, null);
    }

    private final void disposeInputSession() {
        Job job = this.inputSessionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.inputSessionJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOrDisposeInputSessionOnWindowFocusChange() {
        WindowInfo windowInfo = this.windowInfo;
        if (windowInfo == null) {
            return;
        }
        if (windowInfo != null && windowInfo.isWindowFocused() && this.isElementFocused) {
            startInputSession();
        } else {
            disposeInputSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller".toString());
    }
}
