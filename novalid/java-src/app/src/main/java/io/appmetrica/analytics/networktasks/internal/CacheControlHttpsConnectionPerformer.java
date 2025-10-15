package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.C10083a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a */
    private final C10083a f9575a;

    /* renamed from: b */
    private final SSLSocketFactory f9576b;

    public interface Client {
        @Nullable
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(@NonNull String str, @NonNull byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(@Nullable SSLSocketFactory sSLSocketFactory) {
        this(new C10083a(), sSLSocketFactory);
    }

    public void performConnection(@NonNull String str, @NonNull Client client) {
        Response responseM7054a;
        int code;
        String str2;
        try {
            C10083a c10083a = this.f9575a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f9576b;
            c10083a.getClass();
            responseM7054a = C10083a.m7054a(oldETag, str, sSLSocketFactory);
            code = responseM7054a.getCode();
        } catch (Throwable unused) {
        }
        if (code != 200) {
            if (code != 304) {
                client.onError();
                return;
            } else {
                client.onNotModified();
                return;
            }
        }
        List list = (List) CollectionUtils.getFromMapIgnoreCase(responseM7054a.getHeaders(), "ETag");
        if (list == null || list.size() <= 0 || (str2 = (String) list.get(0)) == null) {
            str2 = "";
        }
        client.onResponse(str2, responseM7054a.getResponseData());
    }

    public CacheControlHttpsConnectionPerformer(C10083a c10083a, SSLSocketFactory sSLSocketFactory) {
        this.f9575a = c10083a;
        this.f9576b = sSLSocketFactory;
    }
}
