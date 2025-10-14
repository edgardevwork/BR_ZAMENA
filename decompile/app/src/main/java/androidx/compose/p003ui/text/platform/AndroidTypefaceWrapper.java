package androidx.compose.p003ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTypefaceWrapper.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceWrapper;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "typeface", "Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;)V", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getTypeface", "()Landroid/graphics/Typeface;", "getNativeTypeface", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    public static final int $stable = 8;

    @Nullable
    private final FontFamily fontFamily;

    @NotNull
    private final Typeface typeface;

    public AndroidTypefaceWrapper(@NotNull Typeface typeface) {
        this.typeface = typeface;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // androidx.compose.p003ui.text.font.Typeface
    @Nullable
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p003ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo13408getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int fontStyle, int synthesis) {
        return this.typeface;
    }
}
