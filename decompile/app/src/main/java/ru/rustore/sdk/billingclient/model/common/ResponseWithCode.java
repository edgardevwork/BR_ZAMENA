package ru.rustore.sdk.billingclient.model.common;

import java.util.List;
import kotlin.Metadata;
import ru.rustore.sdk.activitylauncher.ActivityLauncherAnalytics;

@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/common/ResponseWithCode;", "Lru/rustore/sdk/billingclient/model/common/BaseResponse;", "code", "", "getCode", "()I", ActivityLauncherAnalytics.ERROR_DESCRIPTION, "", "getErrorDescription", "()Ljava/lang/String;", "errorMessage", "getErrorMessage", "errors", "", "Lru/rustore/sdk/billingclient/model/common/DigitalShopGeneralError;", "getErrors", "()Ljava/util/List;", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface ResponseWithCode extends BaseResponse {
    int getCode();

    String getErrorDescription();

    String getErrorMessage();

    List<DigitalShopGeneralError> getErrors();
}
