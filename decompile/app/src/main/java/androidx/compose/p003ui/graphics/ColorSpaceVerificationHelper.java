package androidx.compose.p003ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p003ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p003ui.graphics.colorspace.Rgb;
import androidx.compose.p003ui.graphics.colorspace.TransferParameters;
import androidx.compose.p003ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidColorSpace.android.kt */
@RequiresApi(26)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¨\u0006\u0007"}, m7105d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "()V", "androidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ColorSpaceVerificationHelper {

    @NotNull
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    public static final ColorSpace androidColorSpace(@NotNull androidx.compose.p003ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Rgb.TransferParameters transferParametersM199m;
        ColorSpace.Rgb rgbM202m;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (colorSpace instanceof Rgb) {
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            TransferParameters transferParameters = rgb.getTransferParameters();
            if (transferParameters != null) {
                ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline42.m203m();
                transferParametersM199m = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline39.m199m(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
            } else {
                transferParametersM199m = null;
            }
            if (transferParametersM199m != null) {
                ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline43.m204m();
                rgbM202m = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline40.m201m(colorSpace.getName(), rgb.getPrimaries(), xyz$ui_graphics_release, transferParametersM199m);
            } else {
                ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline43.m204m();
                String name = colorSpace.getName();
                float[] primaries = rgb.getPrimaries();
                final Function1<Double, Double> oetf = rgb.getOetf();
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda44
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$0(oetf, d);
                    }
                };
                final Function1<Double, Double> eotf = rgb.getEotf();
                rgbM202m = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline41.m202m(name, primaries, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda45
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$1(eotf, d);
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
            }
            return ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline16.m174m(rgbM202m);
        }
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    public static final double androidColorSpace$lambda$0(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final double androidColorSpace$lambda$1(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    public static final androidx.compose.p003ui.graphics.colorspace.ColorSpace composeColorSpace(@NotNull final ColorSpace colorSpace) {
        WhitePoint whitePoint;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline23.m182m(colorSpace)) {
            ColorSpace.Rgb.TransferParameters transferParameters = ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getTransferParameters();
            if (ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getWhitePoint().length == 3) {
                whitePoint = new WhitePoint(ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getWhitePoint()[0], ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getWhitePoint()[1], ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getWhitePoint()[2]);
            } else {
                whitePoint = new WhitePoint(ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getWhitePoint()[0], ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getWhitePoint()[1]);
            }
            return new Rgb(ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getName(), ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getPrimaries(), whitePoint, ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda46
                @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    return ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d);
                }
            }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda47
                @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    return ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d);
                }
            }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getId());
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d) {
        return ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getOetf().applyAsDouble(d);
    }

    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d) {
        return ColorSpaceVerificationHelper$$ExternalSyntheticApiModelOutline0.m166m(colorSpace).getEotf().applyAsDouble(d);
    }
}
