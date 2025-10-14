package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class RoundedCornersParser {
    public static final JsonReader.Options NAMES = JsonReader.Options.m963of("nm", "r", "hd");

    @Nullable
    public static RoundedCorners parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        boolean zNextBoolean = false;
        String strNextString = null;
        AnimatableFloatValue animatableFloatValue = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(NAMES);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
            } else if (iSelectName == 1) {
                animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, true);
            } else if (iSelectName == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else {
                jsonReader.skipValue();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new RoundedCorners(strNextString, animatableFloatValue);
    }
}
