package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ga */
/* loaded from: classes7.dex */
public interface InterfaceC8921Ga extends InterfaceC8796Ba, InterfaceC9878tc {
    /* renamed from: a */
    void mo5213a(@Nullable Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    /* synthetic */ void mo4935a(@Nullable Location location);

    /* renamed from: a */
    void mo5214a(@NonNull AnrListener anrListener);

    /* renamed from: a */
    void mo5215a(@NonNull ExternalAttribution externalAttribution);

    /* renamed from: a */
    void mo5216a(@NonNull C8909Fn c8909Fn);

    /* renamed from: a */
    void mo5217a(@NonNull EnumC9740o enumC9740o);

    @Override // io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: a */
    /* synthetic */ void mo4985a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    /* synthetic */ void mo4941a(String str, String str2);

    /* renamed from: a */
    void mo5218a(@NonNull String str, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    /* synthetic */ void mo4942a(boolean z);

    /* renamed from: b */
    void mo5219b(@Nullable Activity activity);

    /* renamed from: b */
    void mo5220b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: b */
    /* synthetic */ void mo4986b(@NonNull String str, @Nullable String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: b */
    /* synthetic */ boolean mo4987b();

    /* renamed from: c */
    void mo5221c();

    /* renamed from: g */
    List<String> mo5222g();
}
