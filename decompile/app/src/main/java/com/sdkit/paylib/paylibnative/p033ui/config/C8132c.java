package com.sdkit.paylib.paylibnative.p033ui.config;

import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.entity.PaylibNativeTheme;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider;
import com.sdkit.paylib.paylibnative.p033ui.core.longpolling.AbstractC8146b;
import com.sdkit.paylib.paylibnative.p033ui.core.longpolling.C8145a;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.sdkit.paylib.paylibnative.ui.config.c */
/* loaded from: classes5.dex */
public final class C8132c implements InterfaceC8131b {

    /* renamed from: a */
    public final PaylibNativeFeatureFlags f1948a;

    /* renamed from: b */
    public final InternalConfigProvider f1949b;

    /* renamed from: c */
    public final PaylibNativeConfigProvider f1950c;

    public C8132c(PaylibNativeFeatureFlags paylibNativeFeatureFlags, InternalConfigProvider internalConfigProvider, PaylibNativeConfigProvider paylibNativeConfigProvider) {
        this.f1948a = paylibNativeFeatureFlags;
        this.f1949b = internalConfigProvider;
        this.f1950c = paylibNativeConfigProvider;
    }

    /* renamed from: a */
    public final Boolean m2012a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    /* renamed from: b */
    public boolean mo2007b() {
        Boolean boolM2012a;
        JSONObject jSONObjectM2013g = m2013g();
        if (jSONObjectM2013g != null && (boolM2012a = m2012a(jSONObjectM2013g, "use_theme_icon")) != null) {
            return boolM2012a.booleanValue();
        }
        PaylibNativeConfigProvider paylibNativeConfigProvider = this.f1950c;
        if (paylibNativeConfigProvider != null) {
            return paylibNativeConfigProvider.useThemeIcon();
        }
        return false;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    /* renamed from: c */
    public boolean mo2008c() {
        JSONObject jSONObjectM2013g = m2013g();
        return jSONObjectM2013g != null && jSONObjectM2013g.optBoolean("show_tpay_widget_forcibly");
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    /* renamed from: d */
    public C8145a mo2009d() {
        JSONObject jSONObjectM2013g = m2013g();
        return AbstractC8146b.m2053a(jSONObjectM2013g != null ? jSONObjectM2013g.optString("long_polling_params", "") : null);
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    /* renamed from: e */
    public boolean mo2010e() {
        JSONObject jSONObjectM2013g = m2013g();
        return jSONObjectM2013g != null && jSONObjectM2013g.optBoolean("short_expanded_swipe");
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    /* renamed from: f */
    public PaylibNativeTheme mo2011f() {
        JSONObject jSONObjectM2013g = m2013g();
        String strOptString = jSONObjectM2013g != null ? jSONObjectM2013g.optString("paylib_native_impl_theme", "") : null;
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -87478207) {
                if (iHashCode != 72432886) {
                    if (iHashCode == 1696099028 && strOptString.equals("DEFAULT_DARK")) {
                        return PaylibNativeTheme.DEFAULT_DARK;
                    }
                } else if (strOptString.equals("LIGHT")) {
                    return PaylibNativeTheme.LIGHT;
                }
            } else if (strOptString.equals("NIGHT_BLUE")) {
                return PaylibNativeTheme.NIGHT_BLUE;
            }
        }
        PaylibNativeConfigProvider paylibNativeConfigProvider = this.f1950c;
        if (paylibNativeConfigProvider != null) {
            return paylibNativeConfigProvider.getTheme();
        }
        return null;
    }

    /* renamed from: g */
    public final JSONObject m2013g() {
        String strProvide;
        try {
            InternalConfigProvider internalConfigProvider = this.f1949b;
            if (internalConfigProvider != null && (strProvide = internalConfigProvider.provide()) != null) {
                return new JSONObject(strProvide);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean getStartExpanded() {
        JSONObject jSONObjectM2013g = m2013g();
        if (jSONObjectM2013g != null) {
            return jSONObjectM2013g.optBoolean("start_expanded");
        }
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags != null) {
            return Intrinsics.areEqual(paylibNativeFeatureFlags.getStartExpanded(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean getUseSheetHandle() {
        JSONObject jSONObjectM2013g = m2013g();
        if (jSONObjectM2013g != null) {
            return jSONObjectM2013g.optBoolean("use_sheet_handle");
        }
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags != null) {
            return Intrinsics.areEqual(paylibNativeFeatureFlags.getUseSheetHandle(), Boolean.TRUE);
        }
        return false;
    }

    /* renamed from: h */
    public final Boolean m2014h() {
        String strOptString;
        JSONObject jSONObjectM2013g = m2013g();
        if (jSONObjectM2013g == null || (strOptString = jSONObjectM2013g.optString("is_paylib_tpay_enabled")) == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(strOptString));
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isPaylibAddCardFlowWithProfileEnabled() {
        Boolean boolIsPaylibAddCardFlowWithProfileEnabled;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags == null || (boolIsPaylibAddCardFlowWithProfileEnabled = paylibNativeFeatureFlags.isPaylibAddCardFlowWithProfileEnabled()) == null) {
            return false;
        }
        return boolIsPaylibAddCardFlowWithProfileEnabled.booleanValue();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isPaylibMobileEnabled() {
        Boolean boolIsPaylibMobileEnabled;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags == null || (boolIsPaylibMobileEnabled = paylibNativeFeatureFlags.isPaylibMobileEnabled()) == null) {
            return true;
        }
        return boolIsPaylibMobileEnabled.booleanValue();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isPaylibSbpAllBanksEnabled() {
        Boolean boolIsPaylibSbpAllBanksEnabled;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags == null || (boolIsPaylibSbpAllBanksEnabled = paylibNativeFeatureFlags.isPaylibSbpAllBanksEnabled()) == null) {
            return false;
        }
        return boolIsPaylibSbpAllBanksEnabled.booleanValue();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isPaylibSbpEnabled() {
        Boolean boolIsPaylibSbpEnabled;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags == null || (boolIsPaylibSbpEnabled = paylibNativeFeatureFlags.isPaylibSbpEnabled()) == null) {
            return true;
        }
        return boolIsPaylibSbpEnabled.booleanValue();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isPaylibTPayEnabled() {
        Boolean boolIsPaylibTPayEnabled;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (!((paylibNativeFeatureFlags == null || (boolIsPaylibTPayEnabled = paylibNativeFeatureFlags.isPaylibTPayEnabled()) == null) ? false : boolIsPaylibTPayEnabled.booleanValue())) {
            Boolean boolM2014h = m2014h();
            if (!(boolM2014h != null ? boolM2014h.booleanValue() : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isPaylibUseSaveCardFlowEnabled() {
        Boolean boolIsPaylibUseSaveCardFlowEnabled;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags == null || (boolIsPaylibUseSaveCardFlowEnabled = paylibNativeFeatureFlags.isPaylibUseSaveCardFlowEnabled()) == null) {
            return false;
        }
        return boolIsPaylibUseSaveCardFlowEnabled.booleanValue();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isSandbox() {
        PaylibNativeConfigProvider paylibNativeConfigProvider = this.f1950c;
        if (paylibNativeConfigProvider != null) {
            return paylibNativeConfigProvider.isSandbox();
        }
        return false;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isSbolPayEnabled() {
        Boolean boolIsSbolPayEnabled;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags == null || (boolIsSbolPayEnabled = paylibNativeFeatureFlags.isSbolPayEnabled()) == null) {
            return false;
        }
        return boolIsSbolPayEnabled.booleanValue();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    public boolean isSbolPayInExecutedStatusAvailable() {
        Boolean boolIsSbolPayInExecutedStatusAvailable;
        PaylibNativeFeatureFlags paylibNativeFeatureFlags = this.f1948a;
        if (paylibNativeFeatureFlags == null || (boolIsSbolPayInExecutedStatusAvailable = paylibNativeFeatureFlags.isSbolPayInExecutedStatusAvailable()) == null) {
            return false;
        }
        return boolIsSbolPayInExecutedStatusAvailable.booleanValue();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b
    /* renamed from: a */
    public boolean mo2006a() {
        JSONObject jSONObjectM2013g = m2013g();
        return jSONObjectM2013g != null && jSONObjectM2013g.optBoolean("device_auth_on_card_payment");
    }
}
