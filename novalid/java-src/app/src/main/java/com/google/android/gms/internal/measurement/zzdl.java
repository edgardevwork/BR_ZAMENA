package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes7.dex */
public final class zzdl extends zzbu implements zzdj {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeLong(j);
        zzb(23, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzbw.zza(parcelM1087a_, bundle);
        zzb(9, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeLong(j);
        zzb(43, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeLong(j);
        zzb(24, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void generateEventId(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(22, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getAppInstanceId(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(20, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCachedAppInstanceId(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(19, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getConditionalUserProperties(String str, String str2, zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(10, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenClass(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(17, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getCurrentScreenName(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(16, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getGmpAppId(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(21, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getMaxUserProperties(String str, zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(6, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getSessionId(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(46, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getTestFlag(zzdo zzdoVar, int i) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        parcelM1087a_.writeInt(i);
        zzb(38, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void getUserProperties(String str, String str2, boolean z, zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzbw.zza(parcelM1087a_, z);
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(5, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void initForTests(Map map) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeMap(map);
        zzb(37, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void initialize(IObjectWrapper iObjectWrapper, zzdw zzdwVar, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        zzbw.zza(parcelM1087a_, zzdwVar);
        parcelM1087a_.writeLong(j);
        zzb(1, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void isDataCollectionEnabled(zzdo zzdoVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdoVar);
        zzb(40, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzbw.zza(parcelM1087a_, bundle);
        zzbw.zza(parcelM1087a_, z);
        zzbw.zza(parcelM1087a_, z2);
        parcelM1087a_.writeLong(j);
        zzb(2, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdo zzdoVar, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzbw.zza(parcelM1087a_, bundle);
        zzbw.zza(parcelM1087a_, zzdoVar);
        parcelM1087a_.writeLong(j);
        zzb(3, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeInt(i);
        parcelM1087a_.writeString(str);
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        zzbw.zza(parcelM1087a_, iObjectWrapper2);
        zzbw.zza(parcelM1087a_, iObjectWrapper3);
        zzb(33, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        zzbw.zza(parcelM1087a_, bundle);
        parcelM1087a_.writeLong(j);
        zzb(27, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        parcelM1087a_.writeLong(j);
        zzb(28, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        parcelM1087a_.writeLong(j);
        zzb(29, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        parcelM1087a_.writeLong(j);
        zzb(30, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdo zzdoVar, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        zzbw.zza(parcelM1087a_, zzdoVar);
        parcelM1087a_.writeLong(j);
        zzb(31, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        parcelM1087a_.writeLong(j);
        zzb(25, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        parcelM1087a_.writeLong(j);
        zzb(26, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void performAction(Bundle bundle, zzdo zzdoVar, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, bundle);
        zzbw.zza(parcelM1087a_, zzdoVar);
        parcelM1087a_.writeLong(j);
        zzb(32, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void registerOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdpVar);
        zzb(35, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeLong(j);
        zzb(12, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, bundle);
        parcelM1087a_.writeLong(j);
        zzb(8, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, bundle);
        parcelM1087a_.writeLong(j);
        zzb(44, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, bundle);
        parcelM1087a_.writeLong(j);
        zzb(45, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        parcelM1087a_.writeLong(j);
        zzb(15, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, z);
        zzb(39, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, bundle);
        zzb(42, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setEventInterceptor(zzdp zzdpVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdpVar);
        zzb(34, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setInstanceIdProvider(zzdu zzduVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzduVar);
        zzb(18, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, z);
        parcelM1087a_.writeLong(j);
        zzb(11, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeLong(j);
        zzb(13, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeLong(j);
        zzb(14, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, intent);
        zzb(48, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeLong(j);
        zzb(7, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        parcelM1087a_.writeString(str);
        parcelM1087a_.writeString(str2);
        zzbw.zza(parcelM1087a_, iObjectWrapper);
        zzbw.zza(parcelM1087a_, z);
        parcelM1087a_.writeLong(j);
        zzb(4, parcelM1087a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdj
    public final void unregisterOnMeasurementEventListener(zzdp zzdpVar) throws RemoteException {
        Parcel parcelM1087a_ = m1087a_();
        zzbw.zza(parcelM1087a_, zzdpVar);
        zzb(36, parcelM1087a_);
    }
}
