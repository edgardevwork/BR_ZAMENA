package androidx.compose.p003ui.text.font;

import androidx.compose.p003ui.text.font.AsyncTypefaceCache;
import androidx.compose.p003ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, m7105d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n420#2:433\n421#2,9:435\n420#2:444\n421#2,7:446\n428#2,2:454\n26#3:434\n26#3:445\n1#4:453\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n189#1:433\n189#1:435,9\n205#1:444\n205#1:446,7\n205#1:454,2\n189#1:434\n205#1:445\n*E\n"})
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objLoadBlocking;
        Font font;
        Object objM15699constructorimpl;
        Font font2;
        int size = list.size();
        List listMutableListOf = null;
        for (int i = 0; i < size; i++) {
            Font font3 = list.get(i);
            int loadingStrategy = font3.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (!FontLoadingStrategy.m13261equalsimpl0(loadingStrategy, companion.m13266getBlockingPKNRLFQ())) {
                if (!FontLoadingStrategy.m13261equalsimpl0(loadingStrategy, companion.m13267getOptionalLocalPKNRLFQ())) {
                    if (FontLoadingStrategy.m13261equalsimpl0(loadingStrategy, companion.m13265getAsyncPKNRLFQ())) {
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM13230get1ASDuI8 = asyncTypefaceCache.m13230get1ASDuI8(font3, platformFontLoader);
                        if (asyncTypefaceResultM13230get1ASDuI8 != null) {
                            if (!AsyncTypefaceCache.AsyncTypefaceResult.m13236isPermanentFailureimpl(asyncTypefaceResultM13230get1ASDuI8.m13238unboximpl()) && asyncTypefaceResultM13230get1ASDuI8.m13238unboximpl() != null) {
                                return TuplesKt.m7112to(listMutableListOf, FontSynthesis_androidKt.m13295synthesizeTypefaceFxwP2eA(typefaceRequest.m13320getFontSynthesisGVVA2EU(), asyncTypefaceResultM13230get1ASDuI8.m13238unboximpl(), font3, typefaceRequest.getFontWeight(), typefaceRequest.m13319getFontStyle_LCdwA()));
                            }
                        } else if (listMutableListOf == null) {
                            listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(font3);
                        } else {
                            listMutableListOf.add(font3);
                        }
                    } else {
                        throw new IllegalStateException("Unknown font type " + font3);
                    }
                } else {
                    synchronized (asyncTypefaceCache.cacheLock) {
                        try {
                            AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                            AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                            if (asyncTypefaceResult == null) {
                                asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                            }
                            if (asyncTypefaceResult != null) {
                                objM15699constructorimpl = asyncTypefaceResult.m13238unboximpl();
                                font2 = font3;
                            } else {
                                Unit unit = Unit.INSTANCE;
                                try {
                                    Result.Companion companion2 = Result.INSTANCE;
                                    objM15699constructorimpl = Result.m15699constructorimpl(platformFontLoader.loadBlocking(font3));
                                } catch (Throwable th) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                                }
                                if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                                    objM15699constructorimpl = null;
                                }
                                font2 = font3;
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, objM15699constructorimpl, false, 8, null);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (objM15699constructorimpl != null) {
                        return TuplesKt.m7112to(listMutableListOf, FontSynthesis_androidKt.m13295synthesizeTypefaceFxwP2eA(typefaceRequest.m13320getFontSynthesisGVVA2EU(), objM15699constructorimpl, font2, typefaceRequest.getFontWeight(), typefaceRequest.m13319getFontStyle_LCdwA()));
                    }
                }
            } else {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            objLoadBlocking = asyncTypefaceResult2.m13238unboximpl();
                            font = font3;
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                objLoadBlocking = platformFontLoader.loadBlocking(font3);
                                font = font3;
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, objLoadBlocking, false, 8, null);
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + font3, e);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objLoadBlocking == null) {
                    throw new IllegalStateException("Unable to load font " + font);
                }
                return TuplesKt.m7112to(listMutableListOf, FontSynthesis_androidKt.m13295synthesizeTypefaceFxwP2eA(typefaceRequest.m13320getFontSynthesisGVVA2EU(), objLoadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m13319getFontStyle_LCdwA()));
            }
        }
        return TuplesKt.m7112to(listMutableListOf, function1.invoke(typefaceRequest));
    }
}
