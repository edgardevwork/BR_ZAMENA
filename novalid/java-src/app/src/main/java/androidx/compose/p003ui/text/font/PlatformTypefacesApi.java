package androidx.compose.p003ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontVariation;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\fJ<\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m7105d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "()V", "createAndroidTypefaceUsingTypefaceStyle", "Landroid/graphics/Typeface;", "genericFontFamily", "", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "name", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "familyName", "weight", "style", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "optionalOnDeviceFontFamilyByName", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "context", "Landroid/content/Context;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@VisibleForTesting
/* loaded from: classes4.dex */
public final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    @NotNull
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo13301createDefaultFO1MlWM(@NotNull FontWeight fontWeight, int fontStyle) {
        return m13306createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, fontStyle);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    @NotNull
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo13302createNamedRetOiIg(@NotNull GenericFontFamily name, @NotNull FontWeight fontWeight, int fontStyle) {
        Typeface typefaceM13305loadNamedFromTypefaceCacheOrNullRetOiIg = m13305loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, fontStyle);
        return typefaceM13305loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m13306createAndroidTypefaceUsingTypefaceStyleRetOiIg(name.getName(), fontWeight, fontStyle) : typefaceM13305loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.p003ui.text.font.PlatformTypefaces
    @Nullable
    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public Typeface mo13303optionalOnDeviceFontFamilyByName78DK7lM(@NotNull String familyName, @NotNull FontWeight weight, int style, @NotNull FontVariation.Settings variationSettings, @NotNull Context context) {
        Typeface typefaceMo13302createNamedRetOiIg;
        FontFamily.Companion companion = FontFamily.INSTANCE;
        if (Intrinsics.areEqual(familyName, companion.getSansSerif().getName())) {
            typefaceMo13302createNamedRetOiIg = mo13302createNamedRetOiIg(companion.getSansSerif(), weight, style);
        } else if (Intrinsics.areEqual(familyName, companion.getSerif().getName())) {
            typefaceMo13302createNamedRetOiIg = mo13302createNamedRetOiIg(companion.getSerif(), weight, style);
        } else if (Intrinsics.areEqual(familyName, companion.getMonospace().getName())) {
            typefaceMo13302createNamedRetOiIg = mo13302createNamedRetOiIg(companion.getMonospace(), weight, style);
        } else {
            typefaceMo13302createNamedRetOiIg = Intrinsics.areEqual(familyName, companion.getCursive().getName()) ? mo13302createNamedRetOiIg(companion.getCursive(), weight, style) : m13305loadNamedFromTypefaceCacheOrNullRetOiIg(familyName, weight, style);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceMo13302createNamedRetOiIg, variationSettings, context);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final Typeface m13305loadNamedFromTypefaceCacheOrNullRetOiIg(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceM13306createAndroidTypefaceUsingTypefaceStyleRetOiIg = m13306createAndroidTypefaceUsingTypefaceStyleRetOiIg(familyName, weight, style);
        if (Intrinsics.areEqual(typefaceM13306createAndroidTypefaceUsingTypefaceStyleRetOiIg, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.m13228getAndroidTypefaceStyleFO1MlWM(weight, style))) || Intrinsics.areEqual(typefaceM13306createAndroidTypefaceUsingTypefaceStyleRetOiIg, m13306createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, weight, style))) {
            return null;
        }
        return typefaceM13306createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Typeface m13304createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.INSTANCE.m13281getNormal_LCdwA();
        }
        return platformTypefacesApi.m13306createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    public final Typeface m13306createAndroidTypefaceUsingTypefaceStyleRetOiIg(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        if (FontStyle.m13274equalsimpl0(fontStyle, FontStyle.INSTANCE.m13281getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.INSTANCE.getNormal()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM13228getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m13228getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle);
        if (genericFontFamily == null || genericFontFamily.length() == 0) {
            return Typeface.defaultFromStyle(iM13228getAndroidTypefaceStyleFO1MlWM);
        }
        return Typeface.create(genericFontFamily, iM13228getAndroidTypefaceStyleFO1MlWM);
    }
}
