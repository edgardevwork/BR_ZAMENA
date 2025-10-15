package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.AndroidFont;
import androidx.compose.p003ui.text.font.FontLoadingStrategy;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.common.net.MediaType;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFontLoader.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", MediaType.FONT_TYPE, "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;

    @Nullable
    private final Object cacheKey;
    private final Context context;

    /* compiled from: AndroidFontLoader.android.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.ui.text.font.AndroidFontLoader", m7120f = "AndroidFontLoader.android.kt", m7121i = {1, 1}, m7122l = {57, 58}, m7123m = "awaitLoad", m7124n = {"this", MediaType.FONT_TYPE}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 */
    /* loaded from: classes2.dex */
    public static final class C20261 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C20261(Continuation<? super C20261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    public AndroidFontLoader(@NotNull Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.p003ui.text.font.PlatformFontLoader
    @Nullable
    public Typeface loadBlocking(@NotNull Font font) throws Resources.NotFoundException {
        Object objM15699constructorimpl;
        Typeface typefaceLoad;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.m13261equalsimpl0(loadingStrategy, companion.m13266getBlockingPKNRLFQ())) {
            typefaceLoad = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
        } else if (FontLoadingStrategy.m13261equalsimpl0(loadingStrategy, companion.m13267getOptionalLocalPKNRLFQ())) {
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(AndroidFontLoader_androidKt.load((ResourceFont) font, this.context));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            typefaceLoad = (Typeface) (Result.m15705isFailureimpl(objM15699constructorimpl) ? null : objM15699constructorimpl);
        } else {
            if (FontLoadingStrategy.m13261equalsimpl0(loadingStrategy, companion.m13265getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m13263toStringimpl(font.getLoadingStrategy())));
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceLoad, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p003ui.text.font.PlatformFontLoader
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitLoad(@NotNull Font font, @NotNull Continuation<? super Typeface> continuation) throws Throwable {
        C20261 c20261;
        AndroidFontLoader androidFontLoader;
        if (continuation instanceof C20261) {
            c20261 = (C20261) continuation;
            int i = c20261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20261.label = i - Integer.MIN_VALUE;
            } else {
                c20261 = new C20261(continuation);
            }
        }
        Object objLoadAsync = c20261.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c20261.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objLoadAsync);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            font = (Font) c20261.L$1;
            androidFontLoader = (AndroidFontLoader) c20261.L$0;
            ResultKt.throwOnFailure(objLoadAsync);
            return PlatformTypefaces_androidKt.setFontVariationSettings((Typeface) objLoadAsync, ((ResourceFont) font).getVariationSettings(), androidFontLoader.context);
        }
        ResultKt.throwOnFailure(objLoadAsync);
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            c20261.label = 1;
            objLoadAsync = typefaceLoader.awaitLoad(context, androidFont, c20261);
            return objLoadAsync == coroutine_suspended ? coroutine_suspended : objLoadAsync;
        }
        if (font instanceof ResourceFont) {
            Context context2 = this.context;
            c20261.L$0 = this;
            c20261.L$1 = font;
            c20261.label = 2;
            objLoadAsync = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context2, c20261);
            if (objLoadAsync == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidFontLoader = this;
            return PlatformTypefaces_androidKt.setFontVariationSettings((Typeface) objLoadAsync, ((ResourceFont) font).getVariationSettings(), androidFontLoader.context);
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformFontLoader
    @Nullable
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
