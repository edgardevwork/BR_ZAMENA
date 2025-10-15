package com.blackhub.bronline.game.core.extension;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.exifinterface.media.ExifInterface;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonArrayExtension.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u001d\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005*\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b*\u00020\n\u001a\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u0003\u001a\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f*\u00020\u0003\u001a\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\f\"\u0004\b\u0000\u0010\u0005*\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\f*\u00020\u0003¨\u0006\u0013"}, m7105d2 = {"toAnyList", "", "", "Lorg/json/JSONArray;", "toDataClassList", ExifInterface.GPS_DIRECTION_TRUE, "toList", "toMap", "", "", "Lorg/json/JSONObject;", "toMutableAnnotatedStringList", "", "Landroidx/compose/ui/text/AnnotatedString;", "toMutableAnyList", "toMutableIntList", "", "toMutableList", "toMutableStringList", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nJsonArrayExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 2 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n*L\n1#1,134:1\n8#2,9:135\n*S KotlinDebug\n*F\n+ 1 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n*L\n55#1:135,9\n*E\n"})
/* loaded from: classes2.dex */
public final class JsonArrayExtensionKt {
    @NotNull
    public static final List<Integer> toMutableIntList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (AnyExtensionKt.isNotNull(jSONArray.getString(i))) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<String> toMutableStringList(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (AnyExtensionKt.isNotNull(jSONArray.getString(i))) {
                String string = jSONArray.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<AnnotatedString> toMutableAnnotatedStringList(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (AnyExtensionKt.isNotNull(jSONArray.getString(i))) {
                String string = jSONArray.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(StringExtensionKt.htmlTextToAnnotatedString(string));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Object> toMutableAnyList(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (AnyExtensionKt.isNotNull(jSONArray.get(i))) {
                Object obj = jSONArray.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <T> List<T> toDataClassList(JSONArray jSONArray) throws JSONException {
        Object objFromJson;
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNull(jSONObject);
                try {
                    Gson gson = new Gson();
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    String string2 = StringsKt__StringsKt.trim((CharSequence) string).toString();
                    Intrinsics.reifiedOperationMarker(4, "T?");
                    objFromJson = gson.fromJson(string2, (Class<Object>) Object.class);
                } catch (Exception e) {
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    firebaseCrashlytics.log(e.toString());
                    firebaseCrashlytics.recordException(e);
                    objFromJson = null;
                }
                if (objFromJson != null) {
                    arrayList.add(objFromJson);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics2.log(e2.toString());
            firebaseCrashlytics2.recordException(e2);
            return null;
        }
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object map = jSONObject.get(next);
                Intrinsics.checkNotNullExpressionValue(map, "get(...)");
                if (map instanceof JSONArray) {
                    map = toAnyList((JSONArray) map);
                } else if (map instanceof JSONObject) {
                    map = toMap((JSONObject) map);
                }
                linkedHashMap.put(next, map);
            }
            return linkedHashMap;
        } catch (JSONException e) {
            UtilsKt.crashlyticsRecordNewException("JSONObject.toMap() throw JSONException: " + e);
            return MapsKt__MapsKt.emptyMap();
        }
    }

    @NotNull
    public static final List<Object> toAnyList(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object map = jSONArray.get(i);
                Intrinsics.checkNotNullExpressionValue(map, "get(...)");
                if (map instanceof JSONArray) {
                    map = toAnyList((JSONArray) map);
                } else if (map instanceof JSONObject) {
                    map = toMap((JSONObject) map);
                }
                arrayList.add(map);
            }
            return arrayList;
        } catch (JSONException e) {
            UtilsKt.crashlyticsRecordNewException("JSONObject.toAnyList() throw JSONException: " + e);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final <T> List<T> toList(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (AnyExtensionKt.isNotNull(jSONArray.getString(i))) {
                    arrayList.add(jSONArray.get(i));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> toMutableList(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (AnyExtensionKt.isNotNull(jSONArray.getString(i))) {
                    arrayList.add(jSONArray.get(i));
                }
            }
        }
        return arrayList;
    }
}
