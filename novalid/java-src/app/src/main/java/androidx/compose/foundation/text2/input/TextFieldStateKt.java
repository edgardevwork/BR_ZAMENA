package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldState.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a&\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0007\u001a6\u0010\r\u001a\u00020\u000e*\u00020\u00012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0087@¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m7105d2 = {"TextFieldState", "Landroidx/compose/foundation/text2/input/TextFieldState;", "initialValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "rememberTextFieldState", "initialText", "", "initialSelectionInChars", "Landroidx/compose/ui/text/TextRange;", "rememberTextFieldState-Le-punE", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text2/input/TextFieldState;", "clearText", "", "forEachTextValue", "", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/compose/foundation/text2/input/TextFieldState;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTextAndPlaceCursorAtEnd", "text", "setTextAndSelectAll", "textAsFlow", "Lkotlinx/coroutines/flow/Flow;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,569:1\n1116#2,6:570\n123#3,4:576\n123#3,4:580\n123#3,4:584\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n*L\n472#1:570,6\n495#1:576,4\n520#1:580,4\n543#1:584,4\n*E\n"})
/* loaded from: classes3.dex */
public final class TextFieldStateKt {

    /* compiled from: TextFieldState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.TextFieldStateKt", m7120f = "TextFieldState.kt", m7121i = {}, m7122l = {566}, m7123m = "forEachTextValue", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1 */
    /* loaded from: classes4.dex */
    public static final class C09361 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C09361(Continuation<? super C09361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextFieldStateKt.forEachTextValue(null, null, this);
        }
    }

    @NotNull
    public static final TextFieldState TextFieldState(@NotNull TextFieldValue textFieldValue) {
        return new TextFieldState(textFieldValue.getText(), textFieldValue.getSelection(), (DefaultConstructorMarker) null);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Flow<TextFieldCharSequence> textAsFlow(@NotNull final TextFieldState textFieldState) {
        return SnapshotStateKt.snapshotFlow(new Function0<TextFieldCharSequence>() { // from class: androidx.compose.foundation.text2.input.TextFieldStateKt.textAsFlow.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextFieldCharSequence invoke() {
                return textFieldState.getText();
            }
        });
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m8651rememberTextFieldStateLepunE(@Nullable final String str, final long j, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-855595317);
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            j = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-855595317, i, -1, "androidx.compose.foundation.text2.input.rememberTextFieldState (TextFieldState.kt:471)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        composer.startReplaceableGroup(968820051);
        boolean zChanged = composer.changed(str) | composer.changed(j);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<TextFieldState>() { // from class: androidx.compose.foundation.text2.input.TextFieldStateKt$rememberTextFieldState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final TextFieldState invoke() {
                    return new TextFieldState(str, j, (DefaultConstructorMarker) null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 56, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @ExperimentalFoundationApi
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object forEachTextValue(@NotNull TextFieldState textFieldState, @NotNull Function2<? super TextFieldCharSequence, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<?> continuation) throws Throwable {
        C09361 c09361;
        if (continuation instanceof C09361) {
            c09361 = (C09361) continuation;
            int i = c09361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c09361.label = i - Integer.MIN_VALUE;
            } else {
                c09361 = new C09361(continuation);
            }
        }
        Object obj = c09361.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c09361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<TextFieldCharSequence> flowTextAsFlow = textAsFlow(textFieldState);
            c09361.label = 1;
            if (FlowKt.collectLatest(flowTextAsFlow, function2, c09361) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new IllegalStateException("textAsFlow expected not to complete without exception".toString());
    }

    @ExperimentalFoundationApi
    public static final void setTextAndPlaceCursorAtEnd(@NotNull TextFieldState textFieldState, @NotNull String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit(textFieldState.getText());
        textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
        TextFieldBufferKt.placeCursorAtEnd(textFieldBufferStartEdit);
        textFieldState.commitEdit(textFieldBufferStartEdit);
    }

    @ExperimentalFoundationApi
    public static final void setTextAndSelectAll(@NotNull TextFieldState textFieldState, @NotNull String str) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit(textFieldState.getText());
        textFieldBufferStartEdit.replace(0, textFieldBufferStartEdit.getLength(), str);
        TextFieldBufferKt.selectAll(textFieldBufferStartEdit);
        textFieldState.commitEdit(textFieldBufferStartEdit);
    }

    @ExperimentalFoundationApi
    public static final void clearText(@NotNull TextFieldState textFieldState) {
        TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit(textFieldState.getText());
        TextFieldBufferKt.delete(textFieldBufferStartEdit, 0, textFieldBufferStartEdit.getLength());
        TextFieldBufferKt.placeCursorAtEnd(textFieldBufferStartEdit);
        textFieldState.commitEdit(textFieldBufferStartEdit);
    }
}
