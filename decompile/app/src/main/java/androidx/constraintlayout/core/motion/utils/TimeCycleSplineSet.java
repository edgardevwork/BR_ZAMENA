package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public abstract class TimeCycleSplineSet {
    public static final int CURVE_OFFSET = 2;
    public static final int CURVE_PERIOD = 1;
    public static final int CURVE_VALUE = 0;
    public static final String TAG = "SplineSet";
    public static float VAL_2PI = 6.2831855f;
    public int count;
    public long last_time;
    public CurveFit mCurveFit;
    public String mType;
    public int mWaveShape = 0;
    public int[] mTimePoints = new int[10];
    public float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    public float[] mCache = new float[3];
    public boolean mContinue = false;
    public float last_cycle = Float.NaN;

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.count; i++) {
            str = str + "[" + this.mTimePoints[i] + " , " + decimalFormat.format(this.mValues[i]) + "] ";
        }
        return str;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public float calcWave(float f) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f * VAL_2PI);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * VAL_2PI);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * VAL_2PI);
        }
        return 1.0f - fAbs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setStartTime(long j) {
        this.last_time = j;
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.mTimePoints;
        int i3 = this.count;
        iArr[i3] = i;
        float[] fArr = this.mValues[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.mWaveShape = Math.max(this.mWaveShape, i2);
        this.count++;
    }

    /* loaded from: classes.dex */
    public static class CustomSet extends TimeCycleSplineSet {
        public String mAttributeName;
        public float[] mCache;
        public KeyFrameArray.CustomArray mConstraintAttributeList;
        public float[] mTempValues;
        public KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i3);
                CustomAttribute customAttributeValueAt = this.mConstraintAttributeList.valueAt(i3);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i3);
                dArr[i3] = iKeyAt * 0.01d;
                customAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    if (i4 < this.mTempValues.length) {
                        dArr2[i3][i4] = r8[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, CustomAttribute customAttribute, float f, int i2, float f2) {
            this.mConstraintAttributeList.append(i, customAttribute);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = Math.max(this.mWaveShape, i2);
        }

        public boolean setProperty(MotionWidget motionWidget, float f, long j, KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f4 = (float) ((this.last_cycle + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.last_cycle = f4;
            this.last_time = j;
            float fCalcWave = calcWave(f4);
            this.mContinue = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.mContinue;
                float f5 = this.mTempValues[i];
                this.mContinue = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fCalcWave) + f3;
                i++;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setup(int i) {
        int i2 = this.count;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.mType);
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = this.mTimePoints[i6] * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[] fArr = this.mValues[i6];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i5++;
                }
            }
        }
        this.mCurveFit = CurveFit.get(i, dArr, dArr2);
    }

    public static class Sort {
        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iPartition = partition(iArr, fArr, i4, i6);
                    iArr2[i5] = iPartition - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iPartition + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        public static int partition(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        public static void swap(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* loaded from: classes.dex */
    public static class CustomVarSet extends TimeCycleSplineSet {
        public String mAttributeName;
        public float[] mCache;
        public KeyFrameArray.CustomVar mConstraintAttributeList;
        public float[] mTempValues;
        public KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomVarSet(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i2 = iNumberOfInterpolatedValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i3);
                CustomVariable customVariableValueAt = this.mConstraintAttributeList.valueAt(i3);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i3);
                dArr[i3] = iKeyAt * 0.01d;
                customVariableValueAt.getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    if (i4 < this.mTempValues.length) {
                        dArr2[i3][i4] = r8[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, CustomVariable customVariable, float f, int i2, float f2) {
            this.mConstraintAttributeList.append(i, customVariable);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = Math.max(this.mWaveShape, i2);
        }

        public boolean setProperty(MotionWidget motionWidget, float f, long j, KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f4 = (float) ((this.last_cycle + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.last_cycle = f4;
            this.last_time = j;
            float fCalcWave = calcWave(f4);
            this.mContinue = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.mContinue;
                float f5 = this.mTempValues[i];
                this.mContinue = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fCalcWave) + f3;
                i++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }
}
