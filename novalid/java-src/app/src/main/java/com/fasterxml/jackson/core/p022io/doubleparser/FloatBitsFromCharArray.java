package com.fasterxml.jackson.core.p022io.doubleparser;

/* loaded from: classes6.dex */
public class FloatBitsFromCharArray extends AbstractFloatingPointBitsFromCharArray {
    @Override // com.fasterxml.jackson.core.p022io.doubleparser.AbstractFloatingPointBitsFromCharArray
    public long nan() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // com.fasterxml.jackson.core.p022io.doubleparser.AbstractFloatingPointBitsFromCharArray
    public long negativeInfinity() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.p022io.doubleparser.AbstractFloatingPointBitsFromCharArray
    public long positiveInfinity() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // com.fasterxml.jackson.core.p022io.doubleparser.AbstractFloatingPointBitsFromCharArray
    public long valueOfFloatLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        return Float.isNaN(FastFloatMath.decFloatLiteralToFloat(z, j, i3, z2, i4)) ? Float.floatToRawIntBits(Float.parseFloat(new String(cArr, i, i2 - i))) : Float.floatToRawIntBits(r4);
    }

    @Override // com.fasterxml.jackson.core.p022io.doubleparser.AbstractFloatingPointBitsFromCharArray
    public long valueOfHexLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) throws NumberFormatException {
        float fHexFloatLiteralToFloat = FastFloatMath.hexFloatLiteralToFloat(z, j, i3, z2, i4);
        if (Float.isNaN(fHexFloatLiteralToFloat)) {
            fHexFloatLiteralToFloat = Float.parseFloat(new String(cArr, i, i2 - i));
        }
        return Float.floatToRawIntBits(fHexFloatLiteralToFloat);
    }
}
