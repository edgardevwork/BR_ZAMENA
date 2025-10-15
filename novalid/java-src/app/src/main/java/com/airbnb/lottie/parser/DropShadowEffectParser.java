package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class DropShadowEffectParser {
    public static final JsonReader.Options DROP_SHADOW_EFFECT_NAMES = JsonReader.Options.m963of("ef");
    public static final JsonReader.Options INNER_EFFECT_NAMES = JsonReader.Options.m963of("nm", "v");
    public AnimatableColorValue color;
    public AnimatableFloatValue direction;
    public AnimatableFloatValue distance;
    public AnimatableFloatValue opacity;
    public AnimatableFloatValue radius;

    @Nullable
    public DropShadowEffect parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue animatableFloatValue4;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(DROP_SHADOW_EFFECT_NAMES) == 0) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    maybeParseInnerEffect(jsonReader, lottieComposition);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        AnimatableColorValue animatableColorValue = this.color;
        if (animatableColorValue == null || (animatableFloatValue = this.opacity) == null || (animatableFloatValue2 = this.direction) == null || (animatableFloatValue3 = this.distance) == null || (animatableFloatValue4 = this.radius) == null) {
            return null;
        }
        return new DropShadowEffect(animatableColorValue, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4);
    }

    public final void maybeParseInnerEffect(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(INNER_EFFECT_NAMES);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                strNextString.hashCode();
                switch (strNextString) {
                    case "Distance":
                        this.distance = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                        break;
                    case "Opacity":
                        this.opacity = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                        break;
                    case "Direction":
                        this.direction = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                        break;
                    case "Shadow Color":
                        this.color = AnimatableValueParser.parseColor(jsonReader, lottieComposition);
                        break;
                    case "Softness":
                        this.radius = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
