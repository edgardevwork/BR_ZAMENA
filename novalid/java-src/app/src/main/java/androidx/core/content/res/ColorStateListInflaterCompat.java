package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.C2171R;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class ColorStateListInflaterCompat {
    public static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();

    @Nullable
    public static ColorStateList inflate(@NonNull Resources resources, @XmlRes int i, @Nullable Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return createFromXmlInner(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        return inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        Resources resources2 = resources;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAppend = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = obtainAttributes(resources2, theme, attributeSet, C2171R.styleable.ColorStateListItem);
                int i3 = C2171R.styleable.ColorStateListItem_android_color;
                int resourceId = typedArrayObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1 && !isColorInt(resources2, resourceId)) {
                    try {
                        color = createFromXml(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayObtainAttributes.getColor(C2171R.styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i3, -65281);
                }
                int i4 = C2171R.styleable.ColorStateListItem_android_alpha;
                float f2 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(i4)) {
                    f2 = typedArrayObtainAttributes.getFloat(i4, 1.0f);
                } else {
                    int i5 = C2171R.styleable.ColorStateListItem_alpha;
                    if (typedArrayObtainAttributes.hasValue(i5)) {
                        f2 = typedArrayObtainAttributes.getFloat(i5, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i6 = C2171R.styleable.ColorStateListItem_android_lStar;
                    if (typedArrayObtainAttributes.hasValue(i6)) {
                        f = typedArrayObtainAttributes.getFloat(i6, -1.0f);
                    } else {
                        f = typedArrayObtainAttributes.getFloat(C2171R.styleable.ColorStateListItem_lStar, -1.0f);
                    }
                    typedArrayObtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i7 = 0;
                    for (int i8 = 0; i8 < attributeCount; i8++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C2171R.attr.alpha && attributeNameResource != C2171R.attr.lStar) {
                            int i9 = i7 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i7] = attributeNameResource;
                            i7 = i9;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i7);
                    iArrAppend = GrowingArrayUtils.append(iArrAppend, i2, modulateColorAlpha(color, f2, f));
                    iArr = (int[][]) GrowingArrayUtils.append(iArr, i2, iArrTrimStateSet);
                    i2++;
                }
            }
            i = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArrAppend, 0, iArr3, 0, i2);
        System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }

    public static boolean isColorInt(@NonNull Resources resources, @ColorRes int i) throws Resources.NotFoundException {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        return i2 >= 28 && i2 <= 31;
    }

    @NonNull
    public static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @ColorInt
    public static int modulateColorAlpha(@ColorInt int i, @FloatRange(from = 0.0d, m9to = 1.0d) float f, @FloatRange(from = 0.0d, m9to = 100.0d) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iClamp = MathUtils.clamp((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            CamColor camColorFromColor = CamColor.fromColor(i);
            i = CamColor.toColor(camColorFromColor.getHue(), camColorFromColor.getChroma(), f2);
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (iClamp << 24);
    }
}
