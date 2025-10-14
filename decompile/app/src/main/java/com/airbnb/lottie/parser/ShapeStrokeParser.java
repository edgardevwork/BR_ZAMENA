package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public class ShapeStrokeParser {
    public static final JsonReader.Options NAMES = JsonReader.Options.m963of("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    public static final JsonReader.Options DASH_PATTERN_NAMES = JsonReader.Options.m963of("n", "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ShapeStroke parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableFloatValue animatableFloatValue;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        String strNextString = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatableColorValue color = null;
        AnimatableFloatValue animatableFloatValue3 = null;
        AnimatableIntegerValue integer = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    color = AnimatableValueParser.parseColor(jsonReader, lottieComposition);
                    break;
                case 2:
                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    break;
                case 3:
                    integer = AnimatableValueParser.parseInteger(jsonReader, lottieComposition);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        animatableFloatValue = null;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(DASH_PATTERN_NAMES);
                            if (iSelectName == 0) {
                                strNextString2 = jsonReader.nextString();
                            } else if (iSelectName == 1) {
                                animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            } else {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.hashCode();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                lottieComposition.setHasDashPattern(true);
                                arrayList.add(animatableFloatValue);
                                break;
                            case "o":
                                animatableFloatValue2 = animatableFloatValue;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((AnimatableFloatValue) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new ShapeStroke(strNextString, animatableFloatValue2, arrayList, color, integer == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : integer, animatableFloatValue3, lineCapType == null ? ShapeStroke.LineCapType.BUTT : lineCapType, lineJoinType == null ? ShapeStroke.LineJoinType.MITER : lineJoinType, fNextDouble, zNextBoolean);
    }
}
