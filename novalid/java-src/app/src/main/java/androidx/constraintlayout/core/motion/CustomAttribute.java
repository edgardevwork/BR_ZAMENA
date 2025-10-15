package androidx.constraintlayout.core.motion;

import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public class CustomAttribute {
    public static final String TAG = "TransitionLayout";
    public boolean mBooleanValue;
    public int mColorValue;
    public float mFloatValue;
    public int mIntegerValue;
    public boolean mMethod;
    public String mName;
    public String mStringValue;
    public AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int i2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int i3 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i4 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i5 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i5 << 16) + (i4 << 8) + i2) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 1) {
            return ((i3 << 16) + (i5 << 8) + i2) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 2) {
            return ((i2 << 16) + (i5 << 8) + i4) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 3) {
            return ((i2 << 16) + (i3 << 8) + i5) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i == 4) {
            return ((i4 << 16) + (i2 << 8) + i5) | ViewCompat.MEASURED_STATE_MASK;
        }
        if (i != 5) {
            return 0;
        }
        return ((i5 << 16) + (i2 << 8) + i3) | ViewCompat.MEASURED_STATE_MASK;
    }

    public AttributeType getType() {
        return this.mType;
    }

    /* renamed from: androidx.constraintlayout.core.motion.CustomAttribute$1 */
    public static /* synthetic */ class C21281 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType */
        public static final /* synthetic */ int[] f192xbc2a0812;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f192xbc2a0812 = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f192xbc2a0812[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f192xbc2a0812[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f192xbc2a0812[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f192xbc2a0812[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f192xbc2a0812[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f192xbc2a0812[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f192xbc2a0812[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public boolean isContinuous() {
        int i = C21281.f192xbc2a0812[this.mType.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public void setFloatValue(float f) {
        this.mFloatValue = f;
    }

    public void setColorValue(int i) {
        this.mColorValue = i;
    }

    public void setIntValue(int i) {
        this.mIntegerValue = i;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public int numberOfInterpolatedValues() {
        int i = C21281.f192xbc2a0812[this.mType.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    public float getValueToInterpolate() {
        switch (C21281.f192xbc2a0812[this.mType.ordinal()]) {
            case 2:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.mIntegerValue;
            case 7:
                return this.mFloatValue;
            case 8:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (C21281.f192xbc2a0812[this.mType.ordinal()]) {
            case 2:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = (this.mColorValue >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 6:
                fArr[0] = this.mIntegerValue;
                return;
            case 7:
                fArr[0] = this.mFloatValue;
                return;
            case 8:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        switch (C21281.f192xbc2a0812[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 2:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iHsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = iHsvToRgb;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (iHsvToRgb & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 7:
                this.mFloatValue = fArr[0];
                return;
            case 8:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute == null || (attributeType = this.mType) != customAttribute.mType) {
            return false;
        }
        switch (C21281.f192xbc2a0812[attributeType.ordinal()]) {
            case 1:
            case 6:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case 2:
                return this.mBooleanValue == customAttribute.mBooleanValue;
            case 3:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case 4:
            case 5:
                return this.mColorValue == customAttribute.mColorValue;
            case 7:
                return this.mFloatValue == customAttribute.mFloatValue;
            case 8:
                return this.mFloatValue == customAttribute.mFloatValue;
            default:
                return false;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z;
        setValue(obj);
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (C21281.f192xbc2a0812[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case 2:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.mStringValue = (String) obj;
                break;
            case 4:
            case 5:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case 7:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case 8:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }
}
