package com.sdkit.paylib.paylibnative.api.presentation;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeDeeplinkRouter;", "", "finishPaylib", "", "deeplink", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibNativeDeeplinkRouter {
    void finishPaylib(String deeplink);

    void finishPaylib(String deeplink, Activity activity);
}
