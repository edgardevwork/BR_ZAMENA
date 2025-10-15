package com.sdkit.paylib.paylibpayment.impl.utls;

import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventKeys;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebRequest;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.C8584a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.utls.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8588b {
    /* renamed from: a */
    public static final String m4655a(WebRequest webRequest) {
        String str;
        Intrinsics.checkNotNullParameter(webRequest, "<this>");
        Map<String, String> headers = webRequest.getHeaders();
        if (headers == null || (str = headers.get(UpgradeObjectEventKeys.EVENT_UPGRADE_PRICE_THREE_KEY)) == null) {
            return null;
        }
        return C8584a.f5782c.m4647a(str);
    }
}
