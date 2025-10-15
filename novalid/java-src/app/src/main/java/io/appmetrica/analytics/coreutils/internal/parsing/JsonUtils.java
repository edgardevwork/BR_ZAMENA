package io.appmetrica.analytics.coreutils.internal.parsing;

import com.blackhub.bronline.game.core.constants.Other;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u001f\u0010\r\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u001e\u0010\u0012\u001a\u00020\u0011*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0011H\u0007J)\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\"\u0010\u0018\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0007J\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u001cH\u0007J$\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u001dH\u0007¨\u0006\u001f"}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/parsing/JsonUtils;", "", "Lorg/json/JSONObject;", "", "key", "", Other.FALLBACK, "optLongOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "optLongOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "", "optFloatOrDefault", "optFloatOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;", "optStringOrNullable", "optStringOrNull", "", "optBooleanOrDefault", "optBooleanOrNullable", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "optBooleanOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "optJsonObjectOrDefault", "optJsonObjectOrNullable", "optJsonObjectOrNull", "value", "isEqualTo", "Lorg/json/JSONArray;", "", "optHexByteArray", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class JsonUtils {

    @NotNull
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    @JvmStatic
    public static final boolean isEqualTo(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) throws JSONException {
        boolean zEquals;
        if (!Intrinsics.areEqual(SequencesKt___SequencesKt.toSet(SequencesKt__SequencesKt.asSequence(jSONObject.keys())), SequencesKt___SequencesKt.toSet(SequencesKt__SequencesKt.asSequence(jSONObject2.keys())))) {
            return false;
        }
        for (String str : SequencesKt__SequencesKt.asSequence(jSONObject.keys())) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!(obj2 instanceof JSONObject)) {
                    return false;
                }
                zEquals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
            } else if (!(obj instanceof JSONArray)) {
                zEquals = obj.equals(obj2);
            } else {
                if (!(obj2 instanceof JSONArray)) {
                    return false;
                }
                zEquals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean optBooleanOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, boolean z) {
        Boolean boolOptBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return boolOptBooleanOrNull != null ? boolOptBooleanOrNull.booleanValue() : z;
    }

    @JvmStatic
    @Nullable
    public static final Boolean optBooleanOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final Boolean optBooleanOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable Boolean bool) {
        Boolean boolOptBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return boolOptBooleanOrNull == null ? bool : boolOptBooleanOrNull;
    }

    @JvmStatic
    public static final float optFloatOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, float f) {
        Float fOptFloatOrNull = optFloatOrNull(jSONObject, str);
        return fOptFloatOrNull != null ? fOptFloatOrNull.floatValue() : f;
    }

    @JvmStatic
    @Nullable
    public static final Float optFloatOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Float.valueOf((float) jSONObject.getDouble(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final byte[] optHexByteArray(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable byte[] bArr) {
        String strOptStringOrNull;
        byte[] bArrHexToBytes;
        if (jSONObject == null || (strOptStringOrNull = optStringOrNull(jSONObject, str)) == null) {
            return bArr;
        }
        try {
            bArrHexToBytes = StringUtils.hexToBytes(strOptStringOrNull);
        } catch (Throwable unused) {
            bArrHexToBytes = null;
        }
        return bArrHexToBytes != null ? bArrHexToBytes : bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String str, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    @JvmStatic
    @NotNull
    public static final JSONObject optJsonObjectOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, @NotNull JSONObject jSONObject2) {
        JSONObject jSONObjectOptJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return jSONObjectOptJsonObjectOrNull == null ? jSONObject2 : jSONObjectOptJsonObjectOrNull;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject optJsonObjectOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject optJsonObjectOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable JSONObject jSONObject2) {
        JSONObject jSONObjectOptJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return jSONObjectOptJsonObjectOrNull == null ? jSONObject2 : jSONObjectOptJsonObjectOrNull;
    }

    @JvmStatic
    @Nullable
    public static final Long optLongOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable Long l) {
        Long lOptLongOrNull = optLongOrNull(jSONObject, str);
        return lOptLongOrNull == null ? l : lOptLongOrNull;
    }

    @JvmStatic
    @Nullable
    public static final Long optLongOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final String optStringOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final String optStringOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable String str2) {
        String strOptStringOrNull = optStringOrNull(jSONObject, str);
        return strOptStringOrNull == null ? str2 : strOptStringOrNull;
    }

    @JvmStatic
    public static final boolean isEqualTo(@NotNull JSONArray jSONArray, @NotNull JSONArray jSONArray2) throws JSONException {
        boolean zEquals;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        Iterable iterableUntil = RangesKt___RangesKt.until(0, jSONArray.length());
        if (!(iterableUntil instanceof Collection) || !((Collection) iterableUntil).isEmpty()) {
            Iterator it = iterableUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Object obj = jSONArray.get(iNextInt);
                Object obj2 = jSONArray2.get(iNextInt);
                if (obj instanceof JSONObject) {
                    if (!(obj2 instanceof JSONObject)) {
                        return false;
                    }
                    zEquals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
                } else if (obj instanceof JSONArray) {
                    if (!(obj2 instanceof JSONArray)) {
                        return false;
                    }
                    zEquals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
                } else {
                    zEquals = obj.equals(obj2);
                }
                if (!zEquals) {
                    return false;
                }
            }
        }
        return true;
    }
}
