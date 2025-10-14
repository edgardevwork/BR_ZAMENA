package androidx.compose.p003ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.LoadedFontFamily;
import androidx.compose.p003ui.text.font.SystemFontFamily;
import androidx.compose.p003ui.text.font.Typeface;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontResources.android.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"cacheLock", "Ljava/lang/Object;", "syncLoadedTypefaces", "", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", TtmlNode.ATTR_TTS_FONT_FAMILY, "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "fontResourceFromContext", "context", "Landroid/content/Context;", "a", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n74#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
/* loaded from: classes3.dex */
public final class FontResources_androidKt {

    @NotNull
    private static final Object cacheLock = new Object();

    @GuardedBy("cacheLock")
    @NotNull
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @Composable
    @ReadOnlyComposable
    public static final Typeface fontResource(@NotNull FontFamily fontFamily, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface typefaceFontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typefaceFontResourceFromContext;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if ((fontFamily instanceof SystemFontFamily) || (fontFamily instanceof LoadedFontFamily)) {
            synchronized (cacheLock) {
                try {
                    Map<FontFamily, Typeface> map = syncLoadedTypefaces;
                    Typeface typefaceTypeface$default = map.get(fontFamily);
                    if (typefaceTypeface$default == null) {
                        typefaceTypeface$default = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                        map.put(fontFamily, typefaceTypeface$default);
                    }
                    typeface = typefaceTypeface$default;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return typeface;
        }
        return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
    }
}
