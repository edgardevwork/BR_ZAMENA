package com.sdkit.paylib.paylibnetwork.api.p035di;

import com.sdkit.paylib.paylibnetwork.api.domain.NetworkDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.PingInternetDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientFactory;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/api/di/PaylibNetworkTools;", "", "networkDetector", "Lcom/sdkit/paylib/paylibnetwork/api/domain/NetworkDetector;", "getNetworkDetector", "()Lcom/sdkit/paylib/paylibnetwork/api/domain/NetworkDetector;", "pingInternetDetector", "Lcom/sdkit/paylib/paylibnetwork/api/domain/PingInternetDetector;", "getPingInternetDetector", "()Lcom/sdkit/paylib/paylibnetwork/api/domain/PingInternetDetector;", "webClientFactory", "Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebClientFactory;", "getWebClientFactory", "()Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebClientFactory;", "webViewCertificateVerifier", "Lcom/sdkit/paylib/paylibnetwork/api/domain/WebViewCertificateVerifier;", "getWebViewCertificateVerifier", "()Lcom/sdkit/paylib/paylibnetwork/api/domain/WebViewCertificateVerifier;", "com-sdkit-assistant_paylib_network_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibNetworkTools {
    NetworkDetector getNetworkDetector();

    PingInternetDetector getPingInternetDetector();

    WebClientFactory getWebClientFactory();

    WebViewCertificateVerifier getWebViewCertificateVerifier();
}
