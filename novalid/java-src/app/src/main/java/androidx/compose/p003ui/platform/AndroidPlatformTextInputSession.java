package androidx.compose.p003ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p003ui.SessionMutex;
import androidx.compose.p003ui.text.input.TextInputService;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.caverock.androidsvg.SVG;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010\u001eR\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m7105d2 = {"Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlinx/coroutines/CoroutineScope;", SVG.View.NODE_NAME, "Landroid/view/View;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "coroutineScope", "(Landroid/view/View;Landroidx/compose/ui/text/input/TextInputService;Lkotlinx/coroutines/CoroutineScope;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "isReadyForConnection", "", "()Z", "methodSessionMutex", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/InputMethodSession;", "Ljava/util/concurrent/atomic/AtomicReference;", "getView", "()Landroid/view/View;", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "startInputMethod", "", "request", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, CoroutineScope {
    public static final int $stable = 8;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final AtomicReference<SessionMutex.Session<Object>> methodSessionMutex = SessionMutex.m10979constructorimpl();

    @NotNull
    private final TextInputService textInputService;

    @NotNull
    private final View view;

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", m7120f = "AndroidPlatformTextInputSession.android.kt", m7121i = {}, m7122l = {69}, m7123m = "startInputMethod", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 */
    /* loaded from: classes.dex */
    public static final class C19781 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C19781(Continuation<? super C19781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidPlatformTextInputSession.this.startInputMethod(null, this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    public AndroidPlatformTextInputSession(@NotNull View view, @NotNull TextInputService textInputService, @NotNull CoroutineScope coroutineScope) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = coroutineScope;
    }

    @Override // androidx.compose.p003ui.platform.PlatformTextInputSession
    @NotNull
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m10983getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    @Override // androidx.compose.p003ui.platform.PlatformTextInputSession
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startInputMethod(@NotNull PlatformTextInputMethodRequest platformTextInputMethodRequest, @NotNull Continuation<?> continuation) throws Throwable {
        C19781 c19781;
        if (continuation instanceof C19781) {
            c19781 = (C19781) continuation;
            int i = c19781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19781.label = i - Integer.MIN_VALUE;
            } else {
                c19781 = new C19781(continuation);
            }
        }
        Object obj = c19781.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c19781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AtomicReference<SessionMutex.Session<Object>> atomicReference = this.methodSessionMutex;
            C19792 c19792 = new Function1<CoroutineScope, InputMethodSession>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod.2
                public C19792() {
                    super(1);
                }

                /* compiled from: AndroidPlatformTextInputSession.android.kt */
                @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1 */
                public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                    public AnonymousClass1() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final InputMethodSession invoke(@NotNull CoroutineScope coroutineScope) {
                    return new InputMethodSession(platformTextInputMethodRequest, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod.2.1
                        public AnonymousClass1() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke */
                        public final void invoke2() {
                            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                        }
                    });
                }
            };
            C19803 c19803 = new C19803(null);
            c19781.label = 1;
            if (SessionMutex.m10986withSessionCancellingPreviousimpl(atomicReference, c19792, c19803, c19781) == coroutine_suspended) {
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

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/platform/InputMethodSession;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 */
    /* loaded from: classes.dex */
    public static final class C19792 extends Lambda implements Function1<CoroutineScope, InputMethodSession> {
        public C19792() {
            super(1);
        }

        /* compiled from: AndroidPlatformTextInputSession.android.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final InputMethodSession invoke(@NotNull CoroutineScope coroutineScope) {
            return new InputMethodSession(platformTextInputMethodRequest, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod.2.1
                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                }
            });
        }
    }

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", "methodSession", "Landroidx/compose/ui/platform/InputMethodSession;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", m7120f = "AndroidPlatformTextInputSession.android.kt", m7121i = {0}, m7122l = {Cea708Decoder.COMMAND_DF6}, m7123m = "invokeSuspend", m7124n = {"methodSession"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,157:1\n314#2,11:158\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n*L\n77#1:158,11\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 */
    public static final class C19803 extends SuspendLambda implements Function2<InputMethodSession, Continuation<?>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public C19803(Continuation<? super C19803> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C19803 c19803 = AndroidPlatformTextInputSession.this.new C19803(continuation);
            c19803.L$0 = obj;
            return c19803;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InputMethodSession inputMethodSession, @Nullable Continuation<?> continuation) {
            return ((C19803) create(inputMethodSession, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                final AndroidPlatformTextInputSession androidPlatformTextInputSession = AndroidPlatformTextInputSession.this;
                this.L$0 = inputMethodSession;
                this.L$1 = androidPlatformTextInputSession;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                androidPlatformTextInputSession.textInputService.startInput();
                cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
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
                        inputMethodSession.dispose();
                        androidPlatformTextInputSession.textInputService.stopInput();
                    }
                });
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
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
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m10983getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(outAttrs);
        }
        return null;
    }
}
