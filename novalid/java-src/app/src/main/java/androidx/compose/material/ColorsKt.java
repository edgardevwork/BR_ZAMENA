package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Colors.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0088\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0088\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001c\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m7105d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", FeatureParser.FeatureHandler.PRIMARY, "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n74#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
/* loaded from: classes.dex */
public final class ColorsKt {

    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Colors invoke() {
            return ColorsKt.m8867lightColors2qZNXz8((UnixStat.PERM_MASK & 1) != 0 ? ColorKt.Color(4284612846L) : 0L, (UnixStat.PERM_MASK & 2) != 0 ? ColorKt.Color(4281794739L) : 0L, (UnixStat.PERM_MASK & 4) != 0 ? ColorKt.Color(4278442694L) : 0L, (UnixStat.PERM_MASK & 8) != 0 ? ColorKt.Color(4278290310L) : 0L, (UnixStat.PERM_MASK & 16) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : 0L, (UnixStat.PERM_MASK & 32) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : 0L, (UnixStat.PERM_MASK & 64) != 0 ? ColorKt.Color(4289724448L) : 0L, (UnixStat.PERM_MASK & 128) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : 0L, (UnixStat.PERM_MASK & 256) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : 0L, (UnixStat.PERM_MASK & 512) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : 0L, (UnixStat.PERM_MASK & 1024) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : 0L, (UnixStat.PERM_MASK & 2048) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : 0L);
        }
    });

    @NotNull
    /* renamed from: lightColors-2qZNXz8 */
    public static final Colors m8867lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    /* renamed from: darkColors-2qZNXz8$default */
    public static /* synthetic */ Colors m8866darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long jColor = (i & 1) != 0 ? ColorKt.Color(4290479868L) : j;
        long jColor2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j2;
        long jColor3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j3;
        return m8865darkColors2qZNXz8(jColor, jColor2, jColor3, (i & 8) != 0 ? jColor3 : j4, (i & 16) != 0 ? ColorKt.Color(4279374354L) : j5, (i & 32) != 0 ? ColorKt.Color(4279374354L) : j6, (i & 64) != 0 ? ColorKt.Color(4291782265L) : j7, (i & 128) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j8, (i & 256) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j9, (i & 512) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j10, (i & 1024) != 0 ? Color.INSTANCE.m11377getWhite0d7_KjU() : j11, (i & 2048) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j12);
    }

    @NotNull
    /* renamed from: darkColors-2qZNXz8 */
    public static final Colors m8865darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        return colors.isLight() ? colors.m8846getPrimary0d7_KjU() : colors.m8850getSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-4WTKRHQ */
    public static final long m8863contentColorFor4WTKRHQ(@NotNull Colors colors, long j) {
        if (!Color.m11341equalsimpl0(j, colors.m8846getPrimary0d7_KjU()) && !Color.m11341equalsimpl0(j, colors.m8847getPrimaryVariant0d7_KjU())) {
            if (!Color.m11341equalsimpl0(j, colors.m8848getSecondary0d7_KjU()) && !Color.m11341equalsimpl0(j, colors.m8849getSecondaryVariant0d7_KjU())) {
                return Color.m11341equalsimpl0(j, colors.m8839getBackground0d7_KjU()) ? colors.m8841getOnBackground0d7_KjU() : Color.m11341equalsimpl0(j, colors.m8850getSurface0d7_KjU()) ? colors.m8845getOnSurface0d7_KjU() : Color.m11341equalsimpl0(j, colors.m8840getError0d7_KjU()) ? colors.m8842getOnError0d7_KjU() : Color.INSTANCE.m11376getUnspecified0d7_KjU();
            }
            return colors.m8844getOnSecondary0d7_KjU();
        }
        return colors.m8843getOnPrimary0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U */
    public static final long m8864contentColorForek8zF_U(long j, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        long jM8863contentColorFor4WTKRHQ = m8863contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (jM8863contentColorFor4WTKRHQ == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
            jM8863contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM8863contentColorFor4WTKRHQ;
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors colors2) {
        colors.m8858setPrimary8_81llA$material_release(colors2.m8846getPrimary0d7_KjU());
        colors.m8859setPrimaryVariant8_81llA$material_release(colors2.m8847getPrimaryVariant0d7_KjU());
        colors.m8860setSecondary8_81llA$material_release(colors2.m8848getSecondary0d7_KjU());
        colors.m8861setSecondaryVariant8_81llA$material_release(colors2.m8849getSecondaryVariant0d7_KjU());
        colors.m8851setBackground8_81llA$material_release(colors2.m8839getBackground0d7_KjU());
        colors.m8862setSurface8_81llA$material_release(colors2.m8850getSurface0d7_KjU());
        colors.m8852setError8_81llA$material_release(colors2.m8840getError0d7_KjU());
        colors.m8855setOnPrimary8_81llA$material_release(colors2.m8843getOnPrimary0d7_KjU());
        colors.m8856setOnSecondary8_81llA$material_release(colors2.m8844getOnSecondary0d7_KjU());
        colors.m8853setOnBackground8_81llA$material_release(colors2.m8841getOnBackground0d7_KjU());
        colors.m8857setOnSurface8_81llA$material_release(colors2.m8845getOnSurface0d7_KjU());
        colors.m8854setOnError8_81llA$material_release(colors2.m8842getOnError0d7_KjU());
        colors.setLight$material_release(colors2.isLight());
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }
}
