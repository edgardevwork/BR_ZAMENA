package com.blackhub.bronline.game.core.extension;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* compiled from: JsonExtension.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"toDataClass", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Ljava/lang/Object;", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
