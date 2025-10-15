package io.appmetrica.analytics.coreapi.internal.data;

import androidx.exifinterface.media.ExifInterface;
import io.appmetrica.analytics.coreapi.internal.data.Parser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0005"}, m7105d2 = {"Lio/appmetrica/analytics/coreapi/internal/data/JsonParser;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/appmetrica/analytics/coreapi/internal/data/Parser;", "Lorg/json/JSONObject;", "core-api_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface JsonParser<T> extends Parser<JSONObject, T> {

    @Metadata(m7106k = 3, m7107mv = {1, 6, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        @Nullable
        public static <T> T parseOrNull(@NotNull JsonParser<? extends T> jsonParser, @NotNull JSONObject jSONObject) {
            return (T) Parser.DefaultImpls.parseOrNull(jsonParser, jSONObject);
        }
    }
}
