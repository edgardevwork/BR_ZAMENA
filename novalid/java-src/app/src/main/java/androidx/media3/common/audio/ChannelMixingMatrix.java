package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class ChannelMixingMatrix {
    public final float[] coefficients;
    public final int inputChannelCount;
    public final boolean isDiagonal;
    public final boolean isIdentity;
    public final boolean isZero;
    public final int outputChannelCount;

    public static ChannelMixingMatrix create(int i, int i2) {
        return new ChannelMixingMatrix(i, i2, createMixingCoefficients(i, i2));
    }

    public ChannelMixingMatrix(int i, int i2, float[] fArr) {
        boolean z = false;
        Assertions.checkArgument(i > 0, "Input channel count must be positive.");
        Assertions.checkArgument(i2 > 0, "Output channel count must be positive.");
        Assertions.checkArgument(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.inputChannelCount = i;
        this.outputChannelCount = i2;
        this.coefficients = checkCoefficientsValid(fArr);
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                float mixingCoefficient = getMixingCoefficient(i3, i4);
                boolean z5 = i3 == i4;
                if (mixingCoefficient != 1.0f && z5) {
                    z4 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z2 = false;
                    if (!z5) {
                        z3 = false;
                    }
                }
                i4++;
            }
            i3++;
        }
        this.isZero = z2;
        boolean z6 = isSquare() && z3;
        this.isDiagonal = z6;
        if (z6 && z4) {
            z = true;
        }
        this.isIdentity = z;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public float getMixingCoefficient(int i, int i2) {
        return this.coefficients[(i * this.outputChannelCount) + i2];
    }

    public boolean isZero() {
        return this.isZero;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public ChannelMixingMatrix scaleBy(float f) {
        float[] fArr = new float[this.coefficients.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i < fArr2.length) {
                fArr[i] = fArr2[i] * f;
                i++;
            } else {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
        }
    }

    public static float[] createMixingCoefficients(int i, int i2) {
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        if (i == 1 && i2 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i2 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i + "->" + i2 + " are not yet implemented.");
    }

    public static float[] initializeIdentityMatrix(int i) {
        float[] fArr = new float[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[(i * i2) + i2] = 1.0f;
        }
        return fArr;
    }

    public static float[] checkCoefficientsValid(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i + " is negative.");
            }
        }
        return fArr;
    }
}
