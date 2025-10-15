package androidx.compose.p003ui.text.font;

import androidx.compose.p003ui.text.font.TypefaceResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.common.net.MediaType;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u0005H\u0080@¢\u0006\u0004\b#\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, m7105d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "fontList", "", "Landroidx/compose/ui/text/font/Font;", "initialType", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "onCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "cacheable", "", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n81#2:433\n107#2,2:434\n33#3,6:436\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n256#1:433\n256#1:434,2\n263#1:436,6\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;

    @NotNull
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;

    @NotNull
    private final List<Font> fontList;

    @NotNull
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;

    @NotNull
    private final PlatformFontLoader platformFontLoader;

    @NotNull
    private final TypefaceRequest typefaceRequest;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState value;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.ui.text.font.AsyncFontListLoader", m7120f = "FontListFontFamilyTypefaceAdapter.kt", m7121i = {0, 0, 0, 0, 1, 1, 1}, m7122l = {272, 285}, m7123m = "load", m7124n = {"this", "$this$fastForEach$iv", MediaType.FONT_TYPE, "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, m7125s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    /* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
    /* loaded from: classes2.dex */
    public static final class C20271 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C20271(Continuation<? super C20271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AsyncFontListLoader.this.load(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@NotNull List<? extends Font> list, @NotNull Object obj, @NotNull TypefaceRequest typefaceRequest, @NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull Function1<? super TypefaceResult.Immutable, Unit> function1, @NotNull PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = function1;
        this.platformFontLoader = platformFontLoader;
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.State
    @NotNull
    public Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: getCacheable$ui_text_release, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.cacheable = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f5 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:89:0x0075, B:91:0x008c, B:96:0x00be, B:101:0x00f5), top: B:114:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00be A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:89:0x0075, B:91:0x008c, B:96:0x00be, B:101:0x00f5), top: B:114:0x0075 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0108 -> B:105:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010d -> B:107:0x010f). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C20271 c20271;
        AsyncFontListLoader asyncFontListLoader;
        List<Font> list;
        int size;
        AsyncFontListLoader asyncFontListLoader2;
        int i;
        Font font;
        List<Font> list2;
        int i2;
        if (continuation instanceof C20271) {
            c20271 = (C20271) continuation;
            int i3 = c20271.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c20271.label = i3 - Integer.MIN_VALUE;
            } else {
                c20271 = new C20271(continuation);
            }
        }
        Object obj = c20271.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c20271.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                list = this.fontList;
                size = list.size();
                asyncFontListLoader2 = this;
                i = 0;
                if (i >= size) {
                }
            } catch (Throwable th) {
                th = th;
                asyncFontListLoader = this;
            }
        } else if (i4 == 1) {
            size = c20271.I$1;
            i2 = c20271.I$0;
            Font font2 = (Font) c20271.L$2;
            List<Font> list3 = (List) c20271.L$1;
            AsyncFontListLoader asyncFontListLoader3 = (AsyncFontListLoader) c20271.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                asyncFontListLoader2 = asyncFontListLoader3;
                font = font2;
                list2 = list3;
                if (obj == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                asyncFontListLoader = asyncFontListLoader3;
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = c20271.I$1;
            i2 = c20271.I$0;
            list2 = (List) c20271.L$1;
            asyncFontListLoader = (AsyncFontListLoader) c20271.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                i = i2;
                list = list2;
                asyncFontListLoader2 = asyncFontListLoader;
                i++;
                if (i >= size) {
                    try {
                        Font font3 = list.get(i);
                        if (FontLoadingStrategy.m13261equalsimpl0(font3.getLoadingStrategy(), FontLoadingStrategy.INSTANCE.m13265getAsyncPKNRLFQ())) {
                            AsyncTypefaceCache asyncTypefaceCache = asyncFontListLoader2.asyncTypefaceCache;
                            PlatformFontLoader platformFontLoader = asyncFontListLoader2.platformFontLoader;
                            AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new AsyncFontListLoader$load$2$typeface$1(asyncFontListLoader2, font3, null);
                            c20271.L$0 = asyncFontListLoader2;
                            c20271.L$1 = list;
                            c20271.L$2 = font3;
                            c20271.I$0 = i;
                            c20271.I$1 = size;
                            c20271.label = 1;
                            int i5 = i;
                            Object objRunCached = asyncTypefaceCache.runCached(font3, platformFontLoader, false, asyncFontListLoader$load$2$typeface$1, c20271);
                            if (objRunCached == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list2 = list;
                            obj = objRunCached;
                            font = font3;
                            i2 = i5;
                            if (obj == null) {
                                asyncFontListLoader2.setValue(FontSynthesis_androidKt.m13295synthesizeTypefaceFxwP2eA(asyncFontListLoader2.typefaceRequest.m13320getFontSynthesisGVVA2EU(), obj, font, asyncFontListLoader2.typefaceRequest.getFontWeight(), asyncFontListLoader2.typefaceRequest.m13319getFontStyle_LCdwA()));
                                Unit unit = Unit.INSTANCE;
                                boolean zIsActive = JobKt.isActive(c20271.getContext());
                                asyncFontListLoader2.cacheable = false;
                                asyncFontListLoader2.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader2.getValue(), zIsActive));
                                return unit;
                            }
                            c20271.L$0 = asyncFontListLoader2;
                            c20271.L$1 = list2;
                            c20271.L$2 = null;
                            c20271.I$0 = i2;
                            c20271.I$1 = size;
                            c20271.label = 2;
                            if (YieldKt.yield(c20271) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            asyncFontListLoader = asyncFontListLoader2;
                            i = i2;
                            list = list2;
                            asyncFontListLoader2 = asyncFontListLoader;
                            i++;
                            if (i >= size) {
                                boolean zIsActive2 = JobKt.isActive(c20271.getContext());
                                asyncFontListLoader2.cacheable = false;
                                asyncFontListLoader2.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader2.getValue(), zIsActive2));
                                return Unit.INSTANCE;
                            }
                        } else {
                            i++;
                            if (i >= size) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        asyncFontListLoader = asyncFontListLoader2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        boolean zIsActive3 = JobKt.isActive(c20271.getContext());
        asyncFontListLoader.cacheable = false;
        asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), zIsActive3));
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadWithTimeoutOrNull$ui_text_release(@NotNull Font font, @NotNull Continuation<Object> continuation) throws Throwable {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (continuation instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) continuation;
            int i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuation);
            }
        }
        Object objWithTimeoutOrNull = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        Object obj = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
                asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = font;
                asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                font = (Font) asyncFontListLoader$loadWithTimeoutOrNull$1.L$0;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            obj = objWithTimeoutOrNull;
            return obj;
        } catch (CancellationException e) {
            if (JobKt.isActive(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                return obj;
            }
            throw e;
        } catch (Exception e2) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler == null) {
                return obj;
            }
            coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e2));
            return obj;
        }
    }
}
