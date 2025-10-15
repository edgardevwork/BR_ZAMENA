package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.C3424L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class KeyframeParser {
    public static final float MAX_CP_VALUE = 100.0f;
    public static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache;
    public static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static JsonReader.Options NAMES = JsonReader.Options.m963of("t", "s", "e", "o", "i", "h", "to", "ti");
    public static JsonReader.Options INTERPOLATOR_NAMES = JsonReader.Options.m963of("x", "y");

    public static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new SparseArrayCompat<>();
        }
        return pathInterpolatorCache;
    }

    @Nullable
    public static WeakReference<Interpolator> getInterpolator(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (KeyframeParser.class) {
            weakReference = pathInterpolatorCache().get(i);
        }
        return weakReference;
    }

    public static void putInterpolator(int i, WeakReference<Interpolator> weakReference) {
        synchronized (KeyframeParser.class) {
            pathInterpolatorCache.put(i, weakReference);
        }
    }

    public static <T> Keyframe<T> parse(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser<T> valueParser, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return parseMultiDimensionalKeyframe(lottieComposition, jsonReader, f, valueParser);
        }
        if (z) {
            return parseKeyframe(lottieComposition, jsonReader, f, valueParser);
        }
        return parseStaticValue(jsonReader, f, valueParser);
    }

    public static <T> Keyframe<T> parseKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolatorInterpolatorFor;
        Interpolator interpolator;
        T t;
        jsonReader.beginObject();
        PointF pointFJsonToPoint = null;
        T t2 = null;
        T t3 = null;
        PointF pointFJsonToPoint2 = null;
        PointF pointFJsonToPoint3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFJsonToPoint4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t3 = valueParser.parse(jsonReader, f);
                    break;
                case 2:
                    t2 = valueParser.parse(jsonReader, f);
                    break;
                case 3:
                    pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                case 7:
                    pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolator = LINEAR_INTERPOLATOR;
            t = t3;
        } else {
            if (pointFJsonToPoint != null && pointFJsonToPoint4 != null) {
                interpolatorInterpolatorFor = interpolatorFor(pointFJsonToPoint, pointFJsonToPoint4);
            } else {
                interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            }
            interpolator = interpolatorInterpolatorFor;
            t = t2;
        }
        Keyframe<T> keyframe = new Keyframe<>(lottieComposition, t3, t, interpolator, fNextDouble, null);
        keyframe.pathCp1 = pointFJsonToPoint2;
        keyframe.pathCp2 = pointFJsonToPoint3;
        return keyframe;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> Keyframe<T> parseMultiDimensionalKeyframe(LottieComposition lottieComposition, JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        Interpolator interpolatorInterpolatorFor;
        Interpolator interpolatorInterpolatorFor2;
        Interpolator interpolatorInterpolatorFor3;
        T t;
        PointF pointF;
        Keyframe<T> keyframe;
        PointF pointF2;
        float f2;
        PointF pointF3;
        jsonReader.beginObject();
        PointF pointFJsonToPoint = null;
        boolean z = false;
        PointF pointFJsonToPoint2 = null;
        PointF pointFJsonToPoint3 = null;
        PointF pointF4 = null;
        T t2 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        float fNextDouble = 0.0f;
        PointF pointFJsonToPoint4 = null;
        T t3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    pointF2 = pointFJsonToPoint;
                    fNextDouble = (float) jsonReader.nextDouble();
                    pointFJsonToPoint = pointF2;
                    break;
                case 1:
                    pointF2 = pointFJsonToPoint;
                    t2 = valueParser.parse(jsonReader, f);
                    pointFJsonToPoint = pointF2;
                    break;
                case 2:
                    pointF2 = pointFJsonToPoint;
                    t3 = valueParser.parse(jsonReader, f);
                    pointFJsonToPoint = pointF2;
                    break;
                case 3:
                    pointF2 = pointFJsonToPoint;
                    f2 = fNextDouble;
                    PointF pointF8 = pointFJsonToPoint4;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName == 0) {
                                JsonReader.Token tokenPeek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenPeek == token) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (iSelectName == 1) {
                                JsonReader.Token tokenPeek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenPeek2 == token2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        PointF pointF10 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF5 = pointF10;
                        pointF4 = pointF9;
                        pointFJsonToPoint4 = pointF8;
                        fNextDouble = f2;
                        pointFJsonToPoint = pointF2;
                        break;
                    } else {
                        pointFJsonToPoint2 = JsonUtils.jsonToPoint(jsonReader, f);
                        fNextDouble = f2;
                        pointFJsonToPoint4 = pointF8;
                        pointFJsonToPoint = pointF2;
                    }
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float f3 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF11 = pointFJsonToPoint4;
                            int iSelectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (iSelectName2 != 0) {
                                pointF3 = pointFJsonToPoint;
                                if (iSelectName2 == 1) {
                                    JsonReader.Token tokenPeek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenPeek3 == token3) {
                                        fNextDouble8 = (float) jsonReader.nextDouble();
                                        fNextDouble = fNextDouble;
                                        f3 = fNextDouble8;
                                    } else {
                                        float f4 = fNextDouble;
                                        jsonReader.beginArray();
                                        float fNextDouble9 = (float) jsonReader.nextDouble();
                                        float fNextDouble10 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : fNextDouble9;
                                        jsonReader.endArray();
                                        fNextDouble = f4;
                                        pointFJsonToPoint4 = pointF11;
                                        pointFJsonToPoint = pointF3;
                                        fNextDouble8 = fNextDouble10;
                                        f3 = fNextDouble9;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else {
                                pointF3 = pointFJsonToPoint;
                                float f5 = fNextDouble;
                                JsonReader.Token tokenPeek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenPeek4 == token4) {
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble = f5;
                                    fNextDouble6 = fNextDouble7;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = jsonReader.peek() == token4 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                    fNextDouble = f5;
                                }
                            }
                            pointFJsonToPoint4 = pointF11;
                            pointFJsonToPoint = pointF3;
                        }
                        pointF2 = pointFJsonToPoint;
                        f2 = fNextDouble;
                        PointF pointF12 = new PointF(fNextDouble6, f3);
                        PointF pointF13 = new PointF(fNextDouble7, fNextDouble8);
                        jsonReader.endObject();
                        pointF7 = pointF13;
                        pointF6 = pointF12;
                        fNextDouble = f2;
                        pointFJsonToPoint = pointF2;
                        break;
                    } else {
                        pointF2 = pointFJsonToPoint;
                        pointFJsonToPoint3 = JsonUtils.jsonToPoint(jsonReader, f);
                        pointFJsonToPoint = pointF2;
                    }
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointFJsonToPoint4 = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                case 7:
                    pointFJsonToPoint = JsonUtils.jsonToPoint(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF14 = pointFJsonToPoint;
        float f6 = fNextDouble;
        PointF pointF15 = pointFJsonToPoint4;
        jsonReader.endObject();
        if (z) {
            interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            t = t2;
        } else {
            if (pointFJsonToPoint2 != null && pointFJsonToPoint3 != null) {
                interpolatorInterpolatorFor = interpolatorFor(pointFJsonToPoint2, pointFJsonToPoint3);
            } else {
                if (pointF4 != null && pointF5 != null && pointF6 != null && pointF7 != null) {
                    interpolatorInterpolatorFor2 = interpolatorFor(pointF4, pointF6);
                    interpolatorInterpolatorFor3 = interpolatorFor(pointF5, pointF7);
                    t = t3;
                    interpolatorInterpolatorFor = null;
                    if (interpolatorInterpolatorFor2 == null && interpolatorInterpolatorFor3 != null) {
                        pointF = pointF15;
                        keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorInterpolatorFor2, interpolatorInterpolatorFor3, f6, null);
                    } else {
                        pointF = pointF15;
                        keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorInterpolatorFor, f6, null);
                    }
                    keyframe.pathCp1 = pointF;
                    keyframe.pathCp2 = pointF14;
                    return keyframe;
                }
                interpolatorInterpolatorFor = LINEAR_INTERPOLATOR;
            }
            t = t3;
        }
        interpolatorInterpolatorFor2 = null;
        interpolatorInterpolatorFor3 = null;
        if (interpolatorInterpolatorFor2 == null) {
            pointF = pointF15;
            keyframe = new Keyframe<>(lottieComposition, t2, t, interpolatorInterpolatorFor, f6, null);
        }
        keyframe.pathCp1 = pointF;
        keyframe.pathCp2 = pointF14;
        return keyframe;
    }

    public static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = MiscUtils.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        WeakReference<Interpolator> interpolator = C3424L.getDisablePathInterpolatorCache() ? null : getInterpolator(iHashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator == null || interpolator2 == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator2 = linearInterpolator;
            if (!C3424L.getDisablePathInterpolatorCache()) {
                try {
                    putInterpolator(iHashFor, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator2;
    }

    public static <T> Keyframe<T> parseStaticValue(JsonReader jsonReader, float f, ValueParser<T> valueParser) throws IOException {
        return new Keyframe<>(valueParser.parse(jsonReader, f));
    }
}
