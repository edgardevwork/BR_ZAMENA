package androidx.core.content.res;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    public final float mAw;

    /* renamed from: mC */
    public final float f247mC;
    public final float mFl;
    public final float mFlRoot;

    /* renamed from: mN */
    public final float f248mN;
    public final float mNbb;
    public final float mNc;
    public final float mNcb;
    public final float[] mRgbD;

    /* renamed from: mZ */
    public final float f249mZ;

    public float getAw() {
        return this.mAw;
    }

    public float getN() {
        return this.f248mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNcb() {
        return this.mNcb;
    }

    public float getC() {
        return this.f247mC;
    }

    public float getNc() {
        return this.mNc;
    }

    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getZ() {
        return this.f249mZ;
    }

    public ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f248mN = f;
        this.mAw = f2;
        this.mNbb = f3;
        this.mNcb = f4;
        this.f247mC = f5;
        this.mNc = f6;
        this.mRgbD = fArr;
        this.mFl = f7;
        this.mFlRoot = f8;
        this.f249mZ = f9;
    }

    @NonNull
    public static ViewingConditions make(@NonNull float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fLerp = ((double) f12) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d)));
        float fYFromLStar = CamUtils.yFromLStar(f2) / fArr[1];
        double d2 = fYFromLStar;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new ViewingConditions(fYFromLStar, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fLerp, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }
}
