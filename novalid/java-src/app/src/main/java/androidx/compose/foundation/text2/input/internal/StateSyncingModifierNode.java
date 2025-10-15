package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusEventModifierNode;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.node.ObserverModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import androidx.compose.p003ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StateSyncingModifier.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\"\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\bH\u0002R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "onValueChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "writeSelectionFromTextFieldValue", "", "(Landroidx/compose/foundation/text2/input/TextFieldState;Lkotlin/jvm/functions/Function1;Z)V", "isFocused", "lastValueWhileFocused", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "observeTextState", "fireOnValueChanged", "onAttach", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onObservedReadsChanged", "update", "value", "updateState", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStateSyncingModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateSyncingModifier.kt\nandroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,171:1\n1#2:172\n123#3,4:173\n*S KotlinDebug\n*F\n+ 1 StateSyncingModifier.kt\nandroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode\n*L\n142#1:173,4\n*E\n"})
/* loaded from: classes3.dex */
public final class StateSyncingModifierNode extends Modifier.Node implements ObserverModifierNode, FocusEventModifierNode {
    public boolean isFocused;

    @Nullable
    public TextFieldValue lastValueWhileFocused;

    @NotNull
    public Function1<? super TextFieldValue, Unit> onValueChanged;

    @NotNull
    public final TextFieldState state;
    public final boolean writeSelectionFromTextFieldValue;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public StateSyncingModifierNode(@NotNull TextFieldState textFieldState, @NotNull Function1<? super TextFieldValue, Unit> function1, boolean z) {
        this.state = textFieldState;
        this.onValueChanged = function1;
        this.writeSelectionFromTextFieldValue = z;
    }

    public final void update(@NotNull TextFieldValue value, @NotNull Function1<? super TextFieldValue, Unit> onValueChanged) {
        this.onValueChanged = onValueChanged;
        if (!this.isFocused) {
            updateState(value);
        } else {
            this.lastValueWhileFocused = value;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        observeTextState(false);
    }

    @Override // androidx.compose.p003ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState) {
        if (this.isFocused && !focusState.isFocused()) {
            TextFieldValue textFieldValue = this.lastValueWhileFocused;
            if (textFieldValue != null) {
                updateState(textFieldValue);
            }
            this.lastValueWhileFocused = null;
        }
        this.isFocused = focusState.isFocused();
    }

    @Override // androidx.compose.p003ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        observeTextState$default(this, false, 1, null);
    }

    public final void updateState(TextFieldValue value) {
        TextFieldState textFieldState = this.state;
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit(textFieldState.getText());
        textFieldBufferStartEdit.setTextIfChanged$foundation_release(value.getText());
        if (this.writeSelectionFromTextFieldValue) {
            textFieldBufferStartEdit.m8642selectCharsIn5zctL8(value.getSelection());
        }
        textFieldState.commitEdit(textFieldBufferStartEdit);
    }

    public static /* synthetic */ void observeTextState$default(StateSyncingModifierNode stateSyncingModifierNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        stateSyncingModifierNode.observeTextState(z);
    }

    /* compiled from: StateSyncingModifier.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.StateSyncingModifierNode$observeTextState$1 */
    /* loaded from: classes4.dex */
    public static final class C09451 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Ref.ObjectRef<TextFieldCharSequence> $text;
        public final /* synthetic */ StateSyncingModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09451(Ref.ObjectRef<TextFieldCharSequence> objectRef, StateSyncingModifierNode stateSyncingModifierNode) {
            super(0);
            objectRef = objectRef;
            stateSyncingModifierNode = stateSyncingModifierNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.text2.input.TextFieldCharSequence] */
        /* renamed from: invoke */
        public final void invoke2() {
            objectRef.element = stateSyncingModifierNode.state.getText();
        }
    }

    public final void observeTextState(boolean fireOnValueChanged) {
        TextFieldCharSequence textFieldCharSequence;
        TextFieldCharSequence textFieldCharSequence2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text2.input.internal.StateSyncingModifierNode.observeTextState.1
            public final /* synthetic */ Ref.ObjectRef<TextFieldCharSequence> $text;
            public final /* synthetic */ StateSyncingModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09451(Ref.ObjectRef<TextFieldCharSequence> objectRef2, StateSyncingModifierNode this) {
                super(0);
                objectRef = objectRef2;
                stateSyncingModifierNode = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.text2.input.TextFieldCharSequence] */
            /* renamed from: invoke */
            public final void invoke2() {
                objectRef.element = stateSyncingModifierNode.state.getText();
            }
        });
        if (fireOnValueChanged) {
            T t = objectRef2.element;
            TextFieldCharSequence textFieldCharSequence3 = null;
            if (t == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("text");
                textFieldCharSequence = null;
            } else {
                textFieldCharSequence = (TextFieldCharSequence) t;
            }
            String string = textFieldCharSequence.toString();
            T t2 = objectRef2.element;
            if (t2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("text");
                textFieldCharSequence2 = null;
            } else {
                textFieldCharSequence2 = (TextFieldCharSequence) t2;
            }
            long selectionInChars = textFieldCharSequence2.getSelectionInChars();
            T t3 = objectRef2.element;
            if (t3 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("text");
            } else {
                textFieldCharSequence3 = (TextFieldCharSequence) t3;
            }
            this.onValueChanged.invoke(new TextFieldValue(string, selectionInChars, textFieldCharSequence3.getCompositionInChars(), (DefaultConstructorMarker) null));
        }
    }
}
