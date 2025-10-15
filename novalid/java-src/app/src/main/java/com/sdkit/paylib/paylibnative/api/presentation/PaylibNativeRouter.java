package com.sdkit.paylib.paylibnative.api.presentation;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResult;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000eH&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeRouter;", "", "changePaymentMethod", "", "purchaseId", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "launchPaylib", "invoiceId", "purchaseApplication", "params", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibPurchaseApplicationParams;", "purchaseProduct", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibPurchaseParams;", "resultObserver", "Lkotlinx/coroutines/flow/Flow;", "Lcom/sdkit/paylib/paylibnative/api/entity/PaylibResult;", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibNativeRouter {
    void changePaymentMethod(String purchaseId);

    void changePaymentMethod(String purchaseId, Activity activity);

    void launchPaylib(String invoiceId);

    void purchaseApplication(PaylibPurchaseApplicationParams params);

    void purchaseApplication(PaylibPurchaseApplicationParams params, Activity activity);

    void purchaseProduct(PaylibPurchaseParams params);

    void purchaseProduct(PaylibPurchaseParams params, Activity activity);

    Flow<PaylibResult> resultObserver();
}
