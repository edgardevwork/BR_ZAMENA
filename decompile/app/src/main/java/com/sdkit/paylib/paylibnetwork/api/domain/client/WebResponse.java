package com.sdkit.paylib.paylibnetwork.api.domain.client;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebResponse;", "", "code", "", "getCode", "()I", "contentString", "", "getContentString", "()Ljava/lang/String;", ThrowableDeserializer.PROP_NAME_MESSAGE, "getMessage", "request", "Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequest;", "getRequest", "()Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebRequest;", "header", "name", "com-sdkit-assistant_paylib_network_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface WebResponse {
    int getCode();

    String getContentString();

    String getMessage();

    WebRequest getRequest();

    String header(String name);
}
