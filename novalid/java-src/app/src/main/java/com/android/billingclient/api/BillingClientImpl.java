package com.android.billingclient.api;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.core.app.BundleCompat;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.ktx.BuildConfig;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzgz;
import com.google.android.gms.internal.play_billing.zzhb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public class BillingClientImpl extends BillingClient {
    public boolean zzA;
    public ExecutorService zzB;
    public volatile int zza;
    public final String zzb;
    public final Handler zzc;

    @Nullable
    public volatile zzo zzd;
    public Context zze;
    public zzcc zzf;
    public volatile com.google.android.gms.internal.play_billing.zzs zzg;
    public volatile zzbc zzh;
    public boolean zzi;
    public boolean zzj;
    public int zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;
    public boolean zzp;
    public boolean zzq;
    public boolean zzr;
    public boolean zzs;
    public boolean zzt;
    public boolean zzu;
    public boolean zzv;
    public boolean zzw;
    public boolean zzx;
    public boolean zzy;

    @Nullable
    public PendingPurchasesParams zzz;

    public BillingClientImpl(Activity activity, PendingPurchasesParams pendingPurchasesParams, String str) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new zzbu(), str, null, null, null, null);
    }

    public static /* bridge */ /* synthetic */ zzcz zzag(BillingClientImpl billingClientImpl, String str, int i) {
        zzcz zzczVar;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, billingClientImpl.zzz.isEnabledForOneTimeProducts(), billingClientImpl.zzz.isEnabledForPrepaidPlans(), billingClientImpl.zzb);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleZzj = billingClientImpl.zzn ? billingClientImpl.zzg.zzj(true != billingClientImpl.zzv ? 9 : 19, billingClientImpl.zze.getPackageName(), str, string, bundleZzc) : billingClientImpl.zzg.zzi(3, billingClientImpl.zze.getPackageName(), str, string);
                zzda zzdaVarZza = zzdb.zza(bundleZzj, "BillingClient", "getPurchase()");
                BillingResult billingResultZza = zzdaVarZza.zza();
                if (billingResultZza != zzce.zzl) {
                    billingClientImpl.zzap(zzcb.zza(zzdaVarZza.zzb(), 9, billingResultZza));
                    return new zzcz(billingResultZza, list);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i2))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        BillingResult billingResult = zzce.zzj;
                        billingClientImpl.zzap(zzcb.zza(51, 9, billingResult));
                        zzczVar = new zzcz(billingResult, null);
                        return zzczVar;
                    }
                }
                if (z) {
                    billingClientImpl.zzap(zzcb.zza(26, 9, zzce.zzj));
                }
                string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    zzczVar = new zzcz(zzce.zzl, arrayList);
                    break;
                }
                list = null;
            } catch (Exception e2) {
                BillingResult billingResult2 = zzce.zzm;
                billingClientImpl.zzap(zzcb.zza(52, 9, billingResult2));
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzcz(billingResult2, null);
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    public static String zzan() {
        try {
            return (String) BuildConfig.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return com.android.billingclient.BuildConfig.VERSION_NAME;
        }
    }

    public static /* bridge */ /* synthetic */ zzbt zzg(BillingClientImpl billingClientImpl, String str) {
        zzbt zzbtVar;
        Bundle bundleZzh;
        zzda zzdaVarZza;
        BillingResult billingResultZza;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleZzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, billingClientImpl.zzz.isEnabledForOneTimeProducts(), billingClientImpl.zzz.isEnabledForPrepaidPlans(), billingClientImpl.zzb);
        String string = null;
        while (billingClientImpl.zzl) {
            try {
                bundleZzh = billingClientImpl.zzg.zzh(6, billingClientImpl.zze.getPackageName(), str, string, bundleZzc);
                zzdaVarZza = zzdb.zza(bundleZzh, "BillingClient", "getPurchaseHistory()");
                billingResultZza = zzdaVarZza.zza();
            } catch (RemoteException e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchase history, try to reconnect", e);
                BillingResult billingResult = zzce.zzm;
                billingClientImpl.zzap(zzcb.zza(59, 11, billingResult));
                zzbtVar = new zzbt(billingResult, null);
            }
            if (billingResultZza != zzce.zzl) {
                billingClientImpl.zzap(zzcb.zza(zzdaVarZza.zzb(), 11, billingResultZza));
                return new zzbt(billingResultZza, null);
            }
            ArrayList<String> stringArrayList = bundleZzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundleZzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundleZzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            boolean z = false;
            for (int i = 0; i < stringArrayList2.size(); i++) {
                String str2 = stringArrayList2.get(i);
                String str3 = stringArrayList3.get(i);
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                try {
                    PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                    if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                        z = true;
                    }
                    arrayList.add(purchaseHistoryRecord);
                } catch (JSONException e2) {
                    com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e2);
                    BillingResult billingResult2 = zzce.zzj;
                    billingClientImpl.zzap(zzcb.zza(51, 11, billingResult2));
                    zzbtVar = new zzbt(billingResult2, null);
                }
            }
            if (z) {
                billingClientImpl.zzap(zzcb.zza(26, 11, zzce.zzj));
            }
            string = bundleZzh.getString("INAPP_CONTINUATION_TOKEN");
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            if (TextUtils.isEmpty(string)) {
                zzbtVar = new zzbt(zzce.zzl, arrayList);
                return zzbtVar;
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzbt(zzce.zzq, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = zzce.zzi;
            zzap(zzcb.zza(26, 3, billingResult2));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.zzn) {
            BillingResult billingResult3 = zzce.zzb;
            zzap(zzcb.zza(27, 3, billingResult3));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzu
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzk(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzR(acknowledgePurchaseResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 3, billingResultZzal));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultZzal);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (zzao(new Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzl(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzT(consumeResponseListener, consumeParams);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 4, billingResultZzal));
            consumeResponseListener.onConsumeResponse(billingResultZzal, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
        } else {
            if (!this.zzx) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = zzce.zzE;
                zzap(zzcb.zza(66, 15, billingResult2));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
                return;
            }
            if (zzao(new Callable() { // from class: com.android.billingclient.api.zzz
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzq(alternativeBillingOnlyReportingDetailsListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaa
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzU(alternativeBillingOnlyReportingDetailsListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 15, billingResultZzal));
                alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultZzal, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 24, billingResult));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
        } else {
            if (!this.zzy) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = zzce.zzy;
                zzap(zzcb.zza(103, 24, billingResult2));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
                return;
            }
            if (zzao(new Callable() { // from class: com.android.billingclient.api.zzab
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzr(externalOfferReportingDetailsListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzV(externalOfferReportingDetailsListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 24, billingResultZzal));
                externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultZzal, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        zzaq(zzcb.zzc(12));
        try {
            try {
                if (this.zzd != null) {
                    this.zzd.zzf();
                }
                if (this.zzh != null) {
                    this.zzh.zzc();
                }
                if (this.zzh != null && this.zzg != null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unbinding from service.");
                    this.zze.unbindService(this.zzh);
                    this.zzh = null;
                }
                this.zzg = null;
                ExecutorService executorService = this.zzB;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.zzB = null;
                }
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "There was an exception while ending connection!", e);
            }
            this.zza = 3;
        } catch (Throwable th) {
            this.zza = 3;
            throw th;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzi
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.zzu) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = zzce.zzA;
            zzap(zzcb.zza(32, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        String str = this.zzb;
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (zzao(new Callable() { // from class: com.android.billingclient.api.zzw
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzm(bundle, billingConfigResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzW(billingConfigResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 13, billingResultZzal));
            billingConfigResponseListener.onBillingConfigResponse(billingResultZzal, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    public final void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable zzc zzcVar, String str, @Nullable zzcc zzccVar) {
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.zze.getPackageName());
        if (zzccVar != null) {
            this.zzf = zzccVar;
        } else {
            this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzo(this.zze, purchasesUpdatedListener, null, zzcVar, null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = zzcVar != null;
        this.zze.getPackageName();
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        } else {
            if (!this.zzx) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
                BillingResult billingResult2 = zzce.zzE;
                zzap(zzcb.zza(66, 14, billingResult2));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult2);
                return;
            }
            if (zzao(new Callable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzs(alternativeBillingOnlyAvailabilityListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzag
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzX(alternativeBillingOnlyAvailabilityListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 14, billingResultZzal));
                alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultZzal);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 23, billingResult));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        } else {
            if (!this.zzy) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
                BillingResult billingResult2 = zzce.zzy;
                zzap(zzcb.zza(103, 23, billingResult2));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult2);
                return;
            }
            if (zzao(new Callable() { // from class: com.android.billingclient.api.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzt(externalOfferAvailabilityListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzar
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzY(externalOfferAvailabilityListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 23, billingResultZzal));
                externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultZzal);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d5  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BillingResult isFeatureSupported(String str) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            if (billingResult.getResponseCode() != 0) {
                zzap(zzcb.zza(2, 5, billingResult));
            } else {
                zzaq(zzcb.zzc(5));
            }
            return billingResult;
        }
        int i = zzce.zzG;
        switch (str) {
            case "subscriptions":
                BillingResult billingResult2 = this.zzi ? zzce.zzl : zzce.zzo;
                zzau(billingResult2, 9, 2);
                return billingResult2;
            case "subscriptionsUpdate":
                BillingResult billingResult3 = this.zzj ? zzce.zzl : zzce.zzp;
                zzau(billingResult3, 10, 3);
                return billingResult3;
            case "priceChangeConfirmation":
                BillingResult billingResult4 = this.zzm ? zzce.zzl : zzce.zzr;
                zzau(billingResult4, 35, 4);
                return billingResult4;
            case "bbb":
                BillingResult billingResult5 = this.zzp ? zzce.zzl : zzce.zzw;
                zzau(billingResult5, 30, 5);
                return billingResult5;
            case "aaa":
                BillingResult billingResult6 = this.zzr ? zzce.zzl : zzce.zzs;
                zzau(billingResult6, 31, 6);
                return billingResult6;
            case "ddd":
                BillingResult billingResult7 = this.zzq ? zzce.zzl : zzce.zzu;
                zzau(billingResult7, 21, 7);
                return billingResult7;
            case "ccc":
                BillingResult billingResult8 = this.zzs ? zzce.zzl : zzce.zzt;
                zzau(billingResult8, 19, 8);
                return billingResult8;
            case "eee":
                BillingResult billingResult9 = this.zzs ? zzce.zzl : zzce.zzt;
                zzau(billingResult9, 61, 9);
                return billingResult9;
            case "fff":
                BillingResult billingResult10 = this.zzt ? zzce.zzl : zzce.zzv;
                zzau(billingResult10, 20, 10);
                return billingResult10;
            case "ggg":
                BillingResult billingResult11 = this.zzu ? zzce.zzl : zzce.zzA;
                zzau(billingResult11, 32, 11);
                return billingResult11;
            case "hhh":
                BillingResult billingResult12 = this.zzu ? zzce.zzl : zzce.zzB;
                zzau(billingResult12, 33, 12);
                return billingResult12;
            case "iii":
                BillingResult billingResult13 = this.zzw ? zzce.zzl : zzce.zzD;
                zzau(billingResult13, 60, 13);
                return billingResult13;
            case "jjj":
                BillingResult billingResult14 = this.zzx ? zzce.zzl : zzce.zzE;
                zzau(billingResult14, 66, 14);
                return billingResult14;
            case "kkk":
                BillingResult billingResult15 = this.zzy ? zzce.zzl : zzce.zzy;
                zzau(billingResult15, 103, 18);
                return billingResult15;
            default:
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unsupported feature: ".concat(str));
                BillingResult billingResult16 = zzce.zzz;
                zzau(billingResult16, 34, 1);
                return billingResult16;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:373:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0481 A[Catch: Exception -> 0x0491, CancellationException -> 0x0493, TimeoutException -> 0x0495, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0493, TimeoutException -> 0x0495, Exception -> 0x0491, blocks: (B:403:0x0481, B:411:0x0497, B:413:0x04ab, B:416:0x04c7, B:418:0x04d3), top: B:432:0x047f }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0497 A[Catch: Exception -> 0x0491, CancellationException -> 0x0493, TimeoutException -> 0x0495, TryCatch #4 {CancellationException -> 0x0493, TimeoutException -> 0x0495, Exception -> 0x0491, blocks: (B:403:0x0481, B:411:0x0497, B:413:0x04ab, B:416:0x04c7, B:418:0x04d3), top: B:432:0x047f }] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        final String productId;
        final String productType;
        String str;
        String str2;
        Future futureZzao;
        int i;
        boolean z;
        String str3;
        SkuDetails skuDetails;
        BillingFlowParams.ProductDetailsParams productDetailsParams;
        String str4;
        String str5;
        String str6;
        boolean z2;
        Intent intent;
        String str7;
        int i2;
        final int i3;
        BillingFlowParams.ProductDetailsParams productDetailsParams2;
        final BillingClientImpl billingClientImpl = this;
        if (billingClientImpl.zzd == null || billingClientImpl.zzd.zzd() == null) {
            BillingResult billingResult = zzce.zzF;
            billingClientImpl.zzap(zzcb.zza(12, 2, billingResult));
            return billingResult;
        }
        if (!isReady()) {
            BillingResult billingResult2 = zzce.zzm;
            billingClientImpl.zzap(zzcb.zza(2, 2, billingResult2));
            billingClientImpl.zzak(billingResult2);
            return billingResult2;
        }
        ArrayList<SkuDetails> arrayListZzf = billingFlowParams.zzf();
        List listZzg = billingFlowParams.zzg();
        SkuDetails skuDetails2 = (SkuDetails) com.google.android.gms.internal.play_billing.zzan.zza(arrayListZzf, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzan.zza(listZzg, null);
        if (skuDetails2 != null) {
            productId = skuDetails2.getSku();
            productType = skuDetails2.getType();
        } else {
            productId = productDetailsParams3.zza().getProductId();
            productType = productDetailsParams3.zza().getProductType();
        }
        if (productType.equals("subs") && !billingClientImpl.zzi) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support subscriptions.");
            BillingResult billingResult3 = zzce.zzo;
            billingClientImpl.zzap(zzcb.zza(9, 2, billingResult3));
            billingClientImpl.zzak(billingResult3);
            return billingResult3;
        }
        if (billingFlowParams.zzp() && !billingClientImpl.zzl) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support extra params for buy intent.");
            BillingResult billingResult4 = zzce.zzh;
            billingClientImpl.zzap(zzcb.zza(18, 2, billingResult4));
            billingClientImpl.zzak(billingResult4);
            return billingResult4;
        }
        if (arrayListZzf.size() > 1 && !billingClientImpl.zzs) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support multi-item purchases.");
            BillingResult billingResult5 = zzce.zzt;
            billingClientImpl.zzap(zzcb.zza(19, 2, billingResult5));
            billingClientImpl.zzak(billingResult5);
            return billingResult5;
        }
        if (!listZzg.isEmpty() && !billingClientImpl.zzt) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            BillingResult billingResult6 = zzce.zzv;
            billingClientImpl.zzap(zzcb.zza(20, 2, billingResult6));
            billingClientImpl.zzak(billingResult6);
            return billingResult6;
        }
        if (billingClientImpl.zzl) {
            boolean z3 = billingClientImpl.zzn;
            boolean z4 = billingClientImpl.zzv;
            boolean zIsEnabledForOneTimeProducts = billingClientImpl.zzz.isEnabledForOneTimeProducts();
            boolean zIsEnabledForPrepaidPlans = billingClientImpl.zzz.isEnabledForPrepaidPlans();
            boolean z5 = billingClientImpl.zzA;
            str = "BUY_INTENT";
            String str8 = billingClientImpl.zzb;
            final Bundle bundle = new Bundle();
            final String str9 = productType;
            bundle.putString("playBillingLibraryVersion", str8);
            if (billingFlowParams.zza() != 0) {
                bundle.putInt("prorationMode", billingFlowParams.zza());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzb())) {
                bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzb());
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzc())) {
                bundle.putString("obfuscatedProfileId", billingFlowParams.zzc());
            }
            if (billingFlowParams.zzo()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(billingFlowParams.zzd())) {
                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzd());
            }
            String str10 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle.putString("originalExternalTransactionId", billingFlowParams.zze());
                str10 = null;
            }
            if (!TextUtils.isEmpty(str10)) {
                bundle.putString("paymentsPurchaseParams", str10);
            }
            if (z3 && zIsEnabledForOneTimeProducts) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && zIsEnabledForPrepaidPlans) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (arrayListZzf.isEmpty()) {
                str3 = "proxyPackageVersion";
                skuDetails = skuDetails2;
                productDetailsParams = productDetailsParams3;
                str4 = productId;
                str5 = "BillingClient";
                ArrayList<String> arrayList = new ArrayList<>(listZzg.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listZzg.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                for (int i4 = 0; i4 < listZzg.size(); i4++) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams4 = (BillingFlowParams.ProductDetailsParams) listZzg.get(i4);
                    ProductDetails productDetailsZza = productDetailsParams4.zza();
                    if (!productDetailsZza.zzb().isEmpty()) {
                        arrayList3.add(productDetailsZza.zzb());
                    }
                    arrayList4.add(productDetailsParams4.zzb());
                    if (!TextUtils.isEmpty(productDetailsZza.zzc())) {
                        arrayList5.add(productDetailsZza.zzc());
                    }
                    if (i4 > 0) {
                        arrayList.add(((BillingFlowParams.ProductDetailsParams) listZzg.get(i4)).zza().getProductId());
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) listZzg.get(i4)).zza().getProductType());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<String> arrayList7 = new ArrayList<>();
                str4 = productId;
                ArrayList<String> arrayList8 = new ArrayList<>();
                str3 = "proxyPackageVersion";
                ArrayList<Integer> arrayList9 = new ArrayList<>();
                str5 = "BillingClient";
                ArrayList<String> arrayList10 = new ArrayList<>();
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (SkuDetails skuDetails3 : arrayListZzf) {
                    if (skuDetails3.zzf().isEmpty()) {
                        productDetailsParams2 = productDetailsParams3;
                    } else {
                        productDetailsParams2 = productDetailsParams3;
                        arrayList6.add(skuDetails3.zzf());
                    }
                    String strZzc = skuDetails3.zzc();
                    SkuDetails skuDetails4 = skuDetails2;
                    String strZzb = skuDetails3.zzb();
                    int iZza = skuDetails3.zza();
                    String strZze = skuDetails3.zze();
                    arrayList7.add(strZzc);
                    z6 |= !TextUtils.isEmpty(strZzc);
                    arrayList8.add(strZzb);
                    z7 |= !TextUtils.isEmpty(strZzb);
                    arrayList9.add(Integer.valueOf(iZza));
                    z8 |= iZza != 0;
                    z9 |= !TextUtils.isEmpty(strZze);
                    arrayList10.add(strZze);
                    productDetailsParams3 = productDetailsParams2;
                    skuDetails2 = skuDetails4;
                }
                skuDetails = skuDetails2;
                productDetailsParams = productDetailsParams3;
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z6) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z7) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z8) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z9) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (arrayListZzf.size() > 1) {
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayListZzf.size() - 1);
                    ArrayList<String> arrayList12 = new ArrayList<>(arrayListZzf.size() - 1);
                    for (int i5 = 1; i5 < arrayListZzf.size(); i5++) {
                        arrayList11.add(((SkuDetails) arrayListZzf.get(i5)).getSku());
                        arrayList12.add(((SkuDetails) arrayListZzf.get(i5)).getType());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList12);
                }
            }
            billingClientImpl = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !billingClientImpl.zzq) {
                BillingResult billingResult7 = zzce.zzu;
                billingClientImpl.zzap(zzcb.zza(21, 2, billingResult7));
                billingClientImpl.zzak(billingResult7);
                return billingResult7;
            }
            if (skuDetails != null && !TextUtils.isEmpty(skuDetails.zzd())) {
                bundle.putString("skuPackageName", skuDetails.zzd());
            } else if (productDetailsParams == null || TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                str6 = null;
                z2 = false;
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("accountName", str6);
                }
                intent = activity.getIntent();
                if (intent != null) {
                    str2 = str5;
                    com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Activity's intent is null.");
                } else {
                    str2 = str5;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str7 = str3;
                        } catch (PackageManager.NameNotFoundException unused) {
                            str7 = str3;
                        }
                        try {
                            bundle.putString(str7, billingClientImpl.zze.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            bundle.putString(str7, "package not found");
                            if (billingClientImpl.zzt) {
                            }
                            if (futureZzao != null) {
                            }
                        }
                    }
                }
                if (billingClientImpl.zzt && !listZzg.isEmpty()) {
                    i2 = 17;
                } else if (!billingClientImpl.zzr && z2) {
                    i2 = 15;
                } else if (billingClientImpl.zzn) {
                    i2 = 6;
                } else {
                    i3 = 9;
                    final String str11 = str4;
                    futureZzao = zzao(new Callable() { // from class: com.android.billingclient.api.zzas
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzc(i3, str11, str9, billingFlowParams, bundle);
                        }
                    }, 5000L, null, billingClientImpl.zzc);
                    i = 78;
                }
                i3 = i2;
                final String str112 = str4;
                futureZzao = zzao(new Callable() { // from class: com.android.billingclient.api.zzas
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzc(i3, str112, str9, billingFlowParams, bundle);
                    }
                }, 5000L, null, billingClientImpl.zzc);
                i = 78;
            } else {
                bundle.putString("skuPackageName", productDetailsParams.zza().zza());
            }
            str6 = null;
            z2 = true;
            if (!TextUtils.isEmpty(str6)) {
            }
            intent = activity.getIntent();
            if (intent != null) {
            }
            if (billingClientImpl.zzt) {
                if (!billingClientImpl.zzr) {
                    if (billingClientImpl.zzn) {
                    }
                }
            }
        } else {
            str = "BUY_INTENT";
            str2 = "BillingClient";
            futureZzao = zzao(new Callable() { // from class: com.android.billingclient.api.zzr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzd(productId, productType);
                }
            }, 5000L, null, billingClientImpl.zzc);
            i = 80;
        }
        try {
            if (futureZzao != null) {
                BillingResult billingResult8 = zzce.zzm;
                billingClientImpl.zzap(zzcb.zza(25, 2, billingResult8));
                billingClientImpl.zzak(billingResult8);
                return billingResult8;
            }
            Bundle bundle2 = (Bundle) futureZzao.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle2, str2);
            String strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle2, str2);
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str12 = str;
                intent2.putExtra(str12, (PendingIntent) bundle2.getParcelable(str12));
                activity.startActivity(intent2);
                return zzce.zzl;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Unable to buy item, Error response code: " + iZzb);
            BillingResult billingResultZza = zzce.zza(iZzb, strZzg);
            if (bundle2 != null) {
                i = 23;
            }
            billingClientImpl.zzap(zzcb.zza(i, 2, billingResultZza));
            billingClientImpl.zzak(billingResultZza);
            return billingResultZza;
        } catch (CancellationException e) {
            e = e;
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            BillingResult billingResult9 = zzce.zzn;
            billingClientImpl.zzap(zzcb.zza(4, 2, billingResult9));
            billingClientImpl.zzak(billingResult9);
            return billingResult9;
        } catch (TimeoutException e2) {
            e = e2;
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            BillingResult billingResult92 = zzce.zzn;
            billingClientImpl.zzap(zzcb.zza(4, 2, billingResult92));
            billingClientImpl.zzak(billingResult92);
            return billingResult92;
        } catch (Exception e3) {
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Exception while launching billing flow. Try to reconnect", e3);
            BillingResult billingResult10 = zzce.zzm;
            billingClientImpl.zzap(zzcb.zza(5, 2, billingResult10));
            billingClientImpl.zzak(billingResult10);
            return billingResult10;
        }
    }

    public final int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 7, billingResult));
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.zzt) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = zzce.zzv;
                zzap(zzcb.zza(20, 7, billingResult2));
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (zzao(new Callable() { // from class: com.android.billingclient.api.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzn(queryProductDetailsParams, productDetailsResponseListener);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzao
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzZ(productDetailsResponseListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 7, billingResultZzal));
                productDetailsResponseListener.onProductDetailsResponse(billingResultZzal, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzas(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 8, billingResult));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = zzce.zzf;
            zzap(zzcb.zza(49, 8, billingResult2));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = zzce.zze;
            zzap(zzcb.zza(48, 8, billingResult3));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (zzao(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzac
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzo(this.zzb, this.zzc, null, this.zzd);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzad
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzac(skuDetailsResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 8, billingResultZzal));
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultZzal, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            return zzce.zzm;
        }
        if (!this.zzp) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzce.zzw;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzb);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        final zzaw zzawVar = new zzaw(this, this.zzc, inAppMessageResponseListener);
        zzao(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzp(bundle, activity, zzawVar);
                return null;
            }
        }, 5000L, null, this.zzc);
        return zzce.zzl;
    }

    public final void startConnection(long j) {
        zzbu zzbuVar = new zzbu(j);
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(zzcb.zzc(6));
            zzbuVar.onBillingSetupFinished(zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            BillingResult billingResult = zzce.zzd;
            zzap(zzcb.zza(37, 6, billingResult));
            zzbuVar.onBillingSetupFinished(billingResult);
            return;
        }
        if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            BillingResult billingResult2 = zzce.zzm;
            zzap(zzcb.zza(38, 6, billingResult2));
            zzbuVar.onBillingSetupFinished(billingResult2);
            return;
        }
        this.zza = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.zzh = new zzbc(this, zzbuVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.zza = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        BillingResult billingResult3 = zzce.zzc;
        zzap(zzcb.zza(i, 6, billingResult3));
        zzbuVar.onBillingSetupFinished(billingResult3);
    }

    public final /* synthetic */ void zzR(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 3, billingResult));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public final /* synthetic */ void zzS(BillingResult billingResult) {
        if (this.zzd.zzd() != null) {
            this.zzd.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public final /* synthetic */ void zzT(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 4, billingResult));
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public final /* synthetic */ void zzU(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 15, billingResult));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final /* synthetic */ void zzV(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 24, billingResult));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ void zzW(BillingConfigResponseListener billingConfigResponseListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 13, billingResult));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public final /* synthetic */ void zzX(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 14, billingResult));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final /* synthetic */ void zzY(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 23, billingResult));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final /* synthetic */ void zzZ(ProductDetailsResponseListener productDetailsResponseListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 7, billingResult));
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
    }

    public final /* synthetic */ void zzaa(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 11, billingResult));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
    }

    public final /* synthetic */ void zzab(PurchasesResponseListener purchasesResponseListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 9, billingResult));
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzai.zzk());
    }

    public final /* synthetic */ void zzac(SkuDetailsResponseListener skuDetailsResponseListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 8, billingResult));
        skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
    }

    public final /* synthetic */ void zzad(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 16, billingResult));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final /* synthetic */ void zzae(ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        BillingResult billingResult = zzce.zzn;
        zzap(zzcb.zza(24, 25, billingResult));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final Handler zzaj() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    public final BillingResult zzak(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS(billingResult);
            }
        });
        return billingResult;
    }

    public final BillingResult zzal() {
        return (this.zza == 0 || this.zza == 3) ? zzce.zzm : zzce.zzj;
    }

    public final String zzam(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zze.getPackageName();
        }
        return null;
    }

    @Nullable
    public final Future zzao(Callable callable, long j, @Nullable final Runnable runnable, Handler handler) {
        if (this.zzB == null) {
            this.zzB = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new zzat(this));
        }
        try {
            final Future futureSubmit = this.zzB.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public final void zzap(zzga zzgaVar) {
        this.zzf.zzb(zzgaVar, this.zzk);
    }

    public final void zzaq(zzge zzgeVar) {
        this.zzf.zzd(zzgeVar, this.zzk);
    }

    public final void zzar(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 11, billingResult));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (zzao(new zzav(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaa(purchaseHistoryResponseListener);
            }
        }, zzaj()) == null) {
            BillingResult billingResultZzal = zzal();
            zzap(zzcb.zza(25, 11, billingResultZzal));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultZzal, null);
        }
    }

    public final void zzas(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 9, billingResult));
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid product type.");
                BillingResult billingResult2 = zzce.zzg;
                zzap(zzcb.zza(50, 9, billingResult2));
                purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            if (zzao(new zzau(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzab(purchasesResponseListener);
                }
            }, zzaj()) == null) {
                BillingResult billingResultZzal = zzal();
                zzap(zzcb.zza(25, 9, billingResultZzal));
                purchasesResponseListener.onQueryPurchasesResponse(billingResultZzal, com.google.android.gms.internal.play_billing.zzai.zzk());
            }
        }
    }

    public final boolean zzat() {
        return this.zzv && this.zzz.isEnabledForPrepaidPlans();
    }

    public final void zzau(BillingResult billingResult, int i, int i2) {
        zzge zzgeVar = null;
        zzga zzgaVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i3 = zzcb.zza;
            try {
                zzgd zzgdVarZzy = zzge.zzy();
                zzgdVarZzy.zzm(5);
                zzgz zzgzVarZzy = zzhb.zzy();
                zzgzVarZzy.zzl(i2);
                zzgdVarZzy.zzl((zzhb) zzgzVarZzy.zzf());
                zzgeVar = (zzge) zzgdVarZzy.zzf();
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            }
            zzaq(zzgeVar);
            return;
        }
        int i4 = zzcb.zza;
        try {
            zzfz zzfzVarZzy = zzga.zzy();
            zzgg zzggVarZzy = zzgk.zzy();
            zzggVarZzy.zzn(billingResult.getResponseCode());
            zzggVarZzy.zzm(billingResult.getDebugMessage());
            zzggVarZzy.zzo(i);
            zzfzVarZzy.zzl(zzggVarZzy);
            zzfzVarZzy.zzn(5);
            zzgz zzgzVarZzy2 = zzhb.zzy();
            zzgzVarZzy2.zzl(i2);
            zzfzVarZzy.zzm((zzhb) zzgzVarZzy2.zzf());
            zzgaVar = (zzga) zzfzVarZzy.zzf();
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e2);
        }
        zzap(zzgaVar);
    }

    public final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzg.zzg(i, this.zze.getPackageName(), str, str2, null, bundle);
    }

    public final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzg.zzf(3, this.zze.getPackageName(), str, str2, null);
    }

    public final /* synthetic */ Object zzk(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleZzd = zzsVar.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzce.zza(com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzd, "BillingClient")));
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error acknowledge purchase!", e);
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(28, 3, billingResult));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return null;
        }
    }

    public final /* synthetic */ Object zzl(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int iZza;
        String strZzg;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleZze = zzsVar.zze(9, packageName, purchaseToken, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZze, "BillingClient");
            } else {
                iZza = this.zzg.zza(3, this.zze.getPackageName(), purchaseToken);
                strZzg = "";
            }
            BillingResult billingResultZza = zzce.zza(iZza, strZzg);
            if (iZza == 0) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
                return null;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
            zzap(zzcb.zza(23, 4, billingResultZza));
            consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error consuming purchase!", e);
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(29, 4, billingResult));
            consumeResponseListener.onConsumeResponse(billingResult, purchaseToken);
            return null;
        }
    }

    public final /* synthetic */ Object zzm(Bundle bundle, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        try {
            this.zzg.zzp(18, this.zze.getPackageName(), bundle, new zzbk(billingConfigResponseListener, this.zzf, this.zzk, null));
        } catch (DeadObjectException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e);
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(62, 13, billingResult));
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
        } catch (Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got an exception.", e2);
            BillingResult billingResult2 = zzce.zzj;
            zzap(zzcb.zza(62, 13, billingResult2));
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0123, code lost:
    
        r12 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object zzn(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String strZzg;
        int iZzb;
        int i;
        int i2;
        com.google.android.gms.internal.play_billing.zzs zzsVar;
        int i3;
        String packageName;
        Bundle bundle;
        com.google.android.gms.internal.play_billing.zzai zzaiVar;
        ArrayList arrayList = new ArrayList();
        String strZzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzai zzaiVarZza = queryProductDetailsParams.zza();
        int size = zzaiVarZza.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                strZzg = "";
                iZzb = 0;
                break;
            }
            int i5 = i4 + 20;
            ArrayList arrayList2 = new ArrayList(zzaiVarZza.subList(i4, i5 > size ? size : i5));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i6)).zza());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle2.putString("playBillingLibraryVersion", this.zzb);
            try {
                zzsVar = this.zzg;
                i3 = true != this.zzw ? 17 : 20;
                packageName = this.zze.getPackageName();
                boolean zZzat = zzat();
                String str = this.zzb;
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", str);
                bundle.putBoolean("enablePendingPurchases", true);
                bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zZzat) {
                    bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                zzaiVar = zzaiVarZza;
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i7 < size3) {
                    QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i7);
                    ArrayList arrayList6 = arrayList2;
                    arrayList4.add(null);
                    z |= !TextUtils.isEmpty(null);
                    String strZzb2 = product.zzb();
                    int i8 = size3;
                    if (strZzb2.equals("first_party")) {
                        com.google.android.gms.internal.play_billing.zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z2 = true;
                    }
                    i7++;
                    size3 = i8;
                    arrayList2 = arrayList6;
                }
                if (z) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z2 && !TextUtils.isEmpty(null)) {
                    bundle.putString("accountName", null);
                }
                i2 = 7;
            } catch (Exception e) {
                e = e;
                i = 6;
                i2 = 7;
            }
            try {
                Bundle bundleZzl = zzsVar.zzl(i3, packageName, strZzb, bundle2, bundle);
                strZzg = "Item is unavailable for purchase.";
                if (bundleZzl == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                    zzap(zzcb.zza(44, 7, zzce.zzC));
                    break;
                }
                if (bundleZzl.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                        zzap(zzcb.zza(46, 7, zzce.zzC));
                        break;
                    }
                    for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                        try {
                            ProductDetails productDetails = new ProductDetails(stringArrayList.get(i9));
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                            arrayList.add(productDetails);
                        } catch (JSONException e2) {
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e2);
                            strZzg = "Error trying to decode SkuDetails.";
                            i = 6;
                            zzap(zzcb.zza(47, 7, zzce.zza(6, "Error trying to decode SkuDetails.")));
                            iZzb = i;
                            productDetailsResponseListener.onProductDetailsResponse(zzce.zza(iZzb, strZzg), arrayList);
                            return null;
                        }
                    }
                    i4 = i5;
                    zzaiVarZza = zzaiVar;
                } else {
                    iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzl, "BillingClient");
                    strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzl, "BillingClient");
                    if (iZzb != 0) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                        zzap(zzcb.zza(23, 7, zzce.zza(iZzb, strZzg)));
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                        zzap(zzcb.zza(45, 7, zzce.zza(6, strZzg)));
                        iZzb = 6;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                i = 6;
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                zzap(zzcb.zza(43, i2, zzce.zzj));
                strZzg = "An internal error occurred.";
                iZzb = i;
                productDetailsResponseListener.onProductDetailsResponse(zzce.zza(iZzb, strZzg), arrayList);
                return null;
            }
        }
        productDetailsResponseListener.onProductDetailsResponse(zzce.zza(iZzb, strZzg), arrayList);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00a3, code lost:
    
        r4 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object zzo(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        String strZzg;
        int i;
        Bundle bundleZzk;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strZzg = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                    String packageName = this.zze.getPackageName();
                    int i4 = this.zzk;
                    boolean zIsEnabledForOneTimeProducts = this.zzz.isEnabledForOneTimeProducts();
                    boolean zZzat = zzat();
                    String str3 = this.zzb;
                    Bundle bundle2 = new Bundle();
                    if (i4 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str3);
                    }
                    if (i4 >= 9 && zIsEnabledForOneTimeProducts) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zZzat) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    bundleZzk = zzsVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    bundleZzk = this.zzg.zzk(3, this.zze.getPackageName(), str, bundle);
                }
                strZzg = "Item is unavailable for purchase.";
                if (bundleZzk == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                    zzap(zzcb.zza(44, 8, zzce.zzC));
                    break;
                }
                if (bundleZzk.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                        zzap(zzcb.zza(46, 8, zzce.zzC));
                        break;
                    }
                    for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                            arrayList.add(skuDetails);
                        } catch (JSONException e) {
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                            strZzg = "Error trying to decode SkuDetails.";
                            zzap(zzcb.zza(47, 8, zzce.zza(6, "Error trying to decode SkuDetails.")));
                            i = 6;
                            arrayList = null;
                            skuDetailsResponseListener.onSkuDetailsResponse(zzce.zza(i, strZzg), arrayList);
                            return null;
                        }
                    }
                    i2 = i3;
                } else {
                    int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundleZzk, "BillingClient");
                    strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundleZzk, "BillingClient");
                    if (iZzb != 0) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + iZzb);
                        zzap(zzcb.zza(23, 8, zzce.zza(iZzb, strZzg)));
                        i = iZzb;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        zzap(zzcb.zza(45, 8, zzce.zza(6, strZzg)));
                        i = 6;
                    }
                }
            } catch (Exception e2) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                zzap(zzcb.zza(43, 8, zzce.zzm));
                strZzg = "Service connection is disconnected.";
                i = -1;
            }
        }
        skuDetailsResponseListener.onSkuDetailsResponse(zzce.zza(i, strZzg), arrayList);
        return null;
    }

    public final /* synthetic */ Object zzp(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.zzg.zzt(12, this.zze.getPackageName(), bundle, new zzbs(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    public final /* synthetic */ Void zzq(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzm(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbe(alternativeBillingOnlyReportingDetailsListener, this.zzf, this.zzk, null));
        } catch (Exception unused) {
            BillingResult billingResult = zzce.zzj;
            zzap(zzcb.zza(70, 15, billingResult));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
        }
        return null;
    }

    public final /* synthetic */ Void zzr(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        try {
            this.zzg.zzn(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbg(externalOfferReportingDetailsListener, this.zzf, this.zzk, null));
        } catch (Exception e) {
            BillingResult billingResult = zzce.zzj;
            zzap(zzcb.zzb(94, 24, billingResult, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
        }
        return null;
    }

    public final /* synthetic */ Void zzs(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws Exception {
        try {
            this.zzg.zzr(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbo(alternativeBillingOnlyAvailabilityListener, this.zzf, this.zzk, null));
        } catch (Exception unused) {
            BillingResult billingResult = zzce.zzj;
            zzap(zzcb.zza(69, 14, billingResult));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final /* synthetic */ Void zzt(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        try {
            this.zzg.zzs(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbq(externalOfferAvailabilityListener, this.zzf, this.zzk, null));
        } catch (Exception e) {
            BillingResult billingResult = zzce.zzj;
            zzap(zzcb.zzb(91, 23, billingResult, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
        }
        return null;
    }

    public final /* synthetic */ Void zzu(Activity activity, ResultReceiver resultReceiver, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws Exception {
        try {
            this.zzg.zzo(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbi(new WeakReference(activity), resultReceiver, null));
        } catch (Exception unused) {
            BillingResult billingResult = zzce.zzj;
            zzap(zzcb.zza(74, 16, billingResult));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
        }
        return null;
    }

    public final /* synthetic */ Void zzv(Activity activity, ResultReceiver resultReceiver, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws Exception {
        try {
            this.zzg.zzq(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new zzbm(new WeakReference(activity), resultReceiver, null));
        } catch (Exception e) {
            BillingResult billingResult = zzce.zzj;
            zzap(zzcb.zzb(98, 25, billingResult, String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzas(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzg
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 16, billingResult));
            return billingResult;
        }
        if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = zzce.zzE;
            zzap(zzcb.zza(66, 16, billingResult2));
            return billingResult2;
        }
        final zzax zzaxVar = new zzax(this, this.zzc, alternativeBillingOnlyInformationDialogListener);
        if (zzao(new Callable() { // from class: com.android.billingclient.api.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzu(activity, zzaxVar, alternativeBillingOnlyInformationDialogListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzad(alternativeBillingOnlyInformationDialogListener);
            }
        }, this.zzc) != null) {
            return zzce.zzl;
        }
        BillingResult billingResultZzal = zzal();
        zzap(zzcb.zza(25, 16, billingResultZzal));
        return billingResultZzal;
    }

    @Override // com.android.billingclient.api.BillingClient
    @zzh
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = zzce.zzm;
            zzap(zzcb.zza(2, 25, billingResult));
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = zzce.zzy;
            zzap(zzcb.zza(103, 25, billingResult2));
            return billingResult2;
        }
        final zzay zzayVar = new zzay(this, this.zzc, externalOfferInformationDialogListener);
        if (zzao(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.zzv(activity, zzayVar, externalOfferInformationDialogListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzae(externalOfferInformationDialogListener);
            }
        }, this.zzc) != null) {
            return zzce.zzl;
        }
        BillingResult billingResultZzal = zzal();
        zzap(zzcb.zza(25, 25, billingResultZzal));
        return billingResultZzal;
    }

    @AnyThread
    public BillingClientImpl(Context context, PendingPurchasesParams pendingPurchasesParams, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable zzcc zzccVar, @Nullable ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, (zzcc) null);
    }

    public BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, Context context, @Nullable zzcc zzccVar, @Nullable ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        String strZzan = zzan();
        this.zzb = strZzan;
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(strZzan);
        zzgtVarZzy.zzm(this.zze.getPackageName());
        this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        this.zze.getPackageName();
    }

    public final void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, @Nullable UserChoiceBillingListener userChoiceBillingListener, String str, @Nullable zzcc zzccVar) {
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(str);
        zzgtVarZzy.zzm(this.zze.getPackageName());
        if (zzccVar != null) {
            this.zzf = zzccVar;
        } else {
            this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzo(this.zze, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = userChoiceBillingListener != null;
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzck zzckVar, @Nullable zzcc zzccVar, @Nullable ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzan();
        this.zze = context.getApplicationContext();
        zzgt zzgtVarZzy = zzgu.zzy();
        zzgtVarZzy.zzn(zzan());
        zzgtVarZzy.zzm(this.zze.getPackageName());
        this.zzf = new zzch(this.zze, (zzgu) zzgtVarZzy.zzf());
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new zzo(this.zze, null, null, null, null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zze.getPackageName();
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable zzc zzcVar, @Nullable zzcc zzccVar, @Nullable ExecutorService executorService) {
        String strZzan = zzan();
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = strZzan;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, (zzc) null, strZzan, (zzcc) null);
    }

    @AnyThread
    public BillingClientImpl(@Nullable String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, @Nullable UserChoiceBillingListener userChoiceBillingListener, @Nullable zzcc zzccVar, @Nullable ExecutorService executorService) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, zzan(), null, userChoiceBillingListener, null, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(zzcb.zzc(6));
            billingClientStateListener.onBillingSetupFinished(zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            BillingResult billingResult = zzce.zzd;
            zzap(zzcb.zza(37, 6, billingResult));
            billingClientStateListener.onBillingSetupFinished(billingResult);
            return;
        }
        if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            BillingResult billingResult2 = zzce.zzm;
            zzap(zzcb.zza(38, 6, billingResult2));
            billingClientStateListener.onBillingSetupFinished(billingResult2);
            return;
        }
        this.zza = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.zzh = new zzbc(this, billingClientStateListener, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.zza = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        BillingResult billingResult3 = zzce.zzc;
        zzap(zzcb.zza(i, 6, billingResult3));
        billingClientStateListener.onBillingSetupFinished(billingResult3);
    }
}
