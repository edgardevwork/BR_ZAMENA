package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jc */
/* loaded from: classes7.dex */
public final class C9628jc extends C8803Bh implements InterfaceC8921Ga {
    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5213a(@Nullable Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4935a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5214a(@NonNull AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5215a(@NonNull ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5216a(@NonNull C8909Fn c8909Fn) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5217a(@NonNull EnumC9740o enumC9740o) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: a */
    public final void mo4985a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4941a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: a */
    public final void mo5218a(@NonNull String str, boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4942a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: b */
    public final void mo5219b(@Nullable Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: b */
    public final void mo5220b(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: b */
    public final void mo4986b(@NonNull String str, @Nullable String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga, io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: b */
    public final boolean mo4987b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: c */
    public final void mo5221c() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8921Ga
    /* renamed from: g */
    public final List<String> mo5222g() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.C8803Bh, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.C8803Bh, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }
}
