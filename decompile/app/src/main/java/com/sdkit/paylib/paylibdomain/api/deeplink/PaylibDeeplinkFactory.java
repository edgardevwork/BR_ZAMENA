package com.sdkit.paylib.paylibdomain.api.deeplink;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.DeeplinkDetails;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/deeplink/PaylibDeeplinkFactory;", "", "createDeeplink", "", "baseDeeplink", "deeplinkDetails", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/entity/DeeplinkDetails;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibDeeplinkFactory {
    String createDeeplink(String baseDeeplink, DeeplinkDetails deeplinkDetails);
}
