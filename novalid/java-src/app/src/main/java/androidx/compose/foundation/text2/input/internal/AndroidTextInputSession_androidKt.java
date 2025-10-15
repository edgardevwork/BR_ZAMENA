package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p003ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.p003ui.platform.PlatformTextInputSession;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.ImeOptions;
import androidx.compose.p003ui.text.input.KeyboardCapitalization;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTextInputSession.android.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002\u001a \u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a8\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0080@¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u000b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005¨\u0006\u001e"}, m7105d2 = {"TAG", "", "TIA_DEBUG", "", "getTIA_DEBUG$annotations", "()V", "hasFlag", "bits", "", "flag", "logDebug", "", "tag", "content", "Lkotlin/Function0;", "platformSpecificTextInputSession", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "state", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onImeAction", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Landroid/view/inputmethod/EditorInfo;", "textFieldValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class AndroidTextInputSession_androidKt {

    @NotNull
    private static final String TAG = "AndroidTextInputSession";
    public static final boolean TIA_DEBUG = false;

    /* compiled from: AndroidTextInputSession.android.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt", m7120f = "AndroidTextInputSession.android.kt", m7121i = {}, m7122l = {50}, m7123m = "platformSpecificTextInputSession", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 */
    /* loaded from: classes4.dex */
    public static final class C09401 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C09401(Continuation<? super C09401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, this);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    private static final void logDebug(String str, Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object platformSpecificTextInputSession(@NotNull PlatformTextInputSession platformTextInputSession, @NotNull TransformedTextFieldState transformedTextFieldState, @NotNull ImeOptions imeOptions, @Nullable Function1<? super ImeAction, Unit> function1, @NotNull Continuation<?> continuation) throws Throwable {
        C09401 c09401;
        if (continuation instanceof C09401) {
            c09401 = (C09401) continuation;
            int i = c09401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c09401.label = i - Integer.MIN_VALUE;
            } else {
                c09401 = new C09401(continuation);
            }
        }
        Object obj = c09401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c09401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C09412 c09412 = new C09412(platformTextInputSession, transformedTextFieldState, ComposeInputMethodManager_androidKt.ComposeInputMethodManager(platformTextInputSession.getView()), imeOptions, function1, null);
            c09401.label = 1;
            if (CoroutineScopeKt.coroutineScope(c09412, c09401) == coroutine_suspended) {
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

    /* compiled from: AndroidTextInputSession.android.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2", m7120f = "AndroidTextInputSession.android.kt", m7121i = {}, m7122l = {73}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 */
    /* loaded from: classes2.dex */
    public static final class C09412 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        public final /* synthetic */ ComposeInputMethodManager $composeImm;
        public final /* synthetic */ ImeOptions $imeOptions;
        public final /* synthetic */ Function1<ImeAction, Unit> $onImeAction;
        public final /* synthetic */ TransformedTextFieldState $state;
        public final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C09412(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, ImeOptions imeOptions, Function1<? super ImeAction, Unit> function1, Continuation<? super C09412> continuation) {
            super(2, continuation);
            this.$this_platformSpecificTextInputSession = platformTextInputSession;
            this.$state = transformedTextFieldState;
            this.$composeImm = composeInputMethodManager;
            this.$imeOptions = imeOptions;
            this.$onImeAction = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09412 c09412 = new C09412(this.$this_platformSpecificTextInputSession, this.$state, this.$composeImm, this.$imeOptions, this.$onImeAction, continuation);
            c09412.L$0 = obj;
            return c09412;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<?> continuation) {
            return ((C09412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AndroidTextInputSession.android.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1", m7120f = "AndroidTextInputSession.android.kt", m7121i = {}, m7122l = {52}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ ComposeInputMethodManager $composeImm;
            public final /* synthetic */ ImeOptions $imeOptions;
            public final /* synthetic */ TransformedTextFieldState $state;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, ImeOptions imeOptions, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$state = transformedTextFieldState;
                this.$composeImm = composeInputMethodManager;
                this.$imeOptions = imeOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$state, this.$composeImm, this.$imeOptions, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransformedTextFieldState transformedTextFieldState = this.$state;
                    final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                    final ImeOptions imeOptions = this.$imeOptions;
                    TextFieldState.NotifyImeListener notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1$$ExternalSyntheticLambda0
                        @Override // androidx.compose.foundation.text2.input.TextFieldState.NotifyImeListener
                        public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2) {
                            AndroidTextInputSession_androidKt.C09412.AnonymousClass1.invokeSuspend$lambda$0(composeInputMethodManager, imeOptions, textFieldCharSequence, textFieldCharSequence2);
                        }
                    };
                    this.label = 1;
                    if (transformedTextFieldState.collectImeNotifications(notifyImeListener, this) == coroutine_suspended) {
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

            public static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, ImeOptions imeOptions, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2) {
                if (!TextRange.m13158equalsimpl0(textFieldCharSequence.getSelectionInChars(), textFieldCharSequence2.getSelectionInChars()) || !Intrinsics.areEqual(textFieldCharSequence.getCompositionInChars(), textFieldCharSequence2.getCompositionInChars())) {
                    int iM13163getMinimpl = TextRange.m13163getMinimpl(textFieldCharSequence2.getSelectionInChars());
                    int iM13162getMaximpl = TextRange.m13162getMaximpl(textFieldCharSequence2.getSelectionInChars());
                    TextRange compositionInChars = textFieldCharSequence2.getCompositionInChars();
                    int iM13163getMinimpl2 = compositionInChars != null ? TextRange.m13163getMinimpl(compositionInChars.getPackedValue()) : -1;
                    TextRange compositionInChars2 = textFieldCharSequence2.getCompositionInChars();
                    composeInputMethodManager.updateSelection(iM13163getMinimpl, iM13162getMaximpl, iM13163getMinimpl2, compositionInChars2 != null ? TextRange.m13162getMaximpl(compositionInChars2.getPackedValue()) : -1);
                }
                if (textFieldCharSequence.contentEquals(textFieldCharSequence2) || KeyboardType.m13376equalsimpl0(imeOptions.getKeyboardType(), KeyboardType.INSTANCE.m13394getPasswordPjHm6EE())) {
                    return;
                }
                composeInputMethodManager.restartInput();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.$state, this.$composeImm, this.$imeOptions, null), 1, null);
                PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
                final TransformedTextFieldState transformedTextFieldState = this.$state;
                final ImeOptions imeOptions = this.$imeOptions;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                final Function1<ImeAction, Unit> function1 = this.$onImeAction;
                PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$$ExternalSyntheticLambda0
                    @Override // androidx.compose.p003ui.platform.PlatformTextInputMethodRequest
                    public final InputConnection createInputConnection(EditorInfo editorInfo) {
                        return AndroidTextInputSession_androidKt.C09412.invokeSuspend$lambda$0(transformedTextFieldState, imeOptions, composeInputMethodManager, function1, editorInfo);
                    }
                };
                this.label = 1;
                if (platformTextInputSession.startInputMethod(platformTextInputMethodRequest, this) == coroutine_suspended) {
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

        public static final InputConnection invokeSuspend$lambda$0(final TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, final ComposeInputMethodManager composeInputMethodManager, final Function1 function1, EditorInfo editorInfo) {
            AndroidTextInputSession_androidKt.logDebug$default(null, new Function0<String>() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "createInputConnection(value=\"" + ((Object) transformedTextFieldState.getText()) + "\")";
                }
            }, 1, null);
            TextInputSession textInputSession = new TextInputSession() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1
                @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
                @NotNull
                public TextFieldCharSequence getText() {
                    return transformedTextFieldState.getText();
                }

                @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
                public void requestEdit(@NotNull Function1<? super EditingBuffer, Unit> block) {
                    TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                    TextFieldState textFieldState = transformedTextFieldState2.textFieldState;
                    InputTransformation inputTransformation = transformedTextFieldState2.inputTransformation;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                    TextFieldCharSequence text = textFieldState.getText();
                    textFieldState.getMainBuffer().getChangeTracker().clearChanges();
                    block.invoke(textFieldState.getMainBuffer());
                    if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && TextRange.m13158equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m8666getSelectiond9O1mEE()) && Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m8665getCompositionMzsxiRA())) {
                        return;
                    }
                    textFieldState.commitEditAsUser(text, inputTransformation, false, textFieldEditUndoBehavior);
                }

                @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
                public void sendKeyEvent(@NotNull KeyEvent keyEvent) {
                    composeInputMethodManager.sendKeyEvent(keyEvent);
                }

                @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
                /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
                public void mo8664onImeActionKlQnJC8(int imeAction) {
                    Function1<ImeAction, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(ImeAction.m13326boximpl(imeAction));
                    }
                }
            };
            AndroidTextInputSession_androidKt.update(editorInfo, transformedTextFieldState.getText(), imeOptions);
            return new StatelessInputConnection(textInputSession);
        }
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull TextFieldCharSequence textFieldCharSequence, @NotNull ImeOptions imeOptions) {
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 3;
        int i2 = 6;
        if (ImeAction.m13329equalsimpl0(imeAction, companion.m13341getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.m13329equalsimpl0(imeAction, companion.m13345getNoneeUduSuo())) {
            i2 = 1;
        } else if (ImeAction.m13329equalsimpl0(imeAction, companion.m13343getGoeUduSuo())) {
            i2 = 2;
        } else if (ImeAction.m13329equalsimpl0(imeAction, companion.m13344getNexteUduSuo())) {
            i2 = 5;
        } else if (ImeAction.m13329equalsimpl0(imeAction, companion.m13346getPreviouseUduSuo())) {
            i2 = 7;
        } else if (ImeAction.m13329equalsimpl0(imeAction, companion.m13347getSearcheUduSuo())) {
            i2 = 3;
        } else if (ImeAction.m13329equalsimpl0(imeAction, companion.m13348getSendeUduSuo())) {
            i2 = 4;
        } else if (!ImeAction.m13329equalsimpl0(imeAction, companion.m13342getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i2;
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13396getTextPjHm6EE())) {
            i = 1;
        } else if (KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13389getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i = 1;
        } else if (KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13392getNumberPjHm6EE())) {
            i = 2;
        } else if (!KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13395getPhonePjHm6EE())) {
            if (KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13397getUriPjHm6EE())) {
                i = 17;
            } else if (KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13391getEmailPjHm6EE())) {
                i = 33;
            } else if (KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13394getPasswordPjHm6EE())) {
                i = 129;
            } else if (KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13393getNumberPasswordPjHm6EE())) {
                i = 18;
            } else {
                if (!KeyboardType.m13376equalsimpl0(keyboardType, companion2.m13390getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type".toString());
                }
                i = 8194;
            }
        }
        editorInfo.inputType = i;
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m13329equalsimpl0(imeOptions.getImeAction(), companion.m13341getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m13361equalsimpl0(capitalization, companion3.m13369getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m13361equalsimpl0(capitalization, companion3.m13372getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m13361equalsimpl0(capitalization, companion3.m13371getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m13165getStartimpl(textFieldCharSequence.getSelectionInChars());
        editorInfo.initialSelEnd = TextRange.m13160getEndimpl(textFieldCharSequence.getSelectionInChars());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldCharSequence);
        editorInfo.imeOptions |= NTLMEngineImpl.FLAG_REQUEST_VERSION;
    }

    public static /* synthetic */ void logDebug$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = TAG;
        }
        logDebug(str, function0);
    }
}
