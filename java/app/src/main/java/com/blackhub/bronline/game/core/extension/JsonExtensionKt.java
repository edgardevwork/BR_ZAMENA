package com.blackhub.bronline.game.core.extension;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* compiled from: JsonExtension.kt */

public final class JsonExtensionKt {
    public static final /* synthetic */ <T> T toDataClass(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        try {
            Gson gson = new Gson();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String string2 = StringsKt__StringsKt.trim((CharSequence) string).toString();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) gson.fromJson(string2, (Class) Object.class);
        } catch (Exception e) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log(e.toString());
            firebaseCrashlytics.recordException(e);
            return null;
        }
    }
}

