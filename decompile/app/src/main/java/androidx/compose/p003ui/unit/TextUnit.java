package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextUnit.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010 J\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010 J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m7105d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", TtmlNode.TAG_DIV, "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", ScriptTagPayloadReader.KEY_TIMES, "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class TextUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* renamed from: box-impl */
    public static final /* synthetic */ TextUnit m13847boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: constructor-impl */
    public static long m13849constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl */
    public static boolean m13853equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).getPackedValue();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m13854equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl */
    public static final long m13855getRawTypeimpl(long j) {
        return j & ZipEightByteInteger.BYTE_4_MASK;
    }

    /* renamed from: hashCode-impl */
    public static int m13858hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m13853equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m13858hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: unaryMinus-XSAIIZE */
    public static final long m13865unaryMinusXSAIIZE(long j) {
        TextUnitKt.m13870checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m13855getRawTypeimpl(j), -m13857getValueimpl(j));
    }

    /* renamed from: div-kPz2Gy4 */
    public static final long m13851divkPz2Gy4(long j, float f) {
        TextUnitKt.m13870checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m13855getRawTypeimpl(j), m13857getValueimpl(j) / f);
    }

    /* renamed from: div-kPz2Gy4 */
    public static final long m13850divkPz2Gy4(long j, double d) {
        TextUnitKt.m13870checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m13855getRawTypeimpl(j), (float) (m13857getValueimpl(j) / d));
    }

    /* renamed from: div-kPz2Gy4 */
    public static final long m13852divkPz2Gy4(long j, int i) {
        TextUnitKt.m13870checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m13855getRawTypeimpl(j), m13857getValueimpl(j) / i);
    }

    /* renamed from: times-kPz2Gy4 */
    public static final long m13862timeskPz2Gy4(long j, float f) {
        TextUnitKt.m13870checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m13855getRawTypeimpl(j), m13857getValueimpl(j) * f);
    }

    /* renamed from: times-kPz2Gy4 */
    public static final long m13861timeskPz2Gy4(long j, double d) {
        TextUnitKt.m13870checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m13855getRawTypeimpl(j), (float) (m13857getValueimpl(j) * d));
    }

    /* renamed from: times-kPz2Gy4 */
    public static final long m13863timeskPz2Gy4(long j, int i) {
        TextUnitKt.m13870checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m13855getRawTypeimpl(j), m13857getValueimpl(j) * i);
    }

    /* renamed from: compareTo--R2X_6o */
    public static final int m13848compareToR2X_6o(long j, long j2) {
        TextUnitKt.m13871checkArithmeticNB67dxo(j, j2);
        return Float.compare(m13857getValueimpl(j), m13857getValueimpl(j2));
    }

    @NotNull
    public String toString() {
        return m13864toStringimpl(this.packedValue);
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m13864toStringimpl(long j) {
        long jM13856getTypeUIouoOA = m13856getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m13885equalsimpl0(jM13856getTypeUIouoOA, companion.m13891getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m13885equalsimpl0(jM13856getTypeUIouoOA, companion.m13890getSpUIouoOA())) {
            return m13857getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m13885equalsimpl0(jM13856getTypeUIouoOA, companion.m13889getEmUIouoOA())) {
            return "Invalid";
        }
        return m13857getValueimpl(j) + ".em";
    }

    /* compiled from: TextUnit.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m7105d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations */
        public static /* synthetic */ void m13867getUnspecifiedXSAIIZE$annotations() {
        }

        private Companion() {
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE */
        public final long m13868getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m13882boximpl(companion.m13891getUnspecifiedUIouoOA()), TextUnitType.m13882boximpl(companion.m13890getSpUIouoOA()), TextUnitType.m13882boximpl(companion.m13889getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    /* renamed from: getType-UIouoOA */
    public static final long m13856getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m13855getRawTypeimpl(j) >>> 32)].getType();
    }

    /* renamed from: isSp-impl */
    public static final boolean m13860isSpimpl(long j) {
        return m13855getRawTypeimpl(j) == 4294967296L;
    }

    /* renamed from: isEm-impl */
    public static final boolean m13859isEmimpl(long j) {
        return m13855getRawTypeimpl(j) == 8589934592L;
    }

    /* renamed from: getValue-impl */
    public static final float m13857getValueimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
