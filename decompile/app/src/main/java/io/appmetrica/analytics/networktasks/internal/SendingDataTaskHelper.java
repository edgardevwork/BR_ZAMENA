package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.p046io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes5.dex */
public class SendingDataTaskHelper {

    /* renamed from: a */
    private final RequestBodyEncrypter f9615a;

    /* renamed from: b */
    private final Compressor f9616b;

    /* renamed from: c */
    private final TimeProvider f9617c;

    /* renamed from: d */
    private final RequestDataHolder f9618d;

    /* renamed from: e */
    private final ResponseDataHolder f9619e;

    /* renamed from: f */
    private final NetworkResponseHandler f9620f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f9620f.handle(this.f9619e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f9618d.applySendTime(this.f9617c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f9616b.compress(bArr);
            if (bArrCompress == null || (bArrEncrypt = this.f9615a.encrypt(bArrCompress)) == null) {
                return false;
            }
            this.f9618d.setPostData(bArrEncrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f9615a = requestBodyEncrypter;
        this.f9616b = compressor;
        this.f9617c = timeProvider;
        this.f9618d = requestDataHolder;
        this.f9619e = responseDataHolder;
        this.f9620f = networkResponseHandler;
    }
}
