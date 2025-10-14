package androidx.compose.p003ui.graphics.colorspace;

import androidx.compose.p003ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;

/* compiled from: Lab.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m7105d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", ArtifactoryClientConfiguration.DEFAULT_NUGET_PROTOCOL, "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,141:1\n25#2,3:142\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:142,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A */
    private static final float f79A = 0.008856452f;

    /* renamed from: B */
    private static final float f80B = 7.787037f;

    /* renamed from: C */
    private static final float f81C = 0.13793103f;

    /* renamed from: D */
    private static final float f82D = 0.20689656f;

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    public Lab(@NotNull String str, int i) {
        super(str, ColorModel.INSTANCE.m11752getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v) {
        v[0] = RangesKt___RangesKt.coerceIn(v[0], 0.0f, 100.0f);
        v[1] = RangesKt___RangesKt.coerceIn(v[1], -128.0f, 128.0f);
        float fCoerceIn = RangesKt___RangesKt.coerceIn(v[2], -128.0f, 128.0f);
        v[2] = fCoerceIn;
        float f = (v[0] + 16.0f) / 116.0f;
        float f2 = (v[1] * 0.002f) + f;
        float f3 = f - (fCoerceIn * 0.005f);
        float f4 = f2 > f82D ? f2 * f2 * f2 : (f2 - f81C) * 0.12841855f;
        float f5 = f > f82D ? f * f * f : (f - f81C) * 0.12841855f;
        float f6 = f3 > f82D ? f3 * f3 * f3 : (f3 - f81C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v[0] = f4 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v[1] = f5 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v[2] = f6 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float fCoerceIn = (RangesKt___RangesKt.coerceIn(v0, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fCoerceIn2 = (RangesKt___RangesKt.coerceIn(v1, -128.0f, 128.0f) * 0.002f) + fCoerceIn;
        float f = fCoerceIn2 > f82D ? fCoerceIn2 * fCoerceIn2 * fCoerceIn2 : (fCoerceIn2 - f81C) * 0.12841855f;
        float f2 = fCoerceIn > f82D ? fCoerceIn * fCoerceIn * fCoerceIn : (fCoerceIn - f81C) * 0.12841855f;
        float f3 = f * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        return (Float.floatToRawIntBits(f2 * r5.getD50Xyz$ui_graphics_release()[1]) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        float fCoerceIn = ((RangesKt___RangesKt.coerceIn(v0, 0.0f, 100.0f) + 16.0f) / 116.0f) - (RangesKt___RangesKt.coerceIn(v2, -128.0f, 128.0f) * 0.005f);
        return (fCoerceIn > f82D ? fCoerceIn * fCoerceIn * fCoerceIn : 0.12841855f * (fCoerceIn - f81C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo11756xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a2, @NotNull ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f = x / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f2 = y / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f3 = z / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f > f79A ? (float) Math.pow(f, 0.33333334f) : (f * f80B) + f81C;
        float fPow2 = f2 > f79A ? (float) Math.pow(f2, 0.33333334f) : (f2 * f80B) + f81C;
        return ColorKt.Color(RangesKt___RangesKt.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), RangesKt___RangesKt.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f), RangesKt___RangesKt.coerceIn((fPow2 - (f3 > f79A ? (float) Math.pow(f3, 0.33333334f) : (f3 * f80B) + f81C)) * 200.0f, -128.0f, 128.0f), a2, colorSpace);
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        float f = v[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f2 = f / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f3 = v[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f4 = v[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f2 > f79A ? (float) Math.pow(f2, 0.33333334f) : (f2 * f80B) + f81C;
        float fPow2 = f3 > f79A ? (float) Math.pow(f3, 0.33333334f) : (f3 * f80B) + f81C;
        float fPow3 = f4 > f79A ? (float) Math.pow(f4, 0.33333334f) : (f4 * f80B) + f81C;
        v[0] = RangesKt___RangesKt.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v[1] = RangesKt___RangesKt.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v[2] = RangesKt___RangesKt.coerceIn((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v;
    }
}
