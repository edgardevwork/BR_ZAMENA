package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.blackhub.bronline.game.gui.admintools.AdminToolsKeys;
import com.blackhub.bronline.game.gui.bprewards.BpRewardsKeys;
import com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardKeys;
import java.io.IOException;

/* loaded from: classes.dex */
public class ContentModelParser {
    public static final JsonReader.Options NAMES = JsonReader.Options.m963of("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ContentModel parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ContentModel contentModel;
        String strNextString;
        char c = 1;
        jsonReader.beginObject();
        int iNextInt = 2;
        while (true) {
            contentModel = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            int iSelectName = jsonReader.selectName(NAMES);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
                break;
            }
            if (iSelectName == 1) {
                iNextInt = jsonReader.nextInt();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                if (!strNextString.equals(BpRewardsKeys.ID_FOR_IMAGES_EL_KEY)) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 3270:
                if (!strNextString.equals(BpRewardsKeys.LIST_OF_ALARMS_FOR_BUTTONS_KEY)) {
                }
                break;
            case 3295:
                if (strNextString.equals("gf")) {
                    c = 2;
                    break;
                }
                break;
            case 3307:
                if (strNextString.equals("gr")) {
                    c = 3;
                    break;
                }
                break;
            case 3308:
                if (strNextString.equals("gs")) {
                    c = 4;
                    break;
                }
                break;
            case 3488:
                if (strNextString.equals(HalloweenAwardKeys.HALLOWEEN_AWARD_MONEY_KEY)) {
                    c = 5;
                    break;
                }
                break;
            case 3633:
                if (strNextString.equals("rc")) {
                    c = 6;
                    break;
                }
                break;
            case 3634:
                if (strNextString.equals("rd")) {
                    c = 7;
                    break;
                }
                break;
            case 3646:
                if (strNextString.equals("rp")) {
                    c = '\b';
                    break;
                }
                break;
            case 3669:
                if (strNextString.equals("sh")) {
                    c = '\t';
                    break;
                }
                break;
            case 3679:
                if (strNextString.equals("sr")) {
                    c = '\n';
                    break;
                }
                break;
            case 3681:
                if (strNextString.equals("st")) {
                    c = 11;
                    break;
                }
                break;
            case 3705:
                if (strNextString.equals("tm")) {
                    c = '\f';
                    break;
                }
                break;
            case 3710:
                if (strNextString.equals(AdminToolsKeys.ADMIN_TOOLS_PLAYER_TEXT_REPORT_KEY)) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                contentModel = CircleShapeParser.parse(jsonReader, lottieComposition, iNextInt);
                break;
            case 1:
                contentModel = ShapeFillParser.parse(jsonReader, lottieComposition);
                break;
            case 2:
                contentModel = GradientFillParser.parse(jsonReader, lottieComposition);
                break;
            case 3:
                contentModel = ShapeGroupParser.parse(jsonReader, lottieComposition);
                break;
            case 4:
                contentModel = GradientStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case 5:
                contentModel = MergePathsParser.parse(jsonReader);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModel = RectangleShapeParser.parse(jsonReader, lottieComposition);
                break;
            case 7:
                contentModel = RoundedCornersParser.parse(jsonReader, lottieComposition);
                break;
            case '\b':
                contentModel = RepeaterParser.parse(jsonReader, lottieComposition);
                break;
            case '\t':
                contentModel = ShapePathParser.parse(jsonReader, lottieComposition);
                break;
            case '\n':
                contentModel = PolystarShapeParser.parse(jsonReader, lottieComposition, iNextInt);
                break;
            case 11:
                contentModel = ShapeStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case '\f':
                contentModel = ShapeTrimPathParser.parse(jsonReader, lottieComposition);
                break;
            case '\r':
                contentModel = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                Logger.warning("Unknown shape type " + strNextString);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModel;
    }
}
