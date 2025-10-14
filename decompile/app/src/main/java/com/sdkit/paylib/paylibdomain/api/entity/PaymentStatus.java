package com.sdkit.paylib.paylibdomain.api.entity;

import com.blackhub.bronline.launcher.LauncherConstants;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/entity/PaymentStatus;", "", "(Ljava/lang/String;I)V", "SUCCESS", "CANCELLED", LauncherConstants.ERROR_KEY, "TIMEOUT", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public enum PaymentStatus {
    SUCCESS,
    CANCELLED,
    ERROR,
    TIMEOUT
}
