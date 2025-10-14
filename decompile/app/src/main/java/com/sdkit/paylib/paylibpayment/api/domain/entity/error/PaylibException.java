package com.sdkit.paylib.paylibpayment.api.domain.entity.error;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B%\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PaylibException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/TraceIdContainer;", "", "a", "Ljava/lang/String;", "getTraceId", "()Ljava/lang/String;", "traceId", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class PaylibException extends Exception implements TraceIdContainer {

    /* renamed from: a, reason: from kotlin metadata */
    public final String traceId;

    public PaylibException(String str, String str2, Throwable th) {
        super(str, th);
        this.traceId = str2;
    }

    public String getTraceId() {
        return this.traceId;
    }
}
