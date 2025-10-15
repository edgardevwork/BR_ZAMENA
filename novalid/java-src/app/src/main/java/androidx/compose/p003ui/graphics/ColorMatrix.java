package androidx.compose.p003ui.graphics;

import androidx.core.text.util.LocalePreferences;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorMatrix.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ2\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJP\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f26\u0010&\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\t0'H\u0082\b¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101J(\u0010.\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b9\u00107J\u0015\u0010:\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000f¢\u0006\u0004\b;\u00107J\u0015\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u000f¢\u0006\u0004\b>\u00107J-\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bH\u00101J\u0010\u0010I\u001a\u00020JHÖ\u0001¢\u0006\u0004\bK\u0010LR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, m7105d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", SavedStateHandle.VALUES, "", "constructor-impl", "([F)[F", "getValues", "()[F", "convertRgbToYuv", "", "convertRgbToYuv-impl", "([F)V", "convertYuvToRgb", "convertYuvToRgb-impl", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "", "m1", "row", "", "m2", "column", "dot-Me4OoYI", "([F[FI[FI)F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "reset", "reset-impl", "rotateInternal", "degrees", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "cosine", "sine", "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "set", "src", "set-jHG-Opc", "([F[F)V", "v", "set-impl", "([FIIF)V", "setToRotateBlue", "setToRotateBlue-impl", "([FF)V", "setToRotateGreen", "setToRotateGreen-impl", "setToRotateRed", "setToRotateRed-impl", "setToSaturation", LocalePreferences.FirstDayOfWeek.SATURDAY, "setToSaturation-impl", "setToScale", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "timesAssign", "colorMatrix", "timesAssign-jHG-Opc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "ui-graphics_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,329:1\n97#1,2:330\n97#1,2:332\n97#1,2:334\n97#1,2:336\n84#1:338\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n84#1:357\n97#1,2:358\n97#1,2:360\n97#1,2:362\n97#1,2:364\n97#1,2:366\n97#1,2:368\n97#1,2:370\n97#1,2:372\n97#1,2:374\n97#1,2:376\n97#1,2:378\n97#1,2:380\n97#1,2:382\n97#1,2:384\n97#1,2:386\n97#1,2:388\n97#1,2:390\n97#1,2:392\n97#1,2:394\n97#1,2:396\n84#1:398\n84#1:399\n84#1:400\n84#1:401\n97#1,2:402\n97#1,2:404\n97#1,2:406\n97#1,2:408\n97#1,2:410\n97#1,2:412\n97#1,2:414\n97#1,2:416\n97#1,2:418\n97#1,2:420\n97#1,2:422\n97#1,2:424\n97#1,2:426\n133#1,5:428\n97#1,2:433\n97#1,2:435\n97#1,2:437\n97#1,2:439\n138#1:441\n133#1,5:442\n97#1,2:447\n97#1,2:449\n97#1,2:451\n97#1,2:453\n138#1:455\n133#1,5:456\n97#1,2:461\n97#1,2:463\n97#1,2:465\n97#1,2:467\n138#1:469\n97#1,2:470\n97#1,2:472\n97#1,2:474\n97#1,2:476\n97#1,2:478\n97#1,2:480\n97#1,2:482\n97#1,2:484\n97#1,2:486\n97#1,2:488\n97#1,2:490\n97#1,2:492\n97#1,2:494\n97#1,2:496\n97#1,2:498\n97#1,2:500\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n111#1:330,2\n112#1:332,2\n113#1:334,2\n114#1:336,2\n148#1:338\n149#1:339\n150#1:340\n151#1:341\n152#1:342\n158#1:343\n159#1:344\n160#1:345\n161#1:346\n162#1:347\n168#1:348\n169#1:349\n170#1:350\n171#1:351\n172#1:352\n178#1:353\n179#1:354\n180#1:355\n181#1:356\n182#1:357\n184#1:358,2\n185#1:360,2\n186#1:362,2\n187#1:364,2\n188#1:366,2\n189#1:368,2\n190#1:370,2\n191#1:372,2\n192#1:374,2\n193#1:376,2\n194#1:378,2\n195#1:380,2\n196#1:382,2\n197#1:384,2\n198#1:386,2\n199#1:388,2\n200#1:390,2\n201#1:392,2\n202#1:394,2\n203#1:396,2\n211#1:398\n212#1:399\n213#1:400\n214#1:401\n228#1:402,2\n229#1:404,2\n230#1:406,2\n231#1:408,2\n232#1:410,2\n233#1:412,2\n234#1:414,2\n235#1:416,2\n236#1:418,2\n255#1:420,2\n256#1:422,2\n257#1:424,2\n258#1:426,2\n265#1:428,5\n266#1:433,2\n267#1:435,2\n268#1:437,2\n269#1:439,2\n265#1:441\n277#1:442,5\n278#1:447,2\n279#1:449,2\n280#1:451,2\n281#1:453,2\n277#1:455\n289#1:456,5\n290#1:461,2\n291#1:463,2\n292#1:465,2\n293#1:467,2\n289#1:469\n303#1:470,2\n304#1:472,2\n305#1:474,2\n306#1:476,2\n307#1:478,2\n308#1:480,2\n309#1:482,2\n310#1:484,2\n311#1:486,2\n320#1:488,2\n321#1:490,2\n322#1:492,2\n323#1:494,2\n324#1:496,2\n325#1:498,2\n326#1:500,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorMatrix {

    @NotNull
    private final float[] values;

    /* renamed from: box-impl */
    public static final /* synthetic */ ColorMatrix m11395boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl */
    public static float[] m11396constructorimpl(@NotNull float[] fArr) {
        return fArr;
    }

    /* renamed from: equals-impl */
    public static boolean m11401equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m11416unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m11402equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: hashCode-impl */
    public static int m11404hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: toString-impl */
    public static String m11415toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m11401equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m11404hashCodeimpl(this.values);
    }

    public String toString() {
        return m11415toStringimpl(this.values);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float[] m11416unboximpl() {
        return this.values;
    }

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m11397constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m11396constructorimpl(fArr);
    }

    /* renamed from: get-impl */
    public static final float m11403getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* renamed from: set-impl */
    public static final void m11407setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* renamed from: reset-impl */
    public static final void m11405resetimpl(float[] fArr) {
        ArraysKt___ArraysJvmKt.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* renamed from: set-jHG-Opc */
    public static final void m11408setjHGOpc(float[] fArr, @NotNull float[] fArr2) {
        ArraysKt___ArraysJvmKt.copyInto$default(fArr2, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* renamed from: rotateInternal-impl */
    private static final void m11406rotateInternalimpl(float[] fArr, float f, Function2<? super Float, ? super Float, Unit> function2) {
        m11405resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        function2.invoke(Float.valueOf((float) Math.cos(d)), Float.valueOf((float) Math.sin(d)));
    }

    /* renamed from: timesAssign-jHG-Opc */
    public static final void m11414timesAssignjHGOpc(float[] fArr, @NotNull float[] fArr2) {
        float fM11400dotMe4OoYI = m11400dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float fM11400dotMe4OoYI2 = m11400dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float fM11400dotMe4OoYI3 = m11400dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float fM11400dotMe4OoYI4 = m11400dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f = (fArr[0] * fArr2[4]) + (fArr[1] * fArr2[9]) + (fArr[2] * fArr2[14]) + (fArr[3] * fArr2[19]) + fArr[4];
        float fM11400dotMe4OoYI5 = m11400dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float fM11400dotMe4OoYI6 = m11400dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float fM11400dotMe4OoYI7 = m11400dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float fM11400dotMe4OoYI8 = m11400dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f2 = (fArr[5] * fArr2[4]) + (fArr[6] * fArr2[9]) + (fArr[7] * fArr2[14]) + (fArr[8] * fArr2[19]) + fArr[9];
        float fM11400dotMe4OoYI9 = m11400dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float fM11400dotMe4OoYI10 = m11400dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float fM11400dotMe4OoYI11 = m11400dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float fM11400dotMe4OoYI12 = m11400dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f3 = (fArr[10] * fArr2[4]) + (fArr[11] * fArr2[9]) + (fArr[12] * fArr2[14]) + (fArr[13] * fArr2[19]) + fArr[14];
        float fM11400dotMe4OoYI13 = m11400dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float fM11400dotMe4OoYI14 = m11400dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float fM11400dotMe4OoYI15 = m11400dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float fM11400dotMe4OoYI16 = m11400dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f4 = (fArr[15] * fArr2[4]) + (fArr[16] * fArr2[9]) + (fArr[17] * fArr2[14]) + (fArr[18] * fArr2[19]) + fArr[19];
        fArr[0] = fM11400dotMe4OoYI;
        fArr[1] = fM11400dotMe4OoYI2;
        fArr[2] = fM11400dotMe4OoYI3;
        fArr[3] = fM11400dotMe4OoYI4;
        fArr[4] = f;
        fArr[5] = fM11400dotMe4OoYI5;
        fArr[6] = fM11400dotMe4OoYI6;
        fArr[7] = fM11400dotMe4OoYI7;
        fArr[8] = fM11400dotMe4OoYI8;
        fArr[9] = f2;
        fArr[10] = fM11400dotMe4OoYI9;
        fArr[11] = fM11400dotMe4OoYI10;
        fArr[12] = fM11400dotMe4OoYI11;
        fArr[13] = fM11400dotMe4OoYI12;
        fArr[14] = f3;
        fArr[15] = fM11400dotMe4OoYI13;
        fArr[16] = fM11400dotMe4OoYI14;
        fArr[17] = fM11400dotMe4OoYI15;
        fArr[18] = fM11400dotMe4OoYI16;
        fArr[19] = f4;
    }

    /* renamed from: setToSaturation-impl */
    public static final void m11412setToSaturationimpl(float[] fArr, float f) {
        m11405resetimpl(fArr);
        float f2 = 1 - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* renamed from: setToScale-impl */
    public static final void m11413setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        m11405resetimpl(fArr);
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* renamed from: convertRgbToYuv-impl */
    public static final void m11398convertRgbToYuvimpl(float[] fArr) {
        m11405resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl */
    public static final void m11399convertYuvToRgbimpl(float[] fArr) {
        m11405resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: dot-Me4OoYI */
    private static final float m11400dotMe4OoYI(float[] fArr, float[] fArr2, int i, float[] fArr3, int i2) {
        int i3 = i * 5;
        return (fArr2[i3] * fArr3[i2]) + (fArr2[i3 + 1] * fArr3[5 + i2]) + (fArr2[i3 + 2] * fArr3[10 + i2]) + (fArr2[i3 + 3] * fArr3[15 + i2]);
    }

    /* renamed from: setToRotateRed-impl */
    public static final void m11411setToRotateRedimpl(float[] fArr, float f) {
        m11405resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    /* renamed from: setToRotateGreen-impl */
    public static final void m11410setToRotateGreenimpl(float[] fArr, float f) {
        m11405resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    /* renamed from: setToRotateBlue-impl */
    public static final void m11409setToRotateBlueimpl(float[] fArr, float f) {
        m11405resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }
}
