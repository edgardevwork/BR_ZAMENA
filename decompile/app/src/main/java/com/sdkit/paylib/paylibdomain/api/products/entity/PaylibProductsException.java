package com.sdkit.paylib.paylibdomain.api.products.entity;

import com.sdkit.paylib.paylibpayment.api.domain.entity.error.PaylibException;
import com.sdkit.paylib.paylibpayment.api.network.response.DigitalShopGeneralError;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/products/entity/PaylibProductsException;", "Lcom/sdkit/paylib/paylibpayment/api/domain/entity/error/PaylibException;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/ResponseWithCode;", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "getMeta", "()Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;", "meta", "", "c", "I", "getCode", "()I", "code", "", "d", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "e", "getErrorDescription", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "", "Lcom/sdkit/paylib/paylibpayment/api/network/response/DigitalShopGeneralError;", "f", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "errors", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibpayment/api/network/response/RequestMeta;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PaylibProductsException extends PaylibException implements ResponseWithCode {

    /* renamed from: b, reason: from kotlin metadata */
    public final RequestMeta meta;

    /* renamed from: c, reason: from kotlin metadata */
    public final int code;

    /* renamed from: d, reason: from kotlin metadata */
    public final String errorMessage;

    /* renamed from: e, reason: from kotlin metadata */
    public final String errorDescription;

    /* renamed from: f, reason: from kotlin metadata */
    public final List errors;

    public PaylibProductsException(RequestMeta requestMeta, int i, String str, String str2, List<DigitalShopGeneralError> list) {
        super(str, requestMeta != null ? requestMeta.getTraceId() : null, null);
        this.meta = requestMeta;
        this.code = i;
        this.errorMessage = str;
        this.errorDescription = str2;
        this.errors = list;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public int getCode() {
        return this.code;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public String getErrorDescription() {
        return this.errorDescription;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode
    public List<DigitalShopGeneralError> getErrors() {
        return this.errors;
    }

    @Override // com.sdkit.paylib.paylibpayment.api.network.response.BaseResponse
    public RequestMeta getMeta() {
        return this.meta;
    }
}
