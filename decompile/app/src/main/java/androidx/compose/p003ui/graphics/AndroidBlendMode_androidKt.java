package androidx.compose.p003ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.graphics.BlendMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidBlendMode.android.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m7105d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toComposeBlendMode", "(Landroid/graphics/BlendMode;)I", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class AndroidBlendMode_androidKt {

    /* compiled from: AndroidBlendMode.android.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m11190isSupporteds9anfk8(int i) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m11251equalsimpl0(i, BlendMode.INSTANCE.m11282getSrcOver0nO6VwU()) || m11192toPorterDuffModes9anfk8(i) != PorterDuff.Mode.SRC_OVER;
    }

    @NotNull
    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m11192toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m11251equalsimpl0(i, companion.m11255getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11278getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11261getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11282getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11265getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11280getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11263getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11281getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11264getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11279getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11262getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11283getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11274getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11276getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11273getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11259getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11269getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (BlendMode.m11251equalsimpl0(i, companion.m11271getModulate0nO6VwU())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @RequiresApi(29)
    @NotNull
    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m11191toAndroidBlendModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m11251equalsimpl0(i, companion.m11255getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m11251equalsimpl0(i, companion.m11278getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m11251equalsimpl0(i, companion.m11261getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m11251equalsimpl0(i, companion.m11282getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m11251equalsimpl0(i, companion.m11265getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m11251equalsimpl0(i, companion.m11280getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m11251equalsimpl0(i, companion.m11263getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m11251equalsimpl0(i, companion.m11281getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m11251equalsimpl0(i, companion.m11264getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m11251equalsimpl0(i, companion.m11279getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m11251equalsimpl0(i, companion.m11262getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m11251equalsimpl0(i, companion.m11283getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m11251equalsimpl0(i, companion.m11274getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m11251equalsimpl0(i, companion.m11271getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m11251equalsimpl0(i, companion.m11276getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m11251equalsimpl0(i, companion.m11273getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m11251equalsimpl0(i, companion.m11259getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m11251equalsimpl0(i, companion.m11269getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m11251equalsimpl0(i, companion.m11258getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m11251equalsimpl0(i, companion.m11257getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m11251equalsimpl0(i, companion.m11267getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m11251equalsimpl0(i, companion.m11277getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m11251equalsimpl0(i, companion.m11260getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m11251equalsimpl0(i, companion.m11266getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m11251equalsimpl0(i, companion.m11272getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m11251equalsimpl0(i, companion.m11268getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m11251equalsimpl0(i, companion.m11275getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m11251equalsimpl0(i, companion.m11256getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m11251equalsimpl0(i, companion.m11270getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    @RequiresApi(29)
    public static final int toComposeBlendMode(@NotNull android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.INSTANCE.m11255getClear0nO6VwU();
            case 2:
                return BlendMode.INSTANCE.m11278getSrc0nO6VwU();
            case 3:
                return BlendMode.INSTANCE.m11261getDst0nO6VwU();
            case 4:
                return BlendMode.INSTANCE.m11282getSrcOver0nO6VwU();
            case 5:
                return BlendMode.INSTANCE.m11265getDstOver0nO6VwU();
            case 6:
                return BlendMode.INSTANCE.m11280getSrcIn0nO6VwU();
            case 7:
                return BlendMode.INSTANCE.m11263getDstIn0nO6VwU();
            case 8:
                return BlendMode.INSTANCE.m11281getSrcOut0nO6VwU();
            case 9:
                return BlendMode.INSTANCE.m11264getDstOut0nO6VwU();
            case 10:
                return BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.INSTANCE.m11262getDstAtop0nO6VwU();
            case 12:
                return BlendMode.INSTANCE.m11283getXor0nO6VwU();
            case 13:
                return BlendMode.INSTANCE.m11274getPlus0nO6VwU();
            case 14:
                return BlendMode.INSTANCE.m11271getModulate0nO6VwU();
            case 15:
                return BlendMode.INSTANCE.m11276getScreen0nO6VwU();
            case 16:
                return BlendMode.INSTANCE.m11273getOverlay0nO6VwU();
            case 17:
                return BlendMode.INSTANCE.m11259getDarken0nO6VwU();
            case 18:
                return BlendMode.INSTANCE.m11269getLighten0nO6VwU();
            case 19:
                return BlendMode.INSTANCE.m11258getColorDodge0nO6VwU();
            case 20:
                return BlendMode.INSTANCE.m11257getColorBurn0nO6VwU();
            case 21:
                return BlendMode.INSTANCE.m11267getHardlight0nO6VwU();
            case 22:
                return BlendMode.INSTANCE.m11277getSoftlight0nO6VwU();
            case 23:
                return BlendMode.INSTANCE.m11260getDifference0nO6VwU();
            case 24:
                return BlendMode.INSTANCE.m11266getExclusion0nO6VwU();
            case 25:
                return BlendMode.INSTANCE.m11272getMultiply0nO6VwU();
            case 26:
                return BlendMode.INSTANCE.m11268getHue0nO6VwU();
            case 27:
                return BlendMode.INSTANCE.m11275getSaturation0nO6VwU();
            case 28:
                return BlendMode.INSTANCE.m11256getColor0nO6VwU();
            case 29:
                return BlendMode.INSTANCE.m11270getLuminosity0nO6VwU();
            default:
                return BlendMode.INSTANCE.m11282getSrcOver0nO6VwU();
        }
    }
}
