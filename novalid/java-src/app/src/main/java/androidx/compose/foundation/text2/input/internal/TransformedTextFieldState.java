package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.CodepointTransformationKt;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransformedTextFieldState.kt */
@Metadata(m7104d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 H2\u00020\u0001:\u0002HIB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0013J,\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b!H\u0086\bJ\u0013\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000e\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020%J\u0018\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b-\u0010*J\u001b\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020%ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u000e\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020%J\u0006\u00102\u001a\u00020\u0013J\u000e\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u000205J\"\u00106\u001a\u00020\u00132\u0006\u00104\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u001d2\b\b\u0002\u00108\u001a\u000209J*\u0010:\u001a\u00020\u00132\u0006\u00104\u001a\u0002052\u0006\u0010(\u001a\u00020'2\b\b\u0002\u00108\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0006\u0010=\u001a\u00020\u0013J\u0018\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\bD\u0010AJ\b\u0010E\u001a\u00020FH\u0016J\u0006\u0010G\u001a\u00020\u0013R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "", "textFieldState", "Landroidx/compose/foundation/text2/input/TextFieldState;", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/CodepointTransformation;)V", "text", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "transformedText", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "untransformedText", "getUntransformedText", "collapseSelectionToEnd", "", "collapseSelectionToMax", "collectImeNotifications", "", "notifyImeListener", "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;", "(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSelectedText", "editUntransformedTextAsUser", "notifyImeOfChanges", "", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "Lkotlin/ExtensionFunctionType;", "equals", "other", "hashCode", "", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", P2MetadataParser.RequiredHandler.RANGE, "mapFromTransformed-GEjPoXI", "(J)J", TypedValues.CycleType.S_WAVE_OFFSET, "mapToTransformed", "mapToTransformed-GEjPoXI", "mapToTransformed--jx7JFs", "(I)J", "placeCursorBeforeCharAt", "transformedOffset", "redo", "replaceAll", "newText", "", "replaceSelectedText", "clearComposition", "undoBehavior", "Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;", "replaceText", "replaceText-Sb-Bc2M", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V", "selectAll", "selectCharsIn", "transformedRange", "selectCharsIn-5zc-tL8", "(J)V", "selectUntransformedCharsIn", "untransformedRange", "selectUntransformedCharsIn-5zc-tL8", "toString", "", "undo", "Companion", "TransformedText", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,393:1\n186#2,20:394\n186#2,20:414\n186#2,20:434\n186#2,20:454\n186#2,20:474\n186#2,20:494\n186#2,20:514\n186#2,20:534\n186#2,20:554\n314#3,11:574\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n*L\n93#1:394,20\n99#1:414,20\n106#1:434,20\n112#1:454,20\n131#1:474,20\n148#1:494,20\n166#1:514,20\n173#1:534,20\n201#1:554,20\n277#1:574,11\n*E\n"})
/* loaded from: classes3.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private final CodepointTransformation codepointTransformation;

    @Nullable
    private final InputTransformation inputTransformation;

    @NotNull
    private final TextFieldState textFieldState;

    @Nullable
    private final State<TransformedText> transformedText;

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.TransformedTextFieldState", m7120f = "TransformedTextFieldState.kt", m7121i = {0, 0}, m7122l = {394}, m7123m = "collectImeNotifications", m7124n = {"this", "notifyImeListener"}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1 */
    /* loaded from: classes4.dex */
    public static final class C09731 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C09731(Continuation<? super C09731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformedTextFieldState.this.collectImeNotifications(null, this);
        }
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation);
    }

    @JvmStatic
    /* renamed from: mapFromTransformed-xdX6-G0 */
    private static final long m8710mapFromTransformedxdX6G0(long j, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m8721mapFromTransformedxdX6G0(j, offsetMappingCalculator);
    }

    @JvmStatic
    /* renamed from: mapToTransformed-xdX6-G0 */
    private static final long m8711mapToTransformedxdX6G0(long j, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m8722mapToTransformedxdX6G0(j, offsetMappingCalculator);
    }

    public TransformedTextFieldState(@NotNull TextFieldState textFieldState, @Nullable InputTransformation inputTransformation, @Nullable final CodepointTransformation codepointTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.transformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new Function0<TransformedText>() { // from class: androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$transformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final TransformedTextFieldState.TransformedText invoke() {
                return TransformedTextFieldState.Companion.calculateTransformedText(this.this$0.textFieldState.getText(), codepointTransformation);
            }
        }) : null;
    }

    @NotNull
    public final TextFieldCharSequence getText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? this.textFieldState.getText() : text;
    }

    @NotNull
    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getText();
    }

    public final void placeCursorBeforeCharAt(int transformedOffset) {
        m8717selectCharsIn5zctL8(TextRangeKt.TextRange(transformedOffset));
    }

    /* renamed from: selectCharsIn-5zc-tL8 */
    public final void m8717selectCharsIn5zctL8(long transformedRange) {
        m8718selectUntransformedCharsIn5zctL8(m8713mapFromTransformedGEjPoXI(transformedRange));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8 */
    public final void m8718selectUntransformedCharsIn5zctL8(long untransformedRange) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer().setSelection(TextRange.m13165getStartimpl(untransformedRange), TextRange.m13160getEndimpl(untransformedRange));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceAll(@NotNull CharSequence newText) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        EditCommandKt.deleteAll(mainBuffer);
        EditCommandKt.commitText(mainBuffer, newText.toString(), 1);
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(0, mainBuffer.getLength());
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.delete(TextRange.m13163getMinimpl(mainBuffer.m8666getSelectiond9O1mEE()), TextRange.m13162getMaximpl(mainBuffer.m8666getSelectiond9O1mEE()));
        mainBuffer.setSelection(TextRange.m13163getMinimpl(mainBuffer.m8666getSelectiond9O1mEE()), TextRange.m13163getMinimpl(mainBuffer.m8666getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-Sb-Bc2M$default */
    public static /* synthetic */ void m8712replaceTextSbBc2M$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i, Object obj) {
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.m8716replaceTextSbBc2M(charSequence, j, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-Sb-Bc2M */
    public final void m8716replaceTextSbBc2M(@NotNull CharSequence newText, long j, @NotNull TextFieldEditUndoBehavior undoBehavior) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        long jM8713mapFromTransformedGEjPoXI = m8713mapFromTransformedGEjPoXI(j);
        mainBuffer.replace(TextRange.m13163getMinimpl(jM8713mapFromTransformedGEjPoXI), TextRange.m13162getMaximpl(jM8713mapFromTransformedGEjPoXI), newText);
        int iM13163getMinimpl = TextRange.m13163getMinimpl(jM8713mapFromTransformedGEjPoXI) + newText.length();
        mainBuffer.setSelection(iM13163getMinimpl, iM13163getMinimpl);
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, undoBehavior);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(@NotNull CharSequence newText, boolean clearComposition, @NotNull TextFieldEditUndoBehavior undoBehavior) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        if (clearComposition) {
            mainBuffer.commitComposition();
        }
        long jM8666getSelectiond9O1mEE = mainBuffer.m8666getSelectiond9O1mEE();
        mainBuffer.replace(TextRange.m13163getMinimpl(jM8666getSelectiond9O1mEE), TextRange.m13162getMaximpl(jM8666getSelectiond9O1mEE), newText);
        int iM13163getMinimpl = TextRange.m13163getMinimpl(jM8666getSelectiond9O1mEE) + newText.length();
        mainBuffer.setSelection(iM13163getMinimpl, iM13163getMinimpl);
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, undoBehavior);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(TextRange.m13162getMaximpl(mainBuffer.m8666getSelectiond9O1mEE()), TextRange.m13162getMaximpl(mainBuffer.m8666getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(TextRange.m13160getEndimpl(mainBuffer.m8666getSelectiond9O1mEE()), TextRange.m13160getEndimpl(mainBuffer.m8666getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        function1.invoke(textFieldState.getMainBuffer());
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, z, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean notifyImeOfChanges, @NotNull Function1<? super EditingBuffer, Unit> block) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        block.invoke(textFieldState.getMainBuffer());
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, notifyImeOfChanges, textFieldEditUndoBehavior);
    }

    /* renamed from: mapToTransformed--jx7JFs */
    public final long m8714mapToTransformedjx7JFs(int i) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        if (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) {
            return TextRangeKt.TextRange(i);
        }
        return offsetMapping.m8671mapFromSourcejx7JFs(i);
    }

    /* renamed from: mapToTransformed-GEjPoXI */
    public final long m8715mapToTransformedGEjPoXI(long j) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) ? j : Companion.m8722mapToTransformedxdX6G0(j, offsetMapping);
    }

    public final int mapFromTransformed(int i) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) ? i : TextRange.m13163getMinimpl(offsetMapping.m8670mapFromDestjx7JFs(i));
    }

    /* renamed from: mapFromTransformed-GEjPoXI */
    public final long m8713mapFromTransformedGEjPoXI(long j) {
        TransformedText value;
        OffsetMappingCalculator offsetMapping;
        State<TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) ? j : Companion.m8721mapFromTransformedxdX6G0(j, offsetMapping);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collectImeNotifications(@NotNull final TextFieldState.NotifyImeListener notifyImeListener, @NotNull Continuation<?> continuation) throws Throwable {
        C09731 c09731;
        if (continuation instanceof C09731) {
            c09731 = (C09731) continuation;
            int i = c09731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c09731.label = i - Integer.MIN_VALUE;
            } else {
                c09731 = new C09731(continuation);
            }
        }
        Object obj = c09731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c09731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c09731.L$0 = this;
            c09731.L$1 = notifyImeListener;
            c09731.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c09731), 1);
            cancellableContinuationImpl.initCancellability();
            this.textFieldState.addNotifyImeListener$foundation_release(notifyImeListener);
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    this.this$0.textFieldState.removeNotifyImeListener$foundation_release(notifyImeListener);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c09731);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) other;
        if (Intrinsics.areEqual(this.textFieldState, transformedTextFieldState.textFieldState)) {
            return Intrinsics.areEqual(this.codepointTransformation, transformedTextFieldState.codepointTransformation);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        return iHashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", codepointTransformation=" + this.codepointTransformation + ", transformedText=" + this.transformedText + ", text=\"" + ((Object) getText()) + "\")";
    }

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "", "text", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "offsetMapping", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)V", "getOffsetMapping", "()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final /* data */ class TransformedText {

        @NotNull
        public final OffsetMappingCalculator offsetMapping;

        @NotNull
        public final TextFieldCharSequence text;

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        @NotNull
        public final TransformedText copy(@NotNull TextFieldCharSequence text, @NotNull OffsetMappingCalculator offsetMapping) {
            return new TransformedText(text, offsetMapping);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) other;
            return Intrinsics.areEqual(this.text, transformedText.text) && Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }

        public TransformedText(@NotNull TextFieldCharSequence textFieldCharSequence, @NotNull OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        @NotNull
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        @NotNull
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }
    }

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;", "", "()V", "calculateTransformedText", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "untransformedText", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", P2MetadataParser.RequiredHandler.RANGE, "mapping", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "mapFromTransformed-xdX6-G0", "(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J", "mapToTransformed", "mapToTransformed-xdX6-G0", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final TransformedText calculateTransformedText(TextFieldCharSequence untransformedText, CodepointTransformation codepointTransformation) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(untransformedText, codepointTransformation, offsetMappingCalculator);
            TextRange textRangeM13153boximpl = null;
            if (visualText == untransformedText) {
                return null;
            }
            long jM8722mapToTransformedxdX6G0 = m8722mapToTransformedxdX6G0(untransformedText.getSelectionInChars(), offsetMappingCalculator);
            TextRange compositionInChars = untransformedText.getCompositionInChars();
            if (compositionInChars != null) {
                textRangeM13153boximpl = TextRange.m13153boximpl(TransformedTextFieldState.Companion.m8722mapToTransformedxdX6G0(compositionInChars.getPackedValue(), offsetMappingCalculator));
            }
            return new TransformedText(TextFieldCharSequenceKt.m8647TextFieldCharSequence3r_uNRQ(visualText, jM8722mapToTransformedxdX6G0, textRangeM13153boximpl), offsetMappingCalculator);
        }

        @JvmStatic
        /* renamed from: mapToTransformed-xdX6-G0 */
        public final long m8722mapToTransformedxdX6G0(long j, OffsetMappingCalculator mapping) {
            long jM8671mapFromSourcejx7JFs = mapping.m8671mapFromSourcejx7JFs(TextRange.m13165getStartimpl(j));
            long jM8671mapFromSourcejx7JFs2 = TextRange.m13159getCollapsedimpl(j) ? jM8671mapFromSourcejx7JFs : mapping.m8671mapFromSourcejx7JFs(TextRange.m13160getEndimpl(j));
            int iMin = Math.min(TextRange.m13163getMinimpl(jM8671mapFromSourcejx7JFs), TextRange.m13163getMinimpl(jM8671mapFromSourcejx7JFs2));
            int iMax = Math.max(TextRange.m13162getMaximpl(jM8671mapFromSourcejx7JFs), TextRange.m13162getMaximpl(jM8671mapFromSourcejx7JFs2));
            if (TextRange.m13164getReversedimpl(j)) {
                return TextRangeKt.TextRange(iMax, iMin);
            }
            return TextRangeKt.TextRange(iMin, iMax);
        }

        @JvmStatic
        /* renamed from: mapFromTransformed-xdX6-G0 */
        public final long m8721mapFromTransformedxdX6G0(long j, OffsetMappingCalculator mapping) {
            long jM8670mapFromDestjx7JFs = mapping.m8670mapFromDestjx7JFs(TextRange.m13165getStartimpl(j));
            long jM8670mapFromDestjx7JFs2 = TextRange.m13159getCollapsedimpl(j) ? jM8670mapFromDestjx7JFs : mapping.m8670mapFromDestjx7JFs(TextRange.m13160getEndimpl(j));
            int iMin = Math.min(TextRange.m13163getMinimpl(jM8670mapFromDestjx7JFs), TextRange.m13163getMinimpl(jM8670mapFromDestjx7JFs2));
            int iMax = Math.max(TextRange.m13162getMaximpl(jM8670mapFromDestjx7JFs), TextRange.m13162getMaximpl(jM8670mapFromDestjx7JFs2));
            if (TextRange.m13164getReversedimpl(j)) {
                return TextRangeKt.TextRange(iMax, iMin);
            }
            return TextRangeKt.TextRange(iMin, iMax);
        }
    }
}
